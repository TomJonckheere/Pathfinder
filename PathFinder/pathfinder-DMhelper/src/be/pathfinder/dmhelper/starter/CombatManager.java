package be.pathfinder.dmhelper.starter;

import org.apache.log4j.Logger;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Form;
import org.apache.pivot.wtk.Window;

public class CombatManager extends Window implements Application {

	private static Logger logger = Logger.getLogger(CombatManager.class);
	
	private Form form = null;

	@Override
	public void resume() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean shutdown(boolean arg0) throws Exception {
		logger.info("Shutdown the CombatManager");
		return false;
	}

	@Override
	public void startup(Display display, Map<String, String> arg1)
			throws Exception {
		
		logger.info("Startup the CombatManager");
		
		createForm();
		
		this.add(form);
		this.setTitle("Combat Manager");
		this.open(display);
	}
	
	private void createForm(){
		logger.info("Creating the form");
		form = new Form();
	}

	@Override
	public void suspend() throws Exception {
		// TODO Auto-generated method stub	
	}

}
