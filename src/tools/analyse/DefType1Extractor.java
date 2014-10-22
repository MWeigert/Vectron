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
 *          Class which extracts the definition column from Vectron exp file
 *          type 1
 */

public class DefType1Extractor {

	private DefType1 type;

	public DefType1Extractor(String line) {
		int anf = line.indexOf("(") + 1;
		int ende = line.indexOf(")");
		type = DefType1.UNKNOWN;

		if (line.substring(anf, ende).equals("20,1")) {
			type = DefType1.HVERSION;
		}
		if (line.substring(anf, ende).equals("20:2,1")) {
			type = DefType1.PVERSION;
		}
		if (line.substring(anf, ende).equals("20:3,1")) {
			type = DefType1.BUILD;
		}
		if (line.substring(anf, ende).equals("20:4,1")) {
			type = DefType1.LANGUAGE;
		}
		if (line.substring(anf, ende).equals("20:5,1")) {
			type = DefType1.SERIAL;
		}
		if (line.substring(anf, ende).equals("20:6,1")) {
			type = DefType1.NAME;
		}
		if (line.substring(anf, ende).equals("20:7,1")) {
			type = DefType1.NUMBER;
		}
		if (line.substring(anf, ende).equals("20:8,1")) {
			type = DefType1.HTYPE;
		}
		if (line.substring(anf, ende).equals("20:9,1")) {
			type = DefType1.FLASHFORMAT;
		}
		if (line.substring(anf, ende).equals("20:10,1")) {
			type = DefType1.REVISION;
		}
		if (line.substring(anf, ende).equals("20:11,1")) {
			type = DefType1.VCOM;
		}
		if (line.substring(anf, ende).equals("20:12,1")) {
			type = DefType1.BUILDMONTH;
		}
		if (line.substring(anf, ende).equals("20:14,1")) {
			type = DefType1.TYPE;
		}
		if (line.substring(anf, ende).equals("20:15,1")) {
			type = DefType1.OSVERSION;
		}
		if (line.substring(anf, ende).equals("31,3")) {
			type = DefType1.IP;
		}
		if (line.substring(anf, ende).equals("31,22")) {
			type = DefType1.PWD;
		}
	}

	public DefType1 getDefType1() {
		return type;
	}

}
