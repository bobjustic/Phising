<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office" xmlns="http://www.w3.org/TR/REC-html40">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">

<title>&lt;html xmlns:v=&quot;urn:schemas-microsoft-com:vml&quot; 
xmlns:o=&quot;urn:schemas-microsoft-com:office:office&quot; 
xmlns=&quot;http://www.w3.org/TR/REC-html40&quot;&gt; &lt;head&gt; &lt;meta http-equiv=&quot;Content-Type&quot; 
content=&quot;text/html; charset=windows-1252&quot;&gt; &lt;link rel=&quot;File-List&quot; href=&quot;home_fil</title>

<script language=javascript> 
function signup()
{
document.forms[0].action="signup.jsp";
document.forms[0].submit();
}
function forget()
{
document.forms[0].action="forget.jsp";
document.forms[0].submit();
}
function setting()
{
document.forms[0].action="settings.jsp";
document.forms[0].submit();
}
function home()
{
document.forms[0].action="home.jsp";
document.forms[0].submit();
}
function login()
{

var uname=""+document.forms[0].p1.value;
var pwd=""+document.forms[0].p2.value;
//uname=uname.trim();
//pwd=pwd.trim();
if(uname==""||pwd=="")
alert("Please Enter All Fields")
else if(pwd.length<8)
alert("Password must greater than 7 Letter")
else
{
document.forms[0].action="http://localhost:8080/Phising/Signin";
document.forms[0].submit();
}
}

</script>



</head>
<body background="image/splash.gif">
<form method=post>
<div style="position: absolute; width: 301px; height: 24px; z-index: 5; left: 304px; top: 348px" id="layer9">
	<div style="position: absolute; width: 194px; height: 100px; z-index: 1; left: 295px; top: -116px" id="layer17">
<font color=#000000>
<b><%
if((request.getAttribute("msg"))==null)
{
out.println("");
}
else
{%>
<!--
<br><font color=#009900><p align=left>Show Msg:</p></font>-->
<%
out.println("*"+request.getAttribute("msg"));
}
%></b></font>
</div>
	<b><i><font face="Palatino Linotype" color="#008081">Are&nbsp; you&nbsp; 
	Forget&nbsp; </font></i></b>
	<p><b><i><font face="Palatino Linotype" color="#008081">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; you&nbsp; Password</font><font face="Palatino Linotype" color="#008081" size="4"> </font>
	<font face="Palatino Linotype" color="#800080">
	&nbsp;<a href="forget.jsp">clickhere</a></font></i></b></div>
<pre>&nbsp;</pre>
<div style="position: absolute; width: 100px; height: 80px; z-index: 4; left: -2px; top: 0px" id="layer7">
	<input border="0" src="image/globe1.gif" name="I5" width="86" height="83" type="image"><div style="position: absolute; width: 100px; height: 19px; z-index: 1; left: 6px; top: 31px; visibility:visible" id="layer8">
		<b><font color="#800000" face="Goudy Old Style">
		<marquee width="75" style="color: #FFFFFF">Global Mail</marquee></font></b></div>
	<p>&nbsp;</div>
&nbsp;<p></p>
<p>&nbsp;</p>
<table>
<tr>

<td>	
&nbsp;<td>
<pre>
&nbsp;</pre>
<p>&nbsp;</p>
<p></p>
<div style="position: absolute; width: 465px; height: 88px; z-index: 1; left: 171px; top: 23px" id="layer1">
	<div style="position: absolute; width: 195px; height: 21px; z-index: 1; left: 164px; top: 57px" id="layer5">
		<i><b><font color="#800000" face="Bodoni MT" size="2">Connecting People 
		Globally !</font></b></i></div>
	<blockquote>
		<h1 align="left"><b>
		&nbsp;<font size="7" face="Bodoni MT" color="#800080">G</font><font size="7" face="French Script MT" color="#800080">lobal 
		Mail </font></b></h1>
	</blockquote>
</div>
<pre>
&nbsp;</pre>
<pre>
&nbsp;</pre>
<pre>

</pre>
<td>
<blockquote>
	<div style="position: absolute; width: 244px; height: 100px; z-index: 7; left: 528px; top: 160px" id="layer13">
		<p align="center">
<font color=blue size="2"><b>UserName</b></font><font color="#008081">
		</font> 
		<input type=text name=p1 style="width: 134; height: 22; color: darkblue" size="20"><br>
		<br>
		<b><font size="2" color=blue>Password</font><font color="#000080"> </font>

<font color="#0000FF">&nbsp;</font></b><input type=password name=p2 size="18" style="color: darkblue"><br>
		<br>
		<font color="#800000"><br>
		</font>	&nbsp;&nbsp;


	   <input type=image src="image/login.gif" name=b onclick="login()"></div>
	<pre>	</pre>
</blockquote>
</tr>
<tr>

<td>	&nbsp;<td>
&nbsp;<td>
&nbsp;</tr>
</table>
<div style="position: absolute; width: 100px; height: 100px; z-index: 10; left: 627px; top: 97px" id="layer16">
<h1><u><b><font face="French Script MT" color="#800080">Login</font></b></u></h1>
</div>
<div style="position: absolute; width: 54px; height: 66px; z-index: 9; left: 724px; top: 1px" id="layer15">
<a href="sett.jsp"><img src="image/Association.gif"></a></div>
<div style="position: absolute; width: 327px; height: 313px; z-index: 8; left: 15px; top: 109px" id="layer14">
<font face="Bodoni MT" color=#000066>
<font face="Bodoni MT" color=#000066>
<marquee direction=up  height="312" width="274" scrollamount=2><b><u><font color=#003300>Phising Info</font></u></b><br><br><br><a href="http://localhost:8080/Phising/links/intro.html"><b>Phishing Intro</b></a><br>click above link concept of Phishing attacks<br><br><a href="http://localhost:8080/Phising/links/hyper.html"><b>Classification of the hyperlinks</b></a><br>Five different type of hyperlinks in the phishing e-mails
<br><br><a href="http://localhost:8080/Phising/links/arc.html"><b>Architecture Diagram</b></a><br>click above link shown Architecture Diagram</marquee></font>
</div>

<div style="position: absolute; width: 221px; height: 20px; z-index: 3; left: 310px; top: 178px" id="layer6">
	<b><i><font face="Palatino Linotype" color="#008000">Are you new User</font></i></b><font face="Palatino Linotype"><b><i><u><font color="#800080"><a href="signup.jsp"> </a></font></u></i></b></font>
	</font>
<font face="Palatino Linotype" color=#000066>
	<p><b><i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</i></b></font><font face="Bodoni MT" color=#000066>
	<font face="Palatino Linotype"><b><i><u><font color="#800080">
	<a href="signup.jsp"> SignUp</a></font></u><font color="#0000FF">
	</font><font color="#008000">&nbsp;here</font></i></b></font></div>
</form>

</body>

</html>