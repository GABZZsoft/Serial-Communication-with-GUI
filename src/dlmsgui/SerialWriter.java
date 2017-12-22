/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dlmsgui;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garuba Abdulmalik
 */
public class SerialWriter {
    
        OutputStream out;

        public SerialWriter(OutputStream out) {
            this.out = out;
        }

        public void run(byte[] msg) {
            try {

                this.out.write(msg);

            } catch (IOException ex) {
                Logger.getLogger(DLMS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
