import java.util.*;

public class FishTank{
  private ArrayList<Tankable> myStuff = new ArrayList<Tankable>();
  private float ammoniaCount;
  private double length, width;

  public FishTank(int width, int length){
    this.width=width;
    this.length=length;
  }

  //Accessor Methods
  public double getLength(){return this.length;}
  public double getWidth(){return this.width;}
  public double getAmmonia(){return this.ammoniaCount;}

  public void update(){
    for(int t=0; t<myStuff.size(); t++)
      myStuff.get(t).update();
  }
  private void show(){
  }

  public void cleanTheTank(){
  }
  public void tapTheTank(){
  }

  boolean add(Tankable t){
    boolean added =true;
    myStuff.add(t);
    return true;
  }//add a Tankable object to the FishTank

  boolean remove(Tankable t){
    boolean removed =true;

    return true;
  }//remove a Tankable object from the FishTank

  Goldfish nearestGoldfish(Piranha p){
    Goldfish g = null;

    return g;
  }//nearestGoldfish

}//FishTank
