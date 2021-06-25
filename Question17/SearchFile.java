package Question17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class SearchFile {
  public static void main(String[] args) {
    /**
     * 0039    第一開発部
     * 0035    開発部
     * 0079    開発部
     * 0123    第一開発部
     * 0303    第二開発部
     * 上記の人達のファイル名を出力する
     *
     * File クラスの listFiles メソ⏿ドとラムダ式を用いて。
     */
    List<String> inputData = new ArrayList<>();
    try(BufferedReader br = new BufferedReader(new FileReader("EmployeeList.dat"))) {
      String line;

      while ((line = br.readLine()) != null) {
        inputData.add(line);
      }
      br.close();
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }

    List<String> target = new ArrayList<>();
    inputData.forEach(text -> {
      if(text.contains("開発部")) {
        String trimmingEmpNumber = text.substring(0, 4);
        target.add(trimmingEmpNumber);
      }
    });

  }
}
