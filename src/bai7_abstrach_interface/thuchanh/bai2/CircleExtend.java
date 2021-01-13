package bai7_abstrach_interface.thuchanh.bai2;

import bai6_ke_thua.bai_tap.Circle;

class CircleExtend extends Circle implements Comparable<CircleExtend> {

    public CircleExtend() {
    }

    public CircleExtend(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(CircleExtend o) {
        return this.getColor().compareTo(o.getColor()) ;
    }

//    @Override
//    public int compareTo(ComparableCircle o) {
//        if (this.getRadius() > o.getRadius()) return 1;
//        else if (getRadius() < o.getRadius()) return -1;
//        else return 1;
//    }

}