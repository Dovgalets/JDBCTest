package Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "city", schema = "world", catalog = "")
public class City {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "Name", nullable = false, length = 35)
    private String name;
    @Basic
    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;
    @Basic
    @Column(name = "District", nullable = false, length = 20)
    private String district;
    @Basic
    @Column(name = "Population", nullable = false)
    private int population;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
