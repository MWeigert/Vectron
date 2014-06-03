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
import data.basis.POS;
import data.basis.POSArray;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which generates from an POS set an table which is
 *          displayed on the main application.
 */

public class POSTable {
	
	private TableView<POS> table;
	
	@SuppressWarnings("unchecked")
	public VBox getTable(POSArray pos) {
		VBox box = new VBox();

		Label label = new Label("Kassenliste");
		label.setFont(new Font("Arial", 20));
		table = new TableView<POS>();

		table.setEditable(true);
		table.setTableMenuButtonVisible(true);
		
		TableColumn<POS, Long> numberCol = new TableColumn<POS, Long>("Nr.");
		TableColumn<POS, String> nameCol=new TableColumn<POS, String>("Name");
		TableColumn<POS, String> ipCol= new TableColumn<POS, String>("IP Adresse");
		TableColumn<POS, String> typeCol=new TableColumn<POS, String>("Typ");

		numberCol.setCellValueFactory(new PropertyValueFactory<POS, Long>("number"));
		nameCol.setCellValueFactory(new PropertyValueFactory<POS, String>("name"));
		ipCol.setCellValueFactory(new PropertyValueFactory<POS, String>("ip"));
		typeCol.setCellValueFactory(new PropertyValueFactory<POS, String>("type"));
		
		table.setItems(pos.getPosArray());
		table.getColumns().addAll(numberCol, nameCol, ipCol, typeCol);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);
		
		return box;
	}

}
