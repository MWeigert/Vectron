/**
 * 
 */
package tools.analyse;

/**
 * @author Mathias Weigert
 * 
 */
public class ExtractDefinition {

	private int definition;

	public ExtractDefinition(String line) {
		int x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",");
		String defStr = line.substring(0, x);
		definition = Integer.valueOf(defStr);
	}

	public int getDefinition() {
		return definition;
	}

}
