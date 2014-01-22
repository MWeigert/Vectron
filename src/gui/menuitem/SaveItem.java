/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import javafx.scene.control.MenuItem;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates menu item "Save" for drop down menu
 * WITHOUT FUNCTION IN VERSION 0.75
 */
public class SaveItem {

	MenuItem saveItem;

	public SaveItem() {
		saveItem = new MenuItem("Save");
	}

	public MenuItem getSaveItem() {
		return saveItem;
	}
}
