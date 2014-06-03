/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import gui.action.menu.PosListener;
import javafx.scene.control.MenuItem;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates menu item "Show Articles" for drop down menu
 */

public class PosItem {
	
	private MenuItem posItem;
	
	public PosItem(VP vp) {
		posItem = new MenuItem("Kassenliste");
		posItem.setOnAction(new PosListener(vp));
	}
	
	public MenuItem getPosItem(){
		return posItem;
	}
}
