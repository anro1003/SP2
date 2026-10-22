import Titles.Title;

import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();;

    public Author(String name)
    {
        this.name = name;
    }

    public void addTitle(Title title)
    {
        this.titles.add(title);
    }

    public double calculateRoyalties()
    {
        double totalRoyalties = 0.0d;
        for (Title title : titles)
        {
            totalRoyalties += title.calculateRoyalties();
        }
        return totalRoyalties;
    }

    public String getName()
    {
        return name;
    }
}
