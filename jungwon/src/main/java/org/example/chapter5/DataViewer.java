package org.example.chapter5;


import javax.swing.plaf.TableUI;

public class DataViewer {

    public void display(){
        String data =loadHtml();
        updateGui(data);
    }

    public String loadHtml(){
        HttpClient client = new HttpClient();
        String url = "dds";
        client.connect(url);
        return client.getResponse();
    }

    private void updateGui(String data){
        GuiData guiModel = parseDataToGuiData(data);
//        tableUI.changeData(guiModel);
    }

    private GuiData parseDataToGuiData(String data){
        return null;
    }

}
