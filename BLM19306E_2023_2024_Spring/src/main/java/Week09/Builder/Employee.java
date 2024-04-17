/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week09.Builder;

/**
 *
 * @author ali.nizam
 */
public class Employee {

    int id;
    String firstName, lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(Builder b) {
        this.id = b.id;
        this.firstName = b.firstName;
        this.lastName = b.lastName;
    }

    static class Builder {

        int id;
        String firstName, lastName;

        Employee build() {
            return new Employee(this);
        }

        Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        Builder setId(int id) {
            this.id = id;
            return this;
        }

    }

}
