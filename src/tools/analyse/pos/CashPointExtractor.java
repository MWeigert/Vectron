/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.pos;

import java.util.Map;

import tools.analyse.DefType1Extractor;
import tools.analyse.Type1ValueExtractor;
import tools.analyse.TypeExtractor;
import data.basis.CashPoint;
import data.basis.CashPointArray;
import data.enums.DefType1;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extract a complete cashpoint set from the Vectron file
 *          (type 1).
 */

public class CashPointExtractor {

	private CashPointArray cashPointArray;

	public CashPointExtractor(Map<Integer, String> log) {
		int anz = 0;
		boolean stop = false;
		String line = new String();
		int i = 2;
		DefType1 type;
		CashPoint cp = new CashPoint();

		cashPointArray = new CashPointArray();

		System.out.println("Kassen werden extrahiert.");

		do {
			line = log.get(i);
			TypeExtractor typeEx = new TypeExtractor(line);
			if (typeEx.getType() == 1000) {
				cashPointArray.addCashPoint(cp);
				cp = new CashPoint();
				stop = true;
			} else {
				DefType1Extractor extractor = new DefType1Extractor(line);
				type = extractor.getDefType1();
				if (!"UNKNOWN".equals(type)) {
					switch (type) {
					case HVERSION:
						cp.setHardwareVersion(new Type1ValueExtractor(type,
								line).getStringValue());
						break;
					case PVERSION:
						cp.setHardwareVersion(new Type1ValueExtractor(type,
								line).getStringValue());
						break;
					case BUILD:
						cp.setBuild(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					case LANGUAGE:
						cp.setLanguage(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					case SERIAL:
						cp.setSerialNumber(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					case NAME:
						cp.setName(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					case NUMBER:
						cp.setNumber(new Type1ValueExtractor(type, line)
								.getLongValue());
						break;
					case HTYPE:
						cp.setHardwareType(new Type1ValueExtractor(type, line)
								.getIntValue());
						break;
					case FLASHFORMAT:
						cp.setFlashFormat(new Type1ValueExtractor(type, line)
								.getIntValue());
						break;
					case REVISION:
						cp.setHardwareRevision(new Type1ValueExtractor(type,
								line).getStringValue());
						break;
					case VCOM:
						// not yet implemented
						break;
					case BUILDMONTH:
						// not yet implemented
						break;
					case TYPE:
						// not yet implemented
						break;
					case OSVERSION:
						cp.setOsVersion(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					case IP:
						cp.setIp(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					case PWD:
						cp.setDumpPWD(new Type1ValueExtractor(type, line)
								.getStringValue());
						break;
					default:
						System.out.println("Troubles in CashPointExtractor");
						break;
					}
				}
			}
			if (stop) {
				anz++;
				stop = false;
			}
			i++;
		} while (i != log.size());

		System.out.println("Es wurden " + anz + " Kassen extrahiert.");
	}

	public CashPointArray getCashPointArray() {
		return cashPointArray;
	}

}
