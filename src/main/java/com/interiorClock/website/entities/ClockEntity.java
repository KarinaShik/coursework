package com.interiorClock.website.entities;

import javax.persistence.*;

@Entity
@Table(name = "clocks")
public class ClockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clockId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "movement", nullable = false)
    private String movement;

    @Column(name = "material", nullable = false)
    private String material;

    @Column(name = "dimensions", nullable = false)
    private String dimensions;

    @Column(name = "weight", nullable = false)
    private Double weight;

    @Column(name = "img_ref", nullable = false)
    private String imgRef;

    @Column(name = "other_info", nullable = true)
    private String otherInfo;

    public ClockEntity() {
    }

    public ClockEntity(String title, String category, String description, Double price,
                       String movement, String material, String dimensions, Double weight,
                       String imgRef, String otherInfo) {
        this.title = title;
        this.category = category;
        this.description = description;
        this.price = price;
        this.movement = movement;
        this.material = material;
        this.dimensions = dimensions;
        this.weight = weight;
        this.imgRef = imgRef;
        this.otherInfo = otherInfo;
    }

    public Integer getClockId() {
        return clockId;
    }
    public void setClockId(Integer clockId) {
        this.clockId = clockId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMovement() {
        return movement;
    }
    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getImgRef() {
        return imgRef;
    }
    public void setImgRef(String imgRef) {
        this.imgRef = imgRef;
    }

    public String getOtherInfo() {
        return otherInfo;
    }
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }

    //    @Override
//    public String toString() {
//        return "Clock [clockId=" + clockId + ", title=" + title + ", description=" + description +
//                ", price=" + price + ", imgRef=" + imgRef + "]";
//    }
}
