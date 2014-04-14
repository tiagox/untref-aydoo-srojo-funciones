package untref.aydoo.graficador.tests;

import org.junit.Assert;
import org.junit.Test;
import untref.aydoo.graficador.FuncionLineal;

public class FuncionLinealTest {

    @Test
    public void evaluarEn0DeberiaDevolverElMismoValorDeB() {

        final float a = 2.0f;
        final float b = 3.0f;

        float x = 0.0f;

        FuncionLineal funcionLineal = new FuncionLineal(a, b);

        Assert.assertEquals(b, funcionLineal.evaluarEn(x), 0.0001);

    }

    @Test
    public void evaluarEn1DeberiaDevolverLaSumaDeAYB() {

        final float a = 2.0f;
        final float b = 3.0f;

        float x = 1.0f;

        float resultado = 5.0f;

        FuncionLineal funcionLineal = new FuncionLineal(a, b);

        Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

    }

    @Test
    public void evaluarEn4DeberiaDevolverLaSumaDelCuadrupleDeAYB() {

        final float a = 2.0f;
        final float b = 3.0f;

        float x = 4.0f;

        float resultado = 11.0f;

        FuncionLineal funcionLineal = new FuncionLineal(a, b);

        Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

    }

    @Test
    public void evaluarEn5DeberiaDevolverLaSumaDelQuintupleDeAYB() {

        final float a = 2.0f;
        final float b = 3.0f;

        float x = 5.0f;

        float resultado = 13.0f;

        FuncionLineal funcionLineal = new FuncionLineal(a, b);

        Assert.assertEquals(resultado, funcionLineal.evaluarEn(x), 0.0001);

    }

}
