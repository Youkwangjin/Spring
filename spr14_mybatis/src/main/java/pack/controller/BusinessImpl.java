package pack.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.SangpumDto;
import pack.model.SangpumInter;

@Service // 가독성 비지니스 로직 BusinessImpl businessImpl = new BusinessImpl();
public class BusinessImpl implements BusinessInter{
	@Autowired
	private SangpumInter sangpumInter;

	@Override
	public void dataShow() {
		List<SangpumDto> list = (ArrayList<SangpumDto>)sangpumInter.selectList();
		
		for(SangpumDto s:list) {
			System.out.println(s.getCode() + " " + s.getSang() + " " + s.getSu() + " " + s.getDan());
		}
		
	}

}
