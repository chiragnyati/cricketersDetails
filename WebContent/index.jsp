<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h1>Please Enter your favourite Cricketer Details</h1>
<form action="sports" >
<pre>
Name          : <input type="text" name="name"/> 
Age           : <input type="text" name="age"/> 
BowlingStyle  : <input type="text" name="bowlingStyle"/>
BattingStyle  : <input type="text" name="battingStyle"/>
Role          : <input type="text" name="role"/>
Country       : <input type="text" name="country"/>
<input type="submit" value="Save"/> 
</pre>
</form>
${msg}
</body>
</html>