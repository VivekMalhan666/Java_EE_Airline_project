/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Raghda
 */
public class Booking {
    
    private int bid;
    private int fid;
    private int cid;
    private int NoOfPeople;
    private int totalPrice;
    private boolean transaction;

    public Booking() {
        this.bid = 0;
        this.fid = 0;
        this.cid = 0;
        this.NoOfPeople = 0;
        this.totalPrice = 0;
        this.transaction = false;
    }

    
    
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getNoOfPeople() {
        return NoOfPeople;
    }

    public void setNoOfPeople(int NoOfPeople) {
        this.NoOfPeople = NoOfPeople;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isTransaction() {
        return transaction;
    }

    public void setTransaction(boolean transaction) {
        this.transaction = transaction;
    }
    
    
}
