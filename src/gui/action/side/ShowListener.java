/**
 * 
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
 * @author Tingle Driftwood
 * 
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
		// TODO Auto-generated method stub
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
