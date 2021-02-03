package case_study.models;

public class Customer {
    private String nameCustomer;
    private String dayOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private String serviceId;

    public Customer() {
    }

    public Customer(String nameCustomer, String dayOfBirth, String gender,
                    String idCard, String phoneNumber, String email, String typeCustomer, String address, String serviceId) {
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.serviceId = serviceId;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String showInfo() {
        return "Customer{" +
                "nameCustomer ='" + nameCustomer + '\'' +
                ", dayOfBirth ='" + dayOfBirth + '\'' +
                ", gender ='" + gender + '\'' +
                ", idCard ='" + idCard + '\'' +
                ", phoneNumber ='" + phoneNumber + '\'' +
                ", email ='" + email + '\'' +
                ", typeCustomer ='" + typeCustomer + '\'' +
                ", address ='" + address + '\'' +
                ", serviceId = '" + serviceId + '\'' +
                "}\n";
    }
    public String getInfo(){
        return nameCustomer + "," + dayOfBirth + "," + gender + "," + idCard
                + "," + phoneNumber + "," + email + "," + typeCustomer + "," + address +
                "," + serviceId;
    }
}
