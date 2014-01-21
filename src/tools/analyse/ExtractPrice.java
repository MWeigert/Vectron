/**
 * 
 */
package tools.analyse;

/**
 * @author Mathias Weigert
 *
 */
public class ExtractPrice {
	
	private Double price;

	public ExtractPrice(String line){
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
