package two;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 절대 원본 데이터를 변경하지 않는다
		String passwordOriginStr = "qwer1234"; //기준
		String passwordChangeStr = "";
		
		//비밀번호를 숨기시오
//		ex: 출력형태(글자수만큼*이출력되게한다)
//		
		
		
			
			int length = passwordOriginStr.length();
//			passwordChangeStr = ;
			for (int i = 0; i < length; i++) {	
				passwordChangeStr = passwordChangeStr + "*";
			}
			
		
		// --------    출력 결과는 건드리지 않는다    -----------
		System.out.println(passwordOriginStr);
		System.out.println(passwordChangeStr);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
