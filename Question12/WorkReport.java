package Question12;

import java.util.Scanner;

public class WorkReport {
  public static void main(String[] args) {
    ReadWriteThread1 readThread = new ReadWriteThread1("report.txt", "report3.txt");
    Thread read = new Thread(readThread);

    Scanner sc = new Scanner(System.in);
    readThread.inputContet = sc.nextLine();
    readThread.inputTime = sc.nextLine();
    sc.close();

    read.start();
  }
}
