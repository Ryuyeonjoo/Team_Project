import java.sql.*;
import java.util.Scanner;

public class SurveyMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Done - MySQL workbench  실행 : JDBC - 
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/survey";
        String user = "root";
        String password = "*khacademy!";
        // - database 지정
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();


            System.out.print("P.설문시작 | S.통계 | Q.종료");
               String flag = sc.next();
            

               while(!flag.equals('Q')){             
                if(flag.equals('P') ){
                    SurveyQuestion question = new SurveyQuestion();
                    question.QuestionFunction(statement);
               
                } else if(flag.equals('S')){
                    SurveyTotal total = new SurveyTotal();
                    total.TotalFunction(statement);
                
                } else{
                    System.out.print("소중한 시간을 내어 설문에 참여해 주셔서 감사합니다." +
                    "앞으로도 고객님께서 더욱 만족하실 수 있도록 노력하는 KHCAFE가 되겠습니다." +
                    "감사합니다.");
                    break;
                }
                            }
            
        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}