/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.button;

import main.VP;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Eventhandler of the input button -> starts the enquire badge process
 */
public class BadgeInputListener implements EventHandler<ActionEvent> {

	private TextField field;
	private Stage stage;
	private VP vp;

	public BadgeInputListener(VP vp, Stage stage, TextField field) {
		super();
		this.vp = vp;
		this.field = field;
		this.stage = stage;
	}

	// Test Badge Nr.: 40859
	// Zeile: 10,898,32002,TX:' 40859'
	@Override
	public void handle(ActionEvent arg0) {
		vp.setNumber(Long.valueOf(field.getText()));
		stage.close();
	}

}
