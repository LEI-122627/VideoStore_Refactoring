package ficha3.v2;

import java.util.Vector;

public class Customer
{
	private String _name;
	private Vector<Rental> _rentals = new Vector<>();

	public Customer(String name)
	{
		_name = name;
	}

	public void addRental(Rental arg)
	{
		_rentals.addElement(arg);
	}

	public String getName()
	{
		return _name;
	}

	// statement now delegates pricing and points to Rental and totals to helper methods
	public String statement()
	{
		StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");

		for (Rental each : _rentals) {
			// show figures for this rental
			result.append("\t").append(each.getMovie().getTitle()).append("\t").append(each.getCharge()).append("\n");
		}

		// add footer lines
		result.append("Amount owed is ").append(totalCharge()).append("\n");
		result.append("You earned ").append(totalFrequentRenterPoints()).append(" frequent renter points\n");

		return result.toString();
	}

	private double totalCharge()
	{
		double total = 0;
		for (Rental each : _rentals) {
			total += each.getCharge();
		}
		return total;
	}

	private int totalFrequentRenterPoints()
	{
		int points = 0;
		for (Rental each : _rentals) {
			points += each.getFrequentRenterPoints();
		}
		return points;
	}
}