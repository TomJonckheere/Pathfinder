package be.test.pivot;

import java.awt.Color;
import java.awt.Font;

import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.HorizontalAlignment;
import org.apache.pivot.wtk.Label;
import org.apache.pivot.wtk.VerticalAlignment;
import org.apache.pivot.wtk.Window;

public class HelloJava implements Application{

	private Window window = null;

	@Override
	public boolean shutdown(boolean arg0) throws Exception {
		if (window != null) {
            window.close();
        }
        return false;
	}

	@Override
	public void startup(Display display, Map<String, String> arg1)
			throws Exception {
		window = new Window();

        Label label = new Label();
        label.setText("Hello World!");
        label.getStyles().put("font", new Font("Arial", Font.BOLD, 24));
        label.getStyles().put("color", Color.RED);
        label.getStyles().put("horizontalAlignment",
            HorizontalAlignment.CENTER);
        label.getStyles().put("verticalAlignment",
            VerticalAlignment.CENTER);

        window.setContent(label);
        window.setTitle("Hello World!");
        window.setMaximized(true);

        window.open(display);
	}
	
	@Override
	public void resume() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void suspend() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
