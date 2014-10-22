/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.menu;

import java.io.File;

import data.basis.CashPointArray;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Eventhandler of cash point export menu -> handles complete export
 *          process of the cash points to csv file type (Excel)
 */

public class CashPointExportListener implements EventHandler<ActionEvent> {

	private CashPointArray cpArray;

	public CashPointExportListener(CashPointArray cpArray) {
		super();
		this.cpArray = cpArray;
	}

	@Override
	public void handle(ActionEvent arg0) {
		FileChooser fc = new FileChooser();
		
		File file = fc.showSaveDialog(null);
	}

}
