package com.company;

import java.util.ArrayList;

/**
 * Created by ian on 17/03/2017.
 */
public class Gearbox {
    private ArrayList<Gear> mGears;
    private int mMaxGears;
    private int mCurrentGear = 0;
    private boolean mClutchIsIn;

    public Gearbox(int maxGears) {
        mMaxGears = maxGears;
        mGears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        mGears.add(neutral);

    }

    public void operateClutch(boolean in) {
        mClutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if (number > 0 && number <= mMaxGears) {
            mGears.add(new Gear(number, ratio));
        }
    }

    public double wheelSpeed(int revs) {
        if (mClutchIsIn) {
            System.out.println("Cannot move");
            return 0.0;
        } else {
            return revs * mGears.get(mCurrentGear).getRatio();
        }
    }

    public void changeGear(int newGear) {
        if (newGear > 0 && newGear < mGears.size() && mClutchIsIn) {
            mCurrentGear = newGear;
            System.out.println("Gear number " + newGear + " has been selected");
        } else {
            System.out.println("Cannot change gear unless clutch is in");
            mCurrentGear = 0;
        }
    }


    private class Gear {
        private int mGear;
        private double mRatio;

        public Gear(int gear, double ratio) {
            mGear = gear;
            mRatio = ratio;
        }

        public double getRatio() {
            return mRatio;
        }

        public double driveSpeed(int revs) {
            return revs * mRatio;
        }
    }

}
