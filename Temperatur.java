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
}
