/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.transaction;

import java.util.Map;

import tools.analyse.ActionExtractor;
import tools.analyse.TypeExtractor;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 */
public class TransactionsExtractor {

	public TransactionsExtractor(Map<Integer, String> log) {
		System.out.println("Transaktionen werden ausgelesen.");
		System.out.println("Type: " + new TypeExtractor("10,474,1003,DT:03.01.14/08:23:57").getType());
		System.out.println("Action: " + new ActionExtractor("10,474,1003,DT:03.01.14/08:23:57").getAction());
		System.out.println("Transaktionen wurden ausgelesen.");
	}

}
