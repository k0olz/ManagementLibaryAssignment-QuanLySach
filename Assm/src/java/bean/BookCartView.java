/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Administrator
 */
public class BookCartView {
    private String id ;
    private String name ;
    private String author ;
    private float price ;
    private int total;
    private float totalPaid;
    public BookCartView(){
    
    }
    public BookCartView(String id, String name, String author, float price, int total, float totalPaid) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.total = total;
        this.totalPaid = totalPaid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(float totalPaid) {
        this.totalPaid = totalPaid;
    }
}
