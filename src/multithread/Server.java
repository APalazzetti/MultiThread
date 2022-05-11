/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alexp
 */
public class Server {
    
    ServerSocket serverSocket;
    Socket socket;
      BufferedWriter output;
          BufferedReader input;    
          

    public Server(int porta)
	    {
                
	        try {
          
               
          
        serverSocket = new ServerSocket(porta);
       System.out.println("server avviato \n");
             
            input= new BufferedReader( new InputStreamReader(socket.getInputStream()));
    }
        catch (IOException ex) {
            System.out.println("Errore IO");
        }
            }
    public void ascolto() {
        try {
            socket=serverSocket.accept();
            System.out.println("server in ascolto/n");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void scrivi(String messaggio){
        try {
            output= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            output.write(messaggio+"\r\n");
            output.flush();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
