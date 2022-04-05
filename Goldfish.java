import java.awt.*;//needed for Color

class Goldfish extends Fish {

  Goldfish(FishTank tank, float x, float y) {
    super();
    this.fillColor=StdDraw.ORANGE;
    this.xPos = x;
    this.yPos = y;
    this.xVelocity=5;
    this.yVelocity=5;
    this.tank = tank;
    this.size=3;

  }

  protected void move() {

    if (this.xPos + this.xVelocity > tank.getWidth() - this.size) this.xVelocity = -this.xVelocity;
    else if (this.xPos < 0) this.xVelocity = -this.xVelocity;
    else if (this.yPos + this.yVelocity > tank.getLength() - this.size) this.yVelocity = -this.yVelocity;
    else if (this.yPos < 0) this.yVelocity = -this.yVelocity;

    // update position
    this.xPos += this.xVelocity;
    this.yPos += this.yVelocity;
    System.out.println(this.xPos+" "+this.yPos+" "+this.xVelocity+" "+this.yVelocity);
  }//move

  protected void show(){
    // draw ball on the screen
    StdDraw.setPenColor(this.fillColor);
    StdDraw.filledCircle(this.xPos, this.yPos, this.size);
  }//show

  public boolean tryToEat(Tankable t){
    boolean hasEaten = false;

    return hasEaten;
  }//tryToEat
  public  boolean tryToBreed(Tankable t){
    boolean hasBred = false;

    return hasBred;
  }//tryToBreed

}//Goldfish
