package com.group.data_providers;

import org.testng.annotations.Test;

public class DataProvider2 {

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProvider.class)
    public void loginTest(String email, String password) {
        System.out.println(email + ", " + password);
    }
}
