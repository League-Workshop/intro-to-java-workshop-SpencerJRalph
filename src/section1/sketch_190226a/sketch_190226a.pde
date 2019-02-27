void setup() {
  size(800,800);}
void draw(){
  background(#666666);
  fill(#232323);
  ellipse(400,400,400,400);
  if(mousePressed){
    fill(#777776);
}else{
    fill(#678173);}
  ellipse(400,400,700,600);
}