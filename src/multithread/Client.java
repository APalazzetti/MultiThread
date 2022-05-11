/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alexp
 */
public class Client {
   
    Socket client;
    
       
        BufferedWriter output;
          BufferedReader input;
             
    
    public Client(InetAddress ip,int porta){
        
        try {
                // creazione socket client
                client = new Socket(ip,porta);
                output= new BufferedWriter(new OutputStreamWriter (client.getOutputStream()));
                
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
             
      
             
            
          
            
        
            }
    public String leggi(){
    
        String msg;
        try {
            input= new BufferedReader( new InputStreamReader(client.getInputStream()));
            msg = input.readLine();        
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return "";
}


    }