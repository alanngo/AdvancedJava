package logger;
import org.apache.log4j.Logger;


public class Main
{
    private static final Logger log = Logger.getLogger(Main.class);
    static void foo()
    {
        throw new RuntimeException("runtime exception thrown");
    }

    public static void main(String[] args)
    {
        try
        {
            foo();
        }
        catch (Exception e)
        {
            log.debug("Exception Caught", e);
        }
        finally
        {
            log.warn("finally block is still executed");
        }
        log.info("better than System.out.println()");
    }
}
