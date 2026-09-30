package patterns.creational.singleton;

public class Logger {

    private static Logger logger = null;

    /*public synchronized  static Logger getLogger()
    {
        if(logger == null)
        {
            logger = new Logger();
        }
        return logger;
    }
    -> Additional synchronization overhead even after first initialization
    -> So we go for double-checked locking
    */
    public static Logger getLogger()
    {
        if(logger == null) //Double-Checked Locking Mechanism
        {
            synchronized(Logger.class)
            {
                if(logger == null)
                {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message)
    {
        System.out.println("Log: "+ message);
    }
}


