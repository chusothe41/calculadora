public class Test0050
{

    /**
     * Constructor for objects of class Test0050
     */
    public Test0050()
    {

    }

    public int multiplicacion (int numero, int multiplicador)
    {
        int inicial = numero;
        for (int i= 1; i < multiplicador; i++)
        {
            numero = inicial + numero;
        }
        return numero;
    }

    public int division (int numero, int divisor)
    {
        int contador = 0;

        while (numero >= divisor)
        {
            numero = numero - divisor;
            contador++;
        }
        return numero;
    }
    /*
    public int potencia(int base, int exponente)
    {
        int acumulador = 0;
        int solucion = 1;
        for (int i= 0; i < exponente; i++)
        {
            acumulador = multiplicacion (solucion, base);
            solucion = multiplicacion (acumulador, base);
        }
        return acumulador;
    }*/
}
