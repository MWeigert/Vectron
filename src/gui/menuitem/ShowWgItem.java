/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import main.VP;
import gui.action.side.ArticleListener;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates menu item "Show" for Warengruppen drop down menu
 */

public class ShowWgItem {
	
	private MenuItem showWgItem;
	
	public ShowWgItem (VP vp) {
		BorderPane border = vp.getBorderPane();
		showWgItem = new MenuItem("Anzeigen");
		showWgItem.setOnAction(new ArticleListener(border, vp));
	}
	
	public MenuItem getShowWgItem() {
		return showWgItem;
	}

}
