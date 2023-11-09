public class WhackString {
//Prints out a String with a random mole 

    //instance variables
    private String whackString;
    private int index;
    
    //constructor
    public WhackString () {
        whackString = "";
        index = (int)(Math.random() * 5);
        whackString = createString();
    }

    //creates a String with a random mole
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

    public int getIndex(){
        return index;
    }

    public String getWhackString() {
        return whackString;
    }

    public void randomIndex() {
         index = (int)(Math.random() * 5);
    }
}
