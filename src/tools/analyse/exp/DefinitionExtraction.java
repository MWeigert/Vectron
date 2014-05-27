/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.exp;

import data.basis.Definition;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which made the extraction of all data fields from a single
 *          line of the Vectron exp file.
 * 
 */
public class DefinitionExtraction {
	
	private Definition definition;
	private String line;
	
	public DefinitionExtraction(String line) {
		this.line=line;
	}
	
	public void extract(String line) {
		int anf = 0;
		int ende = 0;
		boolean onWork = true;
		
		// Extract the data fields from the data line
		do {
			ende = line.indexOf(';', anf);
			if (ende == line.length() - 1) {
				onWork = false;
			}
			definition.addDataField(new DataFieldExtraction(line.substring(anf, ende)).getData());
			anf = ende + 1;
		} while (onWork);
		System.out.println("Extraction of Definition finished.");
	}

}
