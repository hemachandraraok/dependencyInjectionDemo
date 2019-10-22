package context;

import dataitems.Data;
import driver.DriverFactory;

public class ScenarioContext {

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    private Data data = new Data();

    public DriverFactory getDriverFactory() {
        return driverFactory;
    }

    public void setDriverFactory(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
    }

    private DriverFactory driverFactory = new DriverFactory();


}
