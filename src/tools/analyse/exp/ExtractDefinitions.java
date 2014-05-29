/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.exp;

import java.util.Map;

import data.basis.Definitions;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which made the extraction of all data fields from a single
 *          line of the Vectron exp file.
 * 
 *          Data will be written in a map the key will be the data field number.
 */

public class ExtractDefinitions {

	private Definitions definitions;

	public ExtractDefinitions(Map<Integer, String> log) {
		int n = 0;
		String line = "";
		String lineNew = "";
		String prea = "";
		DefinitionExtraction defEx = new DefinitionExtraction();
		definitions = new Definitions();

		/*
		 * Building from multiple lines with same LineType and DefinitionID one
		 * single line for data extraction
		 */
		System.out.println("Size log: " + log.size());
		do {
			prea = new PreambleExtraction(log.get(n)).getPreamble();
			line = log.get(n);
			lineNew = line.substring(prea.length() + 1) + ';';
			if (n + 1 < log.size()) {
				while (prea.compareTo(new PreambleExtraction(log.get(n + 1))
						.getPreamble()) == 0) {
					String otherLine = log.get(n + 1);
					otherLine = otherLine.substring(prea.length() + 1) + ';';
					lineNew = lineNew + otherLine;
					n++;
				}
			}
			definitions.addDefinition(defEx.dataExtraction(line, lineNew));
			n++;
		} while (n < log.size());

		System.out.println("Extraction of Definitions finished. " + n
				+ " lines exported.");
	}

	public Definitions getDefinitions() {
		return definitions;
	}
	
}
