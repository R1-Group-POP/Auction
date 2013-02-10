
/**
 *
 * @author Patrick
 */
public class GUIHandler {

    private Auction auction;
    public MainGUI mainGUI;

    public GUIHandler(Auction auction) {
        this.auction = auction;
        
        setLookAndFeel();
        showMainGUI();
    }
    
    /**
     * Sætter look and feel (frame tema)
     */
    public void setLookAndFeel() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }
    
    /**
     * Instansiere og viser MainGUI
     */
    public void showMainGUI() {
        mainGUI = new MainGUI(this,auction);
        mainGUI.setVisible(true);
    }
    
    /**
     * Instansiere makeABidGUI
     * @param lot 
     */
    public void createMakeABidGUI(Lot lot) {
        new MakeABidGUI(this, auction, lot).setVisible(true);
    }
    
    /**
     * Instansiere CreateAuctionGUI
     * @param lot 
     */
    public void createCreateAuctionGUI() {
        new CreateAuctionGUI(this, auction).setVisible(true);
    }
    
    /**
     * Instansiere DeleteAuctionGUI
     * @param lot 
     */
    public void createDeleteAuctionGUI() {
        new DeleteAuctionGUI(this, auction).setVisible(true);
    }
}
