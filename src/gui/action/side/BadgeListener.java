/**
 * 
 */
package gui.action.side;

import main.VP;
import gui.action.button.BadgeInputListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * 
 */
public class BadgeListener implements EventHandler<ActionEvent> {

	private VP vp;

	public BadgeListener(VP vp) {
		super();
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Stage stage = new Stage();
		stage.setTitle("Enquire Badge Revenue");

		VBox box = new VBox();
		Label label = new Label("Please enter Badge Number:");
		label.setFont(new Font("Arial", 14));
		TextField tField = new TextField();

		Button inputBtn = new Button("Input");
		inputBtn.setOnAction(new BadgeInputListener(vp, stage, tField));

		box.getChildren().addAll(label, tField, inputBtn);

		Scene scene = new Scene(box);

		stage.setScene(scene);
		stage.show();
	}

}
