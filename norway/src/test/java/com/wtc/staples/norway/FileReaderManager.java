package com.wtc.staples.norway;

public class FileReaderManager {

  private static FileReaderManager fileReaderManager = new FileReaderManager();
  private ConfigFileReader configFileReader;

  private FileReaderManager() {

  }

  public static FileReaderManager getFileReaderManager() {
    return fileReaderManager;
  }

  public ConfigFileReader getConfigFileReader() {
    return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
  }
}

