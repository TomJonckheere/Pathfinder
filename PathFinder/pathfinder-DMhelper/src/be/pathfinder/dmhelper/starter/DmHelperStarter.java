package be.pathfinder.dmhelper.starter;

import org.apache.log4j.Logger;
import org.apache.pivot.wtk.DesktopApplicationContext;

public class DmHelperStarter {
	
	private static Logger logger = Logger.getLogger(DmHelperStarter.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		logger.info("Starting the pathfinder DM helper application");
		DesktopApplicationContext.main(CombatManager.class, args);
	}
}
