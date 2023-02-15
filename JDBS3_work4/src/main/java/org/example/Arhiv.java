package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Arhiv {
    @Id
    private int id;
    private int fond;
    private String name_fond;
    private int opys;
    private int sprava;
    private String name_sprava;
    private int year;
    private int count_stor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFond() {
        return fond;
    }

    public void setFond(int fond) {
        this.fond = fond;
    }

    public String getName_fond() {
        return name_fond;
    }

    public void setName_fond(String name_fond) {
        this.name_fond = name_fond;
    }

    public int getOpys() {
        return opys;
    }

    public void setOpys(int opys) {
        this.opys = opys;
    }

    public int getSprava() {
        return sprava;
    }

    public void setSprava(int sprava) {
        this.sprava = sprava;
    }

    public String getName_sprava() {
        return name_sprava;
    }

    public void setName_sprava(String name_sprava) {
        this.name_sprava = name_sprava;
    }

    public int getCount_stor() {
        return count_stor;
    }

    public void setCount_stor(int count_stor) {
        this.count_stor = count_stor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
