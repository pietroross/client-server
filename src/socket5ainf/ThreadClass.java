package socket5ainf;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadClass extends Thread {
 
    public ThreadClass ()
    {
        
    }
    @Override
    public void run()
    {
        for(int i=10; i!=0; i--)
        {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
            }
           System.out.println(i);
        }
    
}
}
