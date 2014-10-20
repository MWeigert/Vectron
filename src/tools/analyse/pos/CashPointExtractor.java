/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.pos;

import java.util.Map;

import data.basis.CashPointArray;

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
		
		System.out.println("Kassen werden extrahiert.");
		
		do {
			line = log.get(i);
			if (stop) {
				//Kasse array hinzufügen
				anz++;
				stop=false;
			}
			i++;
		} while (i!=log.size());

		System.out.println("Es wurden " + anz + " Kassen extrahiert.");
	}

	public CashPointArray getCashPointArray() {
		return cashPointArray;
	}

}
