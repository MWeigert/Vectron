/**
 * 
 */
package gui.menuitem;

import gui.action.menu.ExitListener;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 *
 */
public class ExitItem {
	
	MenuItem exitItem;
	
	public ExitItem(Stage primaryStage){
		ExitListener exitListener = new ExitListener(primaryStage);
		
		exitItem=new MenuItem("Exit");
		exitItem.setOnAction(exitListener);
	}

	public MenuItem getExitItem() {
		return exitItem;		
	}
	
}
