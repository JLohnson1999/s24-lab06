package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    // change the type of records to FroggerID
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *
     * @param firstName   first name of the frogger
     * @param lastName    last name of the frogger
     * @param phoneNumber phone number of the frogger
     * @param zipCode     zip code of the frogger
     * @param state       state of the frogger
     * @param gender      gender of the frogger
     * @return Return false if the record has existed. Else, return true.
     * 
     * @deprecated Use {@link #addRecord(FroggerID)} instead.
     */
    public boolean addRecord(FroggerID froggerID) {
        if (records.contains(froggerID)) {
            return false;
        }
        else{
            records.add(froggerID);
            return true;
        }
    }
}