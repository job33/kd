<!DOCTYPE html>

<!-- Skilgreiningar � t�gum sem h�gt er a� nota � HTML k��a --> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">

<head>
    <title>Hver er notandinn</title>
</head>
<body>

<h1></h1>

<form method="POST" commandName="kennari" action="/demo/hverKennari">
    <table><tr>
            <td>Nafn:</td><td> <input name="nafn" type="text" placeholder="Nafn" /> </td>
            </tr> 
            <tr>
            <td>Heimilisfang:</td><td> <input name="heimilisfang" type="text" 
                                              placeholder="Heimilisfang" /> </td>
            </tr>
    </table>            
            <input type="submit" value="� lagi"/> 
</form>
</body>
</html>