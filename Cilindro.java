public class Cilindro extends FiguraGeometrica
{
    //Atributos
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura)
    {   this.setRadio(radio);
        this.setAltura(altura);


    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura (double altura) {
        this.altura = altura;
    }


    public void calcularVolumen()
    {
        volumen = (Math.PI*(radio*radio)*altura);
    }
}