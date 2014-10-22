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

		// Number column
		TableColumn<CashPoint, Long> numberCol = new TableColumn<CashPoint, Long>(
				"Nr.");
		numberCol.setPrefWidth(50);
		numberCol
				.setCellValueFactory(new PropertyValueFactory<CashPoint, Long>(
						"number"));

		// Name column
		TableColumn<CashPoint, String> nameCol = new TableColumn<CashPoint, String>(
				"Name");
		nameCol.setPrefWidth(150);
		nameCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"name"));

		// IP column
		TableColumn<CashPoint, String> ipCol = new TableColumn<CashPoint, String>(
				"IP Adresse");
		ipCol.setPrefWidth(100);
		ipCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"ip"));

		// Serial number column
		TableColumn<CashPoint, String> serialCol = new TableColumn<CashPoint, String>(
				"Seriennummer");
		serialCol.setPrefWidth(100);
		serialCol
				.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
						"serialNumber"));

		// Hardware version column
		TableColumn<CashPoint, String> hVersionCol = new TableColumn<CashPoint, String>(
				"Hardware Version");
		hVersionCol.setPrefWidth(150);
		hVersionCol
				.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
						"hardwareVersion"));

		// Hardware type column
		TableColumn<CashPoint, String> hTypeCol = new TableColumn<CashPoint, String>(
				"Hardware Typ");
		hTypeCol.setPrefWidth(100);
		hTypeCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"hardwareType"));

		// Type column
		TableColumn<CashPoint, String> typeCol = new TableColumn<CashPoint, String>(
				"Typ");
		typeCol.setPrefWidth(50);
		typeCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"type"));

		// Software version column
		TableColumn<CashPoint, String> sVersionCol = new TableColumn<CashPoint, String>(
				"Programm Version");
		sVersionCol.setPrefWidth(150);
		sVersionCol
				.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
						"softwareVersion"));

		// Language column
		TableColumn<CashPoint, String> langCol = new TableColumn<CashPoint, String>(
				"Sprache");
		langCol.setPrefWidth(75);
		langCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"language"));

		// OS version column
		TableColumn<CashPoint, String> osVersionCol = new TableColumn<CashPoint, String>(
				"OS Version");
		osVersionCol.setPrefWidth(100);
		osVersionCol
				.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
						"osVersion"));

		// Build column
		TableColumn<CashPoint, String> buildCol = new TableColumn<CashPoint, String>(
				"Build");
		buildCol.setPrefWidth(50);
		buildCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"build"));

		// Revision column
		TableColumn<CashPoint, String> revCol = new TableColumn<CashPoint, String>(
				"Revision");
		revCol.setPrefWidth(125);
		revCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"hardwareRevision"));

		// Flash format column
		TableColumn<CashPoint, String> flashCol = new TableColumn<CashPoint, String>(
				"Flashformat");
		flashCol.setPrefWidth(75);
		flashCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"flashFormat"));

		// Dump password column
		TableColumn<CashPoint, String> pwdCol = new TableColumn<CashPoint, String>(
				"PWD");
		pwdCol.setPrefWidth(50);
		pwdCol.setCellValueFactory(new PropertyValueFactory<CashPoint, String>(
				"dumpPWD"));

		table.setItems(cpArray.getCashPointArray());
		table.getColumns().addAll(numberCol, nameCol, ipCol, serialCol,
				hVersionCol, hTypeCol, typeCol, sVersionCol, langCol,
				osVersionCol, buildCol, revCol, flashCol, pwdCol);

		box.setSpacing(5);
		box.setPadding(new Insets(10, 10, 10, 10));
		box.getChildren().addAll(label, table);

		return box;
	}

}
