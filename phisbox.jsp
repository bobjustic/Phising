<%@ page import="Appn.*;" %>
<%!  Appn.MsgForm[] mf; %>
<html>
<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>username 
signout</title>

<script type="text/javascript">
onload = function() {
    if (!document.getElementsByTagName || !document.createTextNode) return;
    var rows = document.getElementById('table1').getElementsByTagName('tbody')[0].getElementsByTagName('tr');
    for (i = 1; i < rows.length; i++) {
        rows[i].onclick = function() {
        var v=""+this.rowIndex;
        document.forms[0].index.value=v;
          document.forms[0].action="http://localhost:8080/Phising/Msg";
          document.forms[0].submit();
      }
    }
}
</script>
</head>

<body>

<form method="get">
<div style="position: absolute; width: 45px; height: 48px; z-index: 2; left:710px; top:181px" id="layer2">
<div style="position: absolute; width: 834px; height: 100px; z-index: 1; left: -731px; top: -184px" id="layer3">
<div style="position: absolute; width: 172px; height: 28px; z-index: 1; left: 329px; top: 49px" id="layer7">
<b><font size="7" color="#FFFFFF" face="Chiller">Global Mail</font></b></div>
<img src="image/in.jpg"></div>
&nbsp;</div>
<p><font color="#970000">
</font>
<font color="#970000"></font></a></font></p>
<div style="position: absolute; width: 669px; height: 169px; z-index: 1; left:2px; top:141px" id="layer1">
	
	<blockquote>
		<blockquote>
			<blockquote>
				<h1><b><font size="7" color="#800000" face="Chiller">Phisbox</font><font size="6" color="#800000" face="Chiller">
				</font></b><font color="#000080" face="French Script MT"><b>
				<font face="Chiller" color="#800000" size="6">
				<input type=hidden name="index" size="20"></font></b></font>
				</h1>
			</blockquote>
			<div style="position: absolute; width: 317px; height: 59px; z-index: 1; left: 459px; top: 0px" id="layer5">
				<div style="position: absolute; width: 55px; height: 24px; z-index: 1; left: 129px; top: 26px" id="layer6">[<b><font size="2">
					<a href="logout.jsp">Logout</a> </font></b>]</div><center>
				<font size="4" face="Bell MT" color="#000080"><%=session.getAttribute("user")%></font></center>
			</div>
		</blockquote>
	</blockquote>
<p>
</p>
<!--<table  width="663">
<tr><td>-->
<table  width="778">
<tr><td width="772" background="image/b11.jpg" height="50">
<blockquote>
	
	<center>
	<blockquote>
		<blockquote>
			<blockquote>
				<pre><font face="Baskerville Old Face"><b><a href="inbox.jsp" ><font size="4" color="#800080">InBox</font></a></b></font><font size="5"><font color="#800080">       </font></font><b><a href="phisbox.jsp"><font color="#800080" face="Baskerville Old Face" size="4">PhisBox</font></a></b><font color="#800080" size="5">      </font><b><a href="compose.jsp"><font size="4" color="#800080" face="Baskerville Old Face">ComposeMail</font></a><font size="4" color="#800080" face="Baskerville Old Face">  </font></b></pre>
			</blockquote>
		</blockquote>
	</blockquote>
	</center>

<!--<td>-->
</blockquote>
</tr>
<tr>
<td height="136">
	<blockquote>
		<p>&nbsp;</p>
		<table border="1" width="85%" id="table1" cellspacing="1">
			<tr>
				<th width="27"><font color="#AA6600" size="4">
				<input type="checkbox" name="C1" value="ON" style="font-weight: 700"></font></th>
				<th width="246"><b><font size="4" color="#008000">Sender</font></b></th><th><b><font size="4" color="#008000">Subject</font></b></th><th><b><font size="4" color="#008000">Date</font></b></th></tr><%Appn.Mail m=new Appn.Mail(); %>
        <% mf=m.receive((String)application.getInitParameter("server"),(String)session.getAttribute("user"),(String)session.getAttribute("pwd")); %>
	   <% session.setAttribute("allmsg",mf) ; %>
       <% for(int i=0;i<mf.length;i++){ %>
        				<% String fr=mf[i].from; %>
			<%boolean ok=true; %>
			<%if(!(mf[i].sp).equals("")){ %>
			<%fr=mf[i].sp; %>
			<% ok=false; %>
			<%} %>
			<% if(ok){%>
			<% fr=fr.replace("@"+(String)application.getInitParameter("server"),"@global.com"); %>
            <%} %>			
			
			
	<%String status[]={"Phising Mail","Possible of Phising","Not Phising"}; %>
	<%int s=0; %>
	<% String domain=fr.substring(fr.lastIndexOf("@")+1,fr.lastIndexOf(".")); %>
	<%Appn.Analyzer ob=new Appn.Analyzer();%>
	<%s=ob.analyze(mf[i].msg,(String)application.getInitParameter("server"),domain)+1;%>
	<%mf[i].msg=ob.changeLink(mf[i].msg,(String)application.getInitParameter("server"),domain);%>
	<% if(s!=2){%>		
			<tr>
				<td width="27">
				<p align="center"><font color="#D27E00" size="3">
				<input type="checkbox" name="C1" value="ON" style="font-weight: 700"></font></td>
				<td width="246"><b><font color="#D27E00"><%=fr%></font></b></td><td><b><font color="#D27E00"><%=mf[i].subject %></font></b></td>
				<td width="169"><b><font color="#D27E00"><%=mf[i].date %></font></b></td></tr><% } %><% } %>
		</table>
	</blockquote>
<!--</tr>
</table>-->
</tr>
</table>
</form>

</body>

</html>