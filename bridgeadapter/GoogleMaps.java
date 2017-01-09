package bridgeadapter;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleMaps implements Mapa {

    @Override
    public String devolveMapa(String rua) {

        String url = "http://maps.google.com.br/maps?q=rua+caju";
        URL url2;
        try {
            url2 = new URL(url);
            InputStream openStream = url2.openStream();
            // faz alguma coisa com openStream

            return "mapa";
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
