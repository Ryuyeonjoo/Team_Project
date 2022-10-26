import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SurveyTotal {
    public void TotalFunction(Statement statement){
 Scanner sc = new Scanner(System.in);
 String answer;
 
 while(true){
    System.out.println("1.설문자별 답변 결과 | 2. 질문별 총 답변수");
         answer = sc.nextLine();
        if(answer.equals("1") ){
            SurveyTotal total = new SurveyTotal();
            total.TotalFunction(statement);
          } else if(answer.equals("2")){
            SurveyTotal total = new SurveyTotal();
            total.TotalFunction(statement);
            break;
        } else {
            System.out.println("다시 입력해주세요.");
        }
    }
}
}
    
 

