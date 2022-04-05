import java.awt.*;//needed for Color

abstract class Pellet extends LivingObject{

  Pellet() {
  }//default constructor

  Pellet(Color fillColor, Color outlineColor) {
  }//default constructor

  protected void move() {

  }//move

  public boolean hasCollision(Tankable t){
    boolean collision=false;
    return collision;
  }//hasCollision

}//Pellet
