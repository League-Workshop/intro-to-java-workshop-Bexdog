int x = 10;
int speed = 10;
void setup(){
size (700,700);


}
void draw(){
background (#1DDE1B);
  fill(#D42FEA); 

if(mousePressed){
 x = x+speed; 
}


ellipse(x,250,100,100);

  if(x > 700 ){speed = -10; }
  if(x < 10) {speed = 10;}
  
}