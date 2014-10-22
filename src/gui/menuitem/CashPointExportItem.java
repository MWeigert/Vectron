/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import data.basis.CashPointArray;
import gui.action.menu.CashPointExportListener;
import javafx.scene.control.MenuItem;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class generates menu item "Export CashBox" for drop down menu
 */

public class CashPointExportItem {
	
	private MenuItem cpExportItem;
	
	public CashPointExportItem( CashPointArray cpArray) {
		cpExportItem = new MenuItem("Cash point");
		cpExportItem.setOnAction(new CashPointExportListener(cpArray));
	}
	
	public MenuItem getExportItem() {
		return cpExportItem;
	}

}
