public class TextStatement extends Statement {

  protected String makeTitle(String name) {
    return "Rental Record for " + name + "\n";
  }

  protected String makeRentalFigures(Rental aRental) {
    return "\t" + aRental.getMovie().getTitle() + "\t" +
         String.valueOf(aRental.getCharge()) + "\n";
  }

  protected String makeFooter(Customer aCustomer) {
    return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n"
      + "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints())       +
      " frequent renter points";
  }
}