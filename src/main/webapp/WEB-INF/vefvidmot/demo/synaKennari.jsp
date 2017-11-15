<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>G��an daginn </title>
</head>
<body>

<h1>G��an daginn ${dagur.getNafn()}</h1>
<h1>Allar uppl�singar ${dagur} </h> 
<form method="get" action="/demo/listiDaga">
 <input type="submit" value="Allir"/>
</form>

<form method="get" action="/demo/spyrjaNotanda">
 <input type="submit" value="N�r dagur"/>
</form>

</body>
<!-- method="POST" action="/demo/listiDaga" -->
</html>