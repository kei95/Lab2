package Lab2;

public class Country {

    private String name;
    private Lab2.Province[] provinces;

    public Country() {
        this.name = "Canada";
        this.provinces = new Lab2.Province[]{
                new Lab2.Province("Ontario", "Toronto", 13),
                new Lab2.Province("Quebec", "Quebec City", 8),
                new Lab2.Province("Nova Scotia", "Halifax", 1),
                new Lab2.Province("New Brunswick", "Fredericton", 1),
                new Lab2.Province("Manitoba", "Winnipeg", 1),
                new Lab2.Province("British Columbia", "Victoria", 5),
                new Lab2.Province("Prince Edward Island", "Charlottetown", 0),
                new Lab2.Province("Saskatchewan", "Regina", 1),
                new Lab2.Province("Alberta", "Edmonto,", 4),
                new Lab2.Province("Newfoundland and Labrador", "St. John's", 1),
        };
    }

    public void displayAllProvinces() {
        for (Lab2.Province elem : provinces) {
            elem.getDetails();
        }
    }

    public int howManyHaveThisPopulation(int min, int max) {
        int total = 0;
        for (Lab2.Province nums : provinces) {
            if(min < nums.getPopulationinmillions() && max >= nums.getPopulationinmillions()){
                total += 1;
            }
        }
        return total;
    }

}