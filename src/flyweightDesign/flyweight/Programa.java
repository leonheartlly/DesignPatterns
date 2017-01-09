package flyweight;

import java.util.Arrays;
import java.util.List;

/**
 * Flyweight is used when you need to create many instances of the same object
 * it will call the same instance of the object created already.
 * In this case it will generate a music software as example.
 * 
 * @author lucas.silva
 *
 */
public class Programa {

    public static void main(String[] args) {

        NotasMusicais notas = new NotasMusicais();

        List<Nota> musica = Arrays.asList(notas.pega("re"),
                                          notas.pega("re"),
                                          notas.pega("mi"),
                                          notas.pega("re"),
                                          notas.pega("sol"),
                                          notas.pega("fa"),
                                          notas.pega("re"),
                                          notas.pega("re"),
                                          notas.pega("mi"),
                                          notas.pega("re"),
                                          notas.pega("la"),
                                          notas.pega("sol"),
                                          notas.pega("re"),
                                          notas.pega("re"),
                                          notas.pega("re"),
                                          notas.pega("re"),
                                          notas.pega("si"),
                                          notas.pega("sol"),
                                          notas.pega("fa"),
                                          notas.pega("mi"),
                                          notas.pega("do"),
                                          notas.pega("do"),
                                          notas.pega("si"),
                                          notas.pega("sol"),
                                          notas.pega("la"),
                                          notas.pega("sol"),
                                          notas.pega("sol"));

        // notice that the same instance of each object are used everytime
        System.out.println(musica);

        Piano piano = new Piano();
        piano.toca(musica);
    }
}
