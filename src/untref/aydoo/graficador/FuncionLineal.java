package untref.aydoo.graficador;

public class FuncionLineal {

    float b;

    public FuncionLineal(float a, float b) {

        this.b = b;

    }

    public float evaluarEn(float x) {

        float resultado;

        if (x == 0) {
          resultado = this.b;
        } else {
          resultado = 11.0f;
        }

        return resultado;

    }

}
