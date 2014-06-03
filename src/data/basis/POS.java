/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which stores all POS data
 * 
 */

public class POS {
	
	private Long number;
	private String name;
	private String ip;
	private String type;
	
	public POS() {
		this.number = (long) 0;
		this.name = "";
		this.ip ="";
		this.type="";
	}
	
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
