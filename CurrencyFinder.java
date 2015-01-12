import java.util.Scanner;

/**
 * Created by Srinivas on 12-01-2015.
 */
public class CurrencyFinder {
    Country countries[];

    CurrencyFinder() {
        countries = new Country[3];
        countries[0] = new Country("India", new Rupee());
        countries[1] = new Country("US", new Dollar());
        countries[2] = new Country("UK", new Euro());
    }

    public static void main(String[] args) {
        try {
            int i;
            CurrencyFinder currencyFinder = new CurrencyFinder();
            Scanner sc = new Scanner(System.in);
            String country = sc.next();
            Currency currency= getCurrency(currencyFinder, country);
            printCurrency(currency);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static Currency getCurrency(CurrencyFinder currencyFinder, String country) {
        int i;
       // Currency currency=null;
        for (i = 0; i < 3; i++) {
            if (currencyFinder.countries[i].getCountry().equalsIgnoreCase(country)) {
                return currencyFinder.countries[i].getCurrency();

            }
        }
        return null;
    }
    private static void printCurrency(Currency currency) {

        if (currency != null) {
            System.out.println("Currency name : " + currency.getCurrency());
        }
    }

}
