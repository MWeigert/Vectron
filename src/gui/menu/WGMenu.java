/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menu;

import gui.menuitem.ShowWgItem;
import javafx.scene.control.Menu;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class generates the whole warengruppen menu out of the different
 *          menu items.
 */

public class WGMenu {

	private Menu wgMenu;

	public WGMenu(VP vp) {
		wgMenu = new Menu("Warengruppen");

		// Define menu items for article menu here
		wgMenu.getItems().addAll(
				new ShowWgItem(vp).getShowWgItem());
	}

	public Menu getWgMenu() {
		return wgMenu;
	}

}
