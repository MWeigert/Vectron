/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.pos;

import java.util.ArrayList;

import data.basis.DataField;
import data.basis.Definition;
import data.basis.Definitions;
import data.basis.POS;
import data.basis.POSArray;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extract a complete article set from the Vectron file.
 */
public class POSExtractor {

	private POSArray posArray;

	public POSExtractor(Definitions defs) {
		int anz = 0;

		ArrayList<DataField> dfList = new ArrayList<>();
		posArray = new POSArray();

		System.out.println("Kassen werden ausgelesen.");
		ArrayList<Definition> data = defs.getDefinitions();
		for (Definition def : data) {
			if (def.getLineTypeID() == 20000) {
				POS pos = new POS();
				dfList = def.getDataField();
				for (DataField df : dfList) {
					switch (df.getDfNumber()) {
					// ID 9 = Type of POS
					case 9:
						pos.setType(df.getDataValue());
						break;
					// ID 10 = POS Number
					case 10:
						Long number = Long.valueOf(df.getDataValue());
						pos.setNumber(number);
						break;
					// ID 11 => POS Name
					case 11:
						pos.setName(df.getDataValue());
						break;
					// ID 19 => POS IP address
					case 19:
						pos.setIp(df.getDataType());
						break;
					// Last data field in POS information line
					case 51:
						posArray.addPOS(pos);
						anz++;
						break;
					}
				}
			}
		}
		System.out.println("Es wurden " + anz + " Kassen exportiert.");
	}

	public POSArray getPOSArray() {
		return posArray;
	}

}
