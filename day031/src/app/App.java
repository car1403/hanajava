package app;

import company.Employee;
import company.SalesEmployee;
import company.SecretaryEmployee;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("100","james", "Account", 1000);
        System.out.println(e1);

        Object obj = new Employee("100","james", "Account", 1000);
        System.out.println(obj);

        Employee e2 = new SalesEmployee("100","james", "Account", 1000, 500);
        System.out.println(e2);

        Employee emps [] = new Employee[3];
        emps[0] = new Employee("100","james", "Account", 1000);
        emps[1] = new SalesEmployee("100","james", "Account", 1000, 500);
        emps[2] = new SecretaryEmployee("100","james", "Account", 1000, "boss");

        for(Employee e:emps){
            if(e instanceof SalesEmployee){
                SalesEmployee se = (SalesEmployee)e;
                System.out.println(se.getBonus());
            }
            System.out.println(e.getAnnSalary());
//            System.out.println(e.getBonus());

        }
    }

}
