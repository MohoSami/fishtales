import java.awt.*;//needed for Color

abstract class Fish extends LivingObject{
  private String name;

  Fish() {
    super();
  }//default fish constructor

  public boolean hasCollision(Tankable t){
    boolean collision=false;
    return collision;
  }//hasCollision

  public int compareTo(Fish f){
    return 0;
  }//compareTo

  public boolean isDead(){
    boolean vitalSigns=false;

    return vitalSigns;
  }//isDead

  abstract public boolean tryToEat(Tankable t);

}
