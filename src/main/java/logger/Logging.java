package logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class Main
{
    private static final Log log = LogFactory.getLog(Main.class);
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
