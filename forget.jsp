<%@ page import="java.util.Random;" %>
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office" xmlns="http://www.w3.org/TR/REC-html40">
<head>
<meta http-equiv="Content-Language" content="en-us">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>New Page 1</title>
<script>
function check()
{
var id=document.forms[0].p1.value;
var myindex=document.forms[0].p2.selectedIndex;
var quest=document.forms[0].p2.options[myindex].text;
var ans=document.forms[0].p3.value;
 if(id==""||quest==""||ans=="")
alert("Please Enter all fields")
else if(id.lastIndexOf("@global.com")==-1)
alert("Please Enter Valid ID. ex senthil@global.com")

else
{
document.forms[0].action="http://localhost:8080/Phising/Forget";
document.forms[0].submit();
}
}
function hom()
{
document.forms[0].action="home.jsp";
document.forms[0].submit();
}
</script>
</head>
<body background="image/theme.gif">

<div style="position: absolute; width: 100px; height: 100px; z-index: 4; left: 610px; top: 13px" id="layer7">
	<div style="position: absolute; width: 246px; height: 33px; z-index: 2; left: -286px; top: 124px" id="layer10">
		<div style="position: absolute; width: 100px; height: 27px; z-index: 1; left: -324px; top: -138px" id="layer11">
<div style="position: absolute; width: 617px; height: 50px; z-index: 1; left: 91px; top: 364px" id="layer12">
<center><font color=#CC0000>
<b><%
if((request.getAttribute("msg"))==null)
{
out.println("");
}
else
{%>
<font color=#009900>Show Msg:</font>
<%
out.println(request.getAttribute("msg"));
}
%></b></font></center></div>
<input type=image src="image/hom.gif" onclick="hom()"><br>
&nbsp;<p>&nbsp;</div>
		<u><font face="Book Antiqua" size="4" color="#008000">Forget Password</font></u></div>
	<input border="0" src="image/globe1.gif" name="I5" width="86" height="83" type="image"><div style="position: absolute; width: 100px; height: 19px; z-index: 1; left: 4px; top: 34px" id="layer8">
		<b><font face="French Script MT" color="#00FFFF" size="5">
		<marquee width="78">Global Mail</marquee></font></b></div>
	<p>&nbsp;</div>

<p>&nbsp;</p>
<p>
</p>
<div style="position: absolute; width: 465px; height: 134px; z-index: 1; left: 165px; top: 15px" id="layer1">
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
<p>&nbsp;</p>
<p>&nbsp;</p>
<blockquote>
	<p>&nbsp;</p>
	
		<blockquote>
	<form method=post>		<blockquote>
				<blockquote>
					<blockquote>
						<pre><br>
<b><font color="#000080">UserName</font></b>	   <input type=text name=p1><br>
<b><font color="#000080">Secret Question</font>	</b>   <select size="1" name="p2" style="font-weight: bold; border-style: solid; border-width: 1px">
						<option selected>Who is your favourite player?</option>
						<option>What is your first phone no?</option>
						<option>What is your favourite color?</option>
						<option>What is your favourite food?</option>
						<option>What is your favourite color</option></select><br>
<b><font color="#000080">Secret Answer</font></b>	   <input type=text name=p3><br>&nbsp;</pre>
						<pre>	  	     <input type=button onclick="check()" style="border:0px solid #FFFFFF; background-image: url('image/find.gif')" value="           "><br>   <br>
  
		     
</pre>
					</blockquote>
				</blockquote>
			</blockquote>
		</blockquote>
	</form>
</blockquote>
</body>

</html>