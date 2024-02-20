<h1>Solving the proposed exercices of the first week assignment - Princeton University</h1>

<p>0. As part of these instructions, you will write, compile, and execute the program HelloWorld.java</p><br>
<p>1. Strings and command-line arguments. Write a program HelloGoodbye.java that takes two names as command-line arguments and 
  prints hello and goodbye messages as shown below (with the names for the hello message in the same order as the command-line arguments 
  and with the names for the goodbye message in reverse order).</p><br>
<p>2. Integers and booleans. Write a program RightTriangle that takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle.
  The following two conditions are necessary and sufficient:
</p>
<ul>
  <li>Each integer must be positive.</li>
  <li>The sum of the squares of two of the integers must equal the square of the third integer.</li>
</ul><br>
<p>3. Floating-point numbers and the Math library. The great-circle distance is the length of the shortest path between two points (x1,y1)and (x2,y2) on the surface of a sphere, 
  where the path is constrained to be along the surface.</p>
<p>Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2, and y2
—the latitude and longitude (in degrees) of two points on the surface of the earth—and prints the great-circle distance (in kilometers) between them. Use the following Haversine formula</p>
<p>distance=2*r*arcsin(√sin2(x2−x1/2)+cosx1*cosx2*sin2(y2−y1/2))</p>
<p>Hint: The command-line arguments are given in degrees but Java’s trigonometric functions use radians. Use Math.toRadians() to convert from degrees to radians.
Although the Earth is not a perfect sphere, this formula is a good approximation to the true distance.</p><br>
<p>4. Type conversion. Several different formats are used to represent color. For example, the primary format for LCD displays, digital cameras, and web pages—known as the RGB format—specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255. The primary format for publishing books and magazines—known as the CMYK format—specifies the level of cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.</p>
<p>Write a program CMYKtoRGB.java that converts from CMYK format to RGB format using these mathematical formulas:</p>
<ul>
  <li>white = 1-black</li>
  <li>red = 255*white*(1-cyan)</li>
  <li>green = 255*white*(1-magenta)</li>
  <li>blue = 255*white*(1-yellow)</li>
</ul><br>
<p>OBS: You may not call library functions except those in the java.lang (such as Integer.parseInt() and Math.sqrt()). Do not use loops, conditional statements, arrays, or other Java features that have not yet been introduced in the course.</p>
