/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.menu;

import tools.table.CashPointTable;
import tools.table.POSTable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Eventhandler -> handles complete display of the POS systems
 */

public class PosListener implements EventHandler<ActionEvent> {
	
	private VP vp;
	
	public PosListener (VP vp) {
		super();
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		
		if (vp.getFileType()==1) {
			CashPointTable table = new CashPointTable();
			vp.getBorderPane().setCenter(table.getTable(vp.getCpArray()));
		}
		
		if (vp.getFileType()==2) {
			POSTable table = new POSTable();
			vp.getBorderPane().setCenter(table.getTable(vp.getPos()));
		}
		
	}
	
}