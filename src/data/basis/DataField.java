/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which stores all data field data
 * 
 */

public class DataField {

	private int dfNumber;
	private String dataType;
	private String dataValue;

	public DataField(int dfNumber) {
		this.dfNumber = dfNumber;
	}

	/**
	 * @return the dfNumber
	 */
	public int getDfNumber() {
		return dfNumber;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @return the dataValue
	 */
	public String getDataValue() {
		return dataValue;
	}

	/**
	 * @param dfNumber the dfNumber to set
	 */
	public void setDfNumber(int dfNumber) {
		this.dfNumber = dfNumber;
	}

	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	/**
	 * @param dataValue the dataValue to set
	 */
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}

}
