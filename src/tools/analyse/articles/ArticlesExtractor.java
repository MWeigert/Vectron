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
 * Class which extract a complete article set from the Vectron file.
 */
public class ArticlesExtractor {

	private Articles articles;

	public ArticlesExtractor(Definitions defs) {
		int anz = 0;
		Article art = new Article();
//		DataField df = new DataField(0);
		ArrayList<DataField> dfList = new ArrayList<>();
		articles=new Articles();
		
		System.out.println("Artikel werden ausgelesen.");
		ArrayList<Definition> data = defs.getDefinitions();
		for (Definition def : data) {
			if (def.getLineTypeID()==10038) {
				dfList=def.getDataField();
				for (DataField df : dfList) {
					if (df.getDfNumber()==1) {
						Long number = Long.valueOf(df.getDataValue());
						art.setNumber(number);
						anz++;
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
