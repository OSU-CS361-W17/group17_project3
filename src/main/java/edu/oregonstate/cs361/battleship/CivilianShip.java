package edu.oregonstate.cs361.battleship;

/**
 * Created by Garrett on 2/24/2017.
 */
public class CivilianShip {
    public class civilianShip extends Ship {
        civilianShip(String n, int l, Coordinate s, Coordinate e, boolean stealth) {
            super(n,l,s,e,stealth);
        }

        public void checkIfSunk() {
            int shipHits = returnCounter();
            if (counter > 0)
                isSunk(true);
            else
                isSunk(false);
        }
    }
}