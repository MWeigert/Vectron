/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extract cash point data and system info from Vectron
 *          file.
 */
public class OriginExtractor {

	private String infoString;
	private String line;
	private byte fileType;

	public OriginExtractor(String line) {
		this.line = line;
		storeExtract();
		systemExtract();
		fileTypeExtract();
	}

	private void storeExtract() {
		int x = line.indexOf(";");
		x = line.indexOf(";", x + 1);
		x = line.indexOf(";", x + 1);
		String zs = line.substring(x);
		x = zs.indexOf(",");
		zs = zs.substring(x);
		x = zs.indexOf(";");
		infoString = "Kasse: " + zs.substring(1, x);
	}

	private void systemExtract() {
		int x = line.lastIndexOf(";");
		String zs = line.substring(0, x);
		x = zs.lastIndexOf(",");
		infoString = infoString + " System: " + zs.substring(x + 1) + " | ";
	}

	private void fileTypeExtract() {
		this.fileType = 0;
		int x = line.indexOf(",");
		Integer def = new Integer(line.substring(0, x));
		if (def == 1000) {
			fileType = 1;
		}
		if (def == 10000 || def == 20000) {
			fileType = 2;
		}
		infoString += " FileType: " + fileType;
	}

	public String getInfo() {
		return infoString;
	}

	public byte getFileType() {
		return fileType;
	}

}
