/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import main.VP;

import gui.action.menu.LoadListener;

import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates menu item "Load" for drop down menu
 */
public class LoadItem {

	private MenuItem loadItem;

	public LoadItem(BorderPane border, VP vp) {
		loadItem = new MenuItem("Load");
		loadItem.setOnAction(new LoadListener(border, vp));
	}

	public MenuItem getLoadItem() {
		return loadItem;
	}

}
