package com.innodealing.dao.jdbc.dm.bond.ccxe;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.innodealing.dao.jdbc.BaseDao;
import com.innodealing.model.dm.bond.asbrs.BondManuFinaSheet;
import com.innodealing.util.DateUtils;

/**
 * @author kunkun.zhou
 * @date 2016年12月07日
 * @clasename BondManuFinaSheetDao.java
 * @decription TODO
 */
@Component
public class BondTargetManuFinaDao extends BaseDao<BondManuFinaSheet> {
	private RowMapper rowMapper = new BeanPropertyRowMapper(BondManuFinaSheet.class);
	
	public BondManuFinaSheet getTargetData(Long comUniCode, Long bondUniCode, Date endDate) {
		StringBuilder selResultsql = new StringBuilder();
		selResultsql.append("a.TACBB_110101 as BS101,")
		.append("a.TACBB_112201 as BS102,")
		.append("a.TACBB_110401 as BS103,")
		.append("a.TACBB_110711 as BS104,")
		.append("a.TACBB_110901 as BS105,")
		.append("a.TACBB_110601 as BS106,")
		.append("a.TACBB_110501 as BS107,")
		.append("a.TACBB_110721 as BS108,")
		.append("a.TACBB_111511 as BS109,")
		.append("a.TACBB_112301 as BS110,")
		.append("a.TACBB_112101 as BS111,")
		.append("a.TACBB_110001 as BS100,")
		.append("a.TACBB_1303 as BS2011,")
		.append("a.TACBB_120801 as BS201,")
		.append("a.TACBB_120901 as BS202,")
		.append("a.TACBB_121101 as BS203,")
		.append("a.TACBB_120111 as BS204,")
		.append("a.TACBB_121001 as BS205,")
		.append("a.TACBB_130101 as BS220,")
		.append("a.TACBB_130301 as BS221,")
		.append("a.TACBB_130201 as BS222,")
		.append("a.TACBB_130401 as BS223,")
		.append("a.TACBB_140101 as BS224,")
		.append("a.TACBB_130701 as BS225,")
		.append("a.TACBB_140101 as BS240,")
		.append("a.TACBB_140601 as BS251,")
		.append("a.TACBB_140701 as BS252,")
		.append("a.TACBB_140401 as BS253,")
		.append("a.TACBB_150001 as BS254,")
		.append("a.TACBB_160101 as BS255,")
		.append("a.TACBB_160000 as BS200,")
		.append("a.TACBB_100000 as BS001,")
		.append("a.TACBB_210101 as BS301,")
		.append("a.TACBB_212301 as BS302,")
		.append("a.TACBB_210201 as BS303,")
		.append("a.TACBB_210301 as BS304,")
		.append("a.TACBB_210401 as BS305,")
		.append("a.TACBB_210601 as BS306,")
		.append("a.TACBB_210901 as BS307,")
		.append("a.TACBB_212401 as BS308,")
		.append("a.TACBB_210801 as BS309,")
		.append("a.TACBB_211301 as BS310,")
		.append("a.TACBB_212501 as BS311,")
		.append("a.TACBB_212101 as BS312,")
		.append("a.TACBB_212101 as BS313,")
		.append("a.TACBB_210001 as BS300,")
		.append("a.TACBB_220101 as BS401,")
		.append("a.TACBB_220201 as BS402,")
		.append("a.TACBB_220301 as BS403,")
		.append("a.TACBB_220401 as BS404,")
		.append("a.TACBB_211901 as BS405,")
		.append("a.TACBB_240001 as BS406,")
		.append("a.TACBB_250001 as BS407,")
		.append("a.TACBB_270001 as BS400,")
		.append("a.TACBB_200000 as BS002,")
		.append("a.TACBB_310101 as BS501,")
		.append("a.TACBB_310201 as BS502,")
		.append("a.TACBB_310902 as BS503,")
		.append("a.TACBB_310903 as BS2015,")
		.append("a.TACBB_310301 as BS504,")
		.append("a.TACBB_4102 as BS2016,")
		.append("a.TACBB_310701 as BS505,")
		.append("a.TACBB_310801 as BS506,")
		.append("a.TACBB_311101 as BS003,")
		.append("a.TACBB_400000 as BS507,")
		.append("a.TACBB_300000 as BS004,")
		.append("a.TACBB_500000 as BS005,")
		.append("b.TACPB_110100 as PL101,")
		.append("b.TACPB_110200 as PL102,")
		.append("b.TACPB_110302 as PL103,")
		.append("b.TACPB_120442 as PL201,")
		.append("c.TACCB_411601 as PL202_5,")
		.append("b.TACPB_120422 as PL202,")
		.append("b.TACPB_130201 as PL203,")
		.append("b.TACPB_130211 as PL203_1,")
		.append("b.TACPB_131102 as PL204,")
		.append("b.TACPB_131201 as PL205,")
		.append("CASE WHEN b.TACPB_11040201 IS NOT NULL THEN b.TACPB_150101 + b.TACPB_140202 + b.TACPB_11040201 ")
		.append("ELSE b.TACPB_150101 + b.TACPB_140202 + b.TACPB_120432 END as PL200,")
		.append("c.TACCB_411501 as PL210,")
		.append("c.TACCB_411601 as PL211,")
		.append("c.TACCB_411801 as PL212,")
		.append("CASE WHEN b.TACPB_11040201 IS NOT NULL THEN b.TACPB_150101 + b.TACPB_140202 + b.TACPB_11040201 + c.TACCB_411501 + c.TACCB_411601+c.TACCB_411801 ")
		.append("ELSE b.TACPB_150101 + b.TACPB_140202 + b.TACPB_120432 + c.TACCB_411501 + c.TACCB_411601+c.TACCB_411801 end as PL220,")
		.append("b.TACPB_120432 as PL301,")
		.append("b.TACPB_11040201 as PL301_1,")
		.append("b.TACPB_11013101 as PL301_3,")
		.append("b.TACPB_120601 as PL301_7,")
		.append("b.TACPB_130101 as PL300,")
		.append("b.TACPB_130501 as PL401,")
		.append("b.TACPB_130702 as PL402,")
		.append("b.TACPB_130712 as PL402_1,")
		.append("b.TACPB_140101 as PL400,")
		.append("b.TACPB_140202 as PL501,")
		.append("b.TACPB_150101 as PL500,")
		.append("b.TACPB_140302 as PL601,")
		.append("b.TACPB_160101 as PL600,")
		.append("c.TACCB_110101 as CF101,")
		.append("c.TACCB_110301 as CF102,")
		.append("c.TACCB_110401 as CF103,")
		.append("c.TACCB_110000 as CF100,")
		.append("c.TACCB_120101 as CF201,")
		.append("c.TACCB_120301 as CF202,")
		.append("c.TACCB_120401 as CF203,")
		.append("c.TACCB_120501 as CF204,")
		.append("c.TACCB_120000 as CF200,")
		.append("c.TACCB_100000 as CF001,")
		.append("c.TACCB_210101 as CF301,")
		.append("c.TACCB_210201 as CF302,")
		.append("c.TACCB_210301 as CF303,")
		.append("c.TACCB_210501 as CF305,")
		.append("c.TACCB_210401 as CF304,")
		.append("c.TACCB_210000 as CF300,")
		.append("c.TACCB_220101 as CF401,")
		.append("c.TACCB_220201 as CF402,")
		.append("c.TACCB_220401 as CF404,")
		.append("c.TACCB_220301 as CF403,")
		.append("c.TACCB_220000 as CF400,")
		.append("c.TACCB_200000 as CF002,")
		.append("c.TACCB_310301 as CF501,")
		.append("c.TACCB_310401 as CF502,")
		.append("c.TACCB_310201 as CF504,")
		.append("c.TACCB_310501 as CF503,")
		.append("c.TACCB_310000 as CF500,")
		.append("c.TACCB_320101 as CF601,")
		.append("c.TACCB_320301 as CF602,")
		.append("c.TACCB_320701 as CF603,")
		.append("c.TACCB_320000 as CF600,")
		.append("c.TACCB_300000 as CF003,")
		.append("c.TACCB_410101 as CF004,")
		.append("c.TACCB_410201 as CF005,")
		.append("c.TACCB_413201 as CF006,")
		.append("c.TACCB_413301 as CF007,")
		.append("c.TACCB_411001 as CF901,")
		.append("c.TACCB_411401 as CF902,")
		.append("c.TACCB_411501 as CF903,")
		.append("c.TACCB_411601 as CF904,")
		.append("c.TACCB_411701 as CF905,")
		.append("c.TACCB_412001 as CF906,")
		.append("c.TACCB_412101 as CF907,")
		.append("c.TACCB_413501 as CF908,")
		.append("c.TACCB_412201 as CF909,")
		.append("c.TACCB_412301 as CF910,")
		.append("c.TACCB_413601 as CF911,")
		.append("c.TACCB_413701 as CF912,")
		.append("c.TACCB_412601 as CF913,")
		.append("c.TACCB_412701 as CF914,")
		.append("c.TACCB_412801 as CF915,")
		.append("c.TACCB_413001 as CF916,")
		.append("c.TACCB_ADD_OPER_NETCASH as CF917,")
		.append("c.TACCB_410501 as CF918,")
		.append("c.TACCB_410801 as CF919,")
		.append("c.TACCB_410802 as CF920,")
		.append("c.TACCB_510101 as CF921,")
		.append("c.TACCB_510201 as CF922,")
		.append("c.TACCB_510301 as CF923,")
		.append("c.TACCB_510401 as CF924,")
		.append("c.TACCB_ADD_NETCASH as CF925");
		
		StringBuilder sql = new StringBuilder();
		sql.append(" select a.COM_UNI_CODE,a.END_DATE, ").append(selResultsql)
		.append(" from D_BOND_FIN_GEN_BALA_TACBB a ")
		.append(" inner join D_BOND_FIN_GEN_PROF_TACPB b on b.COM_UNI_CODE=a.COM_UNI_CODE and b.END_DATE=a.END_DATE and b.ISVALID=a.ISVALID and b.SHEET_MARK_PAR=a.SHEET_MARK_PAR ")
		.append(" left join D_BOND_FIN_GEN_CASH_TACCB c on c.COM_UNI_CODE=a.COM_UNI_CODE and c.END_DATE=a.END_DATE and c.ISVALID=a.ISVALID and c.SHEET_MARK_PAR=a.SHEET_MARK_PAR ")
		.append(" where a.ISVALID='1' and a.SHEET_MARK_PAR='1' and a.COM_UNI_CODE=" + comUniCode + " and a.bond_uni_code=" + bondUniCode + " and a.END_DATE='" + DateUtils.convertDateToString(endDate) + "' limit 1");

		List<BondManuFinaSheet> list = ccxeJdbcTemplate.query(sql.toString(), rowMapper);
		if (null == list || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
	public List<BondManuFinaSheet> getList(Integer start, Integer length) {
		StringBuilder selResultsql = new StringBuilder();
		selResultsql.append("a.TACBB_110101 as BS101,")
		.append("a.TACBB_112201 as BS102,")
		.append("a.TACBB_110401 as BS103,")
		.append("a.TACBB_110711 as BS104,")
		.append("a.TACBB_110901 as BS105,")
		.append("a.TACBB_110601 as BS106,")
		.append("a.TACBB_110501 as BS107,")
		.append("a.TACBB_110721 as BS108,")
		.append("a.TACBB_111511 as BS109,")
		.append("a.TACBB_112301 as BS110,")
		.append("a.TACBB_112101 as BS111,")
		.append("a.TACBB_110001 as BS100,")
		.append("a.TACBB_1303 as BS2011,")
		.append("a.TACBB_120801 as BS201,")
		.append("a.TACBB_120901 as BS202,")
		.append("a.TACBB_121101 as BS203,")
		.append("a.TACBB_120111 as BS204,")
		.append("a.TACBB_121001 as BS205,")
		.append("a.TACBB_130101 as BS220,")
		.append("a.TACBB_130301 as BS221,")
		.append("a.TACBB_130201 as BS222,")
		.append("a.TACBB_130401 as BS223,")
		.append("a.TACBB_140101 as BS224,")
		.append("a.TACBB_130701 as BS225,")
		.append("a.TACBB_140101 as BS240,")
		.append("a.TACBB_140601 as BS251,")
		.append("a.TACBB_140701 as BS252,")
		.append("a.TACBB_140401 as BS253,")
		.append("a.TACBB_150001 as BS254,")
		.append("a.TACBB_160101 as BS255,")
		.append("a.TACBB_160000 as BS200,")
		.append("a.TACBB_100000 as BS001,")
		.append("a.TACBB_210101 as BS301,")
		.append("a.TACBB_212301 as BS302,")
		.append("a.TACBB_210201 as BS303,")
		.append("a.TACBB_210301 as BS304,")
		.append("a.TACBB_210401 as BS305,")
		.append("a.TACBB_210601 as BS306,")
		.append("a.TACBB_210901 as BS307,")
		.append("a.TACBB_212401 as BS308,")
		.append("a.TACBB_210801 as BS309,")
		.append("a.TACBB_211301 as BS310,")
		.append("a.TACBB_212501 as BS311,")
		.append("a.TACBB_212101 as BS312,")
		.append("a.TACBB_212101 as BS313,")
		.append("a.TACBB_210001 as BS300,")
		.append("a.TACBB_220101 as BS401,")
		.append("a.TACBB_220201 as BS402,")
		.append("a.TACBB_220301 as BS403,")
		.append("a.TACBB_220401 as BS404,")
		.append("a.TACBB_211901 as BS405,")
		.append("a.TACBB_240001 as BS406,")
		.append("a.TACBB_250001 as BS407,")
		.append("a.TACBB_270001 as BS400,")
		.append("a.TACBB_200000 as BS002,")
		.append("a.TACBB_310101 as BS501,")
		.append("a.TACBB_310201 as BS502,")
		.append("a.TACBB_310902 as BS503,")
		.append("a.TACBB_310903 as BS2015,")
		.append("a.TACBB_310301 as BS504,")
		.append("a.TACBB_4102 as BS2016,")
		.append("a.TACBB_310701 as BS505,")
		.append("a.TACBB_310801 as BS506,")
		.append("a.TACBB_311101 as BS003,")
		.append("a.TACBB_400000 as BS507,")
		.append("a.TACBB_300000 as BS004,")
		.append("a.TACBB_500000 as BS005,")
		.append("b.TACPB_110100 as PL101,")
		.append("b.TACPB_110200 as PL102,")
		.append("b.TACPB_110302 as PL103,")
		.append("b.TACPB_120442 as PL201,")
		.append("c.TACCB_411601 as PL202_5,")
		.append("b.TACPB_120422 as PL202,")
		.append("b.TACPB_130201 as PL203,")
		.append("b.TACPB_130211 as PL203_1,")
		.append("b.TACPB_131102 as PL204,")
		.append("b.TACPB_131201 as PL205,")
		.append("CASE WHEN b.TACPB_11040201 IS NOT NULL THEN b.TACPB_150101 + b.TACPB_140202 + b.TACPB_11040201 ")
		.append("ELSE b.TACPB_150101 + b.TACPB_140202 + b.TACPB_120432 END as PL200,")
		.append("c.TACCB_411501 as PL210,")
		.append("c.TACCB_411601 as PL211,")
		.append("c.TACCB_411801 as PL212,")
		.append("CASE WHEN b.TACPB_11040201 IS NOT NULL THEN b.TACPB_150101 + b.TACPB_140202 + b.TACPB_11040201 + c.TACCB_411501 + c.TACCB_411601+c.TACCB_411801 ")
		.append("ELSE b.TACPB_150101 + b.TACPB_140202 + b.TACPB_120432 + c.TACCB_411501 + c.TACCB_411601+c.TACCB_411801 end as PL220,")
		.append("b.TACPB_120432 as PL301,")
		.append("b.TACPB_11040201 as PL301_1,")
		.append("b.TACPB_11013101 as PL301_3,")
		.append("b.TACPB_120601 as PL301_7,")
		.append("b.TACPB_130101 as PL300,")
		.append("b.TACPB_130501 as PL401,")
		.append("b.TACPB_130702 as PL402,")
		.append("b.TACPB_130712 as PL402_1,")
		.append("b.TACPB_140101 as PL400,")
		.append("b.TACPB_140202 as PL501,")
		.append("b.TACPB_150101 as PL500,")
		.append("b.TACPB_140302 as PL601,")
		.append("b.TACPB_160101 as PL600,")
		.append("c.TACCB_110101 as CF101,")
		.append("c.TACCB_110301 as CF102,")
		.append("c.TACCB_110401 as CF103,")
		.append("c.TACCB_110000 as CF100,")
		.append("c.TACCB_120101 as CF201,")
		.append("c.TACCB_120301 as CF202,")
		.append("c.TACCB_120401 as CF203,")
		.append("c.TACCB_120501 as CF204,")
		.append("c.TACCB_120000 as CF200,")
		.append("c.TACCB_100000 as CF001,")
		.append("c.TACCB_210101 as CF301,")
		.append("c.TACCB_210201 as CF302,")
		.append("c.TACCB_210301 as CF303,")
		.append("c.TACCB_210501 as CF305,")
		.append("c.TACCB_210401 as CF304,")
		.append("c.TACCB_210000 as CF300,")
		.append("c.TACCB_220101 as CF401,")
		.append("c.TACCB_220201 as CF402,")
		.append("c.TACCB_220401 as CF404,")
		.append("c.TACCB_220301 as CF403,")
		.append("c.TACCB_220000 as CF400,")
		.append("c.TACCB_200000 as CF002,")
		.append("c.TACCB_310301 as CF501,")
		.append("c.TACCB_310401 as CF502,")
		.append("c.TACCB_310201 as CF504,")
		.append("c.TACCB_310501 as CF503,")
		.append("c.TACCB_310000 as CF500,")
		.append("c.TACCB_320101 as CF601,")
		.append("c.TACCB_320301 as CF602,")
		.append("c.TACCB_320701 as CF603,")
		.append("c.TACCB_320000 as CF600,")
		.append("c.TACCB_300000 as CF003,")
		.append("c.TACCB_410101 as CF004,")
		.append("c.TACCB_410201 as CF005,")
		.append("c.TACCB_413201 as CF006,")
		.append("c.TACCB_413301 as CF007,")
		.append("c.TACCB_411001 as CF901,")
		.append("c.TACCB_411401 as CF902,")
		.append("c.TACCB_411501 as CF903,")
		.append("c.TACCB_411601 as CF904,")
		.append("c.TACCB_411701 as CF905,")
		.append("c.TACCB_412001 as CF906,")
		.append("c.TACCB_412101 as CF907,")
		.append("c.TACCB_413501 as CF908,")
		.append("c.TACCB_412201 as CF909,")
		.append("c.TACCB_412301 as CF910,")
		.append("c.TACCB_413601 as CF911,")
		.append("c.TACCB_413701 as CF912,")
		.append("c.TACCB_412601 as CF913,")
		.append("c.TACCB_412701 as CF914,")
		.append("c.TACCB_412801 as CF915,")
		.append("c.TACCB_413001 as CF916,")
		.append("c.TACCB_ADD_OPER_NETCASH as CF917,")
		.append("c.TACCB_410501 as CF918,")
		.append("c.TACCB_410801 as CF919,")
		.append("c.TACCB_410802 as CF920,")
		.append("c.TACCB_510101 as CF921,")
		.append("c.TACCB_510201 as CF922,")
		.append("c.TACCB_510301 as CF923,")
		.append("c.TACCB_510401 as CF924,")
		.append("c.TACCB_ADD_NETCASH as CF925");

		StringBuilder sql = new StringBuilder();
		sql.append(" select a.COM_UNI_CODE,a.END_DATE, ").append(selResultsql)
		.append(" from TMP_BOND_FIN_GEN_BALA_TACBB a ")
		.append(" inner join TMP_BOND_FIN_GEN_PROF_TACPB b on b.COM_UNI_CODE=a.COM_UNI_CODE and b.END_DATE=a.END_DATE ")
		.append(" left join TMP_BOND_FIN_GEN_CASH_TACCB c on c.COM_UNI_CODE=a.COM_UNI_CODE and c.END_DATE=a.END_DATE ")
		.append(" order by a.com_uni_code,a.end_date limit ").append(start).append(",").append(length);
	
		return ccxeJdbcTemplate.query(sql.toString(), rowMapper);
	}
	
	public Integer getAllCount() {
		StringBuilder sql = new StringBuilder();
		sql.append(" select count(1) from TMP_BOND_FIN_GEN_BALA_TACBB a ")
		.append(" inner join TMP_BOND_FIN_GEN_PROF_TACPB b on b.COM_UNI_CODE=a.COM_UNI_CODE and b.END_DATE=a.END_DATE ")
		.append(" left join TMP_BOND_FIN_GEN_CASH_TACCB c on c.COM_UNI_CODE=a.COM_UNI_CODE and c.END_DATE=a.END_DATE ");
		return ccxeJdbcTemplate.queryForObject(sql.toString(), Integer.class);
	}

}