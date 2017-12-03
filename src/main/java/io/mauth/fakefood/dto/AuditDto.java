package io.mauth.fakefood.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.mauth.fakefood.enums.FoodType;
import io.mauth.fakefood.enums.PurchasePlaceEnum;
import io.mauth.fakefood.enums.RequestStatus;
import io.mauth.fakefood.model.Audit;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by rahulb on 4/11/17.
 */
public class AuditDto implements Serializable{


    private Long id; // It will be stored in the local db, just tells the request made by the user
    private Long dbId;  // In the server DB
    private String androidId;
    private RequestStatus status;
    private String name;
    private Long companyId;
    private String company;
    private String size;
    private String flavour;
    private PurchasePlaceEnum purchasePlaceEnum;
    private String placeOfPurchase;
    private String lotNumber;
    private FoodType foodType;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expirationDate;
    private String barCode;
    private String frontCanisterImageName;
    private String backCanisterImageName;
    private String logoImageName;

    public AuditDto() {
    }

    public Long getId() {
        return id;
    }

    public AuditDto setId(Long id) {
        this.id = id;
        return this;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String getAndroidId() {
        return androidId;
    }

    public AuditDto setAndroidId(String androidId) {
        this.androidId = androidId;
        return this;
    }

    public Long getDbId() {
        return dbId;
    }

    public AuditDto setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public AuditDto setStatus(RequestStatus status) {
        this.status = status;
        return this;
    }

    public String getName() {
        return name;
    }

    public AuditDto setName(String name) {
        this.name = name;
        return this;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public AuditDto setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSize() {
        return size;
    }

    public AuditDto setSize(String size) {
        this.size = size;
        return this;
    }

    public String getFlavour() {
        return flavour;
    }

    public AuditDto setFlavour(String flavour) {
        this.flavour = flavour;
        return this;
    }

    public PurchasePlaceEnum getPurchasePlaceEnum() {
        return purchasePlaceEnum;
    }

    public AuditDto setPurchasePlaceEnum(PurchasePlaceEnum purchasePlaceEnum) {
        this.purchasePlaceEnum = purchasePlaceEnum;
        return this;
    }

    public String getPlaceOfPurchase() {
        return placeOfPurchase;
    }

    public AuditDto setPlaceOfPurchase(String placeOfPurchase) {
        this.placeOfPurchase = placeOfPurchase;
        return this;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public AuditDto setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
        return this;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public AuditDto setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    public String getBarCode() {
        return barCode;
    }

    public AuditDto setBarCode(String barCode) {
        this.barCode = barCode;
        return this;
    }

    public String getFrontCanisterImageName() {
        return frontCanisterImageName;
    }

    public AuditDto setFrontCanisterImageName(String frontCanisterImageName) {
        this.frontCanisterImageName = frontCanisterImageName;
        return this;
    }

    public String getBackCanisterImageName() {
        return backCanisterImageName;
    }

    public AuditDto setBackCanisterImageName(String backCanisterImageName) {
        this.backCanisterImageName = backCanisterImageName;
        return this;
    }

    public String getLogoImageName() {
        return logoImageName;
    }

    public AuditDto setLogoImageName(String logoImageName) {
        this.logoImageName = logoImageName;
        return this;
    }

    public Audit toAudit(){
        return new Audit(this.androidId,
                this.status,
                this.name,
                this.companyId,
                this.size,
                this.flavour,
                this.purchasePlaceEnum,
                this.placeOfPurchase,
                this.lotNumber,
                this.expirationDate,
                this.barCode,
                this.frontCanisterImageName,
                this.backCanisterImageName,
                this.logoImageName);
    }
}
