package company;

import java.util.StringJoiner;

public class SecretaryEmployee extends Employee{
    private String boss;

    public SecretaryEmployee() {
    }

    public SecretaryEmployee(String id, String name, String dept, long salary, String boss) {
        super(id, name, dept, salary);
        this.boss = boss;
    }

    public String getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return super.toString() + this.boss;
    }
}
