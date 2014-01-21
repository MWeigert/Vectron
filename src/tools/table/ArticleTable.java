/**
 * 
 */
package tools.table;

import data.basis.Article;
import data.basis.Articles;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * @author Mathias Weigert
 * 
 */
public class ArticleTable {

	private TableView table;
	private Articles articles;

	public VBox getTable(Articles articles) {
		this.articles = articles;
		VBox box = new VBox();

		Label label = new Label("Artikelliste");
		label.setFont(new Font("Arial", 20));
		table = new TableView();

		table.setEditable(true);
		TableColumn numberCol = new TableColumn("Nr.");
		TableColumn nameCol = new TableColumn("Name");
		TableColumn pl1Col = new TableColumn("Preis 1");
		TableColumn pl2Col = new TableColumn("Preis 2");

		numberCol.setCellValueFactory(new PropertyValueFactory<Article, Long>(
				"number"));
		nameCol.setCellValueFactory(new PropertyValueFactory<Article, String>(
				"name"));
		pl1Col.setCellValueFactory(new PropertyValueFactory<Article, Double>(
				"priceLevel1"));
		pl2Col.setCellValueFactory(new PropertyValueFactory<Article, Double>(
				"priceLevel2"));

		table.setItems(articles.getArticles());
		table.getColumns().addAll(numberCol, nameCol, pl1Col, pl2Col);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);
		return box;
	}
}