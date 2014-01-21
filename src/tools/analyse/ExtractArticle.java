/**
 * 
 */
package tools.analyse;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Mathias Weigert
 * 
 */
public class ExtractArticle {

	private TreeMap<Long, String> articleMap;

	public void extractArticles(Map<Integer, String> log) {
		System.out.println("Starting article extraction");
		articleMap = new TreeMap<Long, String>();
		String line;
		String article;
		Long number;
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			if (line.substring(0, 3).equals("101") && line.indexOf("'") > 0) {
				int x = line.indexOf(",") + 1;
				line = line.substring(x);
				x = line.indexOf(",");
				number = Long.valueOf(line.substring(0, x));
				x = line.indexOf("'") + 1;
				article = line.substring(x, line.length() - 1);
				articleMap.put(number, article);
			}
		}
		System.out.println("Finished article extraction: " + articleMap.size() + " Articles extracted.");
	}

	public TreeMap<Long, String> getArticleMap() {
		return articleMap;
	}

}