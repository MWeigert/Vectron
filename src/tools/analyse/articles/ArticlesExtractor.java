/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.articles;

import java.util.Map;

import tools.analyse.DefinitionExtractor;

import data.basis.Article;
import data.basis.Articles;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 * Class which extract a complete article set from the Vectron file.
 */
public class ArticlesExtractor {

	private Articles articles;
	private Article article;

	public ArticlesExtractor(Map<Integer, String> log) {
		
		System.out.println("Artikel werden ausgelesen.");
		int anz = 0;
		String line;
		Long number = (long) 0;
		Long oldNumber = (long) 666;
		articles = new Articles();
		int def;

		// Start of article parsing in Vectron file.
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			// 101 in first column of file is a article defenition. 
			if (line.substring(0, 3).equals("101")) {
				number = new ArticleNumberExtractor(line).getNumber();
				// Check if its an new article or still information to the actual one.
				if (!(number.equals(oldNumber))) {
					oldNumber = number;
					// Write actual article in article set
					if (article != null) {
						articles.addArticle(article);
						anz++;
					}
					// Generate new article
					article = new Article();
					article.setNumber(number);
					article.setName(new ArticleNameExtractor(line).getName());
					// Extract further information of actuall article
				} else {
					def = new DefinitionExtractor(line).getDefinition();
					switch (def) {
					// 201 till 210 defines the different price levels of an article
					case 201:
						article.setPriceLevel1(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 1 gefunden.");
						break;
					case 202:
						article.setPriceLevel2(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 2 gefunden.");
						break;
					case 203:
						article.setPriceLevel3(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 3 gefunden.");
						break;
					case 204:
						article.setPriceLevel4(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 4 gefunden.");
						break;
					case 205:
						article.setPriceLevel5(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 5 gefunden.");
						break;
					case 206:
						article.setPriceLevel6(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 6 gefunden.");
						break;
					case 207:
						article.setPriceLevel7(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 7 gefunden.");
						break;
					case 208:
						article.setPriceLevel8(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 8 gefunden.");
						break;
					case 209:
						article.setPriceLevel9(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 9 gefunden.");
						break;
					case 210:
						article.setPriceLevel10(new PriceExtractor(line)
								.getPrice());
						System.out.println("Preislevel 10 gefunden.");
						break;
					default:
						System.out.println("Unbekannte Zeilendefinition: "
								+ def);
						break;
					}
				}
			}
		}
		// Write last article in article set
		articles.addArticle(article);
		anz++;
		System.out.println("Es wurden " + anz + " Artikel exportiert.");
	}

	public Articles getArticles() {
		return articles;
	}

}
