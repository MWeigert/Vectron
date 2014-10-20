/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
package data.basis;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which stores all POS data extracted from file type 1
 * 
 */

public class CashPoint {

	private Long number;
	private String name;
	private String ip;
	private String hardwareVersion;
	private String softwareVersion;
	private String build;
	private String language;
	private String serialNumber;
	private Integer hardwareType;
	private Integer flashFormat;
	private String HardwareRevision;
	private String type;
	private String osVersion;
	private String dumpPWD;
	
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
	public String getHardwareVersion() {
		return hardwareVersion;
	}
	public void setHardwareVersion(String hardwareVersion) {
		this.hardwareVersion = hardwareVersion;
	}
	public String getSoftwareVersion() {
		return softwareVersion;
	}
	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public Integer getHardwareType() {
		return hardwareType;
	}
	public void setHardwareType(Integer hardwareType) {
		this.hardwareType = hardwareType;
	}
	public Integer getFlashFormat() {
		return flashFormat;
	}
	public void setFlashFormat(Integer flashFormat) {
		this.flashFormat = flashFormat;
	}
	public String getHardwareRevision() {
		return HardwareRevision;
	}
	public void setHardwareRevision(String hardwareRevision) {
		HardwareRevision = hardwareRevision;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getDumpPWD() {
		return dumpPWD;
	}
	public void setDumpPWD(String dumpPWD) {
		this.dumpPWD = dumpPWD;
	}
	
}
