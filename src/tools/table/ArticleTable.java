/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
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
 * @version 0.75
 * 
 *          Class which generates from an article set an table which is
 *          displayed on the main application.
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
		pl1Col.setMinWidth(55);
		TableColumn pl2Col = new TableColumn("Preis 2");
		pl2Col.setMinWidth(55);
		TableColumn pl3Col = new TableColumn("Preis 3");
		pl3Col.setMinWidth(55);
		TableColumn pl4Col = new TableColumn("Preis 4");
		pl4Col.setMinWidth(55);
		TableColumn pl5Col = new TableColumn("Preis 5");
		pl5Col.setMinWidth(55);
		TableColumn pl6Col = new TableColumn("Preis 6");
		pl6Col.setMinWidth(55);
		TableColumn pl7Col = new TableColumn("Preis 7");
		pl7Col.setMinWidth(55);
		TableColumn pl8Col = new TableColumn("Catering");
		pl8Col.setMinWidth(55);
		TableColumn pl9Col = new TableColumn("Automat");
		pl9Col.setMinWidth(55);
		TableColumn pl10Col = new TableColumn("EK Preis");
		pl10Col.setMinWidth(55);

		numberCol.setCellValueFactory(new PropertyValueFactory<Article, Long>("number"));
		nameCol.setCellValueFactory(new PropertyValueFactory<Article, String>("name"));
		pl1Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel1"));
		pl2Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel2"));
		pl3Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel3"));
		pl4Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel4"));
		pl5Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel5"));
		pl6Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel6"));
		pl7Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel7"));
		pl8Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel8"));
		pl9Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel9"));
		pl10Col.setCellValueFactory(new PropertyValueFactory<Article, Double>("priceLevel10"));

		table.setItems(articles.getArticles());
		table.getColumns().addAll(numberCol, nameCol, pl1Col, pl2Col, pl3Col, pl4Col, pl5Col, pl6Col, pl7Col, pl8Col,
				pl9Col, pl10Col);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);
		return box;
	}
}