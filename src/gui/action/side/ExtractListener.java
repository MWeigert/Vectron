/**
 * 
 */
package gui.action.side;

import java.util.Map;

import tools.analyse.ExtractArticle;
import main.VP;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Mathias Weigert
 * 
 */
public class ExtractListener implements EventHandler<ActionEvent> {

	private VP vp;
	private Map<Integer, String> log;

	public ExtractListener(VP vp) {
		super();
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		log = vp.getLog();
		ExtractArticle extractor = new ExtractArticle();
		extractor.extractArticles(log);
		vp.setArticle(extractor.getArticleMap());
	}

}
