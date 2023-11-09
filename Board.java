// not done yet!!
import java.util.Scanner;  
public class Board {
        
    private int score;
    private WhackString whackObj;
    private int missCounter;
    // Scanner scan = new Scanner(System.in);

public boolean compareIndexValues(int index) {
    //int userIndex = scan.nextInt();
    int correctIndex = whackObj.getIndex();
    if(index == correctIndex){
        return true;
      }
    return false;
}

public void addPoints(int points) {
  if (compareIndexValues(points)) {
      score++;
      missCounter = 0;
  } else {
      missCounter++;
  }

}

public int getScore() {
    return score;
}

public int getMissCounter() {
    return missCounter;
}

public String getWhackObj() {
        return whackObj;
}
}
