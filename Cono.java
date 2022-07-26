public class Cono extends FiguraGeometrica {

    private double radio;
    private double altura;
    
    public Cono(double radio, double altura)
    {
        this.setRadio(radio);
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

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public void RadioVolumen()
    {
        volumen = ((Math.PI*(radio*radio)*altura)/3);
    }
}
