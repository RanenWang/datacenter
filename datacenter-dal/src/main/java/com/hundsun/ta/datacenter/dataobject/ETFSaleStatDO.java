package com.hundsun.ta.datacenter.dataobject;


import java.math.BigDecimal;
import java.util.Date;

public class ETFSaleStatDO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.D_CDATE
     *
     * @mbggenerated
     */
    private Date dCdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.C_FUNDCODE
     *
     * @mbggenerated
     */
    private String cFundcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.C_AGENCYNO
     *
     * @mbggenerated
     */
    private String cAgencyno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_SHARE
     *
     * @mbggenerated
     */
    private BigDecimal fShare;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_BALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fBalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_ORIBALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fOribalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_MANAGERFEE
     *
     * @mbggenerated
     */
    private BigDecimal fManagerfee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILRATIO
     *
     * @mbggenerated
     */
    private BigDecimal fTailratio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.D_HOLDDATE
     *
     * @mbggenerated
     */
    private Date dHolddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_HOLDRATIO
     *
     * @mbggenerated
     */
    private BigDecimal fHoldratio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_SERVICEFARE
     *
     * @mbggenerated
     */
    private BigDecimal fServicefare;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_INCOME
     *
     * @mbggenerated
     */
    private BigDecimal fIncome;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_REINVESTSHARE
     *
     * @mbggenerated
     */
    private BigDecimal fReinvestshare;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_REINVESTBALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fReinvestbalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_REINVESTORIBALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fReinvestoribalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_OUTERSHARES
     *
     * @mbggenerated
     */
    private BigDecimal fOutershares;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_OUTERBALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fOuterbalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_INNERSHARES
     *
     * @mbggenerated
     */
    private BigDecimal fInnershares;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_INNERBALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fInnerbalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILFARE
     *
     * @mbggenerated
     */
    private BigDecimal fTailfare;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILFARE2
     *
     * @mbggenerated
     */
    private BigDecimal fTailfare2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILRATIO2
     *
     * @mbggenerated
     */
    private BigDecimal fTailratio2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_PROTECTSHARES
     *
     * @mbggenerated
     */
    private BigDecimal fProtectshares;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_PROTECTBALANCE
     *
     * @mbggenerated
     */
    private BigDecimal fProtectbalance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.D_LASTSERVICEFAREDATE
     *
     * @mbggenerated
     */
    private Date dLastservicefaredate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_SERVICERATIO
     *
     * @mbggenerated
     */
    private BigDecimal fServiceratio;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILRATIO3
     *
     * @mbggenerated
     */
    private BigDecimal fTailratio3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILFARE3
     *
     * @mbggenerated
     */
    private BigDecimal fTailfare3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILRATIO4
     *
     * @mbggenerated
     */
    private BigDecimal fTailratio4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TSALESTAT.F_TAILFARE4
     *
     * @mbggenerated
     */
    private BigDecimal fTailfare4;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.D_CDATE
     *
     * @return the value of TSALESTAT.D_CDATE
     *
     * @mbggenerated
     */
    public Date getdCdate() {
        return dCdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.D_CDATE
     *
     * @param dCdate the value for TSALESTAT.D_CDATE
     *
     * @mbggenerated
     */
    public void setdCdate(Date dCdate) {
        this.dCdate = dCdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.C_FUNDCODE
     *
     * @return the value of TSALESTAT.C_FUNDCODE
     *
     * @mbggenerated
     */
    public String getcFundcode() {
        return cFundcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.C_FUNDCODE
     *
     * @param cFundcode the value for TSALESTAT.C_FUNDCODE
     *
     * @mbggenerated
     */
    public void setcFundcode(String cFundcode) {
        this.cFundcode = cFundcode == null ? null : cFundcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.C_AGENCYNO
     *
     * @return the value of TSALESTAT.C_AGENCYNO
     *
     * @mbggenerated
     */
    public String getcAgencyno() {
        return cAgencyno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.C_AGENCYNO
     *
     * @param cAgencyno the value for TSALESTAT.C_AGENCYNO
     *
     * @mbggenerated
     */
    public void setcAgencyno(String cAgencyno) {
        this.cAgencyno = cAgencyno == null ? null : cAgencyno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_SHARE
     *
     * @return the value of TSALESTAT.F_SHARE
     *
     * @mbggenerated
     */
    public BigDecimal getfShare() {
        return fShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_SHARE
     *
     * @param fShare the value for TSALESTAT.F_SHARE
     *
     * @mbggenerated
     */
    public void setfShare(BigDecimal fShare) {
        this.fShare = fShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_BALANCE
     *
     * @return the value of TSALESTAT.F_BALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfBalance() {
        return fBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_BALANCE
     *
     * @param fBalance the value for TSALESTAT.F_BALANCE
     *
     * @mbggenerated
     */
    public void setfBalance(BigDecimal fBalance) {
        this.fBalance = fBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_ORIBALANCE
     *
     * @return the value of TSALESTAT.F_ORIBALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfOribalance() {
        return fOribalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_ORIBALANCE
     *
     * @param fOribalance the value for TSALESTAT.F_ORIBALANCE
     *
     * @mbggenerated
     */
    public void setfOribalance(BigDecimal fOribalance) {
        this.fOribalance = fOribalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_MANAGERFEE
     *
     * @return the value of TSALESTAT.F_MANAGERFEE
     *
     * @mbggenerated
     */
    public BigDecimal getfManagerfee() {
        return fManagerfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_MANAGERFEE
     *
     * @param fManagerfee the value for TSALESTAT.F_MANAGERFEE
     *
     * @mbggenerated
     */
    public void setfManagerfee(BigDecimal fManagerfee) {
        this.fManagerfee = fManagerfee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILRATIO
     *
     * @return the value of TSALESTAT.F_TAILRATIO
     *
     * @mbggenerated
     */
    public BigDecimal getfTailratio() {
        return fTailratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILRATIO
     *
     * @param fTailratio the value for TSALESTAT.F_TAILRATIO
     *
     * @mbggenerated
     */
    public void setfTailratio(BigDecimal fTailratio) {
        this.fTailratio = fTailratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.D_HOLDDATE
     *
     * @return the value of TSALESTAT.D_HOLDDATE
     *
     * @mbggenerated
     */
    public Date getdHolddate() {
        return dHolddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.D_HOLDDATE
     *
     * @param dHolddate the value for TSALESTAT.D_HOLDDATE
     *
     * @mbggenerated
     */
    public void setdHolddate(Date dHolddate) {
        this.dHolddate = dHolddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_HOLDRATIO
     *
     * @return the value of TSALESTAT.F_HOLDRATIO
     *
     * @mbggenerated
     */
    public BigDecimal getfHoldratio() {
        return fHoldratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_HOLDRATIO
     *
     * @param fHoldratio the value for TSALESTAT.F_HOLDRATIO
     *
     * @mbggenerated
     */
    public void setfHoldratio(BigDecimal fHoldratio) {
        this.fHoldratio = fHoldratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_SERVICEFARE
     *
     * @return the value of TSALESTAT.F_SERVICEFARE
     *
     * @mbggenerated
     */
    public BigDecimal getfServicefare() {
        return fServicefare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_SERVICEFARE
     *
     * @param fServicefare the value for TSALESTAT.F_SERVICEFARE
     *
     * @mbggenerated
     */
    public void setfServicefare(BigDecimal fServicefare) {
        this.fServicefare = fServicefare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_INCOME
     *
     * @return the value of TSALESTAT.F_INCOME
     *
     * @mbggenerated
     */
    public BigDecimal getfIncome() {
        return fIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_INCOME
     *
     * @param fIncome the value for TSALESTAT.F_INCOME
     *
     * @mbggenerated
     */
    public void setfIncome(BigDecimal fIncome) {
        this.fIncome = fIncome;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_REINVESTSHARE
     *
     * @return the value of TSALESTAT.F_REINVESTSHARE
     *
     * @mbggenerated
     */
    public BigDecimal getfReinvestshare() {
        return fReinvestshare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_REINVESTSHARE
     *
     * @param fReinvestshare the value for TSALESTAT.F_REINVESTSHARE
     *
     * @mbggenerated
     */
    public void setfReinvestshare(BigDecimal fReinvestshare) {
        this.fReinvestshare = fReinvestshare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_REINVESTBALANCE
     *
     * @return the value of TSALESTAT.F_REINVESTBALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfReinvestbalance() {
        return fReinvestbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_REINVESTBALANCE
     *
     * @param fReinvestbalance the value for TSALESTAT.F_REINVESTBALANCE
     *
     * @mbggenerated
     */
    public void setfReinvestbalance(BigDecimal fReinvestbalance) {
        this.fReinvestbalance = fReinvestbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_REINVESTORIBALANCE
     *
     * @return the value of TSALESTAT.F_REINVESTORIBALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfReinvestoribalance() {
        return fReinvestoribalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_REINVESTORIBALANCE
     *
     * @param fReinvestoribalance the value for TSALESTAT.F_REINVESTORIBALANCE
     *
     * @mbggenerated
     */
    public void setfReinvestoribalance(BigDecimal fReinvestoribalance) {
        this.fReinvestoribalance = fReinvestoribalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_OUTERSHARES
     *
     * @return the value of TSALESTAT.F_OUTERSHARES
     *
     * @mbggenerated
     */
    public BigDecimal getfOutershares() {
        return fOutershares;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_OUTERSHARES
     *
     * @param fOutershares the value for TSALESTAT.F_OUTERSHARES
     *
     * @mbggenerated
     */
    public void setfOutershares(BigDecimal fOutershares) {
        this.fOutershares = fOutershares;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_OUTERBALANCE
     *
     * @return the value of TSALESTAT.F_OUTERBALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfOuterbalance() {
        return fOuterbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_OUTERBALANCE
     *
     * @param fOuterbalance the value for TSALESTAT.F_OUTERBALANCE
     *
     * @mbggenerated
     */
    public void setfOuterbalance(BigDecimal fOuterbalance) {
        this.fOuterbalance = fOuterbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_INNERSHARES
     *
     * @return the value of TSALESTAT.F_INNERSHARES
     *
     * @mbggenerated
     */
    public BigDecimal getfInnershares() {
        return fInnershares;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_INNERSHARES
     *
     * @param fInnershares the value for TSALESTAT.F_INNERSHARES
     *
     * @mbggenerated
     */
    public void setfInnershares(BigDecimal fInnershares) {
        this.fInnershares = fInnershares;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_INNERBALANCE
     *
     * @return the value of TSALESTAT.F_INNERBALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfInnerbalance() {
        return fInnerbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_INNERBALANCE
     *
     * @param fInnerbalance the value for TSALESTAT.F_INNERBALANCE
     *
     * @mbggenerated
     */
    public void setfInnerbalance(BigDecimal fInnerbalance) {
        this.fInnerbalance = fInnerbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILFARE
     *
     * @return the value of TSALESTAT.F_TAILFARE
     *
     * @mbggenerated
     */
    public BigDecimal getfTailfare() {
        return fTailfare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILFARE
     *
     * @param fTailfare the value for TSALESTAT.F_TAILFARE
     *
     * @mbggenerated
     */
    public void setfTailfare(BigDecimal fTailfare) {
        this.fTailfare = fTailfare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILFARE2
     *
     * @return the value of TSALESTAT.F_TAILFARE2
     *
     * @mbggenerated
     */
    public BigDecimal getfTailfare2() {
        return fTailfare2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILFARE2
     *
     * @param fTailfare2 the value for TSALESTAT.F_TAILFARE2
     *
     * @mbggenerated
     */
    public void setfTailfare2(BigDecimal fTailfare2) {
        this.fTailfare2 = fTailfare2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILRATIO2
     *
     * @return the value of TSALESTAT.F_TAILRATIO2
     *
     * @mbggenerated
     */
    public BigDecimal getfTailratio2() {
        return fTailratio2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILRATIO2
     *
     * @param fTailratio2 the value for TSALESTAT.F_TAILRATIO2
     *
     * @mbggenerated
     */
    public void setfTailratio2(BigDecimal fTailratio2) {
        this.fTailratio2 = fTailratio2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_PROTECTSHARES
     *
     * @return the value of TSALESTAT.F_PROTECTSHARES
     *
     * @mbggenerated
     */
    public BigDecimal getfProtectshares() {
        return fProtectshares;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_PROTECTSHARES
     *
     * @param fProtectshares the value for TSALESTAT.F_PROTECTSHARES
     *
     * @mbggenerated
     */
    public void setfProtectshares(BigDecimal fProtectshares) {
        this.fProtectshares = fProtectshares;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_PROTECTBALANCE
     *
     * @return the value of TSALESTAT.F_PROTECTBALANCE
     *
     * @mbggenerated
     */
    public BigDecimal getfProtectbalance() {
        return fProtectbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_PROTECTBALANCE
     *
     * @param fProtectbalance the value for TSALESTAT.F_PROTECTBALANCE
     *
     * @mbggenerated
     */
    public void setfProtectbalance(BigDecimal fProtectbalance) {
        this.fProtectbalance = fProtectbalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.D_LASTSERVICEFAREDATE
     *
     * @return the value of TSALESTAT.D_LASTSERVICEFAREDATE
     *
     * @mbggenerated
     */
    public Date getdLastservicefaredate() {
        return dLastservicefaredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.D_LASTSERVICEFAREDATE
     *
     * @param dLastservicefaredate the value for TSALESTAT.D_LASTSERVICEFAREDATE
     *
     * @mbggenerated
     */
    public void setdLastservicefaredate(Date dLastservicefaredate) {
        this.dLastservicefaredate = dLastservicefaredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_SERVICERATIO
     *
     * @return the value of TSALESTAT.F_SERVICERATIO
     *
     * @mbggenerated
     */
    public BigDecimal getfServiceratio() {
        return fServiceratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_SERVICERATIO
     *
     * @param fServiceratio the value for TSALESTAT.F_SERVICERATIO
     *
     * @mbggenerated
     */
    public void setfServiceratio(BigDecimal fServiceratio) {
        this.fServiceratio = fServiceratio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILRATIO3
     *
     * @return the value of TSALESTAT.F_TAILRATIO3
     *
     * @mbggenerated
     */
    public BigDecimal getfTailratio3() {
        return fTailratio3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILRATIO3
     *
     * @param fTailratio3 the value for TSALESTAT.F_TAILRATIO3
     *
     * @mbggenerated
     */
    public void setfTailratio3(BigDecimal fTailratio3) {
        this.fTailratio3 = fTailratio3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILFARE3
     *
     * @return the value of TSALESTAT.F_TAILFARE3
     *
     * @mbggenerated
     */
    public BigDecimal getfTailfare3() {
        return fTailfare3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILFARE3
     *
     * @param fTailfare3 the value for TSALESTAT.F_TAILFARE3
     *
     * @mbggenerated
     */
    public void setfTailfare3(BigDecimal fTailfare3) {
        this.fTailfare3 = fTailfare3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILRATIO4
     *
     * @return the value of TSALESTAT.F_TAILRATIO4
     *
     * @mbggenerated
     */
    public BigDecimal getfTailratio4() {
        return fTailratio4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILRATIO4
     *
     * @param fTailratio4 the value for TSALESTAT.F_TAILRATIO4
     *
     * @mbggenerated
     */
    public void setfTailratio4(BigDecimal fTailratio4) {
        this.fTailratio4 = fTailratio4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TSALESTAT.F_TAILFARE4
     *
     * @return the value of TSALESTAT.F_TAILFARE4
     *
     * @mbggenerated
     */
    public BigDecimal getfTailfare4() {
        return fTailfare4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TSALESTAT.F_TAILFARE4
     *
     * @param fTailfare4 the value for TSALESTAT.F_TAILFARE4
     *
     * @mbggenerated
     */
    public void setfTailfare4(BigDecimal fTailfare4) {
        this.fTailfare4 = fTailfare4;
    }
}