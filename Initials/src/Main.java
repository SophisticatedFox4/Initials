import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(9, 14);
    World.setDelay(10);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot a = new Robot(7,2,East,4);
    Robot b = new Robot(7,4,South,4);

    Robot c = new Robot(7, 12, West, 4);
    Robot d = new Robot(5, 8, East, 4);
    Robot e = new Robot(3, 12, West, 4);

    Robot f = new Robot(7, 8, South, 2);
    Robot g = new Robot(5, 12, South, 2);
		
    // examples of commands you can invoke on a Robot
    for (int i = 0; i < 5; i++) {
      a.putBeeper();
      b.putBeeper();
      c.putBeeper();
      d.putBeeper();
      e.putBeeper();
      f.putBeeper();
      g.putBeeper();
      a.move();
      b.move();
      c.move();
      d.move();
      e.move();
      f.move();
      g.move();
    }
  }
}