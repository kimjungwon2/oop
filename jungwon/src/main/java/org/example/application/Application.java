package org.example.application;

import org.example.ui.Menu1ScreenUI;
import org.example.ui.Menu2ScreenUI;
import org.example.ui.ScreenUI;

import java.awt.*;

public class Application {

    private ScreenUI currentScreen = null;


    public void clicked(Component eventSource){
        String sourceId = eventSource.getName();
        if(sourceId.equals("sourceId")){
            currentScreen = new Menu1ScreenUI();
            currentScreen.show();
        } else if(sourceId.equals("menu2")){
            currentScreen = new Menu2ScreenUI();
            currentScreen.show();
        } else if(sourceId.equals("button1")){
            if (currentScreen == null)
                    return;
            currentScreen.handleButton1Click();
        }
    }
}
