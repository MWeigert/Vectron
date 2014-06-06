/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.menu;

import main.VP;
import tools.table.ArticleTable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Eventhandler -> handles complete display Warengruppen process
 */
public class WgListener implements EventHandler<ActionEvent>{

	private BorderPane border;
	private VP vp;

	public WgListener(BorderPane border, VP vp) {
		super();
		this.border = border;
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		
		border.setCenter(table.getTable(vp.getArticles()));
	}

}
