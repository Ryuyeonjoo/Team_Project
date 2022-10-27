import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Survey {
    public void SurveyFunction(Statement statement, Statement statement2){
        Scanner sc = new Scanner(System.in);
        Users usr = new Users();
        System.out.println("고객님의 성함과 010을 제외한 휴대폰 번호 뒷자리를 입력해주세요.");


        while(true) { //고객의 인적사항을 입력

            System.out.print("성함) ");
            String name = sc.nextLine();
            if (!name.matches(".*[0-9].*")) {
                usr.name = name;
                break;
            }
            System.out.println("문자만 입력해주세요");
         }
         while(true) {
            System.out.print("휴대폰 번호 (8자리)) ");

            String phone = sc.nextLine();
            if (phone.matches("([0-9]{4})-?([0-9]{4})")) {
                usr.number = phone;
               break;
            }
            System.out.println("8자리를 입력해주세요");
         }
        
        System.out.println("------------------------------------------------------");
        System.out.println("고객님께서 방문하신 KHCAFE에 관련한 설문 조사입니다.\n"+
        "1번에서부터 5번까지 고객님께서 매장에 대해 경험하신 내용을 바탕으로\n" +
        "설문에 임해주시기 바랍니다.\n");
        

        String question = "SELECT * FROM questions_list ORDER BY QUESTIONS";
        ResultSet resultSet;
        String example = "SELECT * FROM example_list ORDER BY EXAMPLE";
        ResultSet resultSet2;

        
        try{
            resultSet = statement.executeQuery(question);
            int idx = 0;
            //문항 출력
            while(resultSet.next()){               

            resultSet2 = statement2.executeQuery(example);
                System.out.println(resultSet.getString("QUESTIONS"));   
                    while(resultSet2.next()){
                    System.out.print(resultSet2.getString("EXAMPLE"));    
                    System.out.print(" ");
                    
                }
                
                System.out.println("");
                System.out.print("답변 : ");

                int answer = 0;
                while (true){
                    answer = sc.nextInt();
                   if(answer <= 5 && answer >= 1) {
                        usr.ans[idx] = answer;
                        idx ++;
                        break;
                   } 
                   System.out.println( "1부터 5까지의 답만 입력해주세요.");
                   }
            }

            resultSet = statement.executeQuery("SELECT COUNT(*) FROM USERS_LIST");
            int cnt = 0;
            if(resultSet.next()){
                cnt = resultSet.getInt(1) + 1;
            }
            String insertQ = "INSERT INTO USERS_LIST VALUES('U"+cnt+"','"+usr.number+"','"+usr.name+"')";
            statement.executeUpdate(insertQ);
            for (int i = 1; i <= 5; i++){
                statement.executeUpdate("INSERT INTO SURVEY VALUES('U"+cnt+"','Q"+i+"','E"+usr.ans[i-1]+"')");
            }

        } catch(SQLException e){
            e.printStackTrace();
        }
    }   
}