/**
 * 
 */
package gui.menuitem;

import gui.action.menu.DbConnectListener;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates menu item "Connect" for drop down menu
 */

public class DbConnectItem {
	
	private MenuItem connectItem;
	
	public DbConnectItem (BorderPane pane, VP vp) {
		connectItem = new MenuItem("Connect");
		connectItem.setOnAction(new DbConnectListener(pane, vp));
	}
	
	public MenuItem getConnectItem() {
		return connectItem;
	}

}
