package edu.bsuir.model;

import javax.persistence.*;

@Entity
@Table(name = "cargos", schema = "logisticcompanyservice")
public class Cargos {
    private int id;
    private String cargoDescription;
    private int cargoWeight;
    private int cargoCount;
    private String cargoDocument;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cargoDescription")
    public String getCargoDescription() {
        return cargoDescription;
    }

    public void setCargoDescription(String cargoDescription) {
        this.cargoDescription = cargoDescription;
    }

    @Basic
    @Column(name = "cargoWeight")
    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Basic
    @Column(name = "cargoCount")
    public int getCargoCount() {
        return cargoCount;
    }

    public void setCargoCount(int cargoCount) {
        this.cargoCount = cargoCount;
    }

    @Basic
    @Column(name = "cargoDocument")
    public String getCargoDocument() {
        return cargoDocument;
    }

    public void setCargoDocument(String cargoDocument) {
        this.cargoDocument = cargoDocument;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cargos that = (Cargos) o;

        if (id != that.id) return false;
        if (cargoWeight != that.cargoWeight) return false;
        if (cargoCount != that.cargoCount) return false;
        if (cargoDescription != null ? !cargoDescription.equals(that.cargoDescription) : that.cargoDescription != null)
            return false;
        if (cargoDocument != null ? !cargoDocument.equals(that.cargoDocument) : that.cargoDocument != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cargoDescription != null ? cargoDescription.hashCode() : 0);
        result = 31 * result + cargoWeight;
        result = 31 * result + cargoCount;
        result = 31 * result + (cargoDocument != null ? cargoDocument.hashCode() : 0);
        return result;
    }
}
