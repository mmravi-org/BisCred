package helpers;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class helpers {

    public static Properties readRegProperties(){
        Properties prop = new Properties();

        try (InputStream input = new FileInputStream("src/main/java/core/regression.properties")) {
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
    public static String getRegValue() {
        return readRegProperties().getProperty("regression_version");
    }

    public static String createTimeStamp(){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return sdf1.format(timestamp);
    }

    public static String getContactPostalCodeValue() {
        return readRegProperties().getProperty("contact_postal_code");
    }

    public static String getContactAreaCode(){
        return readRegProperties().getProperty("contact_area_code");
    }

    public static String getContactPhoneNumber() {
        return readRegProperties().getProperty("contact_phone_number");
    }

    public static String getContactPhoneExtension() throws IOException {
        return readRegProperties().getProperty("contact_phone_extension");
    }

    public static String getCompanyPostalCodeValue() throws IOException {
        return readRegProperties().getProperty("company_postal_code");
    }

    public static String getCompanyAreaCode() {
        return readRegProperties().getProperty("company_area_code");
    }

    public static String getCompanyPhoneNumber()  {
        return readRegProperties().getProperty("company_phone_number");
    }

    public static String getCompanyPhoneExtension() {
        return readRegProperties().getProperty("company_phone_extension");
    }

    public static String getCompanyPropertyCount() {
        return readRegProperties().getProperty("company_property_count");
    }

    public static String getCompanyContactCount() {
        return readRegProperties().getProperty("company_contact_count");
    }

    public static String getRegressionEnvironment() throws IOException {
        return readRegProperties().getProperty("env");
    }

}
