package dataitems;

import java.util.HashMap;

@SuppressWarnings("unchecked")
public class Data {
    public HashMap getPropTransfer() {
        return propTransfer;
    }

    public void setPropTransfer(HashMap propTransfer) {
        this.propTransfer = propTransfer;
    }

    private HashMap<String, String> propTransfer = new HashMap<>();

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test;


}
