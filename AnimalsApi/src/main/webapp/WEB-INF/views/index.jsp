<html>
<head></head>
<body>

<form action ="/showanimal" method= "GET">
   <div style="visibility: ${hide ? 'show':'hidden'}">
  <h2>Animal Name: ${AnimalName} </h2>
  <h3>Photo url:"${imageurl}" </h3>
 </div>
  <img SRC="${imageurl}" style="visibility: ${hide ? 'show':'hidden'}" width="500" height="500">
  <!-- Test Code -->
  <button type="submit" style="visibility: ${hide ? 'show':'hidden'}">NextAnimal</button>

  <button type="submit" style="visibility: ${hide ? 'hidden' : 'show'}">ShowAnimal</button>
  
</form>


</body>


</html>