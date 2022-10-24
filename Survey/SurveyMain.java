package Survey;

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


            while(true){             
                System.out.print("P.설문시작 | S.통계 | Q.종료");
                String choice = sc.next();
                if(choice.equals('P') ){
                    SurveyQuestion question = new SurveyQuestion();
                    question.QuestionFunction(statement);
                } else if(choice.equals('S')){
                    SurveyTotal total = new SurveyTotal();
                    total.TotalFunction(statement);
                } else if(choice.equals('Q')){
                    System.out.print("소중한 시간을 내어 설문에 참여해 주셔서 감사합니다." +
                    "앞으로도 고객님께서 더욱 만족하실 수 있도록 노력하는 KHCAFE가 되겠습니다." +
                    "감사합니다.");
                    break;
                } else {
                    System.out.print("잘못된 입력입니다. 다시 입력해주세요.");
                }
                

            }
            
        } catch (SQLException exception){
            exception.printStackTrace();
        }
        sc.close();
    }
}