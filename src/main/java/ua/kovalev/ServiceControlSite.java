package ua.kovalev;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class ServiceControlSite {
    static boolean checkAccess(String spec){
        try {
            URL url = new URL(spec);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if (httpURLConnection.getResponseCode() != 200) {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    static void checkAccess(List<String> specs, List<String> accessableSites, List<String> notAccessableSites){
        for (String spec : specs) {
            if(checkAccess(spec)){
                accessableSites.add(spec);
            }else{
                notAccessableSites.add(spec);
            }
        }
    }
}
