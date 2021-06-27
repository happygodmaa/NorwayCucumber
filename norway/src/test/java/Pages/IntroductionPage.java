package Pages;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IntroductionPage {
  public static void main(String[] args) {
    Map<String, String> hm = new HashMap<>();
    hm.put("u1", "nik1");
    hm.put("u2", "nik2");
    hm.put("u3", "nik3");
    hm.put("p1", "pass1");
    hm.put("p2", "pass2");
    hm.put("p3", "pass3");
    hm.put("p4", "pass1");
    hm.put("u1", "nik101");
    System.out.println(hm);

    for (Entry<String, String> entry1 : hm.entrySet()) {
      System.out.print(entry1.getKey() + "------");
      System.out.println(entry1.getValue());
    }


  }

}

/*
 * Set<String> s1 = new HashSet<>(); s1.add("set1"); s1.add("set2"); s1.add("set3"); s1.add("set2");
 * System.out.println(s1);
 * 
 * List<String> l2 = new ArrayList<>(); for (String st : s1) { l2.add(st); } System.out.println(l2);
 */
