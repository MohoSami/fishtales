public class FishTales{

  public static void main(String args[]){
    FishTank myTank = new FishTank(500, 500);

    System.out.println("FishTales II- A more sofishticated architecture");
    // set the scale of the coordinate system
    StdDraw.setXscale(0, myTank.getWidth());
    StdDraw.setYscale(0, myTank.getLength());
    StdDraw.enableDoubleBuffering();

    // main animation loop
    while (true)  {
        StdDraw.clear(StdDraw.CYAN);// clear the background

        //if key is pressed
        if(StdDraw.isKeyPressed(71)){//G or g
          myTank.add(new Goldfish(myTank, 200, 200));
        }
        //if mouse is clicked

        myTank.update();

        StdDraw.show();// copy offscreen buffer to onscreen
        StdDraw.pause(20);// pause for 20 ms
      }//main animation loop
  }//main

}//FishTales class
