/**
 * 
 */
package data.basis;

/**
 * @author Mathias Weigert
 * 
 */
public class Article {

	private Double number;
	private String name;

	public Article(Double number, String name) {
		this.number = number;
		this.name = name;
	}

	public Double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
