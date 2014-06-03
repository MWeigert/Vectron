/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menu;

import gui.menuitem.PosItem;
import javafx.scene.control.Menu;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates the whole database menu out of the different menu items.
 */

public class PosMenu {
	
	private Menu posMenu;
	
	public PosMenu (VP vp) {
		posMenu = new Menu("Kassen");
		
		//Define submenu's of the database menu
		PosItem showPOSitem = new PosItem(vp);
		
		posMenu.getItems().addAll(showPOSitem.getPosItem());
	}
	
	public Menu getPosMenu() {
		return posMenu;
	}

}
