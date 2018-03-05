
import com.ict4d.messagerie.ReadMessages;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ndjaka
 */
public class test {
        public static void main(String args[])
        {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    int i=0;
                   // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    while (true) {                        
                        System.out.print("bonjour"+ i++);
                    }
                    
                }
            });
            t.start();
//            int i=0;
//            while (true) {                
//                     System.out.print("bonjour"+ i++);
//            }
        }
}
