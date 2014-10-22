/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse;

import data.enums.DefType1;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extracts the value from Vectron exp file type 1.
 */

public class Type1ValueExtractor {

	private String value;
	private String line;

	public Type1ValueExtractor(DefType1 type, String line) {
		this.line=line;

		switch (type) {
		case HVERSION:
			extractString();
			break;
		case PVERSION:
			extractString();
			break;
		case BUILD:
			extractString();
			break;
		case LANGUAGE:
			extractString();
			break;
		case SERIAL:
			extractString();
			break;
		case NAME:
			extractString();
			break;
		case NUMBER:
			extractString();
			break;
		case HTYPE:
			extractString();
			break;
		case FLASHFORMAT:
			extractString();
			break;
		case REVISION:
			extractString();
			break;
		case VCOM:
			extractString();
			break;
		case BUILDMONTH:
			extractString();
			break;
		case TYPE:
			extractString();
			break;
		case OSVERSION:
			extractString();
			break;
		case IP:
			extractString();
			break;
		case PWD:
			extractNumber();
			break;
		default:
			value = "UNDEF";
			break;
		}
	}

	public void extractString() {
		int anf = line.indexOf("'") + 1;
		value = line.substring(anf, line.length() - 1);
	}

	public void extractNumber(){
		int anf=line.indexOf(":")+1;
		value = line.substring(anf, line.length());
	}
	
	public String getStringValue() {
		return value;
	}
	
	public Long getLongValue() {
		return Long.valueOf(value);
	}

	public Integer getIntValue() {
		return Integer.valueOf(value);
	}
	
}
