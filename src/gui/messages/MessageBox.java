/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.messages;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class should be display user information on purpose.
 * 
 */

public class MessageBox {

	public MessageBox(String title, String text) {

		Stage msgBox = new Stage();
		VBox vBox = new VBox();
		Scene scene = new Scene(vBox);
		
		Text info = new Text(text);
		
		vBox.getChildren().addAll(info);

		msgBox.setTitle(title);
		msgBox.setScene(scene);
		msgBox.show();
	}

}
