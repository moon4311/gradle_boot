package com.cms.model;

import java.math.BigDecimal;
import java.util.Date;

public class VisitLog {
    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.SEQ_NO
     *
     
     */
    private BigDecimal seqNo;

    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.SITE_ID
     *
     
     */
    private String siteId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.PAGE_ID
     *
     
     */
    private String pageId;

    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.PAGE_NM
     *
     
     */
    private String pageNm;

    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.WHEN_DATETIME
     *
     
     */
    private Date whenDatetime;

    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.WHEN_DATE
     *
     
     */
    private String whenDate;

    /**
     *
     
     * This field corresponds to the database column TB_CMSVISITLOG.IPADDR
     *
     
     */
    private String ipaddr;

    /**
     
     * This method corresponds to the database table TB_CMSVISITLOG
     *
     
     */
    public VisitLog(BigDecimal seqNo, String siteId, String pageId, String pageNm, Date whenDatetime, String whenDate, String ipaddr) {
        this.seqNo = seqNo;
        this.siteId = siteId;
        this.pageId = pageId;
        this.pageNm = pageNm;
        this.whenDatetime = whenDatetime;
        this.whenDate = whenDate;
        this.ipaddr = ipaddr;
    }

    /**
     
     * This method corresponds to the database table TB_CMSVISITLOG
     *
     
     */
    public VisitLog() {
        super();
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.SEQ_NO
     *
     * @return the value of TB_CMSVISITLOG.SEQ_NO
     *
     
     */
    public BigDecimal getSeqNo() {
        return seqNo;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.SEQ_NO
     *
     * @param seqNo the value for TB_CMSVISITLOG.SEQ_NO
     *
     
     */
    public void setSeqNo(BigDecimal seqNo) {
        this.seqNo = seqNo;
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.SITE_ID
     *
     * @return the value of TB_CMSVISITLOG.SITE_ID
     *
     
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.SITE_ID
     *
     * @param siteId the value for TB_CMSVISITLOG.SITE_ID
     *
     
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.PAGE_ID
     *
     * @return the value of TB_CMSVISITLOG.PAGE_ID
     *
     
     */
    public String getPageId() {
        return pageId;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.PAGE_ID
     *
     * @param pageId the value for TB_CMSVISITLOG.PAGE_ID
     *
     
     */
    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.PAGE_NM
     *
     * @return the value of TB_CMSVISITLOG.PAGE_NM
     *
     
     */
    public String getPageNm() {
        return pageNm;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.PAGE_NM
     *
     * @param pageNm the value for TB_CMSVISITLOG.PAGE_NM
     *
     
     */
    public void setPageNm(String pageNm) {
        this.pageNm = pageNm;
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.WHEN_DATETIME
     *
     * @return the value of TB_CMSVISITLOG.WHEN_DATETIME
     *
     
     */
    public Date getWhenDatetime() {
        return whenDatetime;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.WHEN_DATETIME
     *
     * @param whenDatetime the value for TB_CMSVISITLOG.WHEN_DATETIME
     *
     
     */
    public void setWhenDatetime(Date whenDatetime) {
        this.whenDatetime = whenDatetime;
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.WHEN_DATE
     *
     * @return the value of TB_CMSVISITLOG.WHEN_DATE
     *
     
     */
    public String getWhenDate() {
        return whenDate;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.WHEN_DATE
     *
     * @param whenDate the value for TB_CMSVISITLOG.WHEN_DATE
     *
     
     */
    public void setWhenDate(String whenDate) {
        this.whenDate = whenDate;
    }

    /**
     
     * This method returns the value of the database column TB_CMSVISITLOG.IPADDR
     *
     * @return the value of TB_CMSVISITLOG.IPADDR
     *
     
     */
    public String getIpaddr() {
        return ipaddr;
    }

    /**
     
     * This method sets the value of the database column TB_CMSVISITLOG.IPADDR
     *
     * @param ipaddr the value for TB_CMSVISITLOG.IPADDR
     *
     
     */
    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }
}