/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4.Bai7;

/**
 *
 * @author KyThuat88
 */
public class Person implements Comparable<Person>{
    private String firstName;
    private String surName;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", surName=" + surName + '}';
    }

    @Override
    public int compareTo(Person o) {
        int result = surName.compareTo(o.surName);
        return result == 0 ? firstName.compareTo(((Person)o).firstName):result;
    }
    
    
    
}
