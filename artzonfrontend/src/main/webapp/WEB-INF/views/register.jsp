<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<title>Registration</title>
<script>
<style >
function check()
{
	var id=new String(document.myform.id.value);
	var new1=new String(document.myform.new1.value);
	var new2=new String(document.myform.new2.value);
	var fname=new String(document.myform.fname.value);
	var lname=new String(document.myform.lname.value);
	var dob=new String(document.myform.dob.value);
	var ph=new String(document.myform.ph.value);
if(id.length<6)
{
	alert("User Id should have minimum of 6 characters");
	document.myform.id.value="";id="";
}
if((new1.length<6) || (new2.length<6) ||! (new1.match(new2)))
{
	alert("Password should have minimum of 6 characters and they should match");
	document.myform.new1.value="";new1="";
	document.myform.new2.value="";new2="";
}
if(fname==""||lname==""||dob==""||new1==""||new2==""||id=="")
alert("Provide valid values in all fields");
else
{
document.myform.submit();
}
}
</script>
</head>
<body>
<center>
<form action="form">
<br><br><hr width=100%><br><b><i><center><h2>Registration</h2><br>
<hr width=100%><br><br>
<table>
<tr>
	<td>Enter user ID</td>
	<td>:</td>
	<td><input type=text name=id></td></tr>
<tr>
	<td>Enter Password</td>
	<td>:</td>
	<td><input type=password name=new1></td></tr>
<tr>
	<td>Re-enter Password</td>
	<td>:</td>
	<td><input type=password name=new2></td></tr>
<tr>
	<td>First name</td>
	<td>:</td>
	<td><input type=text name=fname></td></tr>
<tr>
	<td>Last name</td>
	<td>:</td>
	<td><input type=text name=lname></td></tr>
<tr>
	<td>Date of Birth</td>
	<td>:</td>
	<td><input type="date" name="dob"></td></tr>
<tr>
	<td>Phone number</td>
	<td>:</td>
	<td><input type=number name=ph></td></tr>
<tr>
	<td>Address</td>
	<td>:</td>
	<td><textarea rows="10" cols="30"></textarea></td></tr>
</table>
<input type="submit" value="Submit" onClick="check();">
<input type="Reset" value="Reset" onClick="check();">
<br><br>
</form>
</body>
</html>




