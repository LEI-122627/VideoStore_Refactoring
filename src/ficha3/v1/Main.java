package ficha3.v1;

/***********************************************************
 * Filename: Main.java
 * @author fba 6 de Mai de 2013
 ***********************************************************/
public abstract class Main
{

	/***********************************************************
	 * @param args
	 ***********************************************************/
	public static void main(String[] args)
	{
		Customer who = new Customer("Barack Obama");
		Movie m1 = new Movie("Life of Amalia", Movie.Code.REGULAR);
		Movie m2 = new Movie("Peter Pan", Movie.Code.CHILDRENS);
		Movie m3 = new Movie("Donna del Lago", Movie.Code.NEW_RELEASE);

		Rental r1 = new Rental(m1, 1);
		Rental r2 = new Rental(m2, 2);
		Rental r3 = new Rental(m3, 3);

		who.addRental(r1);
		who.addRental(r2);
		who.addRental(r3);

		System.out.println(who.statement());

		// Additional checks exercising the new Rental methods
		System.out.println("Individual charges and frequent renter points:");
		System.out.println("\t" + r1.getMovie().getTitle() + " => charge: " + r1.getCharge() + ", points: " + r1.getFrequentRenterPoints());
		System.out.println("\t" + r2.getMovie().getTitle() + " => charge: " + r2.getCharge() + ", points: " + r2.getFrequentRenterPoints());
		System.out.println("\t" + r3.getMovie().getTitle() + " => charge: " + r3.getCharge() + ", points: " + r3.getFrequentRenterPoints());
	}

}