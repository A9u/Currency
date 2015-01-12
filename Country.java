/**
 * Created by Srinivas on 12-01-2015.
 */
public class Country {
    String country;
    Currency currency;
    public Country(String country,Currency currency)
    {
        this.country=country;
        this.currency=currency;
    }
    public String getCountry(){
        return this.country;
    }
    public Currency getCurrency()
    {
        return this.currency;
    }
}
