int x = 30;
int w = 40;

void setup()
{
size(400, 400);
background(225, 255, 0);
}
void draw()
{
	
	beam();
	light();
 
}

 
void beam() {
	
	int a = (int)(Math.random()*256);
    int b = (int)(Math.random()*256);
    int c = (int)(Math.random()*256);
    fill(a, b, c);
    ellipse(x, x, w, w);
     x++; 
     w++; 

}

void light() {
	int d = (int)(Math.random()*256);
	int e = (int)(Math.random()*256);
	int f = (int)(Math.random()*256);
	fill(d, e, f);
	ellipse(350, 50, 50, 50); 



}
