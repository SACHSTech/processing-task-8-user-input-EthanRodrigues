import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    size(400, 400);
  }

 boolean upPressed = false;
 boolean downPressed = false;
 boolean leftPressed = false;
 boolean rightPressed = false;

 float circleX = 150;
 float circleY = 150;

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    if (mousePressed) {
      ellipse(mouseX, mouseY, 50, 50);
    } else {
      background(252, 228, 88);
    }

    if (keyPressed){
     fill(0, 0, 0);
     textSize(75);
     text(key, 5, 80);
    }

    if (upPressed) {
      circleY-=5;
      textSize(100);
      text("up", random(0,300), random(0,300));
    }

    if (downPressed) {
      circleY+=5;
      textSize(100);
      text("down", random(0,300), random(0,300));
    }

    if (leftPressed) {
      circleX-=5;
      textSize(100);
      text("left", random(0,300), random(0,300));
    }

    if (rightPressed) {
      circleX+=5; 
      textSize(100);
      text("right", random(0,300), random(0,300));
    }
  
    fill(0, 115, 255);
    ellipse(circleX, circleY, 50, 50);

  }
  

  public void mouseDragged() {
    background(mouseX / 2, mouseY / 2, 255);
    ellipse(circleX, circleY, 50, 50);
    ellipse(mouseX, mouseY, 50, 50);
  }

  public void mouseWheel() {
    int intColour = 200;
    fill(intColour);
    rect(200, 200, 50, 50);
  
    fill(intColour - 100);
    triangle(200, 200, 200 + 50, 200 , 200 + 25, 200 - 30);
  
    fill(intColour - 50);
    rect(200 + 10, 200 + 30, 15, 20);
  }

  public void keyPressed() {
    background(245, 161, 66);
    if (keyCode == UP) {
      upPressed = true;
    }
    else if (keyCode == DOWN) {
      downPressed = true;
    }
    else if (keyCode == LEFT) {
      leftPressed = true;
    }
    else if (keyCode == RIGHT) {
      rightPressed = true;
    }
  }
  
  public void  keyReleased() {
    if (keyCode == UP) {
      upPressed =  false;
    }
    else if (keyCode == DOWN) {
      downPressed =  false;
    }
    else if (keyCode == LEFT) {
      leftPressed = false;
    }
    else if (keyCode == RIGHT) {
      rightPressed = false;
    }
  }
}