package Question8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Question2.InputEmployee2;
import Question3.Person;
import Question4.Address;
import Question5.Employee;
import Question7.Manager;

public class InputEmployee3 {
  Employee emp = new Employee();

  public void setEmployeeData(String empNumber, String firstName, String lastName, String gender, String birthday, String zipCode, String prefecture, String municipaities, String addressBuilding, String mail) {

    // Personクラスに格納するためパース
    int parseIntGender = Integer.parseInt(gender);
    LocalDate localDtBirthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    Person person = new Person(firstName, lastName, parseIntGender, localDtBirthday);

    // Addressクラスに格納
    Address address = new Address(zipCode, prefecture, municipaities, addressBuilding);

    emp.setEmpNumber(empNumber);
    emp.setPerson(person);
    emp.setAddress(address);
    emp.setPhoneNumber("000-1111-2345"); // scannerで入力される機会がないため、データを直接記載。
    emp.setMail(mail);

  }

  public void printEmployeeData() {
    System.out.println("");
    System.out.println("************社員情報************");
    System.out.println("ー ––––––––––––––––––––––––– ー");
    System.out.println("| 社員番号:" + emp.getEmpNumber());
    System.out.println("| 氏名　　:" + emp.getPerson().getFirstName() + " " + emp.getPerson().getLastName());
    System.out.println("| 性別　　:" + emp.getPerson().getGender());
    System.out.println("| 生年月日:" + emp.getPerson().getBirthday());
    System.out.println("| 郵便番号:〒" + emp.getAddress().getZipCode());
    System.out.println("| 住所１　:" + emp.getAddress().getPrefecture() + emp.getAddress().getMunicipaities());
    System.out.println("| 住所２　:" + emp.getAddress().getAddressBuilding());
    System.out.println("| メール　:" + emp.getMail());
    System.out.println("ー –––––––––––––––––––––––––– ー");
  }

}
