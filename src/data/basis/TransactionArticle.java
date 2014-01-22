/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 */
public class TransactionArticle {

	private Long articleNumber;
	private String articleName;
	private Double amount;
	private Double price;
	private Double totalCosts;

	public TransactionArticle() {
		articleNumber = (long) 23;
		articleName = "John Doe";
		amount = 0.00;
		price = 0.00;
		totalCosts = 0.00;
	}

	public TransactionArticle(Long number, String name, Double amount, Double price, Double costs) {
		this.articleNumber = number;
		this.articleName = name;
		this.amount = amount;
		this.price = price;
		this.totalCosts = costs;
	}

	/*
	 * Getter and Setter of the used application data
	 */

	public Long getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(Long articleNumber) {
		this.articleNumber = articleNumber;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotalCosts() {
		return totalCosts;
	}

	public void setTotalCosts(Double totalCosts) {
		this.totalCosts = totalCosts;
	}

}
