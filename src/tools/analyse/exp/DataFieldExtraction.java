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
		data = new DataField(0);
		boolean sw = true;

		int x = line.indexOf(':');
		// Extract data field value
		if (x == -1) {
			x = line.indexOf(',');
			sw = false;
		}
		data.setDataValue(line.substring(x + 1));
		line = line.substring(0, x);

		// Extract data field type
		if (sw) {
			x = line.indexOf(',');
			data.setDataType(line.substring(x + 1));
			line = line.substring(0, x);
		} else {
			data.setDataType("undef");
		}

		// Extract data field number
		data.setDfNumber(Integer.valueOf(line));
		System.out.println("Finished Data Field Extraction");
		System.out.println("Nr.: "+ data.getDfNumber()+" Type: "+data.getDataType()+" Value: "+data.getDataValue());
	}

	public DataField getData() {
		return data;
	}
}
