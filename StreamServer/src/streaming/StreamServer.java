/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

/**
 *
 * @author olegb
 */
public class StreamServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create screen recorder window
        ScreenRecorder screenRecorder = new ScreenRecorder();
        Alignment.centerTheWindow(screenRecorder);
        screenRecorder.setVisible(true);
    }
    
}
