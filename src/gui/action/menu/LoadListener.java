/**
 * 
 */
package gui.action.menu;

import java.io.File;
import java.util.Map;

import main.VP;
import tools.analyse.ExtractOrigin;
//import tools.analyse.CheckKindOfLog;
import tools.io.LogLoader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

/**
 * @author Mathias Weigert
 * 
 */
public class LoadListener implements EventHandler<ActionEvent> {

	private BorderPane border = new BorderPane();
	private VP vp;
	private Map<Integer, String> log;

	public LoadListener(BorderPane border, VP vp) {
		super();
		this.border = border;
		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();

		File file = fc.showOpenDialog(null);

		LogLoader loader = new LogLoader(file);

		vp.setLog(loader.getLog());
		log = loader.getLog();

		HBox hBox = new HBox();

		ExtractOrigin extract = new ExtractOrigin(log.get(0));

		Text logType = new Text(extract.getInfo() + " ");
		logType.setFill(Color.DARKRED);
		logType.setFont(Font.font("Arial", FontWeight.BOLD, 12));

		Text text = new Text("Actual file: " + file.getPath());
		text.setFill(Color.BLUE);
		text.setFont(Font.font("Arial", FontPosture.ITALIC, 12));

		hBox.getChildren().addAll(logType, text);

		border.setBottom(hBox);

		border.setCenter(new TextArea());
	}

}
