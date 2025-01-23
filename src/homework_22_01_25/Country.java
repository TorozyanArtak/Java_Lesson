package homework_22_01_25;

public class Country {
    private String name;
    private String hymn;
    private String blazon;
    private String flag;
    private int population;
    private int area;

    public Country(String name, String hymn, String blazon, String flag, int population, int area) {
        this.name = name;
        this.hymn = hymn;
        this.blazon = blazon;
        this.flag = flag;
        this.population = population;
        this.area = area;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + hymn + ", " + blazon + ", " + flag + ", " + population + ", " + area + "}";
    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Country country)) {
            return false;
        }
        return this.hymn.equals(country.hymn) && this.blazon.equals(country.blazon) && this.flag.equals(country.flag);
    }
}
