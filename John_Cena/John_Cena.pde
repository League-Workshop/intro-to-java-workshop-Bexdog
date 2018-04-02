int x = 1;
int y = 1;
PImage mustache;
  PImage bully;
void setup(){
bully = loadImage("john cena.jpg");
  size(800, 600);
  bully.resize(width, height);
  mustache = loadImage("mustache.png");
 
  
  
}
void draw(){
  
  background(bully);
  

if (mousePressed)
{
x = mouseX;
y = mouseY;
}
if (x > 1) {
image(mustache, x, y);}
  else{image(mustache, mouseX,mouseY);}
  
  
  
  
  
}