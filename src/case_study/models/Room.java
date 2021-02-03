package case_study.models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String id,String nameService, double area, double cost, int amountOfPeople, String typeRent, String freeServices) {
        super(id,nameService, area, cost, amountOfPeople, typeRent);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public void showInfo() {
        System.out.println( "House: " + "id: " + id + ", NameService: " + nameService + ", Area: " + area + ", Cost: " + cost
                + ", AmountOfPeople: " + amountOfPeople + ", TypeRent: " + typeRent + ", Free Services: " + freeServices) ;
    }
    public String getInfo() {
        return id + "," + nameService + "," + area + "," + cost
                + "," + amountOfPeople + "," + typeRent + "," + freeServices;
    }
}
