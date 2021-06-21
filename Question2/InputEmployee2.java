package Question2;

import java.util.*;

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
    if(!firstName.equals("") && !firstName.equals(null)) {
      isFirstName = false;
    }

    while(isFirstName) {
      System.out.print("入力必須です。姓を入力してください(例:赤井) > ");
      firstName = sc.nextLine().strip();
      if(!firstName.equals("") || !firstName.isEmpty()) {
        isFirstName = false;
      }
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
      if(!lastName.equals("") || !lastName.isEmpty()) {
        isLastName = false;
      }
    }

    System.out.print("性別を入力してください(男:1 女:2) > ");
    String gender = sc.nextLine().strip();

    boolean isGender = true;
    if(gender.equals("1") || gender.equals("2")) {
      isGender = false;
    }

    while(isGender) {
      System.out.print("1又は2で性別を入力してください(男:1 女:2)　> ");
      gender = sc.nextLine().strip();
      if(gender.equals("") || gender.isEmpty()) {
        continue;
      }
      if(gender.equals("1") || gender.equals("2")) {
        isGender = false;
      }
    }

    System.out.print("生年月日を入力してください(例:1980/01/01) > ");
    String birthday = sc.nextLine();

    System.out.print("郵便番号を入力してください(例:160-0022) > ");
    String zipCode = sc.nextLine();

    System.out.print("都道府県を入力してください(例:東京都) > ");
    String prefecture = sc.nextLine();

    System.out.print("区市町村を入力してください(例:新宿区) > ");
    String municipaities = sc.nextLine();

    System.out.print("番地・建物を入力してください(例:新宿区三丁目京王追分ビル) > ");
    String addressBuilding = sc.nextLine();

    System.out.print("メールアドレスを入力してください(例:akai@uc.com) > ");
    String mail = sc.nextLine();
    sc.close();

    System.out.println("");
    System.out.println("************社員情報************");
    System.out.println("ー ––––––––––––––––––––––––– ー");
    System.out.println("| 社員番号:" + empNumber);
    System.out.println("| 氏名　　:" + firstName + " " + lastName);
    System.out.println("| 性別　　:" + gender);
    System.out.println("| 生年月日:" + birthday);
    System.out.println("| 郵便番号:〒" + zipCode);
    System.out.println("| 住所１　:" + prefecture + municipaities);
    System.out.println("| 住所２　:" + addressBuilding);
    System.out.println("| メール　:" + mail);
    System.out.println("ー –––––––––––––––––––––––––– ー");


  }
}

