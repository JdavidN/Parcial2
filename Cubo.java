public class Cubo extends FiguraGeometrica
{
    //Atributos
    private double lado;

    public Cubo (double lado)

    {    
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    public double calcularVolumen()
    {
        volumen = (lado*lado*lado);
    }
}