package bai11_stack_queue.bai_tap.bai_4_demerging;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class CompareByBirthDay implements Comparator<DeMeringStaff> {

    @Override
    public int compare(DeMeringStaff o1, DeMeringStaff o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = simpleDateFormat.parse(o1.getBirthday());
            Date date2 = simpleDateFormat.parse(o2.getBirthday());
            return date1.compareTo(date2);
        } catch (ParseException | java.text.ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
