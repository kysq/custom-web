package com.chxd.policeDog.vo;

import java.util.Date;

/**
 * Created by cheng on 2017/8/30.
 */
public class DogImmueVO extends BaseVO {
    private static final long serialVersionUID = -7025306881688939614L;
    private String dogNameLike;
    private Integer dogId;
    private String nestNo;
    private Date immueDate;
    private String immueName;
    private String immueDateStr;
    private String immueDateStart;
    private String immueDateEnd;
    private Integer immueState;
    private Integer immueStateSet;
    private Integer policeId;
    private String policeName;

    private DogBaseInfoVO dogInfo;

    public String getDogNameLike() {
        return dogNameLike;
    }

    public void setDogNameLike(String dogNameLike) {
        this.dogNameLike = dogNameLike;
    }

    public Integer getImmueStateSet() {
        return immueStateSet;
    }

    public void setImmueStateSet(Integer immueStateSet) {
        this.immueStateSet = immueStateSet;
    }

    public DogBaseInfoVO getDogInfo() {
        return dogInfo;
    }

    public void setDogInfo(DogBaseInfoVO dogInfo) {
        this.dogInfo = dogInfo;
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public String getImmueName() {
        return immueName;
    }

    public void setImmueName(String immueName) {
        this.immueName = immueName;
    }

    public Integer getDogId() {
        return dogId;
    }

    public void setDogId(Integer dogId) {
        this.dogId = dogId;
    }

    public String getNestNo() {
        return nestNo;
    }

    public void setNestNo(String nestNo) {
        this.nestNo = nestNo;
    }

    public Date getImmueDate() {
        return immueDate;
    }

    public void setImmueDate(Date immueDate) {
        this.immueDate = immueDate;
    }

    public String getImmueDateStr() {
        return immueDateStr;
    }

    public void setImmueDateStr(String immueDateStr) {
        this.immueDateStr = immueDateStr;
    }

    public Integer getPoliceId() {
        return policeId;
    }

    public void setPoliceId(Integer policeId) {
        this.policeId = policeId;
    }

    public Integer getImmueState() {
        return immueState;
    }

    public void setImmueState(Integer immueState) {
        this.immueState = immueState;
    }

    public String getImmueDateStart() {
        return immueDateStart;
    }

    public void setImmueDateStart(String immueDateStart) {
        this.immueDateStart = immueDateStart;
    }

    public String getImmueDateEnd() {
        return immueDateEnd;
    }

    public void setImmueDateEnd(String immueDateEnd) {
        this.immueDateEnd = immueDateEnd;
    }
}
