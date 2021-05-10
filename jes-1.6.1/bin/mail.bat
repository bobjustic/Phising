@set LOCALCLASSPATH="C:\Program Files\Java\jre1.8.0_241\lib"
@for %%i in ("..\lib\*.jar") do call "lcp.bat" "%%i"

java -cp %LOCALCLASSPATH% com.ericdaugherty.mail.server.Mail ..