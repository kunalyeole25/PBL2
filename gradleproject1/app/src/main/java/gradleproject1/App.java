/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleproject1;

import java.awt.Dimension;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }
    //Dimension dimension = new Dimension(1024, 720);
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        mainWindow mw = new mainWindow();
        mw.setSize(800,400);
        //Rectangle bounds = new Rectangle(1024,720);
        Dimension maximumSize = new Dimension(1024,720);
        mw.setMaximumSize(maximumSize);
        mw.setResizable(false);
        //mw.maximumSize(1024, 720);
        mw.setVisible(true);
    }
}
