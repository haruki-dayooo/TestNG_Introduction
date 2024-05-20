package com.group.data_providers;

import org.testng.annotations.Test;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "LoginDataProvider")
    public Object[][] getData() {
        Object[][] data = {{"abc@fpt.edu.vn", "abc"},
                {"xyz@fpt.edu.vn", "xyz"},
                {"mno@fpt.edu.vn", "mno"}};
        return data;
    }

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email, String password) {
        System.out.println(email + ", " + password);
    }
}
