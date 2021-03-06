package case_study.commons;

import java.time.Year;
import java.util.regex.Pattern;

public class Validation {
    private static final String ID_VILLA_REGEX = "^SVVL-[0-9]{4}$";
    private static final String ID_HOUSE_REGEX = "^SVHO-[0-9]{4}$";
    private static final String ID_ROOM_REGEX = "^SVRO-[0-9]{4}$";
    private static final String NAME_REGEX = "^[A-Z][a-z]*$";
    private static final String AREA_REGEX = "^(30\\.\\d*[1-9]|((3[1-9])|([4-9]\\d)|([1-9]\\d{2,}))(\\.\\d+)?)$";
    private static final String PRICE_REGEX = "^[1-9](\\d)*\\.?\\d*$";
    private static final String NUMBER_PEOPLE = "^([1-9])|(1\\d])$";
    private static final String FLOORS_REGEX = "^[1-9]\\d*$";
    private static final String NAME_CUSTOMER_REGEX = "^([A-Z][a-z]*)|([A-Z][a-z]*\\s[A-Z][a-z]*(\\s[A-Z][a-z]*)*)$";
    private static final String EMAIL_REGEX = "^[a-z]*[1-9]*@([a-z]*)+.([a-z]+)*$";
    private static final String GENDER_REGEX = "^Male|Female|Unknows$";
    private static final String ID_CARD_REGEX = "^[1-9]{9}$";
    private static final String BIRTHDAY_REGEX = "^((0[1-9])|([1-2][0-9])|(3[0-1]))/(0([1-9])|(1[0-2]))/((19\\d[1-9])|(19[1-9]\\d)|(2\\d{3}))$";
    public boolean checkBirthDay(String birthday) {
        try {
            if (!Pattern.matches(BIRTHDAY_REGEX, birthday)) {
                throw new Exception("Hãy nhập đúng định dạng: dd/MM/yyyy");
            } else {
                int currentYear = Year.now().getValue();
                int year = Integer.parseInt(birthday.substring(6));
                if (year <= 1900) {
                    throw new Exception("Năm sinh phải lớn hơn 1900");
                } else {
                    if (year + 18 > currentYear) {
                        throw new Exception("Khách hàng phải lớn hơn 18 tuổi.");
                    } else {
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean checkIdCustomer(String idCard) {
        try {
            if (!Pattern.matches(ID_CARD_REGEX,idCard)) {
                throw new Exception("Id có 9 số");
            } else {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean checkGender(String gender){
        return Pattern.matches(GENDER_REGEX,gender);
    }
    public boolean checkNameCustomer(String nameCustomer){
        return Pattern.matches(NAME_CUSTOMER_REGEX,nameCustomer);
    }
    public boolean checkEmail(String email){
        return Pattern.matches(EMAIL_REGEX,email);
    }

    public boolean checkIdVilla(String idVilla) {
        return Pattern.matches(ID_VILLA_REGEX, idVilla);
    }

    public boolean checkIdHouse(String idHouse) {
        return Pattern.matches(ID_HOUSE_REGEX, idHouse);
    }

    public boolean checkIdRoom(String idRoom) {
        return Pattern.matches(ID_ROOM_REGEX, idRoom);
    }

    public boolean checkNameOfService(String nameService) {
        return Pattern.matches(ID_ROOM_REGEX, nameService);
    }

    public boolean checkArea(double area) {
        return Pattern.matches(AREA_REGEX, Double.toString(area));
    }
    public boolean checkPrice(double price){
        return Pattern.matches(PRICE_REGEX,Double.toString(price));
    }
    public boolean checkNumberPeople(int numPeople){
        return Pattern.matches(NUMBER_PEOPLE,Integer.toString(numPeople));
    }
    public boolean checkNumberFloor(int numFloor){
        return Pattern.matches(FLOORS_REGEX,Integer.toString(numFloor));
    }

}
