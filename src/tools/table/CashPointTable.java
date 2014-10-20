/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.table;

import data.basis.CashPoint;
import data.basis.CashPointArray;
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
 *          Class which generates from an cashpoint set an table which is
 *          displayed on the main application.
 */

public class CashPointTable {

	private TableView<CashPoint> table;
	
	@SuppressWarnings("unchecked")
	public VBox getTable(CashPointArray cpArray) {
		VBox box = new VBox();
		
		Label label = new Label("Kassenliste detalliert");
		label.setFont(new Font("Arial", 20));
		
		table = new TableView<CashPoint>();
		table.setEditable(true);
		table.setTableMenuButtonVisible(true);
		
		TableColumn<CashPoint, Long> numberCol = new TableColumn<CashPoint, Long>("Nr.");
		TableColumn<CashPoint, String> nameCol=new TableColumn<CashPoint, String>("Name");
		TableColumn<CashPoint, String> ipCol= new TableColumn<CashPoint, String>("IP Adresse");
		TableColumn<CashPoint, String> typeCol=new TableColumn<CashPoint, String>("Typ");

		numberCol.setCellValueFactory(new PropertyValueFactory<CashPoint, Long>("number"));
		nameCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>("name"));
		ipCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>("ip"));
		typeCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>("type"));
		
		table.setItems(cpArray.getCashPointArray());
		table.getColumns().addAll(numberCol, nameCol, ipCol, typeCol);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);
		
		return box;
	}
	
}
