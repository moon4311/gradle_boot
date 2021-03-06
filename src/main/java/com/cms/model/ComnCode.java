package com.cms.model;

import java.util.Date;

public class ComnCode {
    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.COMCD_ID
     *
     
     */
    private String comcdId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.COMCD_CODE
     *
     
     */
    private String comcdCode;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.COMCD_NAME
     *
     
     */
    private String comcdName;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.COMCD_PARENT_CODE
     *
     
     */
    private String comcdParentCode;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.COMCD_ORDER
     *
     
     */
    private Integer comcdOrder;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.COMCD_LEVEL
     *
     
     */
    private Integer comcdLevel;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.ISACTIVE
     *
     
     */
    private Short isactive;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.CREATED
     *
     
     */
    private Date created;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.CREATED_USER_ID
     *
     
     */
    private String createdUserId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.MODIFIED
     *
     
     */
    private Date modified;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.MODIFIED_USER_ID
     *
     
     */
    private String modifiedUserId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSCOMMONCODE.ISDEL
     *
     
     */
    private Short isdel;

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public ComnCode(String comcdId, String comcdCode, String comcdName, String comcdParentCode, Integer comcdOrder, Integer comcdLevel, Short isactive, Date created, String createdUserId, Date modified, String modifiedUserId, Short isdel) {
        this.comcdId = comcdId;
        this.comcdCode = comcdCode;
        this.comcdName = comcdName;
        this.comcdParentCode = comcdParentCode;
        this.comcdOrder = comcdOrder;
        this.comcdLevel = comcdLevel;
        this.isactive = isactive;
        this.created = created;
        this.createdUserId = createdUserId;
        this.modified = modified;
        this.modifiedUserId = modifiedUserId;
        this.isdel = isdel;
    }

    /**
     
     * This method corresponds to the database table TB_CMSCOMMONCODE
     *
     
     */
    public ComnCode() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.COMCD_ID
     *
     * @return the value of TB_CMSCOMMONCODE.COMCD_ID
     *
     
     */
    public String getComcdId() {
        return comcdId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.COMCD_ID
     *
     * @param comcdId the value for TB_CMSCOMMONCODE.COMCD_ID
     *
     
     */
    public void setComcdId(String comcdId) {
        this.comcdId = comcdId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.COMCD_CODE
     *
     * @return the value of TB_CMSCOMMONCODE.COMCD_CODE
     *
     
     */
    public String getComcdCode() {
        return comcdCode;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.COMCD_CODE
     *
     * @param comcdCode the value for TB_CMSCOMMONCODE.COMCD_CODE
     *
     
     */
    public void setComcdCode(String comcdCode) {
        this.comcdCode = comcdCode;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.COMCD_NAME
     *
     * @return the value of TB_CMSCOMMONCODE.COMCD_NAME
     *
     
     */
    public String getComcdName() {
        return comcdName;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.COMCD_NAME
     *
     * @param comcdName the value for TB_CMSCOMMONCODE.COMCD_NAME
     *
     
     */
    public void setComcdName(String comcdName) {
        this.comcdName = comcdName;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.COMCD_PARENT_CODE
     *
     * @return the value of TB_CMSCOMMONCODE.COMCD_PARENT_CODE
     *
     
     */
    public String getComcdParentCode() {
        return comcdParentCode;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.COMCD_PARENT_CODE
     *
     * @param comcdParentCode the value for TB_CMSCOMMONCODE.COMCD_PARENT_CODE
     *
     
     */
    public void setComcdParentCode(String comcdParentCode) {
        this.comcdParentCode = comcdParentCode;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.COMCD_ORDER
     *
     * @return the value of TB_CMSCOMMONCODE.COMCD_ORDER
     *
     
     */
    public Integer getComcdOrder() {
        return comcdOrder;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.COMCD_ORDER
     *
     * @param comcdOrder the value for TB_CMSCOMMONCODE.COMCD_ORDER
     *
     
     */
    public void setComcdOrder(Integer comcdOrder) {
        this.comcdOrder = comcdOrder;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.COMCD_LEVEL
     *
     * @return the value of TB_CMSCOMMONCODE.COMCD_LEVEL
     *
     
     */
    public Integer getComcdLevel() {
        return comcdLevel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.COMCD_LEVEL
     *
     * @param comcdLevel the value for TB_CMSCOMMONCODE.COMCD_LEVEL
     *
     
     */
    public void setComcdLevel(Integer comcdLevel) {
        this.comcdLevel = comcdLevel;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.ISACTIVE
     *
     * @return the value of TB_CMSCOMMONCODE.ISACTIVE
     *
     
     */
    public Short getIsactive() {
        return isactive;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.ISACTIVE
     *
     * @param isactive the value for TB_CMSCOMMONCODE.ISACTIVE
     *
     
     */
    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.CREATED
     *
     * @return the value of TB_CMSCOMMONCODE.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.CREATED
     *
     * @param created the value for TB_CMSCOMMONCODE.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.CREATED_USER_ID
     *
     * @return the value of TB_CMSCOMMONCODE.CREATED_USER_ID
     *
     
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.CREATED_USER_ID
     *
     * @param createdUserId the value for TB_CMSCOMMONCODE.CREATED_USER_ID
     *
     
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.MODIFIED
     *
     * @return the value of TB_CMSCOMMONCODE.MODIFIED
     *
     
     */
    public Date getModified() {
        return modified;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.MODIFIED
     *
     * @param modified the value for TB_CMSCOMMONCODE.MODIFIED
     *
     
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.MODIFIED_USER_ID
     *
     * @return the value of TB_CMSCOMMONCODE.MODIFIED_USER_ID
     *
     
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.MODIFIED_USER_ID
     *
     * @param modifiedUserId the value for TB_CMSCOMMONCODE.MODIFIED_USER_ID
     *
     
     */
    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSCOMMONCODE.ISDEL
     *
     * @return the value of TB_CMSCOMMONCODE.ISDEL
     *
     
     */
    public Short getIsdel() {
        return isdel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSCOMMONCODE.ISDEL
     *
     * @param isdel the value for TB_CMSCOMMONCODE.ISDEL
     *
     
     */
    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }
}