import java.util.Enumeration;

public class TextStatement extends Statement {

  private String makeTitle(String name) {
    return "Rental Record for " + name + "\n";
  }

  private String makeRentalFigures(Rental aRental) {
    return "\t" + aRental.getMovie().getTitle() + "\t" +
         String.valueOf(aRental.getCharge()) + "\n";
  }

  private String makeFooter(Customer aCustomer) {
    return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n"
      + "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints())       +
      " frequent renter points";
  }
  
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = makeTitle(aCustomer.getName());
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += makeRentalFigures(each);
      }
      //add footer lines
      result += makeFooter(aCustomer);
      return result;
   }
}