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
 * Class generates menu item "Show Articles" for drop down menu
 */

public class ShowArticleItem {
	
	private MenuItem showArticleItem;
	
	public ShowArticleItem (VP vp) {
		BorderPane border = vp.getBorderPane();
		showArticleItem = new MenuItem("Artikel anzeigen");
		showArticleItem.setOnAction(new ArticleListener(border, vp));
	}
	
	public MenuItem getShowArticleItem() {
		return showArticleItem;
	}

}
