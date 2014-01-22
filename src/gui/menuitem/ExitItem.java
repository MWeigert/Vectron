/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.menuitem;

import gui.action.menu.ExitListener;

import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * @version 0.75
 *
 * Class generates menu item "Exit" for drop down menu
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
