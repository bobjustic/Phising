package Appn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;
//http://103%116%115%:%56%48%56%48%/%80%104%105%115%105%110%103%/%

public class Linkguard
{
	public final int  PHISING=-1,POSSIBLE_PHISHING=0,NOTPHISHING=1;
	String actdns,visdns;
	public TreeSet block=new TreeSet(),white=new TreeSet(),seed=new TreeSet();
	String ser;
	String s1=null,s2=null,s3=null,s4=null;
	public Linkguard(String server)
	{
		try
		{
			ser=server;
			DriverManager.registerDriver( new oracle.jdbc.driver.OracleDriver() );
			Connection conn = DriverManager.getConnection( "jdbc:oracle:thin:@"+server,"system","redhat" );
			PreparedStatement st = conn.prepareStatement("Select * from LIST ");
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				String type=rs.getString("role");
				if(type.equals("Black List"))
					block.add(rs.getString("name"));
				else if(type.equals("White List"))
					white.add(rs.getString("name"));
				else
					seed.add(rs.getString("name"));
					
			}
			
			st.close();
		conn.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	
	}
	}
	public int linkGuard(String actlink,String vislink,String senderdns)
	{
		
/******	 New coding implements    ********/
		if(actlink.indexOf("?")==-1)
		{
			System.out.println("Not type 555");
		}
		else
		{
			
			StringTokenizer st1=new StringTokenizer(actlink,"?");
			while(st1.hasMoreElements())
			{
				s1=(String) st1.nextToken();
				s2=st1.nextToken();
				System.out.println("hh="+s1);
				System.out.println("hhh="+s2);
			}
			StringTokenizer st2=new StringTokenizer(s2,"=");
			while(st2.hasMoreElements())
			{
				s3=st2.nextToken();
				s4=st2.nextToken();
			}
			System.out.println("hh="+s3);
			System.out.println("hhh="+s4);
			return linkGuard(s4,s1,senderdns);
		}
/****              end        ****/		

		int atype=typeFind(actlink);
		int vtype=typeFind(vislink);
		 actdns="empty";
		
		 visdns="empty";
		if(atype==1)
			actdns=getDomain(actlink);
		if(vtype==1)
			visdns=getDomain(vislink);
		
		/*    algorithm starts ***********************/
		
		if((!actdns.equals("empty")&&!visdns.equals("empty"))&&(!actdns.equals(visdns)))   //first if
		{
			System.out.println("first if");
			new AutoSet().check(actdns,"Black List",ser);
			return PHISING;
		}
		else if(atype==2)//second if
		{
			System.out.println("second if");
			
			return POSSIBLE_PHISHING;
		}
		else if(atype==3||vtype==3)//third if
		{
			if(atype==3)
				actlink=decode(actlink)	;
			if(vtype==3)
				vislink=decode(vislink)	;
			System.out.println("3rd if");
			
			return linkGuard(actlink,vislink,senderdns);
		}
		
		else if(visdns.equals("empty")) //4th if
		{
			System.out.println("4th if");
			
			return analyzeDns(senderdns,actdns);
		}
		new AutoSet().check(actdns,"White List",ser);
		return NOTPHISHING;
	}
	public  int typeFind(String link)
	{
		int type=1;
		int count=0;
		StringTokenizer st=new StringTokenizer(link,"%");
		
		if(link.indexOf("localhost")!=-1)//ordinary
		{
			type=1;
		}
		else
		{
			
			while(st.hasMoreTokens())
			{
				st.nextToken();
				++count;
			}
		
			if(count>5)//when encoded
			{
				type=3;
			}
				else
			{
				if(link.indexOf(":8080/")!=-1)//when numeric
					type=2;
				else
					type=0;//no dns
			}
		}
		System.out.println(link+"------------------"+type);
		return type;
	}
	public  String getDomain(String link)
	{
		String domain="empty";
		String pattern="http://localhost:8080/";
		if(link.indexOf(pattern)!=-1)
		{
			domain=link.substring("http://localhost:8080/".length(),link.length());
			domain=domain.substring(0,domain.indexOf("/"));
		}
		System.out.println(link+"----------domain"+domain);
		return domain;
	}
	
	public  String decode(String ip)
	{
		ip=ip.substring("http://".length(),ip.length());
		StringTokenizer st=new StringTokenizer(ip,"%");
		String op="http://";
		while(st.hasMoreTokens())
		{
			String s=(String)st.nextToken();
			char c='a';
			try
			{
				c=(char)Integer.parseInt(s);
			}
			catch(Exception e)
			{
				c=s.charAt(0);
			}
			
			op=op+c;
		}
		System.out.println(op);
		return op;
	}
	public  int analyzeDns(String s,String a)
	{ 
		String b[]=setToString(block);
		String w[]=setToString(white);
		for(int i=0;i<b.length;i++)
		{
			if(b[i].equals(a))
			{
				System.out.println(a+" <-actual analyse block ->"+b[i]);
				
				return PHISING;
				
			}
		}
		for(int i=0;i<w.length;i++)
		{
			if(w[i].equals(a))
			{
				System.out.println(a+" <-actual analyse white-> "+w[i]);
				
				return NOTPHISHING;
				
			}
		}
		return patternMatching(s,a);
	}
	public  String[] setToString(TreeSet ip)
	{
		int i=0;
		String str[]=new String[ip.size()];
		Iterator itr=ip.iterator();
		while(itr.hasNext())
			str[i++]=(String)itr.next();
		return str;
	}
	public int patternMatching(String s,String a)
	{
		if(!s.equals(a))
		{
			System.out.println(s+" <-sender act not eqoal equal pattern match-> "+a);
			
			
			return POSSIBLE_PHISHING;
		}
		String ss[]=setToString(seed);
		for(int i=0;i<ss.length;i++)
		{
			if(checkSimilar(a,ss[i]))
			{
				System.out.println(ss[i]+"similar"+a);
				return POSSIBLE_PHISHING;
			}
		}
		System.out.println("pattern");
		new AutoSet().check(actdns,"White List",ser);
		return NOTPHISHING;
	}

	public boolean checkSimilar(String a,String p)
	{
		if(a.equals(p))//same domain
		{
			System.out.println("same dom");
			return false;
			
		}
		else
		{
		if(a.indexOf(p)!=-1)//actual contain prev
		{
			System.out.println("subset");
			return true;
		}
		else//similarity
		{
		int no=p.length();
		int match=0;
		for(int i=0;i<p.length();i++)
		{
			String pc=""+p.charAt(i);
			String ac="";
			if(a.length()>i)
			{
			ac=""+a.charAt(i);
			if(ac.equals(pc))
				++match;
			}
			
				
		}
		int per=(match/no)*100;
		if(per>70)
			return true;
		}
		}
		return true;
	}
	public static void main(String arg[])
	{
		//System.out.println(calculate("Id.j.i","Id.b.i"));
		//typeFind("c%j%k%j%k%j%k%R");
		//System.out.println(typeFind("localhost"));
		//decode("http://%103%116%115%:%56%48%56%48%/%80%104%105%115%105%110%103%/");
		//encode();
		Linkguard l=new Linkguard("gts11");
		System.out.println(l.linkGuard("http://localhost:8080/Phising/Idbi-help","http://localhost:8080/Phising/Idbi-help","Idbi"));
	}

	
	
	
	
	
	/*
	 public static void checkSimilar(String a,String p)
	{
		if(!a.equals(p));
		if(p.indexOf(a)!=-1);
		int no=p.length();
		int match=0;
		for(int i=0;i<p.length();i++)
		{
			boolean cn=true;
			String c=""+p.charAt(i);
			int pn=-1,pz=-1,pp=-1;
			int k=i;
			if((k-1)>-1&&(k-1)<a.length())
				pn=k-1;
			if((k-0)>-1&&(k-0)<a.length())
				pz=k;
			if((k+1)>-1&&(k+1)<a.length())
				pp=k+1;
			String t="";
			if(cn&&pn!=-1){t=""+a.charAt(pn);if(c.equals(t)){cn=false;++match;}};
			if(cn&&pz!=-1){t=""+a.charAt(pz);if(c.equals(t)){cn=false;++match;}};
			if(cn&&pp!=-1){t=""+a.charAt(pp);if(c.equals(t)){cn=false;++match;}};
			
		}
		
		
	} 
	public static  void encode()
	{
		String link="http://localhost:8080/Phising/";
		String en="http://";
		link=link.substring(en.length(),link.length());
		for(int i=0;i<link.length();i++)
		{
			char c=link.charAt(i);
			int k=c+0;
			en=en+"%"+k;
		}
		decode(en);
	}
	**/

	
}