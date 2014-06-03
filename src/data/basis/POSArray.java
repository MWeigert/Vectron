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
 * List of POS -> used in POSTable
 */

public class POSArray {
	
	private ObservableList<POS> posArray = FXCollections.observableArrayList();
	
	public void addPOS(POS pos) {
		posArray.add(pos);
	}
	
	public ObservableList<POS> getPosArray() {
		return posArray;
	}

}
