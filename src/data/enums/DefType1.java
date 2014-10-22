/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.enums;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Enum which handles the different type of data which can be extracted
 *          from an type 1 export file
 */

public enum DefType1 {

	HVERSION, // Hardware Version (20,1)
	PVERSION, // Program Version (20:2,1)
	BUILD, // Build (20:3,1)
	LANGUAGE, // Language (20:4,1)
	SERIAL, // Serial number (20:5,1)
	NAME, // Name (20:6,1)
	NUMBER, // Number(20:7,1)
	HTYPE, // Hardware Type (20:8,1)
	FLASHFORMAT, // Flash format (20:9,1)
	REVISION, // Hardware Revision (20:10,1)
	VCOM, // VCOM Support (20:11,1)
	BUILDMONTH, // Build month (20:12,1)
	TYPE, // Type (20:14,1)
	OSVERSION, // OS version (20:15,1)
	IP, // IP address (31,3)
	PWD, // Dump password (31,22)
	UNKNOWN // Unknown
}
