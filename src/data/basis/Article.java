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
	private Double priceLevel3;
	private Double priceLevel4;
	private Double priceLevel5;
	private Double priceLevel6;
	private Double priceLevel7;
	private Double priceLevel8;
	private Double priceLevel9;
	private Double priceLevel10;

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

	public Double getPriceLevel3() {
		return priceLevel3;
	}

	public void setPriceLevel3(Double priceLevel3) {
		this.priceLevel3 = priceLevel3;
	}

	public Double getPriceLevel4() {
		return priceLevel4;
	}

	public void setPriceLevel4(Double priceLevel4) {
		this.priceLevel4 = priceLevel4;
	}

	public Double getPriceLevel5() {
		return priceLevel5;
	}

	public void setPriceLevel5(Double priceLevel5) {
		this.priceLevel5 = priceLevel5;
	}

	public Double getPriceLevel6() {
		return priceLevel6;
	}

	public void setPriceLevel6(Double priceLevel6) {
		this.priceLevel6 = priceLevel6;
	}

	public Double getPriceLevel7() {
		return priceLevel7;
	}

	public void setPriceLevel7(Double priceLevel7) {
		this.priceLevel7 = priceLevel7;
	}

	public Double getPriceLevel8() {
		return priceLevel8;
	}

	public void setPriceLevel8(Double priceLevel8) {
		this.priceLevel8 = priceLevel8;
	}

	public Double getPriceLevel9() {
		return priceLevel9;
	}

	public void setPriceLevel9(Double priceLevel9) {
		this.priceLevel9 = priceLevel9;
	}

	public Double getPriceLevel10() {
		return priceLevel10;
	}

	public void setPriceLevel10(Double priceLevel10) {
		this.priceLevel10 = priceLevel10;
	}

}