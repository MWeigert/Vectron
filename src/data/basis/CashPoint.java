/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
package data.basis;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which stores all POS data extracted from file type 1
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
	private String hardwareRevision;
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
		return hardwareRevision;
	}

	public void setHardwareRevision(String hardwareRevision) {
		this.hardwareRevision = hardwareRevision;
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

	// Method generats an .csv (Excel) String which can be used to export data
	// to Excel
	public String toString() {
		String str = "";
		if (this.number == null) {
			str += "; ";
		} else {
			str += this.number + "; ";
		}
		if (this.name == null) {
			str += "; ";
		} else
			str += this.name + "; ";
		if (this.ip == null) {
			str += "; ";
		} else {
			str += this.ip + "; ";
		}
		if (this.serialNumber == null) {
			str += "; ";
		} else {
			str += this.serialNumber + "; ";
		}
		if (this.hardwareVersion == null) {
			str += "; ";
		} else {
			str += this.hardwareVersion + "; ";
		}
		if (this.hardwareType == null) {
			str += "; ";
		} else {
			str += this.hardwareType + "; ";
		}
		if (this.type == null) {
			str += "; ";
		} else {
			str += this.type + "; ";
		}
		if (this.softwareVersion == null) {
			str += "; ";
		} else {
			str += this.softwareVersion + "; ";
		}
		if (this.language == null) {
			str += "; ";
		} else {
			str += this.language + "; ";
		}
		if (this.osVersion == null) {
			str += "; ";
		} else {
			str += this.osVersion + "; ";
		}
		if (this.build == null) {
			str += "; ";
		} else {
			str += this.build + "; ";
		}
		if (this.hardwareRevision == null) {
			str += "; ";
		} else {
			str += this.hardwareRevision + "; ";
		}
		if (this.flashFormat == null) {
			str += "; ";
		} else {
			str += this.flashFormat + "; ";
		}
		if (this.dumpPWD == null) {
			// do nothing
		} else {
			str += this.dumpPWD;
		}
		return str;
	}
}
