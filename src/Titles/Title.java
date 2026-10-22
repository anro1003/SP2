package Titles;

public abstract class Title {
    private String title;
    private LiteratureType literatureType;

    private static final double RATE = 0.067574d;

    public Title(String title, LiteratureType literatureType)
    {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalties()
    {
        return RATE * calculatePoints();
    }

    protected abstract double calculatePoints();

    /*
    * The assignment created this method because we aren't using ENUMS,
    * and I'll make it too, but the implementations using it will be commented out
    * But still present, as to show that I can do it the way the assignment asked :)
    *
    * For the new ENUM types, we can just do "LiteratureType.<type>.getPoints();"
     */
    protected double convertLiteratureType()
    {
        //Acting as if we still used the old string type:
        String literatureTypeString = this.literatureType.toString();
        switch (literatureTypeString)
        {
            case "BI":
            case "TE":
                return 3.0d;
            case "LYRIK":
                return 6.0d;
            case "SKØN":
                return  1.7d;
            case "FAG":
                return 1.0d;
            default:
                throw new IllegalArgumentException("No such literature type: " + literatureTypeString);

        }
    }

    protected LiteratureType getLiteratureType()
    {
        return this.literatureType;
    }
}
