/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which extracts the first column of data from Vectron file
 */
public class TypeExtractor {

	private int typeDef;

	public TypeExtractor(String line) {
		int x = line.indexOf(",");
		line = line.substring(0, x);
		typeDef = Integer.valueOf(line);
	}

	public int getType() {
		return typeDef;
	}

}
