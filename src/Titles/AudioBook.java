package Titles;

public class AudioBook extends Title {

    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, LiteratureType literatureType, int copies, int durationInMinutes)
    {
        super(title, literatureType);
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {

        //The way the assignment wants to do it
        //return ((double) this.durationInMinutes * 0.5) * this.convertLiteratureType() * copies;

        //The ENUM way :)
        return ((double) this.durationInMinutes * 0.5) * this.getLiteratureType().getPoints() * copies;
    }
}
