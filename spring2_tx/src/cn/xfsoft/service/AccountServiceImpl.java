package cn.xfsoft.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import cn.xfsoft.dao.AccountDao;

@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = true)
public class AccountServiceImpl implements AccountService {
	private AccountDao ad;

	// private TransactionTemplate tt;
	@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, readOnly = false)

	@Override
	public void transfer(Integer form, Integer to, double money) {

		ad.decreaseMoney(form, money);
		// int i = 1/0;

		ad.increaseMoney(to, money);

	}

	// public void transfer(final Integer form, final Integer to, final double
	// money) {
	//
	// tt.execute(new TransactionCallbackWithoutResult(){
	//
	// @Override
	// protected void doInTransactionWithoutResult(TransactionStatus arg0) {
	//
	// ad.decreaseMoney(form, money);
	// //int i = 1/0;
	//
	// ad.increaseMoney(to, money);
	// }
	// });
	//
	// }
	// public void setTt(TransactionTemplate tt) {
	// this.tt = tt;
	// }

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

}
