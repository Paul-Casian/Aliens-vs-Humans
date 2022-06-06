import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Thread_Exit implements Runnable {

    public void run(){
        KeyStroke escape = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        if(escape.isOnKeyRelease()){
            System.exit(0);
        }
    }

}
