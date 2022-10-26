import java.sql.*;
import java.util.Scanner;

public class SurveyMain {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            // Done - MySQL workbench  실행 : JDBC 
            // - User/password와 접속 IP:port(localhost:3306) 접속
            String url = "jdbc:mysql://localhost:3306/survey";
            String user = "root";
            String password = "*khacademy!";
            // - database 지정
            try{
                Connection connection = DriverManager.getConnection(url, user, password);
                //query Edit
                Statement statement = connection.createStatement();
                Statement statement2 = connection.createStatement();
                
    
                while(true){             
                    System.out.println("P.설문시작 | S.통계 | Q.종료"); //설문시작,통계,종료
                    String choice = sc.nextLine();
                    
                    if(choice.equals("P") ){
                        Survey question = new Survey();
                        question.SurveyFunction(statement,statement2);
                    } else if(choice.equals("S")){
                        SurveyTotal total = new SurveyTotal();
                        total.TotalFunction(statement);
                    } else if(choice.equals("Q")){
                        System.out.print("소중한 시간을 내어 설문에 참여해 주셔서 감사합니다." +
                        "앞으로도 고객님께서 더욱 만족하실 수 있도록 노력하는 CAFE가 되겠습니다." +
                        "감사합니다.");
                        break;
                    } else {
                        System.out.println("다시 입력해주세요.");
                    }
                
                }
            
        } catch (SQLException exception){
            exception.printStackTrace();
        }
        sc.close();
    }
}