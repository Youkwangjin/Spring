package pack;

import org.springframework.stereotype.Service;

@Service // bean을 생성 (XML파일에 스캔해줘야 한다.)
public class LogicImpl implements LogicInter{

	@Override
	public void startProcess() {
		System.out.println("검증이 되었으므로 핵심 로직 수행");		
	}
}
