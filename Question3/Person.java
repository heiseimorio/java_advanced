package Question3;

import java.time.LocalDate;

public class Person {
  private String firstName;
  private String lastName;
  private int gender;
  private LocalDate birthday;
  // 使用例
  // LocalDate localDt = LocalDate.parse(“1980/01/01”, DateTimeFormatter.ofPattern("yyyy/MM/dd"));

  Person(String firstName, String lastName, int gender, LocalDate birthday) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthday = birthday;
  }

  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public int getGender() {
    return this.gender;
  }
  public LocalDate getBirthday() {
    return this.birthday;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public void setGender(int gender) {
    this.gender = gender;
  }
  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }


}
