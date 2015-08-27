import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int x = 30;
int w = 40;

public void setup()
{
size(400, 400);
background(225, 255, 0);
}
public void draw()
{
	
	beam();
	light();
 
}

 
public void beam() {
	
	int a = (int)(Math.random()*256);
    int b = (int)(Math.random()*256);
    int c = (int)(Math.random()*256);
    fill(a, b, c);
    ellipse(x, x, w, w);
     x++; 
     w++; 

}

public void light() {
	int d = (int)(Math.random()*256);
	int e = (int)(Math.random()*256);
	int f = (int)(Math.random()*256);
	fill(d, e, f);
	ellipse(350, 50, 50, 50); 



}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
