/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
package gui.action.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Eventhandler to exit application via file menu
 * 
 */
public class ExitListener implements EventHandler<javafx.event.ActionEvent> {

	private Stage primaryStage;

	public ExitListener(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
	}

	@Override
	public void handle(ActionEvent arg0) {
		primaryStage.close();
	};

}
