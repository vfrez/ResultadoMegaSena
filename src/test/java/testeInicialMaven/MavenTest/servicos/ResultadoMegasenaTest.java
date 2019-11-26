package testeInicialMaven.MavenTest.servicos;

import junit.framework.TestCase;
import testeInicialMaven.MavenTest.servicos.ResultadoMegasena;

/**
 * Classe de teste unitário para ResultadoMegasena
 */
public class ResultadoMegasenaTest extends TestCase {

    /**
     * Número de dezenas esperadas no resultado da mega-sena.
     */
    private final static int NUMERO_DE_DEZENAS = 6;

    /**
     * Teste do método obtemUltimoResultado()
     */
    public void testObtemUltimoResultado() {
        String[] ultimoResultado = ResultadoMegasena.obtemUltimoResultado();

        assertNotNull(ultimoResultado);
        assertTrue(ultimoResultado.length == NUMERO_DE_DEZENAS);
    }
}