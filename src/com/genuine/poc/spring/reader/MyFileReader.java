package com.genuine.poc.spring.reader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MyFileReader implements MyReader {
  private StringBuilder builder = null;
  private Scanner scanner = null;

  public MyFileReader(String fileName) {
    try {
      scanner = new Scanner(new File(fileName));
    } catch(FileNotFoundException e) { 
      System.out.println(e.getMessage());
    } 
    builder = new StringBuilder();
  }
  public String read() {
    String lineSeparator = System.getProperty("line.separator");
    try {
      while (scanner.hasNextLine()) {
        builder.append(scanner.nextLine() + lineSeparator);
      }
      return builder.toString();
    } finally {
      scanner.close();
    }
  }
}

