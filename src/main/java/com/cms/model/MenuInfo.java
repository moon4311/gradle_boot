package com.cms.model;

public class MenuInfo {

	private String menuId;

    private String upperMenuId;

    private Integer menuDepth;

    private Integer menuOdr;

    private String menuIcon;

    private String menuNm;

    private String menuLink;

    private String isactive;

    private String isdel;

    private String cannotdel;

    private String menuDesc;

    private String menuNmIcon;

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public MenuInfo(String menuId, String upperMenuId, Integer menuDepth, Integer menuOdr, String menuIcon, String menuNm, String menuLink, String isactive, String isdel, String cannotdel, String menuDesc, String menuNmIcon) {
        this.menuId = menuId;
        this.upperMenuId = upperMenuId;
        this.menuDepth = menuDepth;
        this.menuOdr = menuOdr;
        this.menuIcon = menuIcon;
        this.menuNm = menuNm;
        this.menuLink = menuLink;
        this.isactive = isactive;
        this.isdel = isdel;
        this.cannotdel = cannotdel;
        this.menuDesc = menuDesc;
        this.menuNmIcon = menuNmIcon;
    }

    /**
     
     * This method corresponds to the database table TB_CMSADMENUINFO
     *
     
     */
    public MenuInfo() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_ID
     *
     * @return the value of TB_CMSADMENUINFO.MENU_ID
     *
     
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_ID
     *
     * @param menuId the value for TB_CMSADMENUINFO.MENU_ID
     *
     
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.UPPER_MENU_ID
     *
     * @return the value of TB_CMSADMENUINFO.UPPER_MENU_ID
     *
     
     */
    public String getUpperMenuId() {
        return upperMenuId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.UPPER_MENU_ID
     *
     * @param upperMenuId the value for TB_CMSADMENUINFO.UPPER_MENU_ID
     *
     
     */
    public void setUpperMenuId(String upperMenuId) {
        this.upperMenuId = upperMenuId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_DEPTH
     *
     * @return the value of TB_CMSADMENUINFO.MENU_DEPTH
     *
     
     */
    public Integer getMenuDepth() {
        return menuDepth;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_DEPTH
     *
     * @param menuDepth the value for TB_CMSADMENUINFO.MENU_DEPTH
     *
     
     */
    public void setMenuDepth(Integer menuDepth) {
        this.menuDepth = menuDepth;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_ODR
     *
     * @return the value of TB_CMSADMENUINFO.MENU_ODR
     *
     
     */
    public Integer getMenuOdr() {
        return menuOdr;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_ODR
     *
     * @param menuOdr the value for TB_CMSADMENUINFO.MENU_ODR
     *
     
     */
    public void setMenuOdr(Integer menuOdr) {
        this.menuOdr = menuOdr;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_ICON
     *
     * @return the value of TB_CMSADMENUINFO.MENU_ICON
     *
     
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_ICON
     *
     * @param menuIcon the value for TB_CMSADMENUINFO.MENU_ICON
     *
     
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_NM
     *
     * @return the value of TB_CMSADMENUINFO.MENU_NM
     *
     
     */
    public String getMenuNm() {
        return menuNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_NM
     *
     * @param menuNm the value for TB_CMSADMENUINFO.MENU_NM
     *
     
     */
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_LINK
     *
     * @return the value of TB_CMSADMENUINFO.MENU_LINK
     *
     
     */
    public String getMenuLink() {
        return menuLink;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_LINK
     *
     * @param menuLink the value for TB_CMSADMENUINFO.MENU_LINK
     *
     
     */
    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.ISACTIVE
     *
     * @return the value of TB_CMSADMENUINFO.ISACTIVE
     *
     
     */
    public String getIsactive() {
        return isactive;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.ISACTIVE
     *
     * @param isactive the value for TB_CMSADMENUINFO.ISACTIVE
     *
     
     */
    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.ISDEL
     *
     * @return the value of TB_CMSADMENUINFO.ISDEL
     *
     
     */
    public String getIsdel() {
        return isdel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.ISDEL
     *
     * @param isdel the value for TB_CMSADMENUINFO.ISDEL
     *
     
     */
    public void setIsdel(String isdel) {
        this.isdel = isdel;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.CANNOTDEL
     *
     * @return the value of TB_CMSADMENUINFO.CANNOTDEL
     *
     
     */
    public String getCannotdel() {
        return cannotdel;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.CANNOTDEL
     *
     * @param cannotdel the value for TB_CMSADMENUINFO.CANNOTDEL
     *
     
     */
    public void setCannotdel(String cannotdel) {
        this.cannotdel = cannotdel;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_DESC
     *
     * @return the value of TB_CMSADMENUINFO.MENU_DESC
     *
     
     */
    public String getMenuDesc() {
        return menuDesc;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_DESC
     *
     * @param menuDesc the value for TB_CMSADMENUINFO.MENU_DESC
     *
     
     */
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    /**
     
     * This method returns the value of the database column TB_CMSADMENUINFO.MENU_NM_ICON
     *
     * @return the value of TB_CMSADMENUINFO.MENU_NM_ICON
     *
     
     */
    public String getMenuNmIcon() {
        return menuNmIcon;
    }

    /**
     
     * This method sets the value of the database column TB_CMSADMENUINFO.MENU_NM_ICON
     *
     * @param menuNmIcon the value for TB_CMSADMENUINFO.MENU_NM_ICON
     *
     
     */
    public void setMenuNmIcon(String menuNmIcon) {
        this.menuNmIcon = menuNmIcon;
    }
}