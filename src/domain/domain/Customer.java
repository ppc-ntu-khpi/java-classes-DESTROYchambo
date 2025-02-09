package domain;

public class Customer {

    private int ID;
    private boolean isNew;
    private double total;

    public Customer() {
        ID = 1;
        isNew = true;
        total = 1000.0;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("New: " + isNew);
        System.out.println("Total sum: " + total);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void displayCustomerInfoUpd() {
        System.out.println("Customer ID upd: " + ID);
        System.out.println("New upd: " + isNew);
        System.out.println("Total sum upd: " + total);
    }
    
}