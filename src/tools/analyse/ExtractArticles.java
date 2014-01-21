/**
 * 
 */
package tools.analyse;

import java.util.Map;

import data.basis.Article;
import data.basis.Articles;

/**
 * @author Mathias Weigert
 * 
 */
public class ExtractArticles {

	private Articles articles;
	private Article article;

	public ExtractArticles(Map<Integer, String> log) {
		System.out.println("Artikel werden ausgelesen.");
		int anz = 0;
		String line;
		Long number = (long) 0;
		Long oldNumber = (long) 666;
		articles = new Articles();
		int def;

		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			if (line.substring(0, 3).equals("101")) {
				number = new ExtractArticleNumber(line).getNumber();
				if (!(number.equals(oldNumber))) {
					oldNumber = number;
					if (article != null) {
						articles.addArticle(article);
						anz++;
					}
					article = new Article();
					article.setNumber(number);
					article.setName(new ExtractArticleName(line).getName());
				} else {
					def = new ExtractDefinition(line).getDefinition();
					switch (def) {
					case 201:
						article.setPriceLevel1(new ExtractPrice(line)
								.getPrice());
						System.out.println("Preislevel 1 gefunden.");
						break;
					case 202:
						article.setPriceLevel2(new ExtractPrice(line)
								.getPrice());
						System.out.println("Preislevel 2 gefunden.");
						break;
					default:
						System.out.println("Unbekannte Zeilendefinition: "
								+ def);
						break;
					}
				}
			}
		}
		articles.addArticle(article);
		anz++;
		System.out.println("Es wurden " + anz + " Artikel exportiert.");
	}

	public Articles getArticles() {
		return articles;
	}

}
