package com.cms.model;

import java.util.Date;

public class Mbr {
    /**
     * This field corresponds to the database column TB_CMSMBR.MBR_ID
     */
    private String mbrId;

    /**
     * This field corresponds to the database column TB_CMSMBR.MBR_LOGIN
     */
    private String mbrLogin;

    /**
     * This field corresponds to the database column TB_CMSMBR.MBR_NM
     */
    private String mbrNm;

    /**
     * This field corresponds to the database column TB_CMSMBR.PASSWD
     */
    private String passwd;

    /**
     * This field corresponds to the database column TB_CMSMBR.TYPE_ID
     */
    private String typeId;

    /**
     * This field corresponds to the database column TB_CMSMBR.POS_NM
     */
    private String posNm;

    /**
     * This field corresponds to the database column TB_CMSMBR.ORG_NM
     */
    private String orgNm;

    /**
     * This field corresponds to the database column TB_CMSMBR.EMAIL
     */
    private String email;

    /**
     * This field corresponds to the database column TB_CMSMBR.TEL
     */
    private String tel;

    /**
     * This field corresponds to the database column TB_CMSMBR.CREATED
     */
    private Date created;

    /**
     * This field corresponds to the database column TB_CMSMBR.MODIFIED
     */
    private Date modified;

    /**
     * This field corresponds to the database column TB_CMSMBR.ISDEL
     */
    private Short isdel;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBR.PW_MISCNT
     *
     
     */
    private Short pwMiscnt;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBR.EX01
     *
     
     */
    private String ex01;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBR.EX02
     *
     
     */
    private String ex02;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBR.EX03
     *
     
     */
    private String ex03;

    /**
     
     * This method corresponds to the database table TB_CMSMBR
     *
     
     */
    public Mbr(String mbrId, String mbrLogin, String mbrNm, String passwd, String typeId, String posNm, String orgNm, String email, String tel, Date created, Date modified, Short isdel, Short pwMiscnt, String ex01, String ex02, String ex03) {
        this.mbrId = mbrId;
        this.mbrLogin = mbrLogin;
        this.mbrNm = mbrNm;
        this.passwd = passwd;
        this.typeId = typeId;
        this.posNm = posNm;
        this.orgNm = orgNm;
        this.email = email;
        this.tel = tel;
        this.created = created;
        this.modified = modified;
        this.isdel = isdel;
        this.pwMiscnt = pwMiscnt;
        this.ex01 = ex01;
        this.ex02 = ex02;
        this.ex03 = ex03;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBR
     *
     
     */
    public Mbr() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.MBR_ID
     *
     * @return the value of TB_CMSMBR.MBR_ID
     *
     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.MBR_ID
     *
     * @param mbrId the value for TB_CMSMBR.MBR_ID
     *
     
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.MBR_LOGIN
     *
     * @return the value of TB_CMSMBR.MBR_LOGIN
     *
     
     */
    public String getMbrLogin() {
        return mbrLogin;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.MBR_LOGIN
     *
     * @param mbrLogin the value for TB_CMSMBR.MBR_LOGIN
     *
     
     */
    public void setMbrLogin(String mbrLogin) {
        this.mbrLogin = mbrLogin;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.MBR_NM
     *
     * @return the value of TB_CMSMBR.MBR_NM
     *
     
     */
    public String getMbrNm() {
        return mbrNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.MBR_NM
     *
     * @param mbrNm the value for TB_CMSMBR.MBR_NM
     *
     
     */
    public void setMbrNm(String mbrNm) {
        this.mbrNm = mbrNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.PASSWD
     *
     * @return the value of TB_CMSMBR.PASSWD
     *
     
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.PASSWD
     *
     * @param passwd the value for TB_CMSMBR.PASSWD
     *
     
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.TYPE_ID
     *
     * @return the value of TB_CMSMBR.TYPE_ID
     *
     
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.TYPE_ID
     *
     * @param typeId the value for TB_CMSMBR.TYPE_ID
     *
     
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.POS_NM
     *
     * @return the value of TB_CMSMBR.POS_NM
     *
     
     */
    public String getPosNm() {
        return posNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.POS_NM
     *
     * @param posNm the value for TB_CMSMBR.POS_NM
     *
     
     */
    public void setPosNm(String posNm) {
        this.posNm = posNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.ORG_NM
     *
     * @return the value of TB_CMSMBR.ORG_NM
     *
     
     */
    public String getOrgNm() {
        return orgNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.ORG_NM
     *
     * @param orgNm the value for TB_CMSMBR.ORG_NM
     *
     
     */
    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.EMAIL
     *
     * @return the value of TB_CMSMBR.EMAIL
     *
     
     */
    public String getEmail() {
        return email;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.EMAIL
     *
     * @param email the value for TB_CMSMBR.EMAIL
     *
     
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.TEL
     *
     * @return the value of TB_CMSMBR.TEL
     *
     
     */
    public String getTel() {
        return tel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.TEL
     *
     * @param tel the value for TB_CMSMBR.TEL
     *
     
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.CREATED
     *
     * @return the value of TB_CMSMBR.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.CREATED
     *
     * @param created the value for TB_CMSMBR.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.MODIFIED
     *
     * @return the value of TB_CMSMBR.MODIFIED
     *
     
     */
    public Date getModified() {
        return modified;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.MODIFIED
     *
     * @param modified the value for TB_CMSMBR.MODIFIED
     *
     
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.ISDEL
     *
     * @return the value of TB_CMSMBR.ISDEL
     *
     
     */
    public Short getIsdel() {
        return isdel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.ISDEL
     *
     * @param isdel the value for TB_CMSMBR.ISDEL
     *
     
     */
    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.PW_MISCNT
     *
     * @return the value of TB_CMSMBR.PW_MISCNT
     *
     
     */
    public Short getPwMiscnt() {
        return pwMiscnt;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.PW_MISCNT
     *
     * @param pwMiscnt the value for TB_CMSMBR.PW_MISCNT
     *
     
     */
    public void setPwMiscnt(Short pwMiscnt) {
        this.pwMiscnt = pwMiscnt;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.EX01
     *
     * @return the value of TB_CMSMBR.EX01
     *
     
     */
    public String getEx01() {
        return ex01;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.EX01
     *
     * @param ex01 the value for TB_CMSMBR.EX01
     *
     
     */
    public void setEx01(String ex01) {
        this.ex01 = ex01;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.EX02
     *
     * @return the value of TB_CMSMBR.EX02
     *
     
     */
    public String getEx02() {
        return ex02;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.EX02
     *
     * @param ex02 the value for TB_CMSMBR.EX02
     *
     
     */
    public void setEx02(String ex02) {
        this.ex02 = ex02;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBR.EX03
     *
     * @return the value of TB_CMSMBR.EX03
     *
     
     */
    public String getEx03() {
        return ex03;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBR.EX03
     *
     * @param ex03 the value for TB_CMSMBR.EX03
     *
     
     */
    public void setEx03(String ex03) {
        this.ex03 = ex03;
    }
}