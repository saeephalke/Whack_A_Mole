public class Board {

 /**
 * instance variables
 */
    private int score;
    private WhackString whackObj;
    private int missCounter;

/**
 * default constructor that initializes the score and missCounter instance variables to 0, and creates a new whackstring object for the whackObj instance variable
 */
    public Board() {
        score = 0;
        whackObj = new WhackString();
        missCounter = 0;
    }
    
/**
* checks if the user input equals the correct mole position
* Pre-condition: index is a positive number and correctIndex is a number from 1-5
* @param index - user-inputted number
* @return true if the user input equals the correct mole position, false otherwise
*/
 public boolean compareIndexValues(int index) {
    int correctIndex = whackObj.getIndex();
    if(index == correctIndex){
        return true;
      }
    return false;
}

/**
* adds the total points that the user scored
* Pre-condition: points is not negative
* @param points - points to be added to total score
*/
public void addPoints(int points) {
  if (compareIndexValues(points)) {
      score++;
      missCounter = 0;
  } else {
      missCounter++;
  }

}

/**
* gets the current score
* Pre-condition: score os not negative
* @return current score
*/
public int getScore() {
    return score;
}

/**
* gets the current number of misses
* Pre-condition: missCounter is not negative
* @return current number of misses
*/
public int getMissCounter() {
    return missCounter;
}

/**
* gets the current whackObj
* @return current whackObj
*/
public WhackString getWhackObj() {
        return whackObj;
}

/**
* sets the missCounter to the number of current misses
* Pre-condition: miss and missCounter are not negative
* @param miss - number of current misses
*/
public void setMissCounter(int miss) {
      missCounter = miss;
}
}
