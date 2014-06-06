/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
 
package tools.table;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import data.basis.Warengruppe;
import data.basis.Warengruppen;
import data.enums.TaxRate;

 /**
  * @author Mathias Weigert
  * @version 0.75
  * 
  *          Class which generates from an Warengruppen set an table which is
  *          displayed on the main application.
  */
 
public class WgTable {

	private TableView<Warengruppe> table;
//	private Articles articles;

	@SuppressWarnings("unchecked")
	public VBox getTable(Warengruppen waren) {
//		this.articles = articles;
		VBox box = new VBox();

		Label label = new Label("Warengruppen");
		label.setFont(new Font("Arial", 20));
		table = new TableView<Warengruppe>();

		table.setEditable(true);
		table.setTableMenuButtonVisible(true);
		TableColumn<Warengruppe, Long> numberCol = new TableColumn<Warengruppe, Long>("Nr.");
		TableColumn<Warengruppe, String> nameCol = new TableColumn<Warengruppe, String>("Name");
		TableColumn<Warengruppe, Integer> hgaCol = new TableColumn<Warengruppe, Integer>("Hauptgruppe A");
		TableColumn<Warengruppe, Integer> hgbCol = new TableColumn<>("Hauptgruppe B");
		TableColumn<Warengruppe, TaxRate> taxCol = new TableColumn<Warengruppe, TaxRate>("MwSt.");

		table.setItems(waren.getWgArray());
		table.getColumns().addAll(numberCol, nameCol, hgaCol, hgbCol, taxCol);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);
		return box;
	}
}