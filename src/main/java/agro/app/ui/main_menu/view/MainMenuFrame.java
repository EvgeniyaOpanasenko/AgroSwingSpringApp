package agro.app.ui.main_menu.view;

import agro.app.utils.Borders;
import agro.app.utils.ConstMessagesEN;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainMenuFrame extends JFrame {

    private JButton reportsBtn;

    public MainMenuFrame() throws HeadlessException {
        setUpFrame();
        initComponents();
        pack();

    }

    private void initComponents() {
        reportsBtn = new JButton(ConstMessagesEN.Labels.REPOSRT);

        add(reportsBtn);
    }

    private void setUpFrame() {
        getRootPane().setBorder(Borders.createEmptyBorder());
        setTitle(ConstMessagesEN.Labels.MAIN_MENU);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        //LookAndFeelUtils.setWindowsLookAndFeel();
        setLayout(new GridLayout(1, 2, 20, 20));
    }

    public JButton getReportsBtn() {
        return reportsBtn;
    }

    public void setReportsBtn(JButton reportsBtn) {
        this.reportsBtn = reportsBtn;
    }
}
