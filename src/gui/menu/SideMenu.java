/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */
package gui.menu;

import main.VP;

import gui.action.side.ArticleListener;
import gui.action.side.BadgeListener;
import gui.action.side.ExtractListener;
import gui.action.side.ShowListener;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which bild the "button menu" left hand side of the application 
 */
public class SideMenu {

	private VBox side;

	public SideMenu(BorderPane border, VP vp) {
		side = new VBox();

		// Shows the imported Vectron file
		Button showBtn = new Button("Show Log");
		showBtn.setMinWidth(125);
		showBtn.setOnAction(new ShowListener(border, vp));

		// No funtion in Version 0.75
		Button writeLogBtn = new Button("Write Log");
		writeLogBtn.setDisable(true);
		writeLogBtn.setMinWidth(125);

		// Extracted the article list from the file
		Button extractArticleBtn = new Button("Extract Article");
		extractArticleBtn.setMinWidth(125);
		extractArticleBtn.setOnAction(new ExtractListener(vp));

		// Displays article table in application
		Button showArticleBtn = new Button("Show Article List");
		showArticleBtn.setMinWidth(125);
		showArticleBtn.setOnAction(new ArticleListener(border, vp));

		// Extract and display the badge processes from one badge
		Button badgeBtn = new Button("Enquire Badge");
		badgeBtn.setMinWidth(125);
		badgeBtn.setOnAction(new BadgeListener(vp));
		
		side.getChildren().addAll(showBtn, writeLogBtn, extractArticleBtn,
				showArticleBtn, badgeBtn);
	}

	public VBox getSideMenu() {
		return side;
	}
}
