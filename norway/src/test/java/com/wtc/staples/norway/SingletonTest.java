package com.wtc.staples.norway;

public class SingletonTest {

  private static SingletonTest t = null;
  private DataProvider1 d;

  private SingletonTest() {}

  public static SingletonTest getObject() {
    if (t == null) {
      t = new SingletonTest();
    }
    return t;
  }

  public DataProvider1 getData() {
    System.out.println(d);
    return (d == null) ? new DataProvider1() : d;

  }


}
