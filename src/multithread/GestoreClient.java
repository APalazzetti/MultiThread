/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithread;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexp
 */
public class GestoreClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Client cli = new Client(InetAddress.getLocalHost(),2000);
            String msgLetto = cli.leggi();
            System.out.println(msgLetto);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
