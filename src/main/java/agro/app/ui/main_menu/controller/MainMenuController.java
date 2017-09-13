package agro.app.ui.main_menu.controller;

import agro.app.ui.common.AbstractFrameController;
import agro.app.ui.main_menu.view.MainMenuFrame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainMenuController extends AbstractFrameController {

    private MainMenuFrame mainMenuFrame;
    //private ReportsController reportsController;

    @Autowired
    public MainMenuController(MainMenuFrame mainMenuFrame) {
        this.mainMenuFrame = mainMenuFrame;
    }

    @Override
    public void prepareAndOpenFrame() {
        registerAction(mainMenuFrame.getReportsBtn(), e -> openReportsWindow());
        mainMenuFrame.setVisible(true);
    }

    private void openReportsWindow() {

    }


}
