/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.table;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import data.basis.Article;
import data.basis.Articles;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which generates from an article set an table which is
 *          displayed on the main application.
 */
public class ArticleTable {

	private TableView<Article> table;
//	private Articles articles;

	@SuppressWarnings("unchecked")
	public VBox getTable(Articles articles) {
//		this.articles = articles;
		VBox box = new VBox();

		Label label = new Label("Artikelliste");
		label.setFont(new Font("Arial", 20));
		table = new TableView<Article>();

		table.setEditable(true);
		table.setTableMenuButtonVisible(true);
		TableColumn<Article, Long> numberCol = new TableColumn<Article, Long>("Nr.");
		TableColumn<Article, String> nameCol = new TableColumn<Article, String>("Name (Bon)");
		nameCol.setMinWidth(128);
		TableColumn<Article, String> displayCol = new TableColumn<Article, String>("Name (Display)");
		displayCol.setMinWidth(128);
		TableColumn<Article, Integer> wgCol = new TableColumn<Article, Integer>("WG");
		TableColumn<Article, Double> pl1Col = new TableColumn<Article, Double>("Preis 1");
		pl1Col.setMinWidth(55);
		TableColumn<Article, Double> pl2Col = new TableColumn<Article, Double>("Preis 2");
		pl2Col.setMinWidth(55);
		TableColumn<Article, Double> pl3Col = new TableColumn<Article, Double>("Preis 3");
		pl3Col.setMinWidth(55);
		TableColumn<Article, Double> pl4Col = new TableColumn<Article, Double>("Preis 4");
		pl4Col.setMinWidth(55);
		TableColumn<Article, Double> pl5Col = new TableColumn<Article, Double>("Preis 5");
		pl5Col.setMinWidth(55);
		TableColumn<Article, Double> pl6Col = new TableColumn<Article, Double>("Preis 6");
		pl6Col.setMinWidth(55);
		TableColumn<Article, Double> pl7Col = new TableColumn<Article, Double>("Preis 7");
		pl7Col.setMinWidth(55);
		TableColumn<Article, Double> pl8Col = new TableColumn<Article, Double>("Preis 8");
		pl8Col.setMinWidth(55);
		TableColumn<Article, Double> pl9Col = new TableColumn<Article, Double>("Preis 9");
		pl9Col.setMinWidth(55);
		TableColumn<Article, Double> pl10Col = new TableColumn<Article, Double>("Preis 10");
		pl10Col.setMinWidth(55);

		numberCol.setCellValueFactory(new PropertyValueFactory<Article, Long>("number"));
		nameCol.setCellValueFactory(new PropertyValueFactory<Article, String>("name"));
		displayCol.setCellValueFactory(new PropertyValueFactory<Article, String>("display"));
		wgCol.setCellValueFactory(new PropertyValueFactory<Article, Integer>("wg"));
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
		table.getColumns().addAll(numberCol, nameCol, displayCol, wgCol, pl1Col, pl2Col, pl3Col, pl4Col, pl5Col, pl6Col, pl7Col, pl8Col,
				pl9Col, pl10Col);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);
		return box;
	}
}