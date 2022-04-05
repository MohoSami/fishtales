import java.awt.*;//needed for Color

abstract class LivingObject implements Tankable{
  protected FishTank tank;
  protected double xVelocity, yVelocity, maxSpeed;
  protected double xPos, yPos, size, maxSize;
  protected Color fillColor, outlineColor;
  protected int age, maxAge;

  LivingObject(){

  }

  public void update() {
    move();
    show();
  }//update

  //Accessor Methods
  public double getSize(){return size/2;}
  public double getX() {return xPos;}
  public double getY() {return yPos;}

  public abstract boolean isDead();
  public abstract boolean hasCollision(Tankable t);
  abstract protected void move();
  protected abstract void show();

}//LivingObject
