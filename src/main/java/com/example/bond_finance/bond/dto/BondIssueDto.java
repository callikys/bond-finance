package com.example.bond_finance.bond.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class BondIssueDto {
    private LocalDate basDt;
    private String crno;
    private String scrsItmsKcd;
    private String isinCd;
    private String isinCdNm;
    private LocalDate bondIssuDt;
    private String bondIssuFrmtNm;
    private Long bondIssuAmt;
    private String bondIssuCurCd;
    private String bondIssuCurCdNm;
    private LocalDate bondExprDt;
    private Long bondPymtAmt;
    private String irtChngDcd;
    private String irtChngDcdNm;
    private BigDecimal bondSrfcInrt;
    private String bondIntTcd;
    private String bondIntTcdNm;
}
