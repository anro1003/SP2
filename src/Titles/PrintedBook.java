package Titles;

public class PrintedBook extends Title {
    private int pages;
    private int copies;

    public PrintedBook(String title, LiteratureType literatureType, int copies, int pages)
    {
        super(title,literatureType);
        this.copies = copies;
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {

        //The way the assignment wants to do it
        //return this.pages * this.convertLiteratureType() * copies;

        //The ENUM way :)
        return this.pages * this.getLiteratureType().getPoints() * copies;
    }
}
