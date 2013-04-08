package springreader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyReaderClient {
  private ApplicationContext ctx = null;
  private MyReaderService service = null;

  public MyReaderClient() {
    ctx = new ClassPathXmlApplicationContext("myreader-beans.xml");
  }
  public String getData() {
    service = (MyReaderService) ctx.getBean("myReaderService");
    return service.fetchData();
  }
  public static void main(String[] args) {
    MyReaderClient client = new MyReaderClient();
    System.out.println("Data:\n" + client.getData());
  }
}

