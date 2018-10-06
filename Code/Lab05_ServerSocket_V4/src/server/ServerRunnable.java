package server;

import container.Container;
import controller.CmKgController;
import controller.GenericController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import request.RequestImpl;
import response.ResponseImpl;

public class ServerRunnable implements Runnable {

    private int PORT;
    private int count;

    public ServerRunnable(int PORT) {
        this.PORT = PORT;
    }

    @Override
    public void run() {
        try (
                ServerSocket ss = new ServerSocket(PORT);
                Socket socket = ss.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.defaultCharset()));
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);) {

            Container c = Container.getInstance();
            c.processService(br, pw);
            
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
