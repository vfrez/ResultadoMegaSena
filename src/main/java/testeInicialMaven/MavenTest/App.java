package testeInicialMaven.MavenTest;

import testeInicialMaven.MavenTest.servicos.ResultadoMegasena;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        String[] resultado = ResultadoMegasena.obtemUltimoResultado();
        for (String dezena: resultado) {
            System.out.print(dezena + " ");
        }

        //System.out.println( "Hello World!" );
    }
}
