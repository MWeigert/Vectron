/**
 * 
 */
package main;

import gui.menu.FileMenu;

import java.util.HashMap;
import java.util.Map;

import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 *
 */
public class VP extends Application{
	
	private BorderPane border;
	private Map<Integer, String> log;
	
	private Stage primaryStage; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = new Stage();
		
		border = new BorderPane();
		log = new HashMap<Integer, String>();
		
		MenuBar menu = new MenuBar();
		menu.getMenus().add(new FileMenu(primaryStage, this).getFileMenu());
		
		border.setTop(menu);
		
		Scene scene = new Scene(border);
		
		primaryStage.setTitle("Vectron Parser");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public BorderPane getBorderPane() {
		return border;
	}
	
}
