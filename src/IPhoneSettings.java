public class IPhoneSettings {

    private static IPhoneSettings instance;

    public int brightness;
    public boolean wifi = false ;

    private IPhoneSettings(){

    }


    public static IPhoneSettings getInstance(){
        if(instance == null){
            instance = new IPhoneSettings();
        }
        return instance;
    }

    public void setBrightness(int brightness){

        this.brightness = brightness;
    }

    public int getBrightness(){

        return brightness;
    }

    public void enableWiFi (){
         wifi = true;
        System.out.println("WiFi enabled.");
    }

    public void disableWiFi( ){
        wifi = false;
        System.out.println("WiFi disabled.");

    }




}//end of class
