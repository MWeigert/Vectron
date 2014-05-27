/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which extracts the third column of data from Vectron file
 */
public class DefinitionIDExtractor {

	private int definition;

	public DefinitionIDExtractor(String line) {
		int x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",");
		String defStr = line.substring(0, x);
		definition = Integer.valueOf(defStr);
	}

	public int getDefinition() {
		return definition;
	}

}
