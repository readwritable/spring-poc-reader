package springreader;

public class MyReaderService {
  private MyReader reader = null;

  public MyReaderService (MyReader reader) {
    this.reader = reader;
  }
  public String fetchData() {
    return reader.read();
  }
}

