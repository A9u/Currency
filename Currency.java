/**
 * Created by Srinivas on 12-01-2015.
 */
public abstract class Currency {

    String currency;
    String symbol;
    String getCurrency()
    {
        return this.currency;
    }
    String getSymbol()
    {
        return this.symbol;
    }
    public abstract double[] getConversions();
}
