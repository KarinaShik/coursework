package com.interiorClock.website.entities;

import javax.persistence.*;

@Entity
@Table(name = "clock")
public class ClockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clockId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "img_ref", nullable = false)
    private String imgRef;

    public ClockEntity() {
    }

    public ClockEntity(String title, String description, Double price, String imgRef) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.imgRef = imgRef;
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

    public String getImgRef() {
        return imgRef;
    }

    public void setImgRef(String imgRef) {
        this.imgRef = imgRef;
    }

    //    @Override
//    public String toString() {
//        return "Clock [clockId=" + clockId + ", title=" + title + ", description=" + desccription +
//                ", price=" + price + ", imgRef=" + imgRef + "]";
//    }
}
