/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import java.util.ArrayList;

import main.VP;
import data.basis.CashPoint;
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
	
	public CashPointExportItem(VP vp) {
		cpExportItem = new MenuItem("Cash point");
		cpExportItem.setOnAction(new CashPointExportListener(vp));
	}

	public MenuItem getExportItem() {
		return cpExportItem;
	}

}
