package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Gearbox toyotaGearbox = new Gearbox(6);

//      Gearbox.Gear firstGear = toyotaGearbox.new Gear(1, 3.0);
        //Gearbox seccondGear = new Gearbox.Gear(5);
        //Gearbox.Gear third = new mcLaren.Gear(3, 17.8);
//       System.out.println(firstGear.driveSpeed(1000));

        toyotaGearbox.addGear(1, 3.0);
        toyotaGearbox.addGear(2, 5.0);
        toyotaGearbox.addGear(3, 10.0);
        toyotaGearbox.addGear(4, 15.0);

        toyotaGearbox.operateClutch(true);
        toyotaGearbox.changeGear(4);
        toyotaGearbox.operateClutch(false);
        System.out.println(toyotaGearbox.wheelSpeed(4000));
        toyotaGearbox.operateClutch(true);
        System.out.println(toyotaGearbox.wheelSpeed(2000));
        toyotaGearbox.operateClutch(false);
        toyotaGearbox.changeGear(1);


    }
}
