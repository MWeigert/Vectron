/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.side;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import main.VP;
import tools.analyse.articles.ArticlesExtractor;
import tools.analyse.exp.ExtractDefinitions;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Eventhandler -> handles complete data field extraction from the exp
 *          file.
 */

public class ExtractListener implements EventHandler<ActionEvent> {

	private VP vp;

	public ExtractListener(VP vp) {
		super();
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		ExtractDefinitions exDef = new ExtractDefinitions(vp.getLog());
		vp.setDefinitions(exDef.getDefinitions());
		ArticlesExtractor artEx = new ArticlesExtractor(vp.getDefinitions());
		vp.setArticles(artEx.getArticles());
	}

}
