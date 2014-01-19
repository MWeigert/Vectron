/**
 * 
 */
package gui.menuitem;

import javafx.scene.control.MenuItem;

/**
 * @author Tingle Driftwood
 * 
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
