package cn.xfsoft.dao;

public interface AccountDao {

	void increaseMoney(Integer id, double money);

	void decreaseMoney(Integer id, double money);
}
