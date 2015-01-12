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
        CurrencyFinder currencyFinder = new CurrencyFinder();
        Scanner sc = new Scanner(System.in);
        String country = sc.next();
        for (int i = 0; i < 3; i++) {
            if (currencyFinder.countries[i].getCountry().equalsIgnoreCase(country)) {
                Currency currency = currencyFinder.countries[i].getCurrency();
                System.out.println("Currency name : " + currency.getCurrency());
                break;
            }
        }
    }

}
