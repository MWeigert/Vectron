/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extracts the forth column of data from Vectron file
 */
public class ActionExtractor {

	private String action;

	public ActionExtractor(String line) {
		int x = 0;
		for (int i = 0; i < 3; i++) {
			x = line.indexOf(",", x) + 1;
		}
		line = line.substring(x);
		x = line.indexOf(":");
		action = line.substring(0, x);
	}

	public String getAction() {
		return action;
	}

}
