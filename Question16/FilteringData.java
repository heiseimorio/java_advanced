package Question16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilteringData {
  public static void main(String[] args) {
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

    inputData.forEach(text -> {
      if(text.contains("開発部")) {
        System.out.println(text);
      }
    });

  }
}
