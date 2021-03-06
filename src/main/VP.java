/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package main;

import gui.menu.ArticleMenu;
import gui.menu.DbMenu;
import gui.menu.ExportMenu;
import gui.menu.FileMenu;
import gui.menu.PosMenu;
import gui.menu.SideMenu;
import gui.menu.WGMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import data.basis.Articles;
import data.basis.CashPoint;
import data.basis.CashPointArray;
import data.basis.Definitions;
import data.basis.POSArray;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Main class of application opens the application window and hold all
 *          important used data.
 */
public class VP extends Application {

	private BorderPane border;
	private Map<Integer, String> log;
	private TreeMap<Long, String> articleMap;
	private POSArray pos;
	private CashPointArray cpArray;
	private ArrayList<CashPoint> cpArr;
	private Articles articles;
	private Long number;
	private Stage primaryStage;
	private Definitions defs;
	private byte fileType;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	// Generates and starts the application.
	@Override
	public void start(Stage arg0) throws Exception {
		this.primaryStage = new Stage();

		border = new BorderPane();
		border.autosize();
		log = new HashMap<Integer, String>();

		MenuBar menu = new MenuBar();
		menu.getMenus().addAll(new FileMenu(primaryStage, this).getFileMenu(),
				new PosMenu(this).getPosMenu(), new WGMenu(this).getWgMenu(),
				new ArticleMenu(this).getArticleMenu(),
				new DbMenu(this).getdbMenu(), new ExportMenu(this).getExportMenu());

		SideMenu side = new SideMenu(border, this);

		border.setTop(menu);
		border.setLeft(side.getSideMenu());

		Scene scene = new Scene(border);

		primaryStage.setTitle("Vectron Parser");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/*
	 * Getter and Setter of the used application data
	 */

	public Map<Integer, String> getLog() {
		return log;
	}

	public void setLog(Map<Integer, String> log) {
		this.log = log;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}

	public Map<Long, String> getArticle() {
		return articleMap;
	}

	public void setArticle(TreeMap<Long, String> articleMap) {
		this.articleMap = articleMap;
	}

	public BorderPane getBorderPane() {
		return border;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Definitions getDefinitions() {
		return defs;
	}

	public void setDefinitions(Definitions defs) {
		this.defs = defs;
	}

	public POSArray getPos() {
		return pos;
	}

	public void setPos(POSArray pos) {
		this.pos = pos;
	}

	public byte getFileType() {
		return fileType;
	}

	public void setFileType(byte fileType) {
		this.fileType = fileType;
	}

	public CashPointArray getCpArray() {
		return cpArray;
	}

	public void setCpArray(CashPointArray cpArray) {
		this.cpArray = cpArray;
	}

	public ArrayList<CashPoint> getCpArr() {
		return cpArr;
	}

	public void setCpArr(ArrayList<CashPoint> cpArr) {
		this.cpArr = cpArr;
	}

}
