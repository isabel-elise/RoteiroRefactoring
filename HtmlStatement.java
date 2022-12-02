public class HtmlStatement extends Statement {

  protected String makeTitle(String name) {
    return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
  }

  protected String makeRentalFigures(Rental aRental) {
    return aRental.getMovie().getTitle()+ ": " +
         String.valueOf(aRental.getCharge()) + "<BR>\n";
  }

  protected String makeFooter(Customer aCustomer) {
    return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n"
      + "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints())       +
      "</EM> frequent renter points<P>";
  }
}