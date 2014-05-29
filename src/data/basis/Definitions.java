/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

import java.util.ArrayList;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * List of definitions -> used in JavaFX tables
 */

public class Definitions{
	
	private ArrayList<Definition> definitions = new ArrayList<Definition>();
	
	public void addDefinition(Definition definition) {
		definitions.add(definition);
	}
	
	public ArrayList<Definition> getDefinitions() {
		return definitions;
	}

}
