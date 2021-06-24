package Question13;

import java.util.Scanner;

public class WorkReport2 {
  public static void main(String[] args) {
    ReadWriteThread2 readThread = new ReadWriteThread2("report.txt");
    Thread read = new Thread(readThread);

    Scanner sc = new Scanner(System.in);
    // 社員番号、作業内容、作業時間を入力してもらい、report_社員番号名.rptファイルを作成する
    readThread.empNumber = sc.nextLine();
    readThread.inputContet = sc.nextLine();
    readThread.inputTime = sc.nextLine();

    boolean isTime = true;
    if(readThread.inputTime.matches("^[0-9]+$") && readThread.inputTime.length() == 4) {
      isTime = false;
    }

    while(isTime) {
      System.out.print("4桁の半角整数で作業時間を入力してください(例:0200) > ");
      readThread.inputTime = sc.nextLine();
      if(readThread.inputTime.matches("^[0-9]+$") && readThread.inputTime.length() == 4) {
        isTime = false;
        String[] tmp = readThread.inputTime.split("");
        readThread.inputTime = tmp[0] + tmp[1] + ":" + tmp[2] + tmp[3];
      }
    }

    sc.close();

    read.start();
    readThread.write();

  }
}
