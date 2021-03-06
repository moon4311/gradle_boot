package com.cms.model;

import java.util.Date;

public class IpConfig {
    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIG.CMS_TYPE
     *
     
     */
    private String cmsType;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIG.PERMISSION_YN
     *
     
     */
    private String permissionYn;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIG.MBR_ID
     *
     
     */
    private String mbrId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIG.CREATED
     *
     
     */
    private Date created;

    /**
     *
     
     * This field corresponds to the database column TB_CMSIPCONFIG.MODIFIED
     *
     
     */
    private Date modified;

    /**
     
     * This method corresponds to the database table TB_CMSIPCONFIG
     *
     
     */
    public IpConfig(String cmsType, String permissionYn, String mbrId, Date created, Date modified) {
        this.cmsType = cmsType;
        this.permissionYn = permissionYn;
        this.mbrId = mbrId;
        this.created = created;
        this.modified = modified;
    }

    /**
     
     * This method corresponds to the database table TB_CMSIPCONFIG
     *
     
     */
    public IpConfig() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIG.CMS_TYPE
     *
     * @return the value of TB_CMSIPCONFIG.CMS_TYPE
     *
     
     */
    public String getCmsType() {
        return cmsType;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIG.CMS_TYPE
     *
     * @param cmsType the value for TB_CMSIPCONFIG.CMS_TYPE
     *
     
     */
    public void setCmsType(String cmsType) {
        this.cmsType = cmsType;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIG.PERMISSION_YN
     *
     * @return the value of TB_CMSIPCONFIG.PERMISSION_YN
     *
     
     */
    public String getPermissionYn() {
        return permissionYn;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIG.PERMISSION_YN
     *
     * @param permissionYn the value for TB_CMSIPCONFIG.PERMISSION_YN
     *
     
     */
    public void setPermissionYn(String permissionYn) {
        this.permissionYn = permissionYn;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIG.MBR_ID
     *
     * @return the value of TB_CMSIPCONFIG.MBR_ID
     *
     
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIG.MBR_ID
     *
     * @param mbrId the value for TB_CMSIPCONFIG.MBR_ID
     *
     
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIG.CREATED
     *
     * @return the value of TB_CMSIPCONFIG.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIG.CREATED
     *
     * @param created the value for TB_CMSIPCONFIG.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     
     * This method returns the value of the database column TB_CMSIPCONFIG.MODIFIED
     *
     * @return the value of TB_CMSIPCONFIG.MODIFIED
     *
     
     */
    public Date getModified() {
        return modified;
    }

    /**
     
     * This method sets the value of the database column TB_CMSIPCONFIG.MODIFIED
     *
     * @param modified the value for TB_CMSIPCONFIG.MODIFIED
     *
     
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }
}