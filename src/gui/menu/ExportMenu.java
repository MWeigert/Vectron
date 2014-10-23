/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menu;

import main.VP;
import gui.menuitem.CashPointExportItem;
import javafx.scene.control.Menu;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class generates the whole export menu out of the different menu
 *          items.
 */

public class ExportMenu {

	Menu exportMenu;
	VP vp;

	public ExportMenu(VP vp) {
		this.vp = vp;

		exportMenu = new Menu("Export");

		CashPointExportItem cpItem = new CashPointExportItem(vp);

		exportMenu.getItems().addAll(cpItem.getExportItem());
	}

	public Menu getExportMenu() {
		return exportMenu;
	}

}
