package practiseTest;
import org.apache.logging.log4j.*;

public class LoggingConsole {

	private static final Logger log = LogManager.getLogger(LoggingConsole.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debugg Message logged");
		log.error("Error Message logged ");
		log.fatal("Fatal error logged");
	}

}
