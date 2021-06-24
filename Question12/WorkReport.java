package Question12;



public class WorkReport {
  public static void main(String[] args) {
    ReadWriteThread1 readThread = new ReadWriteThread1("report.txt", "report3.txt");
    Thread read = new Thread(readThread);

    read.start();

  }
}
