package oop3.example04;

class Invoice extends Customer{
    Customer customer;
    double amount;

    public Invoice(int id, Customer customer, double amount) {
        super(id, customer.getName(), customer.getDiscount());
        this.customer = customer;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    int getCustomerId(){
        return customer.id;
    }
    String  getCustomerName(){
        return customer.getName();
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    int getCustomerDiscount(){
        return getDiscount();
    }
    public double getAmountAfterDiscount() {
        return amount - (amount * getDiscount() / 100.0);
    }

    public String toString() {
        return "Invoice{" +
                "customer=" + customer +
                ", amount=" + amount +
                '}';
    }

}
