public class Esfera extends FiguraGeometrica {
    
    private double radio;

    public Esfera(double radio)
    {
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio)
     {
        this.radio = radio;
    }

    public void calcularVolumen()
    {
        volumen = (4/3*(Math.PI*(radio*radio*radio)));
    }
}
