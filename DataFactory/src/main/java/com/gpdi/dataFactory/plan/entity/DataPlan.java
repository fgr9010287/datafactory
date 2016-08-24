package com.gpdi.dataFactory.plan.entity;

import java.io.Serializable;
import java.util.Date;

public class DataPlan implements Serializable {
    private String dplid;

    private String dplname;

    private String dpltype;

    private Date dplstartdt;

    private Date dplenddt;

    private String dplplanner;

    private Date dplplantime;

    private Integer incplcust;

    private Integer incpfcust;

    private Integer incplcustinfo;

    private Integer incpfcustinfo;

    private Integer incplcustpoi;

    private Integer incpfcustpoi;

    private Integer fixplcust;

    private Integer fixpfcustinfo;

    private Integer fixplcustpoi;

    private Date createdt;

    private Date fixdt;

    private String dplfixman;

    private static final long serialVersionUID = 1L;

    public String getDplid() {
        return dplid;
    }

    public void setDplid(String dplid) {
        this.dplid = dplid == null ? null : dplid.trim();
    }

    public String getDplname() {
        return dplname;
    }

    public void setDplname(String dplname) {
        this.dplname = dplname == null ? null : dplname.trim();
    }

    public String getDpltype() {
        return dpltype;
    }

    public void setDpltype(String dpltype) {
        this.dpltype = dpltype == null ? null : dpltype.trim();
    }

    public Date getDplstartdt() {
        return dplstartdt;
    }

    public void setDplstartdt(Date dplstartdt) {
        this.dplstartdt = dplstartdt;
    }

    public Date getDplenddt() {
        return dplenddt;
    }

    public void setDplenddt(Date dplenddt) {
        this.dplenddt = dplenddt;
    }

    public String getDplplanner() {
        return dplplanner;
    }

    public void setDplplanner(String dplplanner) {
        this.dplplanner = dplplanner == null ? null : dplplanner.trim();
    }

    public Date getDplplantime() {
        return dplplantime;
    }

    public void setDplplantime(Date dplplantime) {
        this.dplplantime = dplplantime;
    }

    public Integer getIncplcust() {
        return incplcust;
    }

    public void setIncplcust(Integer incplcust) {
        this.incplcust = incplcust;
    }

    public Integer getIncpfcust() {
        return incpfcust;
    }

    public void setIncpfcust(Integer incpfcust) {
        this.incpfcust = incpfcust;
    }

    public Integer getIncplcustinfo() {
        return incplcustinfo;
    }

    public void setIncplcustinfo(Integer incplcustinfo) {
        this.incplcustinfo = incplcustinfo;
    }

    public Integer getIncpfcustinfo() {
        return incpfcustinfo;
    }

    public void setIncpfcustinfo(Integer incpfcustinfo) {
        this.incpfcustinfo = incpfcustinfo;
    }

    public Integer getIncplcustpoi() {
        return incplcustpoi;
    }

    public void setIncplcustpoi(Integer incplcustpoi) {
        this.incplcustpoi = incplcustpoi;
    }

    public Integer getIncpfcustpoi() {
        return incpfcustpoi;
    }

    public void setIncpfcustpoi(Integer incpfcustpoi) {
        this.incpfcustpoi = incpfcustpoi;
    }

    public Integer getFixplcust() {
        return fixplcust;
    }

    public void setFixplcust(Integer fixplcust) {
        this.fixplcust = fixplcust;
    }

    public Integer getFixpfcustinfo() {
        return fixpfcustinfo;
    }

    public void setFixpfcustinfo(Integer fixpfcustinfo) {
        this.fixpfcustinfo = fixpfcustinfo;
    }

    public Integer getFixplcustpoi() {
        return fixplcustpoi;
    }

    public void setFixplcustpoi(Integer fixplcustpoi) {
        this.fixplcustpoi = fixplcustpoi;
    }

    public Date getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Date createdt) {
        this.createdt = createdt;
    }

    public Date getFixdt() {
        return fixdt;
    }

    public void setFixdt(Date fixdt) {
        this.fixdt = fixdt;
    }

    public String getDplfixman() {
        return dplfixman;
    }

    public void setDplfixman(String dplfixman) {
        this.dplfixman = dplfixman == null ? null : dplfixman.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dplid=").append(dplid);
        sb.append(", dplname=").append(dplname);
        sb.append(", dpltype=").append(dpltype);
        sb.append(", dplstartdt=").append(dplstartdt);
        sb.append(", dplenddt=").append(dplenddt);
        sb.append(", dplplanner=").append(dplplanner);
        sb.append(", dplplantime=").append(dplplantime);
        sb.append(", incplcust=").append(incplcust);
        sb.append(", incpfcust=").append(incpfcust);
        sb.append(", incplcustinfo=").append(incplcustinfo);
        sb.append(", incpfcustinfo=").append(incpfcustinfo);
        sb.append(", incplcustpoi=").append(incplcustpoi);
        sb.append(", incpfcustpoi=").append(incpfcustpoi);
        sb.append(", fixplcust=").append(fixplcust);
        sb.append(", fixpfcustinfo=").append(fixpfcustinfo);
        sb.append(", fixplcustpoi=").append(fixplcustpoi);
        sb.append(", createdt=").append(createdt);
        sb.append(", fixdt=").append(fixdt);
        sb.append(", dplfixman=").append(dplfixman);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}