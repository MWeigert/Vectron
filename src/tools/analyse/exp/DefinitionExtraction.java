/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.exp;

import tools.analyse.DefinitionIDExtractor;
import tools.analyse.TypeExtractor;
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

	public Definition dataExtraction(String line, String lineNew) {
		int anf = 0;
		int ende = 0;
		boolean onWork = true;
		definition = new Definition();

		definition.setLineTypeID(new TypeExtractor(line).getType());
		definition.setDefinitionID(new DefinitionIDExtractor(line)
				.getDefinition());

		// Extract the data fields from the data line
		do {
			ende = lineNew.indexOf(';', anf);
			if (ende == lineNew.length() - 1) {
				onWork = false;
			}
			definition.addDataField(new DataFieldExtraction(lineNew.substring(
					anf, ende)).getData());
			anf = ende + 1;
		} while (onWork);
		System.out.println("Extraction of Definition finished.");
		return definition;
	}

}
