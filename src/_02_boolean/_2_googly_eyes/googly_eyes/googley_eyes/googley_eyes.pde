PImage face;

void setup() {

face = loadImage("creeper.png");
size(800,600);
face.resize(width, height); 
  
  
}
void draw() {
  image(face, 0, 0);
  println(mouseX + "    " + mouseY);
ellipse(20, 30, 50, 50);
fill (#FFFFFF);







  
  
}
