public abstract class FiguraGeometrica
{

    //Atributos

    protected double volumen;

    
    //metodo contructor
    public FiguraGeometrica()
    {
         
    }
    

    //Método abstracto

    public abstract double calcularVolumen();

    public double getVolumen()
    {
        return volumen;
    }
}