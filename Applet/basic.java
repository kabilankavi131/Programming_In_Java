import java.applet.*;
import java.awt.*;
/* <applet code="basic.class" height="300" width="300"></applet? */
public class basic extends Applet {
    public void init(){
        System.out.println("Constructor Called");
    }
    public void start(){
        System.out.println("programme Started");
    }
    public void paint(Graphics g){
        g.drawString("Hello Java Applet", 300,300);
    }
    public void stop(){
        System.out.println("program Stopped");
    }
    public void destroy(){
        System.out.println("Program Destroyed ");
    }
}