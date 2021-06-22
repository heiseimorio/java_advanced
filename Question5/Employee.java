package Question5;

import Question3.Person;
import Question4.Address;

public class Employee {
  private String empNumber;
  private Person person;
  private Address address;
  private String phoneNumber;
  private String mail;


  Employee(String empNumber, Person person, Address address, String phoneNumber, String mail) {
    this.empNumber = empNumber;
    this.person = person;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.mail = mail;
  }

  public Employee() {}

  public String getEmpNumber() {
    return this.empNumber;
  }
  public Person getPerson() {
    return this.person;
  }
  public Address getAddress() {
    return this.address;
  }
  public String getPhoneNumber() {
    return this.phoneNumber;
  }
  public String getMail() {
    return this.mail;
  }

  public void setEmpNumber(String empNumber) {
    this.empNumber = empNumber;
  }
  public void setPerson(Person person) {
    this.person = person;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public void setMail(String mail) {
    this.mail = mail;
  }

}
