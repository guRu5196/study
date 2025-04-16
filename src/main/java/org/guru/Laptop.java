package org.guru;

import jakarta.persistence.*;

@Entity
@Table(name="Laptop_table")
public class Laptop {
    @Id
    @Column(name = "Laptop_id")
    private int lap_id;
    @Column(name = "Brand_name")
    private String brand_name;
    @Column(name = "Model Name")
    private String model;
    @Column(name = "Ram")
    private int ram;

    public int getLap_id() {
        return lap_id;
    }

    public void setLap_id(int lap_id) {
        this.lap_id = lap_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lap_id=" + lap_id +
                ", brand_name='" + brand_name + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }
}
