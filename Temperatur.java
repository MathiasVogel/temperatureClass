public class Temperatur
{
    //Fields
    private float tempInCelsius;

    //Constructor with 1 parameter (overloaded)
    public Temperatur(float tempInCelsius)
    {
        this.tempInCelsius = tempInCelsius;
    }
    
    //Constructor with 0 parameter (overloaded)
    public Temperatur()
    {
        this.tempInCelsius = 20.0f;
    }
    
    //Getter
    public float getTempInCelsius() {
        return this.tempInCelsius;
    }
    
    //Setter
    public void setTempInCelsius(float tempInCelsius) {
        this.tempInCelsius = tempInCelsius;
    }
    
    //Methods
    public float changeTemp(float valueForChange) {
        this.tempInCelsius += valueForChange;
        return this.tempInCelsius;
    }
    public float convertTempInKelvin() {
        return this.tempInCelsius + 273.15f;
    }
    public float convertTempInFahrenheit() {
        return this.tempInCelsius * 1.8f + 32.0f;
    }
    private String aggregateChecker(int solid, int gaseous){
        if(this.tempInCelsius > gaseous){
            return "Gasförmig";
        } else if (this.tempInCelsius < solid) {
            return "Fest";
        } return "Flüssig";
    }
    public String getAggregateState(String element) {
        return switch (element) {
            case "N" -> {
                yield aggregateChecker(-210, -196);
            }
            case "Hg" -> {
                yield aggregateChecker(-39, 357);
            }
            case "Pb" -> {
                yield aggregateChecker(327, 1740);
            }
            default -> "Nur die Werte N, Hg, Pb werden unterstützt";
        };
    }
    public String getAggregateStateByClass(Element element) {
        return aggregateChecker(element.getSolidFromInCelsius(), element.getGaseiusFromInCelsius());
    }
}
