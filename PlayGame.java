import java.util.*;
public class PlayGame{
  /*3. Playing class
    import Timer class
    Comments about the Timer class

    while (less than time limit && !(gameOver)) {
      user input
      PlayGame
    }
    Print the points from the second class
  */
  private Scanner scan;
  //private Timer timer;
  private Board board;

  public PlayGame(){
    scan = new Scanner(System.in);
    //timer = new Timer();
    board = new Board(); //will be changed based on code added
  }

  public void playGame(){
    long start = System.currentTimeMillis();
    long end =  start + 30 * 1000;

    while (System.currentTimeMillis() < end && board.method()) {
    // operations to play the game, waiting on board class to complete
    }

  /* 
  public class Task extends TimerTask {
    public void run(){
      //to be filled later
    }
  }
  */
}
  
