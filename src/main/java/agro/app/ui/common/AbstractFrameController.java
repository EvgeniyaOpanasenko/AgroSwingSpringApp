package agro.app.ui.common;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class AbstractFrameController {

    public abstract void  prepareAndOpenFrame();

    protected void registerAction(JButton btn, ActionListener listener){
        btn.addActionListener(listener);
    }
}
