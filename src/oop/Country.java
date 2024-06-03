package src.oop;

public class Country {

    private String name;

    public String getName() {
        return name;
    }

    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0){
            return;
        }
            this.area = area;
    }

    private int population;

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population <= 0){
            return;
        }
            this.population = population;
    }

    private String CountryCode;

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        if (countryCode.length() == 3){
            this.CountryCode = countryCode;
        }else{
            System.out.println("nejde to");
        }
    }
}