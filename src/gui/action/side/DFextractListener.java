/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.side;

import java.util.Map;

import tools.analyse.exp.ExtractDefinitions;
import main.VP;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Mathias Weigert
 * @version 0.75
 *
 * Eventhandler -> handles complete data field extraction from the
 * exp file.
 */

public class DFextractListener implements EventHandler<ActionEvent> {

	private VP vp;

	public DFextractListener(VP vp) {
		super();
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		Map<Integer, String> log = vp.getLog();
		String line = log.get(10);
		new ExtractDefinitions(vp.getLog());
	}

}
