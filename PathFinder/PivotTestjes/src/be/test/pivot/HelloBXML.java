package be.test.pivot;

import org.apache.pivot.beans.BXMLSerializer;
import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;

public class HelloBXML implements Application {

	private Window window = null;
	
	@Override
    public void startup(Display display, Map<String, String> properties)
        throws Exception {
        BXMLSerializer bxmlSerializer = new BXMLSerializer();
        //window = (Window)bxmlSerializer.readObject(HelloBXML.class, "hello.bxml");
        //window = (Window)bxmlSerializer.readObject(HelloBXML.class, "pushButtons.bxml");
        window = (Window)bxmlSerializer.readObject(DataBinding.class, "databinding.bxml");
        window.open(display);
    }

    @Override
    public boolean shutdown(boolean optional) {
        if (window != null) {
            window.close();
        }

        return false;
    }

    @Override
    public void suspend() {
    }

    @Override
    public void resume() {
    }

}
