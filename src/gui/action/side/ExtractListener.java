/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.side;

import gui.messages.MessageBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import main.VP;
import tools.analyse.articles.ArticlesExtractor;
import tools.analyse.exp.ExtractDefinitions;
import tools.analyse.pos.CashPointExtractor;
import tools.analyse.pos.POSExtractor;

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

		if (vp.getFileType() == 1) {
			CashPointExtractor cpEx = new CashPointExtractor(vp.getLog());
			vp.setCpArray(cpEx.getCashPointArray());
			System.out.println(cpEx.getCpArr());
			vp.setCpArr(cpEx.getCpArr());
			new MessageBox("Information", "Extraction of type 1 file finished");
		}

		if (vp.getFileType() == 2) {
			ExtractDefinitions exDef = new ExtractDefinitions(vp.getLog());
			vp.setDefinitions(exDef.getDefinitions());
			ArticlesExtractor artEx = new ArticlesExtractor(vp.getDefinitions());
			vp.setArticles(artEx.getArticles());
			POSExtractor posEx = new POSExtractor(vp.getDefinitions());
			vp.setPos(posEx.getPOSArray());
		}
	}

}
