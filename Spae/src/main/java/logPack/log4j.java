package logPack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {

	private static Logger logger = LogManager.getLogger(log4j.class);
	public static void main(String[] args) {
		
		
		System.out.println("Hello this is log4j program! \n");
		
		logger.trace("This is Trace message");
		logger.info("This is info message");
		logger.error("This is error message");
		logger.warn("This is warning message");
		logger.fatal("This is fatal message");

	}

}
