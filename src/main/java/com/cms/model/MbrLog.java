package com.cms.model;

import java.util.Date;

public class MbrLog {
    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBRLOG_ID
     *
     
     */
    private String mbrlogId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBR_ID
     *
     
     */
    private String mbrId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBRLOG_CONTENT
     *
     
     */
    private String mbrlogContent;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBRLOG_STATUS
     *
     
     */
    private Short mbrlogStatus;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.CREATED
     *
     
     */
    private Date created;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBR_NM
     *
     
     */
    private String mbrNm;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBR_LOGIN
     *
     
     */
    private String mbrLogin;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBR_IP
     *
     
     */
    private String mbrIp;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.ACT_MBR_LOGIN
     *
     
     */
    private String actMbrLogin;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBRLOG_PATH
     *
     
     */
    private String mbrlogPath;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRLOG.MBRLOG_EXT01
     *
     
     */
    private String mbrlogExt01;

    /**
     
     * This method corresponds to the database table TB_CMSMBRLOG
     *
     
     */
    public MbrLog(String mbrlogId, String mbrId, String mbrlogContent, Short mbrlogStatus, Date created, String mbrNm, String mbrLogin, String mbrIp, String actMbrLogin, String mbrlogPath, String mbrlogExt01) {
        this.mbrlogId = mbrlogId;
        this.mbrId = mbrId;
        this.mbrlogContent = mbrlogContent;
        this.mbrlogStatus = mbrlogStatus;
        this.created = created;
        this.mbrNm = mbrNm;
        this.mbrLogin = mbrLogin;
        this.mbrIp = mbrIp;
        this.actMbrLogin = actMbrLogin;
        this.mbrlogPath = mbrlogPath;
        this.mbrlogExt01 = mbrlogExt01;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRLOG
     *
     
     */
    public MbrLog() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBRLOG_ID
     *
     * @return the value of TB_CMSMBRLOG.MBRLOG_ID
     *
     
     */
    public String getMbrlogId() {
        return mbrlogId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBRLOG_ID
     *
     * @param mbrlogId the value for TB_CMSMBRLOG.MBRLOG_ID
     *
     
     */
    public void setMbrlogId(String mbrlogId) {
        this.mbrlogId = mbrlogId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBR_ID
     *
     * @return the value of TB_CMSMBRLOG.MBR_ID
     *
     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBR_ID
     *
     * @param mbrId the value for TB_CMSMBRLOG.MBR_ID
     *
     
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBRLOG_CONTENT
     *
     * @return the value of TB_CMSMBRLOG.MBRLOG_CONTENT
     *
     
     */
    public String getMbrlogContent() {
        return mbrlogContent;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBRLOG_CONTENT
     *
     * @param mbrlogContent the value for TB_CMSMBRLOG.MBRLOG_CONTENT
     *
     
     */
    public void setMbrlogContent(String mbrlogContent) {
        this.mbrlogContent = mbrlogContent;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBRLOG_STATUS
     *
     * @return the value of TB_CMSMBRLOG.MBRLOG_STATUS
     *
     
     */
    public Short getMbrlogStatus() {
        return mbrlogStatus;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBRLOG_STATUS
     *
     * @param mbrlogStatus the value for TB_CMSMBRLOG.MBRLOG_STATUS
     *
     
     */
    public void setMbrlogStatus(Short mbrlogStatus) {
        this.mbrlogStatus = mbrlogStatus;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.CREATED
     *
     * @return the value of TB_CMSMBRLOG.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.CREATED
     *
     * @param created the value for TB_CMSMBRLOG.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBR_NM
     *
     * @return the value of TB_CMSMBRLOG.MBR_NM
     *
     
     */
    public String getMbrNm() {
        return mbrNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBR_NM
     *
     * @param mbrNm the value for TB_CMSMBRLOG.MBR_NM
     *
     
     */
    public void setMbrNm(String mbrNm) {
        this.mbrNm = mbrNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBR_LOGIN
     *
     * @return the value of TB_CMSMBRLOG.MBR_LOGIN
     *
     
     */
    public String getMbrLogin() {
        return mbrLogin;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBR_LOGIN
     *
     * @param mbrLogin the value for TB_CMSMBRLOG.MBR_LOGIN
     *
     
     */
    public void setMbrLogin(String mbrLogin) {
        this.mbrLogin = mbrLogin;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBR_IP
     *
     * @return the value of TB_CMSMBRLOG.MBR_IP
     *
     
     */
    public String getMbrIp() {
        return mbrIp;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBR_IP
     *
     * @param mbrIp the value for TB_CMSMBRLOG.MBR_IP
     *
     
     */
    public void setMbrIp(String mbrIp) {
        this.mbrIp = mbrIp;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.ACT_MBR_LOGIN
     *
     * @return the value of TB_CMSMBRLOG.ACT_MBR_LOGIN
     *
     
     */
    public String getActMbrLogin() {
        return actMbrLogin;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.ACT_MBR_LOGIN
     *
     * @param actMbrLogin the value for TB_CMSMBRLOG.ACT_MBR_LOGIN
     *
     
     */
    public void setActMbrLogin(String actMbrLogin) {
        this.actMbrLogin = actMbrLogin;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBRLOG_PATH
     *
     * @return the value of TB_CMSMBRLOG.MBRLOG_PATH
     *
     
     */
    public String getMbrlogPath() {
        return mbrlogPath;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBRLOG_PATH
     *
     * @param mbrlogPath the value for TB_CMSMBRLOG.MBRLOG_PATH
     *
     
     */
    public void setMbrlogPath(String mbrlogPath) {
        this.mbrlogPath = mbrlogPath;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRLOG.MBRLOG_EXT01
     *
     * @return the value of TB_CMSMBRLOG.MBRLOG_EXT01
     *
     
     */
    public String getMbrlogExt01() {
        return mbrlogExt01;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRLOG.MBRLOG_EXT01
     *
     * @param mbrlogExt01 the value for TB_CMSMBRLOG.MBRLOG_EXT01
     *
     
     */
    public void setMbrlogExt01(String mbrlogExt01) {
        this.mbrlogExt01 = mbrlogExt01;
    }
}