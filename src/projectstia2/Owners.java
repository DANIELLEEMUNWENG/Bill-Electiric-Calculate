/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectstia2;

/**
 *
 * @author USER
 */
public class Owners {
    
    private int accNum;
    private String billDate;
    private String name;
    private String address;
    private double arrears;
    private double preMeter;
    private double curMeter;
    private double totalUnit;
    private double curCharge;
    private double totalBill;

    public Owners(int accNum, String billDate, String name, String address, double arrears, double preMeter, double curMeter, double totalUnit, double curCharge, double totalBill) {
        this.accNum = accNum;
        this.billDate = billDate;
        this.name = name;
        this.address = address;
        this.arrears = arrears;
        this.preMeter = preMeter;
        this.curMeter = curMeter;
        this.totalUnit = totalUnit;
        this.curCharge = curCharge;
        this.totalBill = totalBill;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getBillDate() {
        return billDate;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getArrears() {
        return arrears;
    }

    public double getPreMeter() {
        return preMeter;
    }

    public double getCurMeter() {
        return curMeter;
    }

    public double getTotalUnit() {
        return totalUnit;
    }

    public double getCurCharge() {
        return curCharge;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setArrears(double arrears) {
        this.arrears = arrears;
    }

    public void setPreMeter(double preMeter) {
        this.preMeter = preMeter;
    }

    public void setCurMeter(double curMeter) {
        this.curMeter = curMeter;
    }

    public void setTotalUnit(double totalUnit) {
        this.totalUnit = totalUnit;
    }

    public void setCurCharge(double curCharge) {
        this.curCharge = curCharge;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
