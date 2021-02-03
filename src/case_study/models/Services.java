package case_study.models;

public abstract class Services {
    protected String id;
    protected String nameService;
    protected double area;
    protected double cost;
    protected int amountOfPeople;
    protected String typeRent;

    public Services() {
    }

    public Services(String id, String nameService, double area, double cost, int amountOfPeople, String typeRent) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.cost = cost;
        this.amountOfPeople = amountOfPeople;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public String getId () {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }
    public abstract void showInfo();
}
