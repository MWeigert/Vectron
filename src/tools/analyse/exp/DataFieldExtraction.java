/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.exp;

import data.basis.DataField;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extracts the data from a single data field
 */
public class DataFieldExtraction {

	private DataField data;

	/*
	 * Input String should have the following format: Example: 20,INT:10
	 */
	public DataFieldExtraction(String line) {
		System.out.println("Line: " + line);
		data = new DataField(0);

		int x = line.indexOf(':');
		data.setDataValue(line.substring(x + 1));
		line = line.substring(0, x);

		x = line.indexOf(',');
		data.setDataType(line.substring(x + 1));
		line = line.substring(0, x);

		data.setDfNumber(Integer.valueOf(line));
	}

	public DataField getData() {
		return data;
	}
}
