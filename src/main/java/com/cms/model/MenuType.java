package com.cms.model;

public class MenuType {
    /**
     *
     
     * This field corresponds to the database column TB_CMSADMENUTYPE.MENU_ID
     *
     
     */
    private String menuId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSADMENUTYPE.TYPE_ID
     *
     
     */
    private String typeId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSADMENUTYPE.ISLIST
     *
     
     */
    private String islist;

    /**
     *
     
     * This field corresponds to the database column TB_CMSADMENUTYPE.ISVIEW
     *
     
     */
    private String isview;

    /**
     *
     
     * This field corresponds to the database column TB_CMSADMENUTYPE.ISWRITE
     *
     
     */
    private String iswrite;

    /**
     *
     
     * This field corresponds to the database column TB_CMSADMENUTYPE.MAPNG_CREAT_ID
     *
     
     */
    private String mapngCreatId;

    /**
     
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     
     */
    public MenuType(String menuId, String typeId, String islist, String isview, String iswrite, String mapngCreatId) {
        this.menuId = menuId;
        this.typeId = typeId;
        this.islist = islist;
        this.isview = isview;
        this.iswrite = iswrite;
        this.mapngCreatId = mapngCreatId;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUTYPE
     *
     
     */
    public MenuType() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUTYPE.MENU_ID
     *
     * @return the value of TB_CMSADMENUTYPE.MENU_ID
     *
     
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUTYPE.MENU_ID
     *
     * @param menuId the value for TB_CMSADMENUTYPE.MENU_ID
     *
     
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUTYPE.TYPE_ID
     *
     * @return the value of TB_CMSADMENUTYPE.TYPE_ID
     *
     
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUTYPE.TYPE_ID
     *
     * @param typeId the value for TB_CMSADMENUTYPE.TYPE_ID
     *
     
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUTYPE.ISLIST
     *
     * @return the value of TB_CMSADMENUTYPE.ISLIST
     *
     
     */
    public String getIslist() {
        return islist;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUTYPE.ISLIST
     *
     * @param islist the value for TB_CMSADMENUTYPE.ISLIST
     *
     
     */
    public void setIslist(String islist) {
        this.islist = islist;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUTYPE.ISVIEW
     *
     * @return the value of TB_CMSADMENUTYPE.ISVIEW
     *
     
     */
    public String getIsview() {
        return isview;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUTYPE.ISVIEW
     *
     * @param isview the value for TB_CMSADMENUTYPE.ISVIEW
     *
     
     */
    public void setIsview(String isview) {
        this.isview = isview;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUTYPE.ISWRITE
     *
     * @return the value of TB_CMSADMENUTYPE.ISWRITE
     *
     
     */
    public String getIswrite() {
        return iswrite;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUTYPE.ISWRITE
     *
     * @param iswrite the value for TB_CMSADMENUTYPE.ISWRITE
     *
     
     */
    public void setIswrite(String iswrite) {
        this.iswrite = iswrite;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUTYPE.MAPNG_CREAT_ID
     *
     * @return the value of TB_CMSADMENUTYPE.MAPNG_CREAT_ID
     *
     
     */
    public String getMapngCreatId() {
        return mapngCreatId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUTYPE.MAPNG_CREAT_ID
     *
     * @param mapngCreatId the value for TB_CMSADMENUTYPE.MAPNG_CREAT_ID
     *
     
     */
    public void setMapngCreatId(String mapngCreatId) {
        this.mapngCreatId = mapngCreatId;
    }
}