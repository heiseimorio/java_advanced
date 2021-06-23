package Question2;

import java.util.*;

import Question8.InputEmployee3;

public class InputEmployee2 {

  public static void main(String[] args) {

    /**
     * エラーの場合は再度入力を促す
     *  • 社員番号は４桁の半角整数以外は再入力
     *  • 姓、名は必須入力
     *  • 性別は１、２以外は再入力
     *    ヒント）４桁の半角整数チェ⏿クは String クラスの matches(...)メソ⏿ドと
     *    正規表現の組み合わせで行うことができます。
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("社員番号を入力してください(例:0079) > ");
    String empNumber = sc.nextLine();

    boolean isEmpNumber = true;
    if(empNumber.matches("^[0-9]+$") && empNumber.length() == 4) {
      isEmpNumber = false;
    }

    while(isEmpNumber) {
      System.out.print("4桁の半角整数で社員番号を入力してください(例:0079) > ");
      empNumber = sc.nextLine();
      if(empNumber.matches("^[0-9]+$") && empNumber.length() == 4) {
        isEmpNumber = false;
      }
    }


    System.out.print("姓を入力してください(例:赤井) > ");
    String firstName = sc.nextLine().strip();

    boolean isFirstName = true;
    if(!firstName.equals("") && !firstName.isEmpty()) {
      isFirstName = false;
    }

    while(isFirstName) {
      System.out.print("入力必須です。姓を入力してください(例:赤井) > ");
      firstName = sc.nextLine().strip();
      isFirstName = isStringBlankEmpty(firstName);
    }

    System.out.print("名を入力してください(例:翠聖) > ");
    String lastName = sc.nextLine().strip();


    boolean isLastName = true;
    if(!lastName.equals("") && !lastName.isEmpty()) {
      isLastName = false;
    }

    while(isLastName) {
      System.out.print("入力必須です。名を入力してください(例:赤井) > ");
      lastName = sc.nextLine().strip();
      isLastName = isStringBlankEmpty(lastName);

    }

    System.out.print("性別を入力してください(男:1 女:2) > ");
    String gender = sc.nextLine().strip();

    boolean isGender = true;
    if(gender.equals("1") || gender.equals("2")) {
      isGender = false;
    }

    while(isGender) {
      System.out.print("1または2で性別を入力してください(男:1 女:2)　> ");
      gender = sc.nextLine().strip();

      if(isStringBlankEmpty(gender)) continue;

      if(gender.equals("1") || gender.equals("2")) {
        isGender = false;
      }
    }

    System.out.print("生年月日を入力してください(例:1980/01/01) > ");
    String birthday = sc.nextLine().strip();

    boolean isBirthday = true;
    if(birthday.matches("^[0-9]+$") && birthday.length() == 8) {
      isBirthday = false;
      String year = birthday.substring(0, 4);
      String month = birthday.substring(4, 6);
      String day = birthday.substring(6, 8);
      birthday = year + "/" + month + "/" + day;
    }

    while(isBirthday) {
      System.out.print("8桁の半角数字で生年月日を入力してください(例:1980/01/01) > ");
      birthday = sc.nextLine().strip();
      if(birthday.matches("^[0-9]+$") && birthday.length() == 8) {
        isBirthday = false;
        String year = birthday.substring(0, 4);
        String month = birthday.substring(4, 6);
        String day = birthday.substring(6, 8);
        birthday = year + "/" + month + "/" + day;
      }

    }

    System.out.print("郵便番号を入力してください(例:160-0022) > ");
    String zipCode = sc.nextLine();

    boolean isZipCode = true;
    if(zipCode.matches("^[0-9]+$") && zipCode.length() == 8) {
      isZipCode = false;
      String beforeZipCode = zipCode.substring(0, 3);
      String afterZipCode = zipCode.substring(3, 8);
      zipCode = beforeZipCode + "-" + afterZipCode;
    }

    while(isZipCode) {
      System.out.print("8桁の半角数字で郵便番号を入力してください(例:160-0022) > ");
      zipCode = sc.nextLine().strip();
      if(zipCode.matches("^[0-9]+$") && zipCode.length() == 8) {
        isZipCode = false;
        String beforeZipCode = zipCode.substring(0, 3);
        String afterZipCode = zipCode.substring(3, 8);
        zipCode = beforeZipCode + "-" + afterZipCode;
      }

    }

    System.out.print("都道府県を入力してください(例:東京都) > ");
    String prefecture = sc.nextLine();

    System.out.print("区市町村を入力してください(例:新宿区) > ");
    String municipaities = sc.nextLine();

    System.out.print("番地・建物を入力してください(例:新宿区三丁目京王追分ビル) > ");
    String addressBuilding = sc.nextLine();

    System.out.print("メールアドレスを入力してください(例:akai@uc.com) > ");
    String mail = sc.nextLine();

    boolean isMail = true;
    if(mail.length() >= 3 && mail.contains("@")) {
      String beforeMail = mail.substring(0, mail.indexOf("@"));
      String afterMail = mail.substring((mail.indexOf("@")+1), mail.length());

      if(beforeMail.matches("^[a-z0-9]+$") && afterMail.matches("^[a-z0-9]+$")) {
        isMail = false;
      }
    }

    while(isMail) {
      System.out.print("半角英数字でメールアドレスを入力してください(例:akai@uc.com) > ");
      mail = sc.nextLine().strip();
      if(mail.length() >= 3 && mail.contains("@")) {
        String beforeMail = mail.substring(0, mail.indexOf("@"));
        String afterMail = mail.substring((mail.indexOf("@")+1), mail.length());

        if(beforeMail.matches("^[a-z0-9]+$") && afterMail.matches("^[a-z0-9]+$")) {
          isMail = false;
        }
      }
    }

    sc.close();

    // Scannerで入力されたデータをEmployeeクラスに格納する
    InputEmployee3 input3 = new InputEmployee3();
    input3.setEmployeeData(empNumber, firstName, lastName, gender, birthday, zipCode, prefecture, municipaities, addressBuilding, mail);

    // Employeeクラスのデータを表示する
    input3.printEmployeeData();
  }

  private static boolean isStringBlankEmpty(String str) {
    boolean flg = true;
    if(!str.equals("") || !str.isEmpty()) {
      flg = false;
    }
    return flg;
  }
}

