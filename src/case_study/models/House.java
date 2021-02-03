package case_study.models;

public class House extends Services {
    private String standardRoom;
    private String otherFacilities;
    private int numberOfFloors;

    public House() {
    }

    public House(String id,String nameService, double area, double cost, int amountOfPeople, String typeRent,
                 String standardRoom, String otherFacilities, int numberOfFloors) {
        super(id,nameService, area, cost, amountOfPeople, typeRent);
        this.standardRoom = standardRoom;
        this.otherFacilities = otherFacilities;
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

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfo() {
        System.out.println( "House: " + "id: " + id + ", NameService: " + nameService + ", Area: " + area + ", Cost: " + cost
                + ", AmountOfPeople: " + amountOfPeople + ", TypeRent: " + typeRent + ", StandardRoom " + standardRoom
                + ", OtherFacilities " + otherFacilities + ", NumberOfFloors " + numberOfFloors ) ;
    }
    public String getInfo() {
        return id + "," + nameService + "," + area + "," + cost
                + "," + amountOfPeople + "," + typeRent + "," + standardRoom + "," + otherFacilities + "," + numberOfFloors;
    }
}
