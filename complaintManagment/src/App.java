/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    //Dimension dimension = new Dimension(1024, 720);
    public static void main(String[] args) throws InterruptedException, UnknownHostException, IOException, SQLException, ClassNotFoundException {
        System.out.println(new App().getGreeting());
        mainWindow mw = new mainWindow();
        loginWindow lw = new loginWindow();
        //loginWindow dialog = new loginWindow();
        mw.setSize(1000,510);
        //Rectangle bounds = new Rectangle(1024,720);
        Dimension maximumSize = new Dimension(1024,720);
        mw.setMaximumSize(maximumSize);
        mw.setResizable(false);
        //mw.maximumSize(1024, 720);
        lw.setVisible(true);
        //DBConnection database = new DBConnection();
        //Connection connection = DBConnection.getConnection();
        
        System.out.println("[DEBUGPOINT]Outside loop");  
        while(true)
        {
            Thread.sleep(500);
            if(lw.getLoginStatus() == 1)
            {
                System.out.println("[DEBUGPOINT]main window"); 
                          lw.setVisible(false);
                          break;
            }
            else if(lw.getLoginStatus() == 0)
            {
                System.out.println("[DEBUGPOINT]not main window");

            }
        }
        mw.setVisible(true);
        //databaseController dbcontroller = new DBConnection();
       ;
   
            
            //dialog.setDefaultCloseOperation(loginWindow.HIDE_ON_CLOSE);
            //dialog.setSize(400,400);
            //dialog.setVisible(true);
  
        
    }
}
