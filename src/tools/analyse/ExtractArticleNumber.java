/**
 * 
 */
package tools.analyse;

/**
 * @author Mathias Weigert
 *
 */
public class ExtractArticleNumber {

	private Long number;
	
	public ExtractArticleNumber(String line) {
		int x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",");
		this.number = Long.valueOf(line.substring(0, x));
	}
	
	public Long getNumber(){
		return number;
	}
}
