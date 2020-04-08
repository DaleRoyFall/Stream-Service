/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.net.InetAddress;

/**
 *
 * @author olegb
 */
public class StreamConnection {
    private String name;
    private InetAddress address;
    private int port;
    
    StreamConnection(String name, InetAddress address, int port) {
        this.name = name;
        this.address = address;
        this.port = port;
    }
    
    String getName() {
        return name;
    }
    
    InetAddress getAddress() {
        return address;
    }
    
    int getPort() {
        return port;
    }
}
