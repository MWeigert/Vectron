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

public class Warengruppen {
	
	private ObservableList<Warengruppe> wgArray = FXCollections.observableArrayList();
	
	public void addWG(Warengruppe wg) {
		wgArray.add(wg);
	}
	
	public ObservableList<Warengruppe> getWgArray() {
		return wgArray;
	}

}
