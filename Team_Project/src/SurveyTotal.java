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
    
 
//  public void answer(Statement statement){
//     try{
//         String question = "SELECT * FROM questions_list ORDER BY QUESTIONS";
//         ResultSet resultSet;
//         String example = "SELECT * FROM example_list ORDER BY EXAMPLE";
//         ResultSet resultSet2;
       
       
//         resultSet = statement.executeQuery(question);
//         resultSet2 = statement2.executeQuery(example);
 
//         System.out.println("Q(1) Q(2) Q(3) Q(4) Q(5)");
//         System.out.println("설문자 )");

// }catch(SQLException e){
//     e.printStackTrace();
// }    

//     }

// }
