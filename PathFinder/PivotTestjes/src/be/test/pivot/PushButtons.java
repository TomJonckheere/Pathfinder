package be.test.pivot;

import java.net.URL;
import java.util.Map;

import org.apache.pivot.beans.Bindable;
import org.apache.pivot.util.Resources;
import org.apache.pivot.wtk.Alert;
import org.apache.pivot.wtk.Button;
import org.apache.pivot.wtk.ButtonPressListener;
import org.apache.pivot.wtk.MessageType;
import org.apache.pivot.wtk.PushButton;
import org.apache.pivot.wtk.Window;

public class PushButtons extends Window implements Bindable{
	private PushButton pushButton;

	@Override
	public void initialize(
			org.apache.pivot.collections.Map<String, Object> namespace, URL arg1,
			Resources arg2) {
		pushButton = (PushButton)namespace.get("pushButton");

        pushButton.getButtonPressListeners().add(new ButtonPressListener() {
            @Override
            public void buttonPressed(Button button) {
                Alert.alert(MessageType.INFO, "You clicked me!", PushButtons.this);
            }
        });
	}
	
}
