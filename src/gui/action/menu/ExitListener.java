/**
 * 
 */
package gui.action.menu;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 * 
 */
public class ExitListener implements EventHandler<javafx.event.ActionEvent> {

	private Stage primaryStage;

	public ExitListener(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
	}

	
	/*
	 * Actionlistener which close the application.
	 */
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		primaryStage.close();
	};

}
