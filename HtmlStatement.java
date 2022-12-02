import java.util.Enumeration;

public class HtmlStatement extends Statement {

  private String makeTitle(String name) {
    return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
  }

  private String makeRentalFigures(Rental aRental) {
    return aRental.getMovie().getTitle()+ ": " +
         String.valueOf(aRental.getCharge()) + "<BR>\n";
  }

  private String makeFooter(Customer aCustomer) {
    return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n"
      + "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints())       +
      "</EM> frequent renter points<P>";
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