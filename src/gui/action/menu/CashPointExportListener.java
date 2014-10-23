/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.menu;

import java.io.File;

import main.VP;

import tools.io.ExportCashPoint;

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
	
	private VP vp; 

	public CashPointExportListener(VP vp) {
		super();
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		FileChooser fc = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
				"CSV files (*.csv)", "*.csv");

		fc.getExtensionFilters().add(extFilter);

		File file = fc.showSaveDialog(null);
		String fileName = file.getName();
		
		ExportCashPoint exWriter;

		if (!fileName.contains(".")) {
			// Missing .csv in file name 
			fileName = file.getPath() + ".csv";
			File file2 = new File(fileName);
			exWriter = new ExportCashPoint(file2, vp);
		} else {
			// File name is correct .csv is not missing
			exWriter = new ExportCashPoint(file, vp);
		}
	}

}
