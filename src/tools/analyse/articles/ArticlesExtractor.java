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
					// ID 1 = Article Number
					case 1:
						Long number = Long.valueOf(df.getDataValue());
						art.setNumber(number);
						break;
					// ID 2 => Article Name (name on guest check)
					case 2:
						art.setName(df.getDataValue());
						break;
					// ID 3 => Article Name (name on display)
					case 3:
							if (df.getDataValue().length()>2) {
//								System.out.println(art.getName());
//								System.out.println(df.getDataValue());		
								art.setDisplay(df.getDataValue());
							}
						break;
					// ID 7 => Warengruppe
					case 7:
						Integer wg = Integer.valueOf(df.getDataValue());
						art.setWg(wg);
						break;
					// ID 10 => Price (Lvl. 1)
					case 10:
						Double price1 = Double.valueOf(df.getDataValue());
						art.setPriceLevel1(price1);
						break;
					// ID 11 => Price (Lvl. 2)
					case 11:
						Double price2 = Double.valueOf(df.getDataValue());
						art.setPriceLevel2(price2);
						break;
					// ID 12 => Price (Lvl. 3)
					case 12:
						Double price3 = Double.valueOf(df.getDataValue());
						art.setPriceLevel3(price3);
						break;
					// ID 13 => Price (Lvl. 4)
					case 13:
						Double price4 = Double.valueOf(df.getDataValue());
						art.setPriceLevel4(price4);
						break;
					// ID 14 => Price (Lvl. 5)
					case 14:
						Double price5 = Double.valueOf(df.getDataValue());
						art.setPriceLevel5(price5);
						break;
					// ID 15 => Price (Lvl. 6)
					case 15:
						Double price6 = Double.valueOf(df.getDataValue());
						art.setPriceLevel6(price6);
						break;
					// ID 16 => Price (Lvl. 7)
					case 16:
						Double price7 = Double.valueOf(df.getDataValue());
						art.setPriceLevel7(price7);
						break;
					// ID 17 => Price (Lvl. 8)
					case 17:
						Double price8 = Double.valueOf(df.getDataValue());
						art.setPriceLevel8(price8);
						break;
					// ID 18 => Price (Lvl. 9)
					case 18:
						Double price9 = Double.valueOf(df.getDataValue());
						art.setPriceLevel9(price9);
						break;
					// ID 19 => Price (Lvl. 10)
					case 19:
						Double price10 = Double.valueOf(df.getDataValue());
						art.setPriceLevel10(price10);
						break;
					// ID 301 => undef (in use to put article to array list
					// articles
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
