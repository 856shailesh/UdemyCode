package log4j;
import org.apache.logging.log4j.*;

public class LoggingFile {

	private static final Logger log = LogManager.getLogger(LoggingFile.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Debugg Message logged");
		log.error("Error Message logged ");
		log.fatal("Fatal error logged");
	}

}
