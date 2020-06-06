package jm.cms.model;

import java.util.Date;

public class MbrSess {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CMSMBRSESS.MBR_ID
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    private String mbrId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CMSMBRSESS.MBR_SESS
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    private String mbrSess;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CMSMBRSESS.SESS_LOCK
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    private Long sessLock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TB_CMSMBRSESS.SESS_DATE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    private Date sessDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRSESS
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public MbrSess(String mbrId, String mbrSess, Long sessLock, Date sessDate) {
        this.mbrId = mbrId;
        this.mbrSess = mbrSess;
        this.sessLock = sessLock;
        this.sessDate = sessDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TB_CMSMBRSESS
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public MbrSess() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CMSMBRSESS.MBR_ID
     *
     * @return the value of TB_CMSMBRSESS.MBR_ID
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public String getMbrId() {
        return mbrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CMSMBRSESS.MBR_ID
     *
     * @param mbrId the value for TB_CMSMBRSESS.MBR_ID
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void setMbrId(String mbrId) {
        this.mbrId = mbrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CMSMBRSESS.MBR_SESS
     *
     * @return the value of TB_CMSMBRSESS.MBR_SESS
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public String getMbrSess() {
        return mbrSess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CMSMBRSESS.MBR_SESS
     *
     * @param mbrSess the value for TB_CMSMBRSESS.MBR_SESS
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void setMbrSess(String mbrSess) {
        this.mbrSess = mbrSess;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CMSMBRSESS.SESS_LOCK
     *
     * @return the value of TB_CMSMBRSESS.SESS_LOCK
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public Long getSessLock() {
        return sessLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CMSMBRSESS.SESS_LOCK
     *
     * @param sessLock the value for TB_CMSMBRSESS.SESS_LOCK
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void setSessLock(Long sessLock) {
        this.sessLock = sessLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TB_CMSMBRSESS.SESS_DATE
     *
     * @return the value of TB_CMSMBRSESS.SESS_DATE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public Date getSessDate() {
        return sessDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TB_CMSMBRSESS.SESS_DATE
     *
     * @param sessDate the value for TB_CMSMBRSESS.SESS_DATE
     *
     * @mbg.generated Sat Jun 06 11:44:28 KST 2020
     */
    public void setSessDate(Date sessDate) {
        this.sessDate = sessDate;
    }
}