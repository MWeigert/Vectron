/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * List of articles -> used in ArticleTable
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
