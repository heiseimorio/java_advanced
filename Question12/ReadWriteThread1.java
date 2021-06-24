package Question12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;

public class ReadWriteThread1 implements Runnable {

  String readFilePath;
  String writeFilePath;

  public void run() {
    Scanner sc = new Scanner(System.in);
    String inputContet = sc.nextLine();
    String inputTime = sc.nextLine();
    sc.close();
    List<String> readData = read(this.readFilePath, inputContet, inputTime);
    write(this.writeFilePath, readData);
  }

  public ReadWriteThread1(String readfileName, String writeFileName) {
    // ファイル名を指定
    File readFile = new File(readfileName);
    // 読み込みファイル名のフルパスを取得
    this.readFilePath = readFile.getAbsolutePath();

    // ファイル名を指定
    File writeFile = new File(writeFileName);
    // 書き込み先ファイル名のフルパスを取得
    this.writeFilePath = writeFile.getAbsolutePath();
  }


  public List<String> read(String readFilePath, String inputContet, String inputTime) {

    List<String> data = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader(readFilePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        data.add(line);
      }
      br.close();


      String blank = "	";
      String workContent = blank + inputContet;

      String time = blank + inputTime;

      data.set(3, workContent);
      data.set(6, time);

    } catch(FileNotFoundException e){
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
    return data;
  }

  public void write(String writeFilePath, List<String> readData) {
    try {
      // FileWriterクラスのオブジェクトを生成する
      FileWriter fileWriter = new FileWriter(writeFilePath);

      // PrintWriterクラスのオブジェクトを生成する
      PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

      // PrintWriterクラスのprintlnメソッドを使ってファイルに書き込む
      for(String text: readData) {
        if(text.equals("以上、報告終わり。")) {
          printWriter.print(text);
        } else {
          printWriter.println(text);
        }
      }

      // 書き込み対象のファイルを閉じてリソースを開放する
      printWriter.close();
    } catch(FileNotFoundException e){
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }
  }

}
