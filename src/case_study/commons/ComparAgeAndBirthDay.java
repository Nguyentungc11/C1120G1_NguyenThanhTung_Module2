package case_study.commons;

import case_study.models.Customer;

import java.util.Comparator;

public class ComparAgeAndBirthDay implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        if (o1.getNameCustomer().equals(o2.getNameCustomer())){
            return o1.getDayOfBirth().compareTo(o2.getDayOfBirth());
        }else {
            return o1.getNameCustomer().compareTo(o2.getNameCustomer());
        }
    }
}
