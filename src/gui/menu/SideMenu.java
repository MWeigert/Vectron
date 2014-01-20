/**
 * 
 */
package gui.menu;

import main.VP;
import gui.action.side.ArticleListener;
import gui.action.side.ExtractListener;
import gui.action.side.ShowListener;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * @author Tingle Driftwood
 * 
 */
public class SideMenu {

	private VBox side;

	public SideMenu(BorderPane border, VP vp) {
		side = new VBox();

		Button showBtn = new Button("Show Log");
		showBtn.setMinWidth(100);
		showBtn.setOnAction(new ShowListener(border, vp));

		Button writeLogBtn = new Button("Write Log");
		writeLogBtn.setMinWidth(100);

		Button extractArticleBtn = new Button("Extract Article");
		extractArticleBtn.setMinWidth(100);
		extractArticleBtn.setOnAction(new ExtractListener(vp));

		Button showArticleBtn = new Button("Show Article List");
		showArticleBtn.setMinWidth(100);
		showArticleBtn.setOnAction(new ArticleListener(border, vp));

		side.getChildren().addAll(showBtn, writeLogBtn, extractArticleBtn,
				showArticleBtn);
	}

	public VBox getSideMenu() {
		return side;
	}
}
