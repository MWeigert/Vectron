/** Class which generate and handle the file menu of the log parser.
 * 
 */
package gui.menu;

import main.VP;
import gui.menuitem.ExitItem;
import gui.menuitem.LoadItem;
import gui.menuitem.SaveItem;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 * 
 */
public class FileMenu {

	Menu fileMenu;

	public FileMenu(Stage primaryStage, VP vp) {
		fileMenu = new Menu("File");

		// Define submenu's of the file menu
		LoadItem loadItem = new LoadItem(vp.getBorderPane(), vp);
		SaveItem saveItem = new SaveItem();
		ExitItem exitItem = new ExitItem(primaryStage);

		fileMenu.getItems().addAll(loadItem.getLoadItem(), saveItem.getSaveItem(), exitItem.getExitItem());
	}

	public Menu getFileMenu() {
		return fileMenu;
	}

}
