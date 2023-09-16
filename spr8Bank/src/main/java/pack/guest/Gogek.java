package pack.guest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import pack.bank.Bank;
import pack.bank.HanaBank;
import pack.bank.ShinhanBank;

@Service  // 참조변수를 안적어주면 기본값으로 gogek이 들어간다. 
@ComponentScan("pack.bank")
@Scope("prototype")
public class Gogek {
	private Bank bank;
	
	@Autowired 
	// 클래스의 포함 관계 
	private ShinhanBank shinhanBank;
	
	@Resource(name="hana")
	private HanaBank hanaBank;
	
	public void selectBank(String sel) {
		// sel값을 비교 
		if(sel.equals("신한")) {
			bank = shinhanBank;
		} else if(sel.equals("하나")) {
			bank = hanaBank;
		}
	}
	
	public void playInputMoney(int money) {
		// 고객이 은행을 선택하여 들어온다
		bank.inputMoney(money);
	}
	
	public void playOutputMoney(int money) {
		// 고객이 은행을 선택하여 들어온다
		bank.outputMoney(money);
	}
	
	private String msg;
	
	@PostConstruct // 생성자 이후에 자동 수행 
	public void init() {
		msg = "계좌 잔고 : ";
	}
	
	@PreDestroy // 마무리 작업 
	public void end() {
		if(shinhanBank != null) shinhanBank = null;
		if(hanaBank != null) hanaBank = null;
	}
	
	public void showMoney() {
		//System.out.println("고객님의 계좌 잔고는 : " + bank.getMoney()); 
		System.out.println(msg + bank.getMoney());
		
	}
}






