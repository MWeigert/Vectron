/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.articles;

/**
 * @author Mathias Weigert
 * @version 0.75
 *
 * Class which extracts article number from Vectron file.
 */
public class ArticleNumberExtractor {

	private Long number;
	
	public ArticleNumberExtractor(String line) {
		int x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",");
		this.number = Long.valueOf(line.substring(0, x));
	}
	
	public Long getNumber(){
		return number;
	}
}
