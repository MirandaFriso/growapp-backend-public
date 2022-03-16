package com.miranda.growappbackendpublic.model;

import javax.persistence.*;

@Entity
@Table(name = "plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "plant_name")
    private String name;
    private int so;
    private int harvest;

    public Plant() {
    }

    public Plant(long id, String name, int so, int harvest) {
        this.id = id;
        this.name = name;
        this.so = so;
        this.harvest = harvest;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

/*    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", so=" + so +
                ", harvest=" + harvest +
                '}';
    }*/
}
