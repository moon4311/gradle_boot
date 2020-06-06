package com.cms.model;

import java.util.Date;

public class MbrType {
    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRTYPE.TYPE_ID
     *
     
     */
    private String typeId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRTYPE.TYPE_NM
     *
     
     */
    private String typeNm;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRTYPE.TYPE_LV
     *
     
     */
    private String typeLv;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRTYPE.CREATED
     *
     
     */
    private Date created;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRTYPE.MODIFIED
     *
     
     */
    private Date modified;

    /**
     *
     
     * This field corresponds to the database column TB_CMSMBRTYPE.ISDEL
     *
     
     */
    private Short isdel;

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public MbrType(String typeId, String typeNm, String typeLv, Date created, Date modified, Short isdel) {
        this.typeId = typeId;
        this.typeNm = typeNm;
        this.typeLv = typeLv;
        this.created = created;
        this.modified = modified;
        this.isdel = isdel;
    }

    /**
     
     * This method corresponds to the database table TB_CMSMBRTYPE
     *
     
     */
    public MbrType() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRTYPE.TYPE_ID
     *
     * @return the value of TB_CMSMBRTYPE.TYPE_ID
     *
     
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRTYPE.TYPE_ID
     *
     * @param typeId the value for TB_CMSMBRTYPE.TYPE_ID
     *
     
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRTYPE.TYPE_NM
     *
     * @return the value of TB_CMSMBRTYPE.TYPE_NM
     *
     
     */
    public String getTypeNm() {
        return typeNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRTYPE.TYPE_NM
     *
     * @param typeNm the value for TB_CMSMBRTYPE.TYPE_NM
     *
     
     */
    public void setTypeNm(String typeNm) {
        this.typeNm = typeNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRTYPE.TYPE_LV
     *
     * @return the value of TB_CMSMBRTYPE.TYPE_LV
     *
     
     */
    public String getTypeLv() {
        return typeLv;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRTYPE.TYPE_LV
     *
     * @param typeLv the value for TB_CMSMBRTYPE.TYPE_LV
     *
     
     */
    public void setTypeLv(String typeLv) {
        this.typeLv = typeLv;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRTYPE.CREATED
     *
     * @return the value of TB_CMSMBRTYPE.CREATED
     *
     
     */
    public Date getCreated() {
        return created;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRTYPE.CREATED
     *
     * @param created the value for TB_CMSMBRTYPE.CREATED
     *
     
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRTYPE.MODIFIED
     *
     * @return the value of TB_CMSMBRTYPE.MODIFIED
     *
     
     */
    public Date getModified() {
        return modified;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRTYPE.MODIFIED
     *
     * @param modified the value for TB_CMSMBRTYPE.MODIFIED
     *
     
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     
     * This method returns the value of the database column TB_CMSMBRTYPE.ISDEL
     *
     * @return the value of TB_CMSMBRTYPE.ISDEL
     *
     
     */
    public Short getIsdel() {
        return isdel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSMBRTYPE.ISDEL
     *
     * @param isdel the value for TB_CMSMBRTYPE.ISDEL
     *
     
     */
    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }
}