/**
 * Created by Srinivas on 12-01-2015.
 */
public class Rupee extends Currency {
    final double DOLLAR_FACTOR=0.016;
    final double EURO_FACTOR=0.01;
    public Rupee()
    {
        this.currency="Rupee";
        this.symbol="Rs";
    }

    @Override
    public double[] getConversions() {
        double conversions[]=new double[2];
        conversions[0]=DOLLAR_FACTOR;
        conversions[1]=EURO_FACTOR;
        return conversions;
    }
}
