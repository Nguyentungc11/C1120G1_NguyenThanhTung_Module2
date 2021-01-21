package bai11_stack_queue.bai_tap.bai_4_demerging;

import com.sun.org.apache.bcel.internal.generic.DMUL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TestDeMering {
    public static void main(String[] args) {
        ArrayList<DeMeringStaff> arrayList = new ArrayList<>();
        arrayList.add(new DeMeringStaff(1,"Hoang","12/12/1995","male"));
        arrayList.add(new DeMeringStaff(2,"Thuan","11/04/1998","female"));
        arrayList.add(new DeMeringStaff(3,"Quang","10/02/1993","male"));
        arrayList.add(new DeMeringStaff(4,"Ngoc","1/03/1995","female"));
        arrayList.add(new DeMeringStaff(5,"Sang","2/10/1995","female"));
        arrayList.add(new DeMeringStaff(6,"Van","6/10/1995","male"));
        arrayList.add(new DeMeringStaff(7,"Nghia","2/1/1995","female"));
        arrayList.sort(new CompareByBirthDay());
        for (DeMeringStaff deMeringStaff: arrayList) {
            System.out.println(deMeringStaff);
        }
        Queue<DeMeringStaff> male = new LinkedList<>();
        Queue<DeMeringStaff> female = new LinkedList<>();
        System.out.println("After sort: ");
        for(DeMeringStaff deMeringStaff : arrayList){
            if(deMeringStaff.isGender().equals("female")){
                female.add(deMeringStaff);
            }else {
                male.add(deMeringStaff);
            }
        }
        ArrayList<DeMeringStaff> newListDeMering = new ArrayList<>();
        while(!female.isEmpty()){
            newListDeMering.add(female.poll());
        }
        while(!male.isEmpty()){
            newListDeMering.add(male.poll());
        }
        for (DeMeringStaff staff:newListDeMering) {
            System.out.println(staff);
        }
    }

}
