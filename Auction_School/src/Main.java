/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick
 */
public class Main {
    
    private GUIHandler guiHandler;
    private Auction auction;
    
    public Main() {
        auction = new Auction();
        guiHandler = new GUIHandler(auction);
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
