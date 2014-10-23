/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import main.VP;
import data.basis.CashPoint;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which saves the .csv export data to an file.
 */

public class ExportCashPoint {

	private ArrayList<CashPoint> data;
	
	public ExportCashPoint(File file, VP vp) {
		this.data = vp.getCpArr();
		
		
		PrintWriter writer;

		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for (CashPoint array : data ) {
				
				writer.print(data.toString());
				writer.print("\r\n");
			}
			
			
			writer.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("shit is going real in ExportCashPoint");
		}
	}

}
