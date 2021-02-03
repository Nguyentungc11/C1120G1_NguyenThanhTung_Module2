package case_study.models;

public class Villa extends Services {
    private String standardRoom;
    private String otherFacilities;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id,String nameService, double area, double cost,
                 int amountOfPeople, String typeRent, String standardRoom,
                 String otherFacilities, double poolArea, int numberOfFloors) {
        super(id,nameService, area, cost, amountOfPeople, typeRent);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println( "Villa: " + "id: " + id + "NameService: " + nameService + "Area: " + area + "Cost: " + cost
                + "AmountOfPeople: " + amountOfPeople + "TypeRent: " + typeRent + "standardRoom " + standardRoom
                + "otherFacilities " + otherFacilities +
                "poolArea " + poolArea +  "numberOfFloors " + numberOfFloors ) ;
    }

    public String getInfo(){
        return id + "," + nameService + "," + area + "," + cost
                + "," + amountOfPeople + "," + typeRent + "," + standardRoom + "," + otherFacilities +
                "," + poolArea +  "," + numberOfFloors;
    }
}
