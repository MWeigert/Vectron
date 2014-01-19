/**
 * 
 */
package tools.analyse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mathias Weigert
 * 
 */
public class ExtractArticle {

	private Map<Double, String> articleMap;

	public void extractArticles(Map<Integer, String> log) {
		articleMap = new HashMap<Double, String>();
		String line;
		Double number;
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			if (line.substring(0, 2) == "101" && line.indexOf("'")>0) {
				System.out.println("Gotcha");
			}
//				int x = line.indexOf(",") + 1;
//				line = line.substring(x);
//				x = line.indexOf(",");
//				number = Double.valueOf(line.substring(0, x));
			}
		}

	public Map<Double, String> getArticleMap() {
		return articleMap;
	}

}
