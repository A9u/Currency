/**
 * Created by Srinivas on 12-01-2015.
 */
public class Dollar extends Currency {
    final double RUPEE_FACTOR=63.0;
    final double EURO_FACTOR=0.85;
    public Dollar()
    {
        this.currency="Dollar";
        this.symbol="$";
    }

    @Override
    public double[] getConversions() {
        double conversions[]=new double[2];
        conversions[0]=RUPEE_FACTOR;
        conversions[1]=EURO_FACTOR;
        return conversions;
    }
}
