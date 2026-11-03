package com.example.bond_finance.bond.entity;

import java.math.BigDecimal;
import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "bond_issue",
        uniqueConstraints = {
            @UniqueConstraint(
                name = "uk_bond_issue_isin_bas_dt",
                columnNames = { "isin_cd", "bas_dt"}
            )
        }
)
@NoArgsConstructor 
@Getter 
@Setter 
public class BondIssueEntity {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bond_id")
    private Long bondId;


    @Column(name = "isin_cd")
    private String isinCd;

    @Column(name = "bas_dt")
    private LocalDate basDt;

    @Column(name = "crno")
    private String crno;

    @Column(name = "scrs_itms_kcd")
    private String scrsItmsKcd;

    @Column(name = "isin_cd_nm")
    private String isinCdNm;

    @Column(name = "bond_issu_dt")
    private LocalDate bondIssuDt;

    @Column(name = "bond_issu_frmt_nm")
    private String bondIssuFrmtNm;

    @Column(name = "bond_issu_amt", precision = 20, scale = 0)
    private BigDecimal bondIssuAmt;

    @Column(name = "bond_issu_cur_cd")
    private String bondIssuCurCd;

    @Column(name = "bond_issu_cur_cd_nm")
    private String bondIssuCurCdNm;

    @Column(name = "bond_expr_dt")
    private LocalDate bondExprDt;

    @Column(name = "bond_pymt_amt", precision = 20, scale = 0)
    private BigDecimal bondPymtAmt;

    @Column(name = "irt_chng_dcd")
    private String irtChngDcd;

    @Column(name = "irt_chng_dcd_nm")
    private String irtChngDcdNm;

    @Column(name = "bond_srfc_inrt", precision = 12, scale = 6)
    private BigDecimal bondSrfcInrt;

    @Column(name = "bond_int_tcd")
    private String bondIntTcd;

    @Column(name = "bond_int_tcd_nm")
    private String bondIntTcdNm;
}
