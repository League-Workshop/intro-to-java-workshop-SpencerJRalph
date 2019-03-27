PImage catPic;
void setup(){
size(220 , 302 );
catPic = loadImage("lazer.jpg");
catPic.resize(220, 302);
background(catPic);}
void draw(){
  if(mousePressed){
    println("Mouse's x-position: "+mouseX+"\n"+"Mouse's y-position: "+mouseY+"\n");}
    ellipse(x, y, width, height);
}