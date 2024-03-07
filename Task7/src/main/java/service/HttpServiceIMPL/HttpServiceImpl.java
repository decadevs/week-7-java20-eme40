package service.HttpServiceIMPL;

import entity.SimpleHttpServer;
import service.HttpService;
import util.HttpHandler;

import javax.sound.sampled.Port;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class HttpServiceImpl implements HttpService {
  public void start(int port){
    try (ServerSocket serverSocket = new ServerSocket(SimpleHttpServer.PORT)){
      System.out.println("Server port number is: " + port);

      while(true){
        Socket socket = serverSocket.accept();
        System.out.println("Connection established");
        new Thread(new HttpHandler(socket)).start();
      }
    }catch (IOException e){
      e.printStackTrace();
    }

  }
}
