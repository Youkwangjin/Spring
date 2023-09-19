package pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.SangpumDto;
import pack.model.SangpumInter;

@Service
public class BusinessImpl implements BusinessInter{
	@Autowired  
	private SangpumInter sangpumInter;  // Autowired 해줌으로써 클래스의 포함관계가 성립
	
	@Override
	public void dataShow() {
		List<SangpumDto> list = (ArrayList<SangpumDto>)sangpumInter.selectList();
		System.out.println("직원자료");
		for(SangpumDto s:list) {
			System.out.println( s.getJikwon_no() + " " +s.getJikwon_name() + " " + s.getBuser_name() + " " + s.getIbsa());	
		}
	}

	@Override
	public void dataShow2() {
		List<SangpumDto> list2 = (ArrayList<SangpumDto>) sangpumInter.selectList2();
		System.out.println("부서별 인원수");
		for (SangpumDto b : list2) {
			System.out.println(b.getBuser_name() + " " + b.getInwon());
		}
	}

	@Override
	public void dataShow3() {
		List<SangpumDto> list3 = (ArrayList<SangpumDto>) sangpumInter.selectList3();
		System.out.println("부서별" + " " + "직원명" + " " + "연봉");
		for (SangpumDto p : list3) {
			System.out.println(p.getBuser_name() + " " + p.getJikwon_name() + " " + p.getJikwon_pay());
		}
	}

}
