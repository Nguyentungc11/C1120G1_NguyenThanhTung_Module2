package case_study.models;

public class Booking {
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idCustomer, String idService) {
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String showInfo() {
        return "Booking{" +
                "idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    public String getInfo() {
        return idCustomer + "," + idService;
    }
}

