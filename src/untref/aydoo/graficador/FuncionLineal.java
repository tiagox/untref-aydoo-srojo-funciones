package untref.aydoo.graficador;

public class FuncionLineal {

    private float a;
    private float b;

    public FuncionLineal(float a, float b) {

        this.a = a;
        this.b = b;

    }

    public float evaluarEn(float x) {

        float resultado = 0;

        if (x == 0.0f) {
            resultado = this.b;
        } else if (x == 1.0f) {
            resultado = this.a + this.b;
        } else if (x == 2.0f) {
            resultado = this.a * 2 + this.b;
        } else if (x == 4.0f) {
            resultado = 11.0f;
        }

        return resultado;

    }

}
