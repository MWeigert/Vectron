/**
 * Vectron Parser
 * Parser to analyze Badge export files from the Vectroncommander
 */

package tools.analyse.articles;

import java.util.ArrayList;

import data.basis.Article;
import data.basis.Articles;
import data.basis.DataField;
import data.basis.Definition;
import data.basis.Definitions;

/**
 * @author Mathias Weigert
 * @version 0.75
 * 
 *          Class which extract a complete article set from the Vectron file.
 */
public class ArticlesExtractor {

	private Articles articles;

	public ArticlesExtractor(Definitions defs) {
		int anz = 0;

		ArrayList<DataField> dfList = new ArrayList<>();
		articles = new Articles();

		System.out.println("Artikel werden ausgelesen.");
		ArrayList<Definition> data = defs.getDefinitions();
		for (Definition def : data) {
			if (def.getLineTypeID() == 10038) {
				Article art = new Article();
				dfList = def.getDataField();
				for (DataField df : dfList) {
					switch (df.getDfNumber()) {
					case 1:
						Long number = Long.valueOf(df.getDataValue());
						art.setNumber(number);
//						System.out.println("Nummer: " + df.getDataValue());
						break;
					case 2:
						art.setName(df.getDataValue());
//						System.out.println("Name: " + df.getDataValue());
						break;
					case 10:
						Double price1 = Double.valueOf(df.getDataValue());
						art.setPriceLevel1(price1);
						break;
					case 11:
						Double price2 = Double.valueOf(df.getDataValue());
						art.setPriceLevel2(price2);
						break;
					case 12:
						Double price3 = Double.valueOf(df.getDataValue());
						art.setPriceLevel3(price3);
						break;
					case 13:
						Double price4 = Double.valueOf(df.getDataValue());
						art.setPriceLevel4(price4);
						break;
					case 14:
						Double price5 = Double.valueOf(df.getDataValue());
						art.setPriceLevel5(price5);
						break;
					case 15:
						Double price6 = Double.valueOf(df.getDataValue());
						art.setPriceLevel6(price6);
						break;
					case 16:
						Double price7 = Double.valueOf(df.getDataValue());
						art.setPriceLevel7(price7);
						break;
					case 17:
						Double price8 = Double.valueOf(df.getDataValue());
						art.setPriceLevel8(price8);
						break;
					case 18:
						Double price9 = Double.valueOf(df.getDataValue());
						art.setPriceLevel9(price9);
						break;
					case 19:
						Double price10 = Double.valueOf(df.getDataValue());
						art.setPriceLevel10(price10);
						break;
					case 301:
						articles.addArticle(art);
						anz++;
						break;
					}
				}
			}
		}
		System.out.println("Es wurden " + anz + " Artikel exportiert.");
	}

	public Articles getArticles() {
		return articles;
	}

}
