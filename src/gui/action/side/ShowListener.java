/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.side;

import java.util.HashMap;
import java.util.Map;

import main.VP;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Eventhandler -> handles the displaying of the vectron export file
 */
public class ShowListener implements EventHandler<ActionEvent> {

	private VP vp;
	private Map<Integer, String> log;
	private BorderPane border;

	public ShowListener(BorderPane border, VP vp) {
		super();
		this.border = border;
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		StringBuffer info = new StringBuffer();
		log = new HashMap<Integer, String>();
		log = vp.getLog();

		for (int i = 0; i < log.size(); i++) {
			if (i > 0) {
				info.append("\n");
			}
			info.append(log.get(i));
		}
		TextArea text = new TextArea(info.toString());
		border.setCenter(text);
	}

}
