/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.ui.Player;
import StatePattern.ui.UI;

public class StateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();    
    }
    
}
