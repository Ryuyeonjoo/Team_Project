package Survey;

import java.sql.Statement;
import java.util.Scanner;



public class Survey {
    public void SurveyFunction(Statement statement){
        Scanner sc = new Scanner(System.in);

        System.out.print("고객님의 성함과 010을 제외한 휴대폰 번호 뒷자리를 입력해주세요.");

        System.out.print("성함) ");
        String name = sc.nextLine();
        System.out.print("휴대폰 번호 8자리) ");
        String phone = sc.nextLine();
    }
    
}
