package stepDefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

  public static void main(String[] args) {
    List<String> list4 = new ArrayList<>();
    list4.add("ram1");
    list4.add("ram2");
    list4.add("ram13");
    list4.add("ram14");
    String[] a = list4.toArray(new String[list4.size()]);


    String[] b = {"hi1", "hi2", "hi3", "hi4"};

    List<String> list5 = new ArrayList<>();
    for (String s : b) {
      list5.add(s);
    }
    System.out.println(list5);
    Map<String, String> m = new HashMap<>();

    m.put("ram", "phy");
    m.put("ram1", "phy1");
    System.out.println(m);


  }

}
