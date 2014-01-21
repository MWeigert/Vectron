/**
 * 
 */
package gui.action.side;

import data.basis.Articles;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import main.VP;
import tools.analyse.ExtractArticles;

/**
 * @author Mathias Weigert
 *
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
		articles = new ExtractArticles(vp.getLog()).getArticles();
		vp.setArticles(articles);
	}

}
