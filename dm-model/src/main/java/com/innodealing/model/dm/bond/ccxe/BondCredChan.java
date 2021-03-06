package com.innodealing.model.dm.bond.ccxe;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.io.Serializable;
import com.innodealing.model.dm.bond.ccxe.BondCredChanPK;

@IdClass(BondCredChanPK.class)
@Entity(name="ccxe.BondCredChan")
@Table(name="d_bond_cred_chan")
public class BondCredChan implements Serializable{
    private static final long serialVersionUID = 1L;
    
    
    /**
     * 
     */
    @Column(name="ID", length=36)
    private String id;
    
    /**
     * 
     */
    @Column(name="ISVALID", length=10)
    private Integer isvalid;
    
    /**
     * 
     */
    @Column(name="CREATETIME", length=19)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createtime;
    
    /**
     * 
     */
    @Column(name="UPDATETIME", length=19)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatetime;
    
    /**
     * 
     */
    @Column(nullable=false, name="CCXEID", length=19)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccxeid;
    
    /**
     * 
     */
	 @Id
    @Column(name="RATE_ID", length=19)
    private Long rateId;
    
    /**
     * 
     */
	 @Id
    @Column(name="BOND_UNI_CODE", length=19)
    private Long bondUniCode;
    
    /**
     * 
     */
    @Column(name="BOND_CODE", length=20)
    private String bondCode;
    
    /**
     * 
     */
    @Column(name="BOND_SHORT_NAME", length=200)
    private String bondShortName;
    
    /**
     * 
     */
    @Column(name="ORG_UNI_CODE", length=19)
    private Long orgUniCode;
    
    /**
     * 
     */
    @Column(name="RATE_PUBL_DATE", length=19)
    @Temporal(TemporalType.TIMESTAMP)
    private Date ratePublDate;
    
    /**
     * 
     */
    @Column(name="RATE_WRIT_DATE", length=19)
    @Temporal(TemporalType.TIMESTAMP)
    private Date rateWritDate;
    
    /**
     * 
     */
    @Column(name="RESER_NAME", length=150)
    private String reserName;
    
    /**
     * 
     */
    @Column(name="RATE_TYPE_PAR", length=10)
    private Integer rateTypePar;
    
    /**
     * 
     */
    @Column(name="RATE_CLS_PAR", length=10)
    private Integer rateClsPar;
    
    /**
     * 
     */
    @Column(name="IS_NEW_RATE", length=10)
    private Integer isNewRate;
    
    /**
     * 
     */
    @Column(name="BOND_CRED_LEVEL", length=20)
    private String bondCredLevel;
    
    /**
     * 
     */
    @Column(name="BOND_CRED_LEVEL_PAR", length=10)
    private Integer bondCredLevelPar;
    
    /**
     * 
     */
    @Column(name="BOND_CRED_LEVEL_EXP", length=65535)
    private String bondCredLevelExp;
    
    /**
     * 
     */
    @Column(name="RATE_POINT", length=65535)
    private String ratePoint;
    
    /**
     * 
     */
    @Column(name="CCE_ADVT", length=65535)
    private String cceAdvt;
    
    /**
     * 
     */
    @Column(name="CCE_DISADVT", length=65535)
    private String cceDisadvt;
    
    /**
     * 
     */
    @Column(name="ATT_POINT", length=65535)
    private String attPoint;
    
    /**
     * 
     */
    @Column(name="RATE_PROS_PAR", length=10)
    private Integer rateProsPar;

    
    public void setId(String id){
       this.id = id;
    }
    
    public String getId(){
       return this.id;
    }
    
    public void setIsvalid(Integer isvalid){
       this.isvalid = isvalid;
    }
    
    public Integer getIsvalid(){
       return this.isvalid;
    }
    
    public void setCreatetime(Date createtime){
       this.createtime = createtime;
    }
    
    public Date getCreatetime(){
       return this.createtime;
    }
    
    public void setUpdatetime(Date updatetime){
       this.updatetime = updatetime;
    }
    
    public Date getUpdatetime(){
       return this.updatetime;
    }
    
    public void setCcxeid(Date ccxeid){
       this.ccxeid = ccxeid;
    }
    
    public Date getCcxeid(){
       return this.ccxeid;
    }
    
    public void setRateId(Long rateId){
       this.rateId = rateId;
    }
    
    public Long getRateId(){
       return this.rateId;
    }
    
    public void setBondUniCode(Long bondUniCode){
       this.bondUniCode = bondUniCode;
    }
    
    public Long getBondUniCode(){
       return this.bondUniCode;
    }
    
    public void setBondCode(String bondCode){
       this.bondCode = bondCode;
    }
    
    public String getBondCode(){
       return this.bondCode;
    }
    
    public void setBondShortName(String bondShortName){
       this.bondShortName = bondShortName;
    }
    
    public String getBondShortName(){
       return this.bondShortName;
    }
    
    public void setOrgUniCode(Long orgUniCode){
       this.orgUniCode = orgUniCode;
    }
    
    public Long getOrgUniCode(){
       return this.orgUniCode;
    }
    
    public void setRatePublDate(Date ratePublDate){
       this.ratePublDate = ratePublDate;
    }
    
    public Date getRatePublDate(){
       return this.ratePublDate;
    }
    
    public void setRateWritDate(Date rateWritDate){
       this.rateWritDate = rateWritDate;
    }
    
    public Date getRateWritDate(){
       return this.rateWritDate;
    }
    
    public void setReserName(String reserName){
       this.reserName = reserName;
    }
    
    public String getReserName(){
       return this.reserName;
    }
    
    public void setRateTypePar(Integer rateTypePar){
       this.rateTypePar = rateTypePar;
    }
    
    public Integer getRateTypePar(){
       return this.rateTypePar;
    }
    
    public void setRateClsPar(Integer rateClsPar){
       this.rateClsPar = rateClsPar;
    }
    
    public Integer getRateClsPar(){
       return this.rateClsPar;
    }
    
    public void setIsNewRate(Integer isNewRate){
       this.isNewRate = isNewRate;
    }
    
    public Integer getIsNewRate(){
       return this.isNewRate;
    }
    
    public void setBondCredLevel(String bondCredLevel){
       this.bondCredLevel = bondCredLevel;
    }
    
    public String getBondCredLevel(){
       return this.bondCredLevel;
    }
    
    public void setBondCredLevelPar(Integer bondCredLevelPar){
       this.bondCredLevelPar = bondCredLevelPar;
    }
    
    public Integer getBondCredLevelPar(){
       return this.bondCredLevelPar;
    }
    
    public void setBondCredLevelExp(String bondCredLevelExp){
       this.bondCredLevelExp = bondCredLevelExp;
    }
    
    public String getBondCredLevelExp(){
       return this.bondCredLevelExp;
    }
    
    public void setRatePoint(String ratePoint){
       this.ratePoint = ratePoint;
    }
    
    public String getRatePoint(){
       return this.ratePoint;
    }
    
    public void setCceAdvt(String cceAdvt){
       this.cceAdvt = cceAdvt;
    }
    
    public String getCceAdvt(){
       return this.cceAdvt;
    }
    
    public void setCceDisadvt(String cceDisadvt){
       this.cceDisadvt = cceDisadvt;
    }
    
    public String getCceDisadvt(){
       return this.cceDisadvt;
    }
    
    public void setAttPoint(String attPoint){
       this.attPoint = attPoint;
    }
    
    public String getAttPoint(){
       return this.attPoint;
    }
    
    public void setRateProsPar(Integer rateProsPar){
       this.rateProsPar = rateProsPar;
    }
    
    public Integer getRateProsPar(){
       return this.rateProsPar;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attPoint == null) ? 0 : attPoint.hashCode());
        result = prime * result + ((bondCode == null) ? 0 : bondCode.hashCode());
        result = prime * result + ((bondCredLevel == null) ? 0 : bondCredLevel.hashCode());
        result = prime * result + ((bondCredLevelExp == null) ? 0 : bondCredLevelExp.hashCode());
        result = prime * result + ((bondCredLevelPar == null) ? 0 : bondCredLevelPar.hashCode());
        result = prime * result + ((bondShortName == null) ? 0 : bondShortName.hashCode());
        result = prime * result + ((bondUniCode == null) ? 0 : bondUniCode.hashCode());
        result = prime * result + ((cceAdvt == null) ? 0 : cceAdvt.hashCode());
        result = prime * result + ((cceDisadvt == null) ? 0 : cceDisadvt.hashCode());
        result = prime * result + ((ccxeid == null) ? 0 : ccxeid.hashCode());
        result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((isNewRate == null) ? 0 : isNewRate.hashCode());
        result = prime * result + ((isvalid == null) ? 0 : isvalid.hashCode());
        result = prime * result + ((orgUniCode == null) ? 0 : orgUniCode.hashCode());
        result = prime * result + ((rateClsPar == null) ? 0 : rateClsPar.hashCode());
        result = prime * result + ((rateId == null) ? 0 : rateId.hashCode());
        result = prime * result + ((ratePoint == null) ? 0 : ratePoint.hashCode());
        result = prime * result + ((rateProsPar == null) ? 0 : rateProsPar.hashCode());
        result = prime * result + ((ratePublDate == null) ? 0 : ratePublDate.hashCode());
        result = prime * result + ((rateTypePar == null) ? 0 : rateTypePar.hashCode());
        result = prime * result + ((rateWritDate == null) ? 0 : rateWritDate.hashCode());
        result = prime * result + ((reserName == null) ? 0 : reserName.hashCode());
        result = prime * result + ((updatetime == null) ? 0 : updatetime.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BondCredChan other = (BondCredChan) obj;
        if (attPoint == null) {
            if (other.attPoint != null)
                return false;
        } else if (!attPoint.equals(other.attPoint))
            return false;
        if (bondCode == null) {
            if (other.bondCode != null)
                return false;
        } else if (!bondCode.equals(other.bondCode))
            return false;
        if (bondCredLevel == null) {
            if (other.bondCredLevel != null)
                return false;
        } else if (!bondCredLevel.equals(other.bondCredLevel))
            return false;
        if (bondCredLevelExp == null) {
            if (other.bondCredLevelExp != null)
                return false;
        } else if (!bondCredLevelExp.equals(other.bondCredLevelExp))
            return false;
        if (bondCredLevelPar == null) {
            if (other.bondCredLevelPar != null)
                return false;
        } else if (!bondCredLevelPar.equals(other.bondCredLevelPar))
            return false;
        if (bondShortName == null) {
            if (other.bondShortName != null)
                return false;
        } else if (!bondShortName.equals(other.bondShortName))
            return false;
        if (bondUniCode == null) {
            if (other.bondUniCode != null)
                return false;
        } else if (!bondUniCode.equals(other.bondUniCode))
            return false;
        if (cceAdvt == null) {
            if (other.cceAdvt != null)
                return false;
        } else if (!cceAdvt.equals(other.cceAdvt))
            return false;
        if (cceDisadvt == null) {
            if (other.cceDisadvt != null)
                return false;
        } else if (!cceDisadvt.equals(other.cceDisadvt))
            return false;
        if (ccxeid == null) {
            if (other.ccxeid != null)
                return false;
        } else if (!ccxeid.equals(other.ccxeid))
            return false;
        if (createtime == null) {
            if (other.createtime != null)
                return false;
        } else if (!createtime.equals(other.createtime))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (isNewRate == null) {
            if (other.isNewRate != null)
                return false;
        } else if (!isNewRate.equals(other.isNewRate))
            return false;
        if (isvalid == null) {
            if (other.isvalid != null)
                return false;
        } else if (!isvalid.equals(other.isvalid))
            return false;
        if (orgUniCode == null) {
            if (other.orgUniCode != null)
                return false;
        } else if (!orgUniCode.equals(other.orgUniCode))
            return false;
        if (rateClsPar == null) {
            if (other.rateClsPar != null)
                return false;
        } else if (!rateClsPar.equals(other.rateClsPar))
            return false;
        if (rateId == null) {
            if (other.rateId != null)
                return false;
        } else if (!rateId.equals(other.rateId))
            return false;
        if (ratePoint == null) {
            if (other.ratePoint != null)
                return false;
        } else if (!ratePoint.equals(other.ratePoint))
            return false;
        if (rateProsPar == null) {
            if (other.rateProsPar != null)
                return false;
        } else if (!rateProsPar.equals(other.rateProsPar))
            return false;
        if (ratePublDate == null) {
            if (other.ratePublDate != null)
                return false;
        } else if (!ratePublDate.equals(other.ratePublDate))
            return false;
        if (rateTypePar == null) {
            if (other.rateTypePar != null)
                return false;
        } else if (!rateTypePar.equals(other.rateTypePar))
            return false;
        if (rateWritDate == null) {
            if (other.rateWritDate != null)
                return false;
        } else if (!rateWritDate.equals(other.rateWritDate))
            return false;
        if (reserName == null) {
            if (other.reserName != null)
                return false;
        } else if (!reserName.equals(other.reserName))
            return false;
        if (updatetime == null) {
            if (other.updatetime != null)
                return false;
        } else if (!updatetime.equals(other.updatetime))
            return false;
        return true;
    }
}
