/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.exp;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which made the extraction of the preamble (first two colums of
 *          the data row of an export file.
 * 
 */

public class PreambleExtraction {

	private String preamble;

	public PreambleExtraction(String line) {
		try {
			int x = line.indexOf(',');
			x = line.indexOf(',', x + 1);
			this.preamble = line.substring(0, x);
		} catch (NullPointerException e) {
			System.out.println("Dobby catched a " + e
					+ " master should give Dobby a commendation.");
			this.preamble = "undefined";
		}
	}

	public String getPreamble() {
		return preamble;
	}

}
