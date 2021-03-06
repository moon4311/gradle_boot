package com.cms.model;

import java.util.Date;

public class LoginLog {
    /**
     *
     
     * This field corresponds to the database column TB_LOGINLOG.IP_ID
     *
     
     */
    private String ipId;

    /**
     *
     
     * This field corresponds to the database column TB_LOGINLOG.MBR_ID
     *
     
     */
    private String mbrId;

    /**
     *
     
     * This field corresponds to the database column TB_LOGINLOG.IP_ADDR
     *
     
     */
    private String ipAddr;

    /**
     *
     
     * This field corresponds to the database column TB_LOGINLOG.CREATED
     *
     
     */
    private Date created;

    /**
     
     * This method corresponds to the database table TB_LOGINLOG
     *
     
     */
    public LoginLog(String ipId, String mbrId, String ipAddr, Date created) {
        this.ipId = ipId;
        this.mbrId = mbrId;
        this.ipAddr = ipAddr;
        this.created = created;
    }

    /**
     
     * This method corresponds to the database table TB_LOGINLOG
     *
     
     */
    public LoginLog() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_LOGINLOG.IP_ID
     *
     * @return the value of TB_LOGINLOG.IP_ID
     *
     
     */
    public String getIpId() {
        return ipId;
    }

    /**
     
     * This method sets the value of the database column TB_LOGINLOG.IP_ID
     *
     * @param ipId the value for TB_LOGINLOG.IP_ID
     *
     
     */
    public void setIpId(String ipId) {
        this.ipId = ipId;
    }

    /**
     
     * This method returns the value of the database column TB_LOGINLOG.MBR_ID
     *
     * @return the value of TB_LOGINLOG.MBR_ID
     *
     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     
     * This method sets the value of the database column TB_LOGINLOG.MBR_ID
     *
     * @param mbrId the value for TB_LOGINLOG.MBR_ID
     *
     
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     
     * This method returns the value of the database column TB_LOGINLOG.IP_ADDR
     *
     * @return the value of TB_LOGINLOG.IP_ADDR
     *
     
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     
     * This method sets the value of the database column TB_LOGINLOG.IP_ADDR
     *
     * @param ipAddr the value for TB_LOGINLOG.IP_ADDR
     *
     
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    /**
     
     * This method returns the value of the database column TB_LOGINLOG.CREATED
     *
     * @return the value of TB_LOGINLOG.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_LOGINLOG.CREATED
     *
     * @param created the value for TB_LOGINLOG.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}