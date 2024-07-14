package com.gtrxac.discord;

import javax.microedition.lcdui.*;

public class MainMenu extends List implements CommandListener {
    State s;
    private Command quitCommand;

    public MainMenu(State s) {
        super(null, List.IMPLICIT);
        setCommandListener(this); 
        this.s = s;

        quitCommand = new Command("Quit", Command.EXIT, 0);

        append("Servers", null);
        append("Direct messages", null);
        append("Settings", null);
        append("Log out", null);
        addCommand(quitCommand);
    }

    public void commandAction(Command c, Displayable d) {
        if (c == List.SELECT_COMMAND) {
            switch (getSelectedIndex()) {
                case 0: {
                    s.openGuildSelector(true);
                    break;
                }
                case 1: {
                    s.openDMSelector(true);
                    break;
                }
                case 2: {
                    s.disp.setCurrent(new SettingsForm(s));
                    break;
                }
                case 3: {
                    if (s.gateway != null) s.gateway.stop = true;
                    s.myUserId = null;
                    s.disp.setCurrent(new LoginForm(s));
                }
            }
        }
        else if (c == quitCommand) {
            s.midlet.notifyDestroyed();
        }
    }
}
