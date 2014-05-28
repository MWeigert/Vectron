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
 * List of definitions -> used in JavaFX tables
 */

public class Definitions {
	
	private ObservableList<Definition> definitions =FXCollections.observableArrayList();
	
	public void addDefinition(Definition definition) {
		definitions.add(definition);
	}
	
	public ObservableList<Definition> getDefinitions() {
		return definitions;
	}

}
