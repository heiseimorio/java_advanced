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
    sc.close();

    read.start();
    readThread.write(readThread.readData);

  }
}
