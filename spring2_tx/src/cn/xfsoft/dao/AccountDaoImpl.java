package cn.xfsoft.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void increaseMoney(Integer id, double money) {
		super.getJdbcTemplate().update("update t_account set money=money+? where id = ?",money,id);
	}

	@Override
	public void decreaseMoney(Integer id, double money) {
		super.getJdbcTemplate().update("update t_account set money=money-? where id = ?",money,id);

	}

	
}
