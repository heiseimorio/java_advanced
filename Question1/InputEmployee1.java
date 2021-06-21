package Question1;

import java.util.*;

class InputEmployee1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("社員番号を入力してください(例:0079) > ");
    String empNumber = sc.nextLine();

    System.out.print("姓を入力してください(例:赤井) > ");
    String firstName = sc.nextLine();

    System.out.print("名を入力してください(例:翠聖) > ");
    String lastName = sc.nextLine();

    System.out.print("性別を入力してください(男:1 女:2) > ");
    String gender = sc.nextLine();

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