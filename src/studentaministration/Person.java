/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentaministration;

/**
 *
 * @author zhuan
 */
class Person {
    protected String name;
    protected int age;
    protected Address address;
    protected Gender gender;
    
    public void setName(String n) {
        this.name=n;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    void copy(Person person) {
        this.name=person.getName();
        this.gender=person.getGender();
        this.address=person.getAddress();
        this.age=person.getAge();
    }
    
    
}
