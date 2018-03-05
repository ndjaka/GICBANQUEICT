
import com.ict4d.messagerie.ReadMessages;
import java.util.Date;

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
              Date d = new Date(),c ;
              c = new Date(d.getYear(), d.getMonth(), d.getDate());
              System.err.println(c);
        }
}
