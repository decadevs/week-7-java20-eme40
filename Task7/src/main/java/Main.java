import entity.SimpleHttpServer;
import service.HttpServiceIMPL.HttpServiceImpl;

public class Main {
  public static void main(String[] args) {
    HttpServiceImpl obj = new HttpServiceImpl();

    obj.start(SimpleHttpServer.PORT);
  }
}
