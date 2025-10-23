// src/ficha3/v0/Main.java
package ficha3.v0;

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

        who.addRental(new Rental(m1, 1));
        who.addRental(new Rental(m2, 2));
        who.addRental(new Rental(m3, 3));

        String stmt = who.statement();
        System.out.println(stmt);

        // verificações esperadas para este cenário:
        boolean ok = true;
        StringBuilder errors = new StringBuilder();

        // verificações parciais (título + valor esperado)
        if (!stmt.contains("Life of Amalia") || !stmt.contains("2.0")) {
            ok = false;
            errors.append("Falha: esperado 'Life of Amalia' com 2.0\n");
        }
        if (!stmt.contains("Peter Pan") || !stmt.contains("1.5")) {
            ok = false;
            errors.append("Falha: esperado 'Peter Pan' com 1.5\n");
        }
        if (!stmt.contains("Donna del Lago") || !stmt.contains("9.0")) {
            ok = false;
            errors.append("Falha: esperado 'Donna del Lago' com 9.0\n");
        }

        // total e pontos esperados (2.0 + 1.5 + 9.0 = 12.5 ; pontos = 1 + 1 + 2 = 4)
        if (!stmt.contains("Amount owed is 12.5")) {
            ok = false;
            errors.append("Falha: esperado 'Amount owed is 12.5'\n");
        }
        if (!stmt.contains("You earned 4 frequent renter points")) {
            ok = false;
            errors.append("Falha: esperado 'You earned 4 frequent renter points'\n");
        }

        if (ok) {
            System.out.println("All checks passed.");
        } else {
            System.err.println(errors.toString());
            System.exit(1);
        }
    }

}
