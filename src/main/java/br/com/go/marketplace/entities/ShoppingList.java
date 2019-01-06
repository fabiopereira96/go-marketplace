package br.com.go.marketplace.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class ShoppingList implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idList;

    @ManyToOne
    @JoinColumn(nullable = false, name = "idUser")
    private User user;

    @Column(name = "totalAmount", nullable = false)
    private Integer totalAmount;

    @Column(name = "totalPrice")
    private Double totalPrice;

    @Column(name = "expectedPrice")
    private Double expectedPrice;

    @Column(name = "creationDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(name = "purchaseDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;

    @Column(name = "bought")
    private boolean bought;

    public ShoppingList() {}

    public ShoppingList(User user, Integer totalAmount, Double totalPrice, Double expectedPrice, Date creationDate, Date purchaseDate, boolean bought) {
        this.user = user;
        this.totalAmount = totalAmount;
        this.totalPrice = totalPrice;
        this.expectedPrice = expectedPrice;
        this.creationDate = creationDate;
        this.purchaseDate = purchaseDate;
        this.bought = bought;
    }

    public Integer getIdList() {
        return idList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getExpectedPrice() {
        return expectedPrice;
    }

    public void setExpectedPrice(Double expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingList that = (ShoppingList) o;
        return idList.equals(that.idList) &&
                user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idList);
    }
}
