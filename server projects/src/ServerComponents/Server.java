package ServerComponents;

import ServerComponents.Client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

public class Server {

    public ArrayList<Client> Clients = new ArrayList<>();
    private int port = 222; //port of the server //TODO: edit to the correct value


    public Server(){
        //TODO: initialize




    }

    public void OnConnect(){
        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("ServerComponents.Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                writer.println(new Date().toString());
            }

        } catch (IOException ex) {
            System.out.println("ServerComponents.Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }



    }

    public ArrayList<Client> getClients() {
        return Clients;
    }
}
