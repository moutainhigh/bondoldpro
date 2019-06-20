DROP TABLE IF EXISTS `t_bond_com_ext_saas`;
CREATE TABLE IF NOT EXISTS `t_bond_com_ext_saas` (
  `com_uni_code` BIGINT(20) NOT NULL,
  `com_chi_name` VARCHAR(100) NOT NULL,
  `indu_uni_code` BIGINT(20) NOT NULL,
  `indu_uni_name` VARCHAR(100) NOT NULL,
  `org_id` INT(11) NOT NULL,
  `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=INNODB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;