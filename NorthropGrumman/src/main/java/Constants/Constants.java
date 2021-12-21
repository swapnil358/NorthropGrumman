package Constants;

public class Constants {

    private Constants() {
    }

    private static final String CHROMEDRIVERPATH = System.getProperty("user.dir") + "/resources/executables/chromedriver.exe";
    private static final int EXPLICITLYWAIT = 20;

    public static int getEXPLICITLYWAIT() {
        return EXPLICITLYWAIT;
    }

    public static String getCHROMEDRIVERPATH() {
        return CHROMEDRIVERPATH;
    }


}
