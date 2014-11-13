package be.pathfinder.dmhelper.starter;

import java.net.URL;

import org.apache.pivot.beans.BXML;
import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.beans.Bindable;
import org.apache.pivot.collections.Map;
import org.apache.pivot.util.Resources;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Form;
import org.apache.pivot.wtk.PushButton;
import org.apache.pivot.wtk.Window;

public class MainMenu extends Window implements Application, Bindable {

	private Form form = null;
	@BXML
    private PushButton creationButton = null;
	@BXML
	private PushButton loadBattleButton = null;
	private Window window;
	
	@Override
	public void initialize(Map<String, Object> arg0, URL arg1, Resources arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean shutdown(boolean arg0) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void startup(Display display, Map<String, String> arg1)
			throws Exception {
		BXMLSerializer bxmlSerializer = new BXMLSerializer();
		window = (Window) bxmlSerializer.readObject(MainMenu.class,
				"mainmenu.bxml");
		window.open(display);
		
	}

	@Override
	public void suspend() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
