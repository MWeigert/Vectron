/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.side;

import data.basis.Articles;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import main.VP;

import tools.analyse.articles.ArticlesExtractor;

/**
 * @author Mathias Weigert
 * @version 0.75
 *
 * Eventhandler -> handles complete article extraction from the
 * export file.
 */
public class ExtractListener implements EventHandler<ActionEvent>{
	
	private VP vp;
	private Articles articles;
	
	public ExtractListener(VP vp) {
		super();
		this.vp=vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		articles = new ArticlesExtractor(vp.getLog()).getArticles();
		vp.setArticles(articles);
	}

}