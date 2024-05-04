package org.example.application;

import org.example.ui.Menu1ScreenUI;
import org.example.ui.Menu2ScreenUI;
import org.example.ui.ScreenUI;

import java.awt.*;

public class Application {


    private ScreenUI currentScreen = null;




    public void clicked(Component eventSource){
        if(currentScreen == null)
            return;
        String sourceId = eventSource.getName();
        if(sourceId.equals("button1")){
            currentScreen.handleButton1Click();
        } else if(sourceId.equals("button2")){
            currentScreen.handleButton2Click();
        }
    }



}
