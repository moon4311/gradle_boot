package com.cms.model;

import java.util.Date;

public class MbrSess {
    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRSESS.MBR_ID
     *
     
     */
    private String mbrId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRSESS.MBR_SESS
     *
     
     */
    private String mbrSess;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRSESS.SESS_LOCK
     *
     
     */
    private Long sessLock;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRSESS.SESS_DATE
     *
     
     */
    private Date sessDate;

    /**
     
     * This method corresponds to the database table TB_CMSMBRSESS
     *
     
     */
    public MbrSess(String mbrId, String mbrSess, Long sessLock, Date sessDate) {
        this.mbrId = mbrId;
        this.mbrSess = mbrSess;
        this.sessLock = sessLock;
        this.sessDate = sessDate;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRSESS
     *
     
     */
    public MbrSess() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRSESS.MBR_ID
     *
     * @return the value of TB_CMSMBRSESS.MBR_ID
     *
     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRSESS.MBR_ID
     *
     * @param mbrId the value for TB_CMSMBRSESS.MBR_ID
     *
     
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRSESS.MBR_SESS
     *
     * @return the value of TB_CMSMBRSESS.MBR_SESS
     *
     
     */
    public String getMbrSess() {
        return mbrSess;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRSESS.MBR_SESS
     *
     * @param mbrSess the value for TB_CMSMBRSESS.MBR_SESS
     *
     
     */
    public void setMbrSess(String mbrSess) {
        this.mbrSess = mbrSess;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRSESS.SESS_LOCK
     *
     * @return the value of TB_CMSMBRSESS.SESS_LOCK
     *
     
     */
    public Long getSessLock() {
        return sessLock;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRSESS.SESS_LOCK
     *
     * @param sessLock the value for TB_CMSMBRSESS.SESS_LOCK
     *
     
     */
    public void setSessLock(Long sessLock) {
        this.sessLock = sessLock;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRSESS.SESS_DATE
     *
     * @return the value of TB_CMSMBRSESS.SESS_DATE
     *
     
     */
    public Date getSessDate() {
        return sessDate;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRSESS.SESS_DATE
     *
     * @param sessDate the value for TB_CMSMBRSESS.SESS_DATE
     *
     
     */
    public void setSessDate(Date sessDate) {
        this.sessDate = sessDate;
    }
}