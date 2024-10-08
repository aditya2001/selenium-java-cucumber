package constants;

public class FrameworkConstants {

    private FrameworkConstants() {

    }

    private static final int EXPLICITWAIT = 10;

    private static final String RESOURCESPATH= System.getProperty("user.dir") +"/src/test/resources/";
    private static final String CONFIGFILEPATH= RESOURCESPATH + "/config/config.properties";

    public static int getExplicitWait() {
        return EXPLICITWAIT;
    }

    public static String getConfigFilePath() {
        return CONFIGFILEPATH;
    }

}