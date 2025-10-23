package ficha3.v2;

public class Main {
	public static void main(String[] args) {
		// Use Movie.Code enum values instead of ints
		Movie m1 = new Movie("The Matrix", Movie.Code.REGULAR);
		Movie m2 = new Movie("Toy Story", Movie.Code.CHILDRENS);
		Movie m3 = new Movie("Avengers: Endgame", Movie.Code.NEW_RELEASE);

		// Create rentals (movie, daysRented)
		Rental r1 = new Rental(m1, 3);
		Rental r2 = new Rental(m2, 4);
		Rental r3 = new Rental(m3, 1);

		// Create customer and add rentals
		Customer customer = new Customer("John Doe");
		customer.addRental(r1);
		customer.addRental(r2);
		customer.addRental(r3);

		// Print statement to verify changes
		System.out.println(customer.statement());
	}
}