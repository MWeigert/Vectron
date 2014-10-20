/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
package data.basis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * List of CashPoint -> used in ...
 */

public class CashPointArray {
	
	private ObservableList<CashPoint> cashPointArray = FXCollections.observableArrayList();
	
	public void addCashPoint(CashPoint cp) {
		cashPointArray.add(cp);
	}

	public ObservableList<CashPoint> getCashPointArray() {
		return cashPointArray;
	}
	
}
