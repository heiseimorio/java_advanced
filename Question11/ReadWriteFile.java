package Question11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWriteFile {
  public static void main(String[] args) {
    // ファイル名を指定
    File file = new File("report.txt");

    // 上記ファイル名のフルパスを取得
    String filePath = file.getAbsolutePath();

    Scanner sc = new Scanner(System.in);
    try(BufferedReader br = new BufferedReader(new FileReader(filePath)))
      {
        String line;
        List<String> data = new ArrayList<>();

        while ((line = br.readLine()) != null) {
          data.add(line);
        }
        br.close();

        String inputContet = sc.nextLine();
        String blank = "	";
        String workContent = blank + inputContet;

        String inputTime = sc.nextLine();
        String time = blank + inputTime;
        sc.close();

        data.set(3, workContent);
        data.set(6, time);

        // ファイル名を指定
        file = new File("report3.txt");

        // 上記ファイル名のフルパスを取得
        filePath = file.getAbsolutePath();

        // FileWriterクラスのオブジェクトを生成する
        FileWriter fileWriter = new FileWriter(filePath);

        // PrintWriterクラスのオブジェクトを生成する
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

        // PrintWriterクラスのprintlnメソッドを使ってファイルに書き込む
        for(String text: data) {
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
