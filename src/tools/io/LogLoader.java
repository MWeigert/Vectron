/**
 * Class which loads Vanguard logfile and store the content in a map
 */
package tools.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tingle Driftwood
 *
 */
public class LogLoader {
	
	public Map<Integer, String> log;
	
	public LogLoader(File file){
		
		BufferedReader reader;
		String line;
		
		try {
			reader = new BufferedReader(new FileReader(file));
			int nr = 0;
			log = new HashMap<Integer, String>();
			while ((line = reader.readLine()) != null) {
				log.put(nr, line);
				nr++;
			}
			reader.close();
			System.out.println("Einlesen des Logfiles fehlerfrei abgeschlossen.");
		} catch (IOException e) {
			System.out.println("Fehler beim lesen der Datei: " + file);
		}
	}
	
	public Map<Integer, String> getLog() {
		return log;
	}

}
