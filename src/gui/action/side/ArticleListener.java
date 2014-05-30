/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.side;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import main.VP;
import tools.table.ArticleTable;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Eventhandler -> handles complete display articles process
 */
public class ArticleListener implements EventHandler<ActionEvent> {

	private BorderPane border;
	private VP vp;

	public ArticleListener(BorderPane border, VP vp) {
		super();
		this.border = border;
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		ArticleTable table = new ArticleTable();
		border.setCenter(table.getTable(vp.getArticles()));
	}

}