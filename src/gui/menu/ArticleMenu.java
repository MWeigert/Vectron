/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menu;

import gui.menuitem.ShowArticleItem;
import javafx.scene.control.Menu;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates the whole article menu out of the different menu items.
 */

public class ArticleMenu {
	
	private Menu articleMenu;
	
	public ArticleMenu(VP vp) {
		articleMenu=new Menu("Artikel");
		
		//Define menu items for article menu here
		articleMenu.getItems().addAll(new ShowArticleItem(vp).getShowArticleItem());
	}
	
	public Menu getArticleMenu(){
		return articleMenu;
	}

}
