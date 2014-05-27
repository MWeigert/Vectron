/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.exp;

import java.util.Map;

import tools.analyse.DefinitionIDExtractor;
import tools.analyse.TypeExtractor;
import data.basis.DataField;
import data.basis.Definition;

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

	private Map<Integer, DataField> dataFieldMap;
	private Definition definition;

	public ExtractDefinitions(Map<Integer, String> log) {
		definition = new Definition();
		boolean onWork = true;
		int n = 0;
		String line = "";

		/* Building from multiple lines with same LineType and DefinitionID one 
		 * single line for data extraction
		 */
		do {
			if (check10k(log.get(n))) {
				n++;
			}
			String prae = extractPraeambel(log.get(n));
			definition.setLineTypeID(new TypeExtractor(log.get(n)).getType());
			definition.setDefinitionID(new DefinitionIDExtractor(log.get(n))
					.getDefinition());
			line = log.get(n);
			line = line.substring(prae.length() + 1) + ';';
			while (prae.compareTo(extractPraeambel(log.get(n + 1))) == 0) {
				String otherLine = log.get(n + 1);
				otherLine = otherLine.substring(prae.length() + 1) + ';';
				line = line + otherLine;
				n++;
			}
			onWork = false;
		} while (onWork);

		int anf = 0;
		int ende = 0;
		onWork = true;
		
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

	/*
	 * Method checking of LineTypeID refers to an cashbox id
	 */
	public boolean check10k(String line) {
		TypeExtractor typeEx = new TypeExtractor(line);
		boolean sw = false;
		if (typeEx.getType() == 10000) {
			sw = true;
		}
		return sw;
	}

	public String extractPraeambel(String line) {
		String prae = "undefined";
		int x = line.indexOf(',');
		x = line.indexOf(',', x + 1);
		prae = line.substring(0, x);
		return prae;
	}

	public Map<Integer, DataField> getDataFieldMap() {
		return dataFieldMap;
	}

}
