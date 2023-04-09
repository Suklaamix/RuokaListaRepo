package com.kaapo.ruokalista;

import java.util.ArrayList;

public class Item {
    protected String ostos;
    protected String extraTxt;

    public Item(String Ostos, String extraTxt) {
        this.ostos = Ostos;
        this.extraTxt = extraTxt;
    }

    public String getOstos() {
        return ostos;
    }

    public void setOstos(String teksti) {
        this.ostos = teksti;
    }
    public void setExtraTxt(String extraTxt) {
        this.extraTxt = extraTxt;
    }

    public String getExtraTxt(){
        return extraTxt;
    }
}
