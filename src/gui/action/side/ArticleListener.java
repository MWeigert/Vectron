/**
 * 
 */
package gui.action.side;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import main.VP;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Mathias Weigert
 * 
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
		// TODO Auto-generated method stub
		System.out.println("Begin to display articles.");
		StringBuffer info = new StringBuffer();
		Map<Long, String> articleMap = new HashMap<Long, String>();
		articleMap = vp.getArticle();
				
		for (Long number : articleMap.keySet()) {

			System.out.println("Nummer: " + number + " Artikel: "
					+ articleMap.get(number));
			info.append(number + " " + articleMap.get(number) + "\n");
			
			// for (int i = 0; i < articleMap.size(); i++) {
			// if (i > 0) {
			// info.append("\n");
			// }
			// info.append(articleMap.);
		}

		 TextArea text = new TextArea(info.toString());
		 border.setCenter(text);
	}

}