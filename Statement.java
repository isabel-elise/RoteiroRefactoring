import java.util.Enumeration;

public abstract class Statement {

  protected abstract String makeTitle(String nome);
  protected abstract String makeRentalFigures(Rental aRental);
  protected abstract String makeFooter(Customer aCustomer);

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