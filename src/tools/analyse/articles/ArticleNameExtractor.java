/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.articles;

/**
 * @author Mathias Weigert
 * @version 0.75
 *
 * Class which extract article name from Vectron file.
 */
public class ArticleNameExtractor {

	private String name;
	
	public ArticleNameExtractor(String line) {
		int x = line.indexOf("'") + 1;
		this.name = line.substring(x, line.length() - 1);
	}
	
	public String getName() {
		return name;
	}
}
