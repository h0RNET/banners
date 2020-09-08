package mironenko.banners.models;

import javax.persistence.*;

@Entity
public class Banner {

    @Id //первичный ключ
    @GeneratedValue(strategy = GenerationType.IDENTITY) //уникальное значение 

    private Integer idBanner;

    private String name, content;
    private int categoryId;
    private double price;
    private boolean deleted;

    public int getId_banner() {
        return idBanner;
    }

    public void setId_banner(int id_banner) {
        this.idBanner = id_banner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getCategory_id() {
        return categoryId;
    }

    public void setCategory_id(int category_id) {
        this.categoryId = category_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Banner() {
    }

    public Banner(String name, String content, int categoryId, double price) {
        this.name = name;
        this.content = content;
        this.categoryId = categoryId;
        this.price = price;
    }
}
