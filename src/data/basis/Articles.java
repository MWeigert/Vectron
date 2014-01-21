/**
 * 
 */
package data.basis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Mathias Weigert
 *
 */
public class Articles {

	private ObservableList<Article> articles = FXCollections.observableArrayList();
	
	public void addArticle(Article article) {
		articles.add(article);
	}
	
	public ObservableList<Article> getArticles() {
		return articles;
	}
	
}
