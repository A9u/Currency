/**
 * Created by Srinivas on 12-01-2015.
 */
public class Euro extends Currency{
    final double DOLLAR_FACTOR=1.18;
    final double RUPEE_FACTOR=73.0;
    public Euro()
    {
        this.currency="Euro";
        this.symbol="Er";
    }

    @Override
    public double[] getConversions() {
        double conversions[]=new double[2];
        conversions[0]=DOLLAR_FACTOR;
        conversions[1]=RUPEE_FACTOR;
        return conversions;
    }

}
