
public class Main {
    public static void main(String[] args) {

        IPhoneSettings iphone =  IPhoneSettings.getInstance();

        iphone.setBrightness(60);
        int iphoneBrightness = iphone.getBrightness();

        System.out.println("The iphone brightness is " + iphoneBrightness);

        iphone.disableWiFi();
        // iphone.enableWiFi();



    } //end of main
}