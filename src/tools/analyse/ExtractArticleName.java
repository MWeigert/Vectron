/**
 * 
 */
package tools.analyse;

/**
 * @author Mathias Weigert
 *
 */
public class ExtractArticleName {

	private String name;
	
	public ExtractArticleName(String line) {
		int x = line.indexOf("'") + 1;
		this.name = line.substring(x, line.length() - 1);
	}
	
	public String getName() {
		return name;
	}
}
