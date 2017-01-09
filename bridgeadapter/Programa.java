package bridgeadapter;

import java.io.IOException;
import java.util.Calendar;

/**
 * Bridge design pattern create a bridge to another system or code.
 * Adapter design pattern adapts a part of a code to comunicate with another
 * one.
 * 
 * @author lucas.silva
 *
 */
public class Programa {

    public static void main(String[] args) throws IOException {

        // design pattern bridge
        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("rua do caju");

        // Design pattern adapter
        Relogio relogio = new RelogioComCalendar();
        Calendar hoje = relogio.hoje();
    }
}
