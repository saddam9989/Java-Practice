package com.log4j.test;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestLog {

	private static Logger log = Logger.getLogger(TestLog.class);

	public static void main(String[] args) throws Exception {

		// create layout
		// Layout layout = new SimpleLayout();
		// Layout layout = new HTMLLayout();
		//Layout layout = new XMLLayout();
		 Layout layout=new PatternLayout("%p %d %C %M %m %n");

		// create appender + link layout
		//Appender app = new ConsoleAppender(layout);
		 Appender app = new FileAppender(layout, "C:\\Users\\ARVHUSSA\\Desktop\\New folder\\data.log");

		// link appender with logger
		log.addAppender(app);

		log.info("This is Info");
		log.debug("This is Debug");
		log.warn("This is Warn");
		log.error("This is Error");
		log.fatal("This is Fatal");

	}

}
