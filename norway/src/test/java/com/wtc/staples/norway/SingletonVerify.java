package com.wtc.staples.norway;

public class SingletonVerify {

  public void example() {
    SingletonTest.getObject().getData();
  }

  public static void main(String[] args) {
    SingletonTest.getObject().getData();
  }

}
