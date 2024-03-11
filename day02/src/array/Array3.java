package array;

public class Array3 {
    public static void main(String[] args) {
        Customer [] customers = new Customer[3];
        customers[0] = new Customer("id00","pwd00","name");
        customers[1] = new Customer("id01","pwd01","name");
        customers[2] = new Customer("id02","pwd02","name");

        for(Customer c:customers){
            System.out.println(c);
        }
    }
}



