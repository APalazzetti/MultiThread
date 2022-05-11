/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;

/**
 *
 * @author alexp
 */
public class ClientHandler implements Runnable{
    
    private final Socket clientSocket;
    private BufferedReader in;
    private BufferedWriter out;
    private String messInv;
    private String messRic;
    
    public ClientHandler(Socket c){
        clientSocket = c;
    }
    
    @Override
    public void run(){
        scrivi("Ciao client!");
        chiudi();
    }    
    
    public void scrivi(String messaggioDaInviare){
        try {
            out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            out.write(messInv+"\n");
            out.flush();
        } catch (IOException ex) {
            System.err.print(ex);
        }
    }
    
    public String leggi(){
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            messRic = in.readLine();
            return messRic;
        } catch (IOException ex) {
            System.err.print(ex);
            return "";
        }
    }
    
    
    
    public void chiudi(){
        try {
            
            clientSocket.close();
        } catch (IOException ex) {
            System.err.print(ex);
        }
    }
}