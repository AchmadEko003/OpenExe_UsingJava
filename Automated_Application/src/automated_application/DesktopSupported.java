/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automated_application;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 *
 * @author Nitani
 */
public class DesktopSupported {
    public void desktopsupport(String myUrl){
            if(Desktop.isDesktopSupported()){               //check if desktop is supported 
                Desktop desktop = Desktop.getDesktop();     //getDesktop
            try {
                desktop.browse(new URI(myUrl));         //open default browser, pass myUrl string as new URI Object to browser
            } catch (IOException | URISyntaxException e) { //catch Exceptions
                // TODO Auto-generated catch block
                e.printStackTrace();                    //print trace of error up stack
            }
            }else{
                    Runtime runtime = Runtime.getRuntime();     //getRuntime
                try {
                        runtime.exec("xdg-open " + myUrl);      
                    } catch (IOException e) {                   //catch IOExcetion
                        // TODO Auto-generated catch block
                        e.printStackTrace();                    //print trace of error up stack
                }
            }
        }
}
