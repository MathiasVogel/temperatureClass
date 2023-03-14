public class Element
{
    // Fileds
    private int solidFromInCelsius;
    private int gaseousFromInCelsius;
    
    // Constructors
    public Element(int solidFromInCelsius, int gaseousFromInCelsius) {
        this.solidFromInCelsius = solidFromInCelsius;
        this.gaseousFromInCelsius = gaseousFromInCelsius;
    }
    
    // Getter
    public int getSolidFromInCelsius() {
        return this.solidFromInCelsius;
    }
    public int getGaseiusFromInCelsius() {
        return this.gaseousFromInCelsius;
    }
}
