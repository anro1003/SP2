package Titles;

/*
* Yes I know that the assignment is using Strings, but I just had to do it with ENUMS since it's
* the perfect place to use them...
*/
public enum LiteratureType {
    BI(3.0d),
    TE(3.0d),
    LYRIK(6.0d),
    SKØN(1.7d),
    FAG(1.0d);

    private double points;
    private LiteratureType(double points)
    {
        this.points = points;
    }

    public double getPoints()
    {
        return this.points;
    }

}
