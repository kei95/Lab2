package Lab2;

public class Province {
    private static int DEFAULT_POPULATION_MILLIONS = 0;
    private static String DEFAULT_PROVINCE = "";
    private static String DEFAULT_CAPITAL = "";

    private String name;
    private String capital;
    private int populationInMillions;

    public Province(String name, String capital, int populationInMillions){
        if (isValidPopulation(populationInMillions) && isValidProvince(name) && isValidCapitalCity(capital)){
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        } else {
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
        }
    }

    public Province(){
        this.name = "British Columbia";
        this.capital = "Victoria";
        this.populationInMillions = 4;
    }



    private boolean isValidProvince(String province){
        final String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba", "British Columbia",
                "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        int i = 0;

        while(i < provinces.length){
            if (province == provinces[i]){
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital){
        final String[] cities = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Victoria", "Winnipeg",
                "Charlottetown", "Regina", "Edmonto,", "St. John's"};
        String str = "";

        for(String elem : cities){
            str = elem + "";
            if(capital == str){
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation(int populationInMillions){
        if(populationInMillions >= 4 && populationInMillions <= 38){
            return true;
        }
        return false;
    }

    // GETTER
    public String getCapital()
    {
        return this.capital;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPopulationinmillions()
    {
        return this.populationInMillions;
    }

    // SETTER

    public void setCapital(String capital)
    {
        this.capital = capital;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPopulationinmillions(int populationInMillions)
    {
        this.populationInMillions = populationInMillions;
    }

    public String getDetails(){
        return "The Capital of " + name + " (pop. " + populationInMillions + " ) is  " + capital;
    }
}
