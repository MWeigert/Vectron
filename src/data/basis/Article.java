/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

import javafx.beans.property.SimpleStringProperty;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which stores all article data
 * 
 */
public class Article {

	private Long number;
	private SimpleStringProperty name;
	private Double priceLevel1;
	private Double priceLevel2;

	public Article() {
		name = new SimpleStringProperty();
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Double getPriceLevel1() {
		return priceLevel1;
	}

	public void setPriceLevel1(Double value) {
		priceLevel1 = value;
	}
	
	public Double getPriceLevel2() {
		return priceLevel2;
	}

	public void setPriceLevel2(Double value) {
		priceLevel2 = value;
	}

}