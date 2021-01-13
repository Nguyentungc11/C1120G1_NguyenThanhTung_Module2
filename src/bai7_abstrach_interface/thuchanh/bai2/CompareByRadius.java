package bai7_abstrach_interface.thuchanh.bai2;

import java.util.Comparator;

public class CompareByRadius implements Comparator<CircleExtend> {
    @Override
    public int compare(CircleExtend o1, CircleExtend o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
