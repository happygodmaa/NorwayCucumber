package com.wtc.staples.norway;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

  @DataProvider(name = "dpname")
  public Object[][] m() {
    return new Object[][] {{"nik3", "pass3"}, {"nik2", "pass2"}, {"nik4", "pass4"},
        {"nik5", "pass5"}};
  }

}
