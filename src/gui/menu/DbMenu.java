/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menu;

import gui.menuitem.DbConnectItem;
import javafx.scene.control.Menu;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates the whole database menu out of the different menu items.
 */
public class DbMenu {
	
	private Menu dbMenu;
	
	public DbMenu(VP vp) {
		dbMenu = new Menu("Database");
		
		//Define submenu's of the database menu
		DbConnectItem connectItem = new DbConnectItem(vp.getBorderPane(), vp);
		
		dbMenu.getItems().addAll(connectItem.getConnectItem());
	}

	public Menu getdbMenu() {
		return dbMenu;
	}
	
}
