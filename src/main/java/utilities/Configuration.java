package utilities;

import org.testng.Assert;
import org.yaml.snakeyaml.Yaml;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

public class Configuration {

    public static void setUp(){
        try{
            InputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/config.yml"));
            Yaml yaml = new Yaml();
            Map<String, String> data = (Map<String, String>) yaml.load(inputStream);
            System.out.println("Configuration data->"+data);
            System.setProperty("Browser",data.get("Browser"));
            System.out.println("Config parameters set successfully");
        }catch (Exception e){
            Assert.fail("Failed to set up Config Properties"+e.getMessage());
        }
    }

    public static String getValue(String parameter){
        String value=null;
        try{
            InputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir")+"/src/main/resources/config.yml"));
            Yaml yaml = new Yaml();
            Map<String, String> data = (Map<String, String>) yaml.load(inputStream);
            if(data.containsKey(parameter)){
                value = data.get(parameter);
            }else {
                Assert.fail("Failed to find Key in Config Yml file");
            }
            System.setProperty("Environment",data.get("Environment"));
        }catch (Exception e){
            Assert.fail("Failed to set up Config Properties"+e.getMessage());
        }
        return value;
    }
}
