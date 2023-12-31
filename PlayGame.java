import java.util.*;
/**
* Name: PlayGame Class
* Objects of this class contain a board object and scanner
* 
*/
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

  /**
   * Default constructor, sets the scan instance variable to a new scanner object, and the board instance variable to a new board
   */
  public PlayGame(){
    scan = new Scanner(System.in);
    //timer = new Timer();
    board = new Board(); //will be changed based on code added
  }

  /**
   * Runs the entire game using user input and methods in the Board class
   */
  public void playGame(){
    long start = System.currentTimeMillis();
    long end =  start + 30 * 1000;

    while (System.currentTimeMillis() < end && board.getMissCounter() < 3) {
    // operations to play the game, waiting on board class to complete
      System.out.println("Score: " + board.getScore() + " Misses: " + board.getMissCounter());
      System.out.println("Enter a number between 1-5 to whack the mole!");
      System.out.println(board.getWhackObj().getWhackString());
      int guess = scan.nextInt();
      
      while (guess < 1 || guess > 5) {
        System.out.println("Sorry that index is illegal! Enter a number between 1-5");
        System.out.println("For doing this, we're adding to your miss counter mwahahahaha!");
        board.setMissCounter(board.getMissCounter() + 1);
        System.out.println("Your miss counter is now " + board.getMissCounter());
        guess = scan.nextInt();
      }
        
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
  
