package v3;

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
  v2.Movie m1 = new v2.Movie("Life of Amalia", v2.Movie.Code.REGULAR);
  v2.Movie m2 = new v2.Movie("Peter Pan", v2.Movie.Code.CHILDRENS);
  v2.Movie m3 = new v2.Movie("Donna del Lago", v2.Movie.Code.NEW_RELEASE);

  who.addRental(new v2.Rental(m1, 1));
  who.addRental(new v2.Rental(m2, 2));
  who.addRental(new v2.Rental(m3, 3));

  System.out.println(who.statement());
 }

}