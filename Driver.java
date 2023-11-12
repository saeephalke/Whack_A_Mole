public class Driver {
    /**
     * runs the play game method to play and start the game
     * @param args the command line arguments (not used in this implementation)
     * @throws Exception if an error occurs during the game execution 
     * precondition: has all of the information necessary to initialize and run the game
     */
    public static void main(String[] args) throws Exception {
        PlayGame g = new PlayGame();
        g.playGame();
    }
}
