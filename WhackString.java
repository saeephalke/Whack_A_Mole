/**
* Name: WhackString Class
* Objects of this class contain a five-character String with a mole at a randomly-chosen index
* 
*/

public class WhackString {

    //instance variables
    private String whackString;
    private int index;
    
    //constructor
    /**
     * default constructor
     * initializes index to a random number from 1-5
     * initializes whackString to an empty String
     */
    public WhackString () {
        whackString = "";
        index = (int)(Math.random() * 5);
        whackString = createString();
    }

    //creates a String with a random mole
    /**
     * Generates a whackstring which is composed of four dashes and a $ symbol
     * the $ symbol has an index of "index"
     * @return a newly generated whackstring
     */
    public String createString () {
        whackString = "";
      for (int i = 0; i < 5; i++) {
          if (i != index) {
              whackString += "-";
          }
          else {
              whackString += "$";
          }
      }
      return whackString;

  }

  /**
   * returns the value of the index instance variable
   * @return the whackString's stored index value
   */

    public int getIndex(){
        return index;
    }

    /**
     * returns the value of the whackstring
     * @return a string representing the current whackString
     */

    public String getWhackString() {
        return whackString;
    }


    /**
     * Changes index to a randomly generated number between 1-5
     */
    public void randomIndex() {
         index = (int)(Math.random() * 5);
    }
}
