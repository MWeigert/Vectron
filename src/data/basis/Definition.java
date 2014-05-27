/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package data.basis;

import java.util.ArrayList;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which stores all data field data from one definition
 * 
 */

public class Definition {

	private int lineTypeID;
	private int definitionID;
	private ArrayList<DataField> data;

	public Definition() {
		lineTypeID = 0;
		definitionID = 0;
		data = new ArrayList<>();
	}

	public void setLineTypeID(int lineTypeID) {
		this.lineTypeID = lineTypeID;
	}

	public void setDefinitionID(int definitionID) {
		this.definitionID=definitionID;
	}
	
	public void addDataField(DataField data) {
		this.data.add(data);
	}
	
	public int getLineTypeID(){
		return this.lineTypeID;
	}
	
	public int getDefinitionID(){
		return this.definitionID;
	}
	
	public ArrayList<DataField> getDataField() {
		return this.data;
	}
	
}
