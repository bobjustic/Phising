<%@ page import="Appn.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>New Page 1</title>
<script>
function hom()
{
document.forms[0].action="home.jsp";
document.forms[0].submit();
}

function hai()
{
var dn=document.forms[0].t1.value;
var myindex=document.forms[0].t2.selectedIndex;
if(dn=="")
{
alert("Please Enter the domain name");
}
else
{
  document.forms[0].action="http://localhost:8080/Phising/Domain";
   document.forms[0].submit();
}


}
function empty()
{
document.forms[0].t1.value="";
myindex=document.forms[0].t2.selectedIndex=0;

}
</script>



</head>

<body background="image/theme1.gif">

<div style="position: absolute; width: 62px; height: 42px; z-index: 5; left: 717px; top: 2px" id="layer15">
<div align=center style="position: absolute; width: 242px; height: 30px; z-index: 1; left: -707px; top: 358px" id="layer16">
<font color=#CC0000>
<b><%
if((request.getAttribute("msg"))==null)
{
out.println("");
}
else
{%>
<br><font color=#009900><p align=left>Show Msg:</p></font>
<%
out.println(request.getAttribute("msg"));
}
%></b></font></div>
<a href="logout1.jsp"><img src="image/back1.gif"></a></div>

<p>
</p>
<form method="POST" >
<div style="position: absolute; width: 465px; height: 134px; z-index: 1; left: 206px; top: 35px" id="layer14">
	<div style="position: absolute; width: 195px; height: 21px; z-index: 1; left: 164px; top: 57px" id="layer5">
		<i><b><font color="#800000" face="Bodoni MT" size="2">Connecting People 
		Globally !</font></b></i></div>
	<blockquote>
		<h1 align="left"><b>
		&nbsp;<font size="7" face="Century Schoolbook" color="#800080">G</font><font size="7" face="French Script MT" color="#800080">lobal 
		Mail </font></b></h1>
		<p align="left">&nbsp;</p>
	</blockquote>
</div>
<p align="center">&nbsp;</p>
	<div style="position: absolute; width: 100px; height: 100px; z-index: 2; left: -1px; top: -1px" id="layer13">
<input type=image src="image/hom.gif" onclick="hom()" name="I1"></div>

	<div style="position: absolute; width: 249px; height: 67px; z-index: 1; left: 2px; top: 247px" id="layer1">
		<font face="Bodoni MT" color="#000080">  <b>DomainName</b></font><font color="#0066CC">  
	<input type="text" name="t1" size="20" style="border-style: solid; border-width: 1px"></font><p>
		<font face="Bodoni MT"><font color="#000080">  <b>ListType</b></font>&nbsp;&nbsp;
		</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
	<select size="1" name="t2" style="font-weight: bold; border-style: solid; border-width: 1px">
<option selected>Black List</option>
<option>White List</option>
<option>Seed List</option>
</select></p>
		<p align="center">
		<input type=button name=b value=Save style="border:1px solid #800000; width: 87; height: 24; font-family: Times New Roman; font-weight: bold; font-size: 14pt; color: #800000; background-image: url('image/back.GIF')" onclick="hai()"></p></div>
	<div align="center">

		<br><br><br>
		<p>&nbsp;</p>
<div style="position: absolute; width: 100px; height: 100px; z-index: 4; left: 100px; top: 92px" id="layer7">
	<div style="position: absolute; width: 246px; height: 33px; z-index: 2; left: 335px; top: 68px" id="layer10">
		<u><font face="Bodoni MT" size="5" color="#0066CC">Domain's List</font></u></div>
	<input border="0" src="image/globe1.gif" name="I5" width="86" height="83" type="image"><div style="position: absolute; width: 100px; height: 19px; z-index: 1; left: -1px; top: 33px" id="layer8">
		<b><font face="French Script MT" color="#00FFFF" size="5">
		<marquee width="73">Global Mail</marquee></font></b></div>
	<p>&nbsp;</div>

		<p>&nbsp;</p>
		<p><br>
								</p>
								<p align=right>
										<table border="1" width="60%" id="table1" height="38">
											<tr>
												<td width="100" height="24">
												<p align="center"><b>
												<font color="#008000" size="4">NO</font></b></td>
												<td width="239" height="24">
												<p align="center"><b>
												<font size="4" color="#008000">Domain Name</font></b></td>
												<td height="24">
												<p align="center"><b>
												<font color="#008000" size="4">Type</font></b></td>
											</tr>
			

			<% 	Appn.Sread m=new Appn.Sread(); %>
            <% Appn.TabForm tf=null; %>
            <% Vector data=m.getTable((String)application.getInitParameter("server")); %>
            <% for(int i=0;i<data.size();i++){ %>
            <% tf=(Appn.TabForm)data.get(i); %>
            								<tr>
												<td width="100">
												<font size="4" color="#D96C00"><%=tf.no%></font></td>
												<td width="239">
												<font size="4" color="#D96C00"><%=tf.name%> 
												</font></td>
												<td>
												<font color="#D96C00" size="4">
				<%=tf.type%></font></td>
											</tr>
			
			<%} %>
	
										</table></p>
	
	</div>
</form>
<p>&nbsp;&nbsp;&nbsp; </p>

</body>

</html>