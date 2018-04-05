int y = 323;
int x = 427;
int acceleration = 1;
PImage catPic;  
void setup(){
size(1000, 1000);
 catPic=
 loadImage("cat.jpg");
 catPic.resize(width, height);
  background(catPic);
  
}
void keyPressed() {
                 x++;
y++;
 y+=2*acceleration;
x+=2*acceleration;
}
void draw(){
   if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
   fill(#43D61C);
    noStroke();
    ellipse( x, y, 40, 75);
  ellipse(x+150, y+60, 40, 75);
if(x>width){ 
 loadImage("cat.jpg");
 catPic.resize(width, height);
  background(catPic);
  x=427;
  y=323;
  acceleration = 1;
}
}