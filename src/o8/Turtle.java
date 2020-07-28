/*
package o8;

import se.lth.cs.window.SimpleWindow;

public class Turtle {

  */
/** skapar en sköldpadda som ritar i ritfönstret w.
      Från början befinner sig skoldpaddan i punkten xHome,yHome med pennan
      lyft och huvudet pekande rakt uppåt i fönstret, dvs i negativ y-riktning
  *//*

  private SimpleWindow w;
  private double xHome, yHome;
  private int angle;
  private boolean penStat;

  public Turtle(SimpleWindow w, int xHome, int yHome) {
    this.w = w;
    this.xHome = (double)xHome;
    this.yHome = (double)yHome;
    this.angle = 90;
    penStat = false;

  }

  */
/** sänker pennan *//*

  public void penDown() {
    penStat = true;
  }

  */
/** lyfter pennan *//*

  public void penUp() {
    penStat = false;
  }

  */
/** går rakt framåt n pixlar i huvudets riktning *//*

  public void forward(int n) {
    this.w.moveTo((int) Math.round(this.xHome), (int) Math.round(this.yHome));
    xHome = xHome + n*Math.cos(angle*Math.PI/180);
    yHome = yHome - n*Math.sin(angle*Math.PI/180);
    if (penStat){
        this.w.lineTo((int) Math.round(this.xHome), (int) Math.round(this.yHome));
    } else this.w.moveTo((int) Math.round(this.xHome), (int) Math.round(this.yHome));
  }

  public void forward(double d) {
    this.w.moveTo((int) Math.round(this.xHome), (int) Math.round(this.yHome));
    xHome = xHome + d*Math.cos(angle*Math.PI/180);
    yHome = yHome - d*Math.sin(angle*Math.PI/180);
    if (penStat){
      this.w.lineTo((int) Math.round(this.xHome), (int) Math.round(this.yHome));
    } else this.w.moveTo((int) Math.round(this.xHome), (int) Math.round(this.yHome));
  }

  */
/** vrider huvudet beta grader åt vänster *//*

  public void left(int beta) {
    angle += beta;
  }

  */
/** vrider hvudet beta grader åt höger *//*

  public void right(int beta) {
      angle -= beta;
  }

  */
/** går till punkten newX,newY utan att rita.
      Pennans läge och huvudets riktning påverkas inte *//*

  public void jumpTo(int newX, int newY) {
      this.xHome = newX;
      this.yHome = newY;
  }

  */
/** Återställer huvudets riktning till den ursprungliga *//*

  public void turnNorth() {
    angle = 90;
  }

  */
/** tar reda på sköldpaddans aktuella x-koordinat *//*

  public int getX() {
      return (int) Math.round(this.xHome);
  }

  */
/** tar reda på sköldpaddans aktuella y-koordinat *//*

  public int getY() {
      return (int) Math.round(this.yHome);
  }

  public int getAngle() {
    return angle;
  }

  public boolean isPenStat() {
    return penStat;
  }


}
*/
