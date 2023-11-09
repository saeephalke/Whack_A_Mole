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

    while (System.currentTimeMillis() < end && board.getMissCounter() < 3) {
    // operations to play the game, waiting on board class to complete
      System.out.println("Score: " + board.getScore() + "Misses: " + board.getMissCounter());
      System.out.println("Enter a number between 1-5 to whack the mole!");
      System.out.println(board.getWhackObj().getWhackString());
      int guess = scan.nextInt();
      board.addPoints(guess - 1);
      board.getWhackObj().randomIndex();
      board.getWhackObj().createString();
    }

    System.out.println("Game over! Here is your score " + board.getScore());
  }

  /* 
  public class Task extends TimerTask {
    public void run(){
      //to be filled later
    }
  }
  */
}
  
