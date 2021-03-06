package com.cms.model;

import java.util.Date;

public class IpConfigInfo {
    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.CMS_TYPE
     *
     
     */
    private String cmsType;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.IP_ADDR
     *
     
     */
    private String ipAddr;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.IP_BAND
     *
     
     */
    private String ipBand;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.IP_DESC
     *
     
     */
    private String ipDesc;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.MBR_ID
     *
     
     */
    private String mbrId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.CREATED
     *
     
     */
    private Date created;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.MODIFIED
     *
     
     */
    private Date modified;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIGINFO.ISDEL
     *
     
     */
    private Short isdel;

    /**
     
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     
     */
    public IpConfigInfo(String cmsType, String ipAddr, String ipBand, String ipDesc, String mbrId, Date created, Date modified, Short isdel) {
        this.cmsType = cmsType;
        this.ipAddr = ipAddr;
        this.ipBand = ipBand;
        this.ipDesc = ipDesc;
        this.mbrId = mbrId;
        this.created = created;
        this.modified = modified;
        this.isdel = isdel;
    }

    /**
     
     * This method corresponds to the database table TB_CMSIPCONFIGINFO
     *
     
     */
    public IpConfigInfo() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.CMS_TYPE
     *
     * @return the value of TB_CMSIPCONFIGINFO.CMS_TYPE
     *
     
     */
    public String getCmsType() {
        return cmsType;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.CMS_TYPE
     *
     * @param cmsType the value for TB_CMSIPCONFIGINFO.CMS_TYPE
     *
     
     */
    public void setCmsType(String cmsType) {
        this.cmsType = cmsType;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.IP_ADDR
     *
     * @return the value of TB_CMSIPCONFIGINFO.IP_ADDR
     *
     
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.IP_ADDR
     *
     * @param ipAddr the value for TB_CMSIPCONFIGINFO.IP_ADDR
     *
     
     */
    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.IP_BAND
     *
     * @return the value of TB_CMSIPCONFIGINFO.IP_BAND
     *
     
     */
    public String getIpBand() {
        return ipBand;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.IP_BAND
     *
     * @param ipBand the value for TB_CMSIPCONFIGINFO.IP_BAND
     *
     
     */
    public void setIpBand(String ipBand) {
        this.ipBand = ipBand;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.IP_DESC
     *
     * @return the value of TB_CMSIPCONFIGINFO.IP_DESC
     *
     
     */
    public String getIpDesc() {
        return ipDesc;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.IP_DESC
     *
     * @param ipDesc the value for TB_CMSIPCONFIGINFO.IP_DESC
     *
     
     */
    public void setIpDesc(String ipDesc) {
        this.ipDesc = ipDesc;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.MBR_ID
     *
     * @return the value of TB_CMSIPCONFIGINFO.MBR_ID
     *
     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.MBR_ID
     *
     * @param mbrId the value for TB_CMSIPCONFIGINFO.MBR_ID
     *
     
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.CREATED
     *
     * @return the value of TB_CMSIPCONFIGINFO.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.CREATED
     *
     * @param created the value for TB_CMSIPCONFIGINFO.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.MODIFIED
     *
     * @return the value of TB_CMSIPCONFIGINFO.MODIFIED
     *
     
     */
    public Date getModified() {
        return modified;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.MODIFIED
     *
     * @param modified the value for TB_CMSIPCONFIGINFO.MODIFIED
     *
     
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIGINFO.ISDEL
     *
     * @return the value of TB_CMSIPCONFIGINFO.ISDEL
     *
     
     */
    public Short getIsdel() {
        return isdel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIGINFO.ISDEL
     *
     * @param isdel the value for TB_CMSIPCONFIGINFO.ISDEL
     *
     
     */
    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }
}