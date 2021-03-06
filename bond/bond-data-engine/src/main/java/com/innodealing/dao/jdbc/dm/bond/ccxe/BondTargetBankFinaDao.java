package com.innodealing.dao.jdbc.dm.bond.ccxe;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.innodealing.dao.jdbc.BaseDao;
import com.innodealing.model.dm.bond.asbrs.BondBankFinaSheet;
import com.innodealing.util.DateUtils;

/**
 * @author kunkun.zhou
 * @date 2016年12月07日
 * @clasename BondBankFinaSheetDao.java
 * @decription TODO
 */
@Component
public class BondTargetBankFinaDao extends BaseDao<BondBankFinaSheet> {
	private RowMapper rowMapper = new BeanPropertyRowMapper(BondBankFinaSheet.class);
	
public BondBankFinaSheet getTargetData(Long comUniCode, Long bondUniCode, Date endDate) {
		
		String selResult = "a.TAFBBY_110101 as BBS101, "
				+ "a.TAFBBY_110901 as BBS102, "
				+ "a.TAFBBY_110201 as BBS103, "
				+ "a.TAFBBY_110401 as BBS104, "
				+ "a.TAFBBY_110501 as BBS105, "
				+ "a.TAFBBY_110701 as BBS106, "
				+ "a.TAFBBY_110801 as BBS107, "
				+ "a.TAFBBY_111701 as BBS108, "
				+ "a.TAFBBY_121601 as BBS110, "
				+ "a.TAFBBY_121701 as BBS111, "
				+ "a.TAFBBY_121117 as BBS112, "				
				+ "a.TAFBBY_124101 as BBS118, "
				+ "a.TAFBBY_122327 as BBS114, "
				+ "a.TAFBBY_122427 as BBS1102, "
				+ "a.TAFBBY_122801 as BBS115, "
				+ "a.TAFBBY_123201 as BBS1103, "
				+ "a.TAFBBY_123701 as BBS116, "
				+ "a.TAFBBY_121901 as BBS113, "
				+ "a.TAFBBY_130000 as BBS117, "
				+ "a.TAFBB_100000 as BBS001, "
				+ "a.TAFBBY_210101 as BBS202, "
				+ "a.TAFBBY_211201 as BBS201, "
				+ "a.TAFBBY_210301 as BBS203, "
				+ "a.TAFBBY_210501 as BBS204, "
				+ "a.TAFBBY_210601 as BBS205, "
				+ "a.TAFBBY_210701 as BBS206, "
				+ "a.TAFBBY_211401 as BBS207, "
				+ "a.TAFBBY_213201 as BBS208, "
				+ "a.TAFBBY_213401 as BBS209, "
				+ "a.TAFBBY_211901 as BBS210, "
				+ "a.TAFBBY_220801 as BBS212, "
				+ "a.TAFBBY_230101 as BBS213, "
				+ "a.TAFBBY_213801 as BBS211, "
				+ "a.TAFBBY_240101 as BBS214, "
				+ "a.TAFBB_210000 as BBS002, "
				+ "a.TAFBBY_310201 as BBS401, "
				+ "a.TAFBBY_310301 as BBS402, "
				+ "a.TAFBBY_310703 as BBS402_1, "
				+ "a.TAFBBY_310401 as BBS403, "
				+ "a.TAFBBY_310701 as BBS405, "
				+ "a.TAFBBY_310601 as BBS404, "
				+ "a.TAFBBY_310801 as BBS408, "
				+ "a.TAFBBY_310101 as BBS409, "
				+ "a.TAFBBY_311201 as BBS406, "
				+ "a.TAFBBY_300000 as BBS003, "
				+ "a.TAFBBY_400000 as BBS004, "
				+ "b.TAFPBY_100000 as BPL100, "
				+ "b.TAFPBY_110101 as BPL101, "
				+ "b.TAFPBY_110111 BPL101_1, "
				+ "b.TAFPBY_110123 as BPL101_2, "
				+ "b.TAFPBY_110301 as BPL102, "
				+ "b.TAFPBY_111511 as BPL102_1, "
				+ "b.TAFPBY_111523 as BPL102_2, "
				+ "b.TAFPBY_110701 as BPL103, "
				+ "b.TAFPBY_110711 as BPL103_1, "
				+ "b.TAFPBY_110801 as BPL104, "
				+ "b.TAFPBY_111101 as BPL105, "
				+ "b.TAFPBY_111201 as BPL106, "
				+ "b.TAFPBY_200000 as BPL200, "
				+ "b.TAFPBF_201903 as BPL201, "
				+ "b.TAFPBF_200903 as BPL202, "
				+ "b.TAFPBF_201703 as BPL203, "
				+ "b.TAFPBF_201803 as BPL204, "
				+ "b.TAFPBY_300000 as BPL300, "
				+ "b.TAFPBY_310101 as BPL301, "
				+ "b.TAFPBY_310203 as BPL302, "
				+ "b.TAFPBY_400000 as BPL400, "
				+ "b.TAFPBY_410203 as BPL401, "
				+ "b.TAFPBY_500000 as BPL500, "
				+ "b.TAFPBY_510201 as BPL501, "
				+ "b.TAFPBY_510101 as BPL502, "
				+ "b.TAFPB_240801 as BPL503, "
				+ "b.TAFPB_240901 as BPL504, "
				+ "b.TAFPBY_510301 as BPL505, "
				+ "b.TAFPB_I_170101 as BPL506, "
				+ "b.TAFPB_170102 as BPL507, "
				+ "b.TAFPB_170103 as BPL508, "
				+ "c.TAFCBY_110001 as BCF101, "
				+ "c.TAFCBY_110007 as BCF102, "
				+ "c.TAFCBY_110008 as BCF103, "
				+ "c.TAFCBY_110009 as BCF107, "
				+ "c.TAFCBY_110401 as BCF108, "
				+ "c.TAFCBY_110000 as BCF100, "
				+ "c.TAFCBY_120001 as BCF204, "
				+ "c.TAFCBY_120045 as BCF205, "
				+ "c.TAFCBY_120020 as BCF206, "
				+ "c.TAFCBY_120002 as BCF207, "
				+ "c.TAFCBY_120301 as BCF208, "
				+ "c.TAFCBY_120401 as BCF209, "
				+ "c.TAFCBY_120501 as BCF210, "
				+ "c.TAFCBY_120000 as BCF200, "
				+ "c.TAFCBY_100000 as BCF001, "
				+ "c.TAFCBY_210101 as BCF301, "
				+ "c.TAFCBY_210201 as BCF302, "
				+ "c.TAFCBY_210301 as BCF303, "
				+ "c.TAFCBY_210501 as BCF304, "
				+ "c.TAFCBY_210401 as BCF305, "
				+ "c.TAFCBY_210000 as BCF300, "
				+ "c.TAFCBY_220201 as BCF401, "
				+ "c.TAFCBY_220101 as BCF402, "
				+ "c.TAFCBY_220401 as BCF403, "
				+ "c.TAFCBY_220301 as BCF404, "
				+ "c.TAFCBY_220000 as BCF400, "
				+ "c.TAFCBY_200000 as BCF002, "
				+ "c.TAFCBY_310301 as BCF501, "
				+ "c.TAFCBY_310111 as BCF502, "
				+ "c.TAFCBY_310201 as BCF503, "
				+ "c.TAFCBY_310501 as BCF504, "
				+ "c.TAFCBY_310000 as BCF500, "
				+ "c.TAFCBY_320101 as BCF601, "
				+ "c.TAFCBY_320301 as BCF602, "
				+ "c.TAFCBY_320801 as BCF603, "
				+ "c.TAFCBY_320701 as BCF604, "
				+ "c.TAFCBY_320000 as BCF600, "
				+ "c.TAFCBY_300000 as BCF003, "
				+ "c.TAFCBY_410101 as BCF701, "
				+ "c.TAFCBY_410201 as BCF004, "
				+ "c.TAFCBY_413201 as BCF801, "
				+ "c.TAFCBY_413301 as BCF005, "
				+ "c.TAFCBY_411001 as BCF901, "
				+ "c.TAFCBY_411401 as BCF902, "
				+ "c.TAFCBY_411501 as BCF903, "
				+ "c.TAFCBY_411601 as BCF904, "
				+ "c.TAFCBY_411701 as BCF905, "
				+ "c.TAFCBY_411801 as BCF906, "
				+ "c.TAFCBY_411901 as BCF907, "
				+ "c.TAFCBY_412001 as BCF908, "
				+ "c.TAFCBY_412101 as BCF909, "
				+ "c.TAFCBY_413501 as BCF910, "
				+ "c.TAFCBY_412201 as BCF911, "
				+ "c.TAFCBY_412301 as BCF912, "
				+ "c.TAFCBY_413601 as BCF913, "
				+ "c.TAFCBY_413701 as BCF914, "
				+ "c.TAFCBY_412601 as BCF915, "
				+ "c.TAFCBY_412701 as BCF916, "
				+ "c.TAFCBY_412801 as BCF917, "
				+ "c.TAFCBY_413001 as BCF918, "
				+ "c.TAFCBY_ADD_OPER_NETCASH as BCF919, "
				+ "c.TAFCBY_410501 as BCF920, "
				+ "c.TAFCBY_410801 as BCF921, "
				+ "c.TAFCBY_410802 as BCF922, "
				+ "c.TAFCBY_510101 as BCF923, "
				+ "c.TAFCBY_510201 as BCF924, "
				+ "c.TAFCBY_510301 as BCF925, "
				+ "c.TAFCBY_510401 as BCF926, "
				+ "c.TAFCBY_ADD_NETCASH as BCF927";
		
		String sql = "select a.COM_UNI_CODE,a.END_DATE,"+selResult
				+ " from D_BOND_FIN_FAL_BALA_TAFBB a "
				+ " inner join D_BOND_FIN_FAL_PROF_TAFPB b on b.COM_UNI_CODE=a.COM_UNI_CODE and b.END_DATE=a.END_DATE and b.ISVALID=a.ISVALID and b.SHEET_MARK_PAR=a.SHEET_MARK_PAR "
				+ " left join D_BOND_FIN_FAL_CASH_TAFCB c on c.COM_UNI_CODE=a.COM_UNI_CODE and c.END_DATE=a.END_DATE and c.ISVALID=a.ISVALID and c.SHEET_MARK_PAR=a.SHEET_MARK_PAR "
				+ " where a.ISVALID='1' and a.SHEET_MARK_PAR='1' and a.COM_UNI_CODE=" + comUniCode + " and a.bond_uni_code=" + bondUniCode + " and a.END_DATE='" + DateUtils.convertDateToString(endDate) + "' limit 1";

		List<BondBankFinaSheet> list = ccxeJdbcTemplate.query(sql.toString(), rowMapper);
		if (null == list || list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
	public List<BondBankFinaSheet> getList(Integer start, Integer length) {
		
		String selResult = "a.TAFBBY_110101 as BBS101, "
				+ "a.TAFBBY_110901 as BBS102, "
				+ "a.TAFBBY_110201 as BBS103, "
				+ "a.TAFBBY_110401 as BBS104, "
				+ "a.TAFBBY_110501 as BBS105, "
				+ "a.TAFBBY_110701 as BBS106, "
				+ "a.TAFBBY_110801 as BBS107, "
				+ "a.TAFBBY_111701 as BBS108, "
				+ "a.TAFBBY_121601 as BBS110, "
				+ "a.TAFBBY_121701 as BBS111, "
				+ "a.TAFBBY_121117 as BBS112, "				
				+ "a.TAFBBY_124101 as BBS118, "
				+ "a.TAFBBY_122327 as BBS114, "
				+ "a.TAFBBY_122427 as BBS1102, "
				+ "a.TAFBBY_122801 as BBS115, "
				+ "a.TAFBBY_123201 as BBS1103, "
				+ "a.TAFBBY_123701 as BBS116, "
				+ "a.TAFBBY_121901 as BBS113, "
				+ "a.TAFBBY_130000 as BBS117, "
				+ "a.TAFBB_100000 as BBS001, "
				+ "a.TAFBBY_210101 as BBS202, "
				+ "a.TAFBBY_211201 as BBS201, "
				+ "a.TAFBBY_210301 as BBS203, "
				+ "a.TAFBBY_210501 as BBS204, "
				+ "a.TAFBBY_210601 as BBS205, "
				+ "a.TAFBBY_210701 as BBS206, "
				+ "a.TAFBBY_211401 as BBS207, "
				+ "a.TAFBBY_213201 as BBS208, "
				+ "a.TAFBBY_213401 as BBS209, "
				+ "a.TAFBBY_211901 as BBS210, "
				+ "a.TAFBBY_220801 as BBS212, "
				+ "a.TAFBBY_230101 as BBS213, "
				+ "a.TAFBBY_213801 as BBS211, "
				+ "a.TAFBBY_240101 as BBS214, "
				+ "a.TAFBB_210000 as BBS002, "
				+ "a.TAFBBY_310201 as BBS401, "
				+ "a.TAFBBY_310301 as BBS402, "
				+ "a.TAFBBY_310703 as BBS402_1, "
				+ "a.TAFBBY_310401 as BBS403, "
				+ "a.TAFBBY_310701 as BBS405, "
				+ "a.TAFBBY_310601 as BBS404, "
				+ "a.TAFBBY_310801 as BBS408, "
				+ "a.TAFBBY_310101 as BBS409, "
				+ "a.TAFBBY_311201 as BBS406, "
				+ "a.TAFBBY_300000 as BBS003, "
				+ "a.TAFBBY_400000 as BBS004, "
				+ "b.TAFPBY_100000 as BPL100, "
				+ "b.TAFPBY_110101 as BPL101, "
				+ "b.TAFPBY_110111 BPL101_1, "
				+ "b.TAFPBY_110123 as BPL101_2, "
				+ "b.TAFPBY_110301 as BPL102, "
				+ "b.TAFPBY_111511 as BPL102_1, "
				+ "b.TAFPBY_111523 as BPL102_2, "
				+ "b.TAFPBY_110701 as BPL103, "
				+ "b.TAFPBY_110711 as BPL103_1, "
				+ "b.TAFPBY_110801 as BPL104, "
				+ "b.TAFPBY_111101 as BPL105, "
				+ "b.TAFPBY_111201 as BPL106, "
				+ "b.TAFPBY_200000 as BPL200, "
				+ "b.TAFPBF_201903 as BPL201, "
				+ "b.TAFPBF_200903 as BPL202, "
				+ "b.TAFPBF_201703 as BPL203, "
				+ "b.TAFPBF_201803 as BPL204, "
				+ "b.TAFPBY_300000 as BPL300, "
				+ "b.TAFPBY_310101 as BPL301, "
				+ "b.TAFPBY_310203 as BPL302, "
				+ "b.TAFPBY_400000 as BPL400, "
				+ "b.TAFPBY_410203 as BPL401, "
				+ "b.TAFPBY_500000 as BPL500, "
				+ "b.TAFPBY_510201 as BPL501, "
				+ "b.TAFPBY_510101 as BPL502, "
				+ "b.TAFPB_240801 as BPL503, "
				+ "b.TAFPB_240901 as BPL504, "
				+ "b.TAFPBY_510301 as BPL505, "
				+ "b.TAFPB_I_170101 as BPL506, "
				+ "b.TAFPB_170102 as BPL507, "
				+ "b.TAFPB_170103 as BPL508, "
				+ "c.TAFCBY_110001 as BCF101, "
				+ "c.TAFCBY_110007 as BCF102, "
				+ "c.TAFCBY_110008 as BCF103, "
				+ "c.TAFCBY_110009 as BCF107, "
				+ "c.TAFCBY_110401 as BCF108, "
				+ "c.TAFCBY_110000 as BCF100, "
				+ "c.TAFCBY_120001 as BCF204, "
				+ "c.TAFCBY_120045 as BCF205, "
				+ "c.TAFCBY_120020 as BCF206, "
				+ "c.TAFCBY_120002 as BCF207, "
				+ "c.TAFCBY_120301 as BCF208, "
				+ "c.TAFCBY_120401 as BCF209, "
				+ "c.TAFCBY_120501 as BCF210, "
				+ "c.TAFCBY_120000 as BCF200, "
				+ "c.TAFCBY_100000 as BCF001, "
				+ "c.TAFCBY_210101 as BCF301, "
				+ "c.TAFCBY_210201 as BCF302, "
				+ "c.TAFCBY_210301 as BCF303, "
				+ "c.TAFCBY_210501 as BCF304, "
				+ "c.TAFCBY_210401 as BCF305, "
				+ "c.TAFCBY_210000 as BCF300, "
				+ "c.TAFCBY_220201 as BCF401, "
				+ "c.TAFCBY_220101 as BCF402, "
				+ "c.TAFCBY_220401 as BCF403, "
				+ "c.TAFCBY_220301 as BCF404, "
				+ "c.TAFCBY_220000 as BCF400, "
				+ "c.TAFCBY_200000 as BCF002, "
				+ "c.TAFCBY_310301 as BCF501, "
				+ "c.TAFCBY_310111 as BCF502, "
				+ "c.TAFCBY_310201 as BCF503, "
				+ "c.TAFCBY_310501 as BCF504, "
				+ "c.TAFCBY_310000 as BCF500, "
				+ "c.TAFCBY_320101 as BCF601, "
				+ "c.TAFCBY_320301 as BCF602, "
				+ "c.TAFCBY_320801 as BCF603, "
				+ "c.TAFCBY_320701 as BCF604, "
				+ "c.TAFCBY_320000 as BCF600, "
				+ "c.TAFCBY_300000 as BCF003, "
				+ "c.TAFCBY_410101 as BCF701, "
				+ "c.TAFCBY_410201 as BCF004, "
				+ "c.TAFCBY_413201 as BCF801, "
				+ "c.TAFCBY_413301 as BCF005, "
				+ "c.TAFCBY_411001 as BCF901, "
				+ "c.TAFCBY_411401 as BCF902, "
				+ "c.TAFCBY_411501 as BCF903, "
				+ "c.TAFCBY_411601 as BCF904, "
				+ "c.TAFCBY_411701 as BCF905, "
				+ "c.TAFCBY_411801 as BCF906, "
				+ "c.TAFCBY_411901 as BCF907, "
				+ "c.TAFCBY_412001 as BCF908, "
				+ "c.TAFCBY_412101 as BCF909, "
				+ "c.TAFCBY_413501 as BCF910, "
				+ "c.TAFCBY_412201 as BCF911, "
				+ "c.TAFCBY_412301 as BCF912, "
				+ "c.TAFCBY_413601 as BCF913, "
				+ "c.TAFCBY_413701 as BCF914, "
				+ "c.TAFCBY_412601 as BCF915, "
				+ "c.TAFCBY_412701 as BCF916, "
				+ "c.TAFCBY_412801 as BCF917, "
				+ "c.TAFCBY_413001 as BCF918, "
				+ "c.TAFCBY_ADD_OPER_NETCASH as BCF919, "
				+ "c.TAFCBY_410501 as BCF920, "
				+ "c.TAFCBY_410801 as BCF921, "
				+ "c.TAFCBY_410802 as BCF922, "
				+ "c.TAFCBY_510101 as BCF923, "
				+ "c.TAFCBY_510201 as BCF924, "
				+ "c.TAFCBY_510301 as BCF925, "
				+ "c.TAFCBY_510401 as BCF926, "
				+ "c.TAFCBY_ADD_NETCASH as BCF927";
		
		String sql = "select a.COM_UNI_CODE,a.END_DATE,"+selResult
				+ " from TMP_BOND_FIN_FAL_BALA_TAFBB a "
				+ " inner join TMP_BOND_FIN_FAL_PROF_TAFPB b on b.COM_UNI_CODE=a.COM_UNI_CODE and b.END_DATE=a.END_DATE "
				+ " left join TMP_BOND_FIN_FAL_CASH_TAFCB c on c.COM_UNI_CODE=a.COM_UNI_CODE and c.END_DATE=a.END_DATE "
				+ " order by a.com_uni_code,a.end_date limit "+start+"," + length;

		return ccxeJdbcTemplate.query(sql, rowMapper);
	}

	public Integer getAllCount() {
		StringBuilder sql = new StringBuilder();
		sql.append(" select count(1) from TMP_BOND_FIN_FAL_BALA_TAFBB a ")
		.append(" inner join TMP_BOND_FIN_FAL_PROF_TAFPB b on b.COM_UNI_CODE=a.COM_UNI_CODE and b.END_DATE=a.END_DATE ")
		.append(" left join TMP_BOND_FIN_FAL_CASH_TAFCB c on c.COM_UNI_CODE=a.COM_UNI_CODE and c.END_DATE=a.END_DATE ");
		return ccxeJdbcTemplate.queryForObject(sql.toString(), Integer.class);
	}
}
