<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create shipment</title>
</head>
<body >
<center>
<form action="CreateShipment" method="post">

<h3>Begin Your Shipment</h3>

<table cellpadding='5px' width="75%">
<th><center>What are you Shipping?</center></th>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>
<tr><td>Item</td><td></td><td><input type="text"/></tr></td>
<tr><td>No of Packages</td><td>    </td><td>     <input type="number" name="No_of_Packages" min="0"/></tr></td>
<tr><td>Packaging type     </td><td>   </td><td> <select name="Item1">
<option>package</option>
<option>Express Freight</option>
<option>Envelope</option>
</select></tr></td>
<tr><td>Package Declared Value  </td><td> </td><td><input type="number" name="Package_Declared_Value"  min="0"/>in $<br></tr></td>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>

<th><center>Where is this shipment going?</center></th>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>
<tr><td>Company or Name</td><td></td><td>  <input type="text" name="to_company"/></tr></td>
<tr><td>Contact</td><td></td><td>  <input type="number" name="to_contact" min="0"/></tr></td>
<tr><td>Country </td><td></td><td> <select name="to_country">
	<option value="">Country...</option>
	<option value="United States">United states</option></select></tr></td>
<tr><td>State</td><td></td><td>  <select name="to_state">
	<option value="">State</option>
	<option value="North Carolina">North Carolina</option></select></tr></td>
<tr><td>City </td><td></td><td> <input type="text" name="to_city" /></tr></td>
<tr><td>Address line1</td><td></td><td>          <input type="text" name="to_addressline1" /></tr></td>
<tr><td>Address line2</td><td></td><td>          <input type="text" name="to_addressline2"/></tr></td>
<tr><td>Zip code</td><td></td><td>  <input type="text" name="to_zipcode"/></tr></td>
<tr><td>Email</td><td></td><td>  <input type="text" name="to_email"/></tr></td>


<tr></tr><tr></tr>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>

<th><center>Where is this shipment coming from?</center></th>
<tr><td></td><td></td></tr><tr><td></td><td></td></tr>
<tr><td>Company or Name</td><td></td><td>  <input type="text" name="from_company"/></tr></td>
<tr><td>Contact</td><td></td><td>  <input type="number" name="from_contact" min="0"/></tr></td>
<tr><td>Country </td><td></td><td> <select name="from_country">
	<option value="">Country...</option>
	<option value="United States">United states</option></select></tr></td>
<tr><td>State</td><td></td><td>  <select name="from_state">
	<option value="">State</option>
	<option value="North Carolina">North Carolina</option></select></tr></td>
<tr><td>City </td><td></td><td> <input type="text" name="from_city" /></tr></td>
<tr><td>Address line1</td><td></td><td>          <input type="text" name="from_addressline1" /></tr></td>
<tr><td>Address line2</td><td></td><td>          <input type="text" name="from_addressline2"/></tr></td>
<tr><td>Zip code</td><td></td><td>  <input type="text" name="from_zipcode"/></tr></td>
<tr><td>Email</td><td></td><td>  <input type="text" name="from_email"/></tr></td>
</table>
How do you want us to collect your shipment?	<input type="radio" name="Pick up from your above address" value="Pickup"/>
Pick up from your above address
	<input type="radio" name="Drop off at nearest location" value="Drop Off"/>Drop off at 
	nearest location<br><br>
<input type="submit" value="submit"/>
&nbsp&nbsp<input type="button" value="Cancel" onclick="window.location='Homepage.jsp'"/>
&nbsp&nbsp<input type="reset" value="Reset"/>
<br><br>
</form></center>
</body>
</html>