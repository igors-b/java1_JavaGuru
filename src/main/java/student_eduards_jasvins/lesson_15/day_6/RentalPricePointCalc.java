package student_eduards_jasvins.lesson_15.day_6;

import java.util.Enumeration;


public class RentalPricePointCalc {


    public String getPointAndPrice (Customer customer) {
        double 				totalAmount 			= 0;
        int					frequentRenterPoints 	= 0;
        Enumeration         rentals 				= customer.getRentals().elements();
        String 				result 					= "Rental Record for " + customer.getName() + "\n";

        while (rentals.hasMoreElements ()) {
            double 		thisAmount = 0;
            Rental each = (Rental)rentals.nextElement ();


            switch (each.getMovie().getPriceCode ()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented () > 2)
                        thisAmount += (each.getDaysRented () - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented () * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented () > 3)
                        thisAmount += (each.getDaysRented () - 3) * 1.5;
                    break;
            }

            frequentRenterPoints++;

            if (each.getMovie ().getPriceCode () == Movie.NEW_RELEASE
                    && each.getDaysRented () > 1)
                frequentRenterPoints++;

            result += "\t" + each.getMovie().getTitle() + "\t"
                    + (thisAmount) + "\n";
            totalAmount += thisAmount;

        }

        result += "You owed " + (totalAmount) + "\n";
        result += "You earned " + (frequentRenterPoints) + " frequent renter points\n";


        return result;
    }

}
