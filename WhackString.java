public class WhackString {
//Prints out a String with a random mole 

    //instance variables
    private String whackString;
    private int index;
    
    //constructor
    /**
     * default constructor, initializes index to a random number from 1-5, and generates random whackstring
     */
    public WhackString () {
        whackString = "";
        index = (int)(Math.random() * 5);
        whackString = createString();
    }

    //creates a String with a random mole
    /**
     * Generates a whackstring which is composed of four dashes, and a $ symbol
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
   * @return the wackstring's stored index value
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
