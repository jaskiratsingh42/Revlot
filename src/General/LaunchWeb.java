
package General;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author GAMER
 */
public class LaunchWeb {
    public void Launch_Lambo(){
    try
    {
    Desktop.getDesktop().browse(URI.create("https://www.lamborghini.com/en-en/contact-us"));
    }
    catch(IOException e)
    {}  }
     public void Launch_Rolls(){
    try
    {
    Desktop.getDesktop().browse(URI.create("https://www.rolls-roycemotorcars.com/en-GB/information/contact-rolls-royce.html"));
    }
    catch(IOException e)
    {}
     }
     
     public void Launch_Mclaren(){
    try
    {
    Desktop.getDesktop().browse(URI.create("http://www.retailers.mclaren.com/"));
    }
    catch(IOException e)
    {}
   }
}
