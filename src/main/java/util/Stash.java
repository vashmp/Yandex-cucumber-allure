package util;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Nikita Blokhin
 */
public class Stash {

    private static Map<String, Object> stash = new HashMap<>();


    public static final String movieName = "movieName";
    public static final String moviePlaces = "moviePlaces";

    public static Object get (String key){
        return stash.get(key);
    }

    public static void put(String key, Object value){
        stash.put(key, value);
    }



}