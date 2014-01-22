/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which stores all data from one Transaction
 */
public class Transaction {

	private Map<Integer, String> transLog;
	private Long badgeNumber;
	private TransactionArticle[] transactionArticles;

	public Transaction() {
		transLog = new HashMap<Integer, String>();
		badgeNumber = (long) 0;
		}

	/*
	 * Getter and Setter of the used data
	 */

	public Map<Integer, String> getTransLog() {
		return transLog;
	}

	public void setTransLog(Map<Integer, String> transLog) {
		this.transLog = transLog;
	}

	public String getTransLogLine(int number) {
		return transLog.get(number);
	}

	public void putTransLogLine(int number, String line) {
		transLog.put(number, line);
	}

	public Long getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(Long value) {
		badgeNumber = value;
	}

//	public TransactionArticle[] getTransactionArticle(int pos) {
//		return transactionArticles[pos];
//	}
//
//	public void setTransactionArticle(int pos, TransactionArticle[] transactionArticles) {
//		this.transactionArticles[pos] = transactionArticles;
//	}

	public TransactionArticle[] getTransactionArticles() {
		return transactionArticles;
	}

	public void setTransactionArticles(TransactionArticle[] transactionArticles) {
		this.transactionArticles = transactionArticles;
	}
}
