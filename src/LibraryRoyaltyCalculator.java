import Titles.AudioBook;
import Titles.LiteratureType;
import Titles.PrintedBook;

import java.text.DecimalFormat;

public class LibraryRoyaltyCalculator {
    public static void TestMain()
    {
        DecimalFormat df = new DecimalFormat("#.##"); //For half-up decimal rounding

        Author[] authors = new Author[] {new Author("Olga Ravn"), new Author("Anders And")};
        authors[0].addTitle(new PrintedBook("Celestine", LiteratureType.SKØN,140,166));
        authors[0].addTitle(new AudioBook("Celestine",LiteratureType.SKØN,140,192));

        authors[1].addTitle(new PrintedBook("The Art of War", LiteratureType.FAG, 200, 240));
        authors[1].addTitle(new PrintedBook("The legenend of UgaaBoogaa", LiteratureType.SKØN, 15, 80));
        authors[1].addTitle(new AudioBook("The time I fell of my bike, an AudioBook Musical in 7 parts",LiteratureType.LYRIK,100,65));


        for(int i = 0; i < authors.length; i++)
        {
            System.out.println("Author: " + authors[i].getName() + " Earned: " + df.format(authors[i].calculateRoyalties()) + "kr from royalties");
        }

    }
}
