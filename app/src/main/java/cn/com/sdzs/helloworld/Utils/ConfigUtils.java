package cn.com.sdzs.helloworld.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
    public static Properties getAppConfigProperties() {
        Properties prop = new Properties();
        InputStream inputStream = ConfigUtils.class.getResourceAsStream("/assets/AppConfig.properties");
        try{
            prop.load(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
}
