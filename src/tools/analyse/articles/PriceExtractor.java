/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.articles;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which extract article price from Vectron file.
 */
public class PriceExtractor {
	
	private Double price;

	public PriceExtractor(String line){
		int x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",") + 1;
		line = line.substring(x);
		x = line.indexOf(",")+1;
		line = line.substring(x);
		price = Double.valueOf(line);
	}
	
	public Double getPrice(){
		return price;
	}
	
}
