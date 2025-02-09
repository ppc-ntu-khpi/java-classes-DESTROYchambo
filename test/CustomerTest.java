package test;
import domain.Customer;

public class CustomerTest{

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();

        customer.setID(2);
        customer.setStatus(false);
        customer.setTotal(3200.0);

        customer.displayCustomerInfoUpd();
    }
}