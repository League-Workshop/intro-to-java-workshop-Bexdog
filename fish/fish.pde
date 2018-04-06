int score = 0;
int foodY = 10;
void setup() {
  size(750, 750);
}
int randomNumber = (int) random(width); 
void draw() {
  background(141, 233, 237);
  if (score>=20) {
    textSize(50);

    text("YOU LOSE, JK, YOU WIN!", 75, 375);
  } else {  
    drawFish();
    fill(#F74802); 
    noStroke();
    ellipse(randomNumber, foodY, 10, 10);
    foodY=foodY+1;
    if (foodY>=750) {
      foodY=10;
      randomNumber = (int) random(width-200);
    }
    checkCatch(randomNumber, foodY);
  }
}
void checkCatch(int x, int y) {
  if (x > mouseX && x < mouseX+70) {
    if (y > mouseY-17 && y < mouseY+30) {
      score++;
      foodY=10;
      randomNumber = (int) random(width-200);
    }
  } else if (y > height && score > 0) {
    score--;
  }
  println("Your score is now: " + score);
}

void drawFish() {
  noStroke();
  fill(255, 255, 255);
  ellipse(mouseX-17, mouseY-17, 20, 20); //back side eye
  fill(255, 200, 88);
  ellipse(mouseX, mouseY, 90, 50); //body
  triangle(mouseX+30, mouseY, mouseX+70, mouseY+30, mouseX+70, mouseY-30); //tail
  stroke(0);
  triangle(mouseX, mouseY, mouseX+15, mouseY+10, mouseX+15, mouseY-10); //side fin
  noStroke();
  fill(255, 200, 88);
  ellipse(mouseX, mouseY, 15, 15); //side fin cover
  noStroke();
  fill(255, 255, 255);
  ellipse(mouseX-25, mouseY-15, 20, 20); //front eye
  fill(0, 0, 0);
  ellipse(mouseX-25, mouseY-15, 5, 5); //pupil
  fill(141, 233, 237);
  ellipse(mouseX-45, mouseY, 25, 25); //mouth
}