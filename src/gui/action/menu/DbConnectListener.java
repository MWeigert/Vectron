/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package gui.action.menu;

import java.sql.Connection;
import java.sql.SQLException;

import db.tools.DbConnection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import main.VP;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Eventhandler of db connect menu -> handles complete database
 *          connection process
 */

public class DbConnectListener implements EventHandler<ActionEvent> {

//	private BorderPane border = new BorderPane();
//	private VP vp;

	public DbConnectListener(BorderPane border, VP vp) {
		super();
//		this.border = border;
//		this.vp = vp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		DbConnection dbCon = new DbConnection();
		try {
			@SuppressWarnings("unused")
			Connection conn = dbCon.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
