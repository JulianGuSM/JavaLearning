package com.hs.ptscan.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author : Julian
 * @date : 2019/5/27 15:54
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class PtPxjg {
    private String pkId;
    private int isscan;
    private String isok;
    private String ddh;
    private String szxhStr;
    private String szxh;
    private String zz;
    private BigDecimal pxsl;
    private String khdm;
    private String oldKhdm;
    private String khcgddh;
    private String vbeln;
    private String posnr;
    private String kb;
    private Date chrq;
    private String wx;
    private String cp;
    private String xh;
    private String ws;
    private String ps;
    private BigDecimal kcl;
    private String pxdh;
    private String khmc;
    private String pm;
    private String hsbzlh;
    private String saplh;
    private String bz;
    private String bzsl;
    private String khlh;
    private String ywy;
    private String ponobz;
    private BigDecimal slzz;
    private BigDecimal jz;
    private BigDecimal mz;
    private String fbg;
    private String zb;
    private BigDecimal changetimes;
    private BigDecimal abolishtimes;
    private String pboxman;
    private String changeman;
    private Date pboxdate;
    private Date changedate;
    private BigDecimal mjsl;
    private String pxbz;
    private String isDelete;
    private int js;
    private String scbs;
    private String sdf;
    private int smallpgNum=-1;
    private int printNum=-1;
    private Date creationDate;
    private String psn;
    private int boxindex;
    private String cwywy;  //财务报表内的业务员
    private BigDecimal wxzl;
    private Date yqjq;
    private int atagsCount;  //A标签的总数
    public List<String> btagsCount;  //B标签的总数
}
