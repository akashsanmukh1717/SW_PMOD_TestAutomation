package utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DummyClass {

    public static void main(String[] args) {
        String filePath = "accounts_maintenance/SampleJSON.json";
        JsonHandler jsonHandler = new JsonHandler(new File(filePath));

        //Reading a Json value
        System.out.println(jsonHandler.getJsonValue("$.coffee.region"));

        //Writing to JSON
        Map<String, String> mapDemo = new HashMap<>();
        mapDemo.put("firstName", "Prithviraj");
        mapDemo.put("lastName", "Sahoo");
        System.out.println(jsonHandler.writeToJson("$.coffee.region", mapDemo));
    }
}
