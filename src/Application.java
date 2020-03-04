
public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		Currency todaysCurrency = new Currency("EUR","MDL",17.50f,"2020-01-01");
		Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02");

		System.out.println(todaysCurrency);
		System.out.println(tomorrowsCurrency);
		System.out.println();
		
		Currency newValueTomorrowCurrency = tomorrowsCurrency.setValue(18.00f);
		
		System.out.println(todaysCurrency);
		System.out.println(tomorrowsCurrency);
		System.out.println(newValueTomorrowCurrency);
	}
}
// 1. Two objects.
// 2. Three objects.
