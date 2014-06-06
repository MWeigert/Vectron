/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

import data.enums.TaxRate;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which stores all article data
 * 
 */

public class Warengruppe {

	private Long number;
	private String name;
	private int hga;
	private int hgb;
	private TaxRate tax;
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHga() {
		return hga;
	}
	public void setHga(int hga) {
		this.hga = hga;
	}
	public int getHgb() {
		return hgb;
	}
	public void setHgb(int hgb) {
		this.hgb = hgb;
	}
	public TaxRate getTax() {
		return tax;
	}
	public void setTax(TaxRate tax) {
		this.tax = tax;
	}
	
	
	
}
