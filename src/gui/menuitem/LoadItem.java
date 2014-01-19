/**
 * 
 */
package gui.menuitem;

import main.VP;
import gui.action.menu.LoadListener;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author mweigert
 * 
 */
public class LoadItem {

	MenuItem loadItem;

	public LoadItem(BorderPane border, VP vp) {
		loadItem = new MenuItem("Load");
		loadItem.setOnAction(new LoadListener(border, vp));
	}

	public MenuItem getLoadItem() {
		return loadItem;
	}

}
