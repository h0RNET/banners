package mironenko.banners.models;

import javax.persistence.*;

@Entity
public class Banner {

    @Id //первичный ключ
    @GeneratedValue(strategy = GenerationType.AUTO) //уникальное значение
    private Integer id_banner;

    private String name, content;
    private int category_id;
    private double price;
    private boolean deleted;

    public int getId_banner() {
        return id_banner;
    }

    public void setId_banner(int id_banner) {
        this.id_banner = id_banner;
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
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
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



}
