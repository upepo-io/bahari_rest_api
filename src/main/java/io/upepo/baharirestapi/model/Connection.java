package io.upepo.baharirestapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

@Entity
@Table(name="connections")
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name="customer_id")
    private Customer customer;

    @Column(name="tenure")
    @NotBlank(message = "Tenure must be entered")
    private String tenure;

    @Column(name="classification")
    @NotBlank(message = "Classification must be entered")
    private String classification;

    @Column(name="plot_number")
    @NotBlank(message="Plot number must be entered")
    private String plotNumber;

    @Column(name="county")
    private String county;

    @Column(name="sub_county")
    private String subCounty;

    @Column(name="location")
    private String location;

    @Column(name="sub_location")
    private String subLocation;

    @Column(name="town")
    private String town;

    @ManyToOne()
    @JoinColumn(name="zone_id")
    private Zone zone;

    @Column(name="latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTenure() {
        return tenure;
    }

    public void setTenure(String tenure) {
        this.tenure = tenure;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getPlotNumber() {
        return plotNumber;
    }

    public void setPlotNumber(String plotNumber) {
        this.plotNumber = plotNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getSubcounty() {
        return subCounty;
    }

    public void setSubcounty(String subcounty) {
        this.subCounty = subcounty;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubLocation() {
        return subLocation;
    }

    public void setSubLocation(String subLocation) {
        this.subLocation = subLocation;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
