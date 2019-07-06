package src.config;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Start {

    public static void main(String[] args) throws InterruptedException {

        while (true)
        {
            System.out.println(Arrays.toString(DbConfig.values()));
            Thread.sleep(5000);
        }

    }


}
