import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Survey {
    public void SurveyFunction(Statement statement, Statement statement2){
        Scanner sc = new Scanner(System.in);

        String phonenumber = ""; //번호가 8자리가 아니면 while밑부터 다시 하고 싶은데 메인으로 돌아가 처음부터 다시 실행됨
 
        while (true) {
        System.out.println("고객님의 성함과 010을 제외한 휴대폰 번호 뒷자리를 입력해 주세요.");
        System.out.print("성함 ) ");
       
        Scanner scanner = new Scanner(System.in);
        String aaa = sc.next();
       
                System.out.print("휴대폰 번호 8자리 )");
                int num = sc.nextInt();
       
               if((int)(Math.log10(num)+1) == 8) {
               System.out.print("설문을 시작합니다.");
             
            }else{
                System.out.println("다시 입력 바랍니다.");
                return;
            }

        System.out.println("------------------------------------------------------");
        System.out.println("고객님께서 방문하신 KHCAFE 강남점에 관련한 설문 조사입니다.\n"+
        "1번에서부터 5번까지 고객님께서 매장에 대해 경험하신 내용을 바탕으로\n" +
        "설문에 임해주시기 바랍니다.");

        String question = "SELECT * FROM questions_list ORDER BY QUESTIONS";
        ResultSet resultSet;
        String example = "SELECT * FROM example_list";
        ResultSet resultSet2;
        
        try{
            resultSet = statement.executeQuery(question);
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
                int answer = sc.nextInt();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
}




// System.out.println("고객님의 성함과 010을 제외한 휴대폰 번호 뒷자리를 입력해주세요."); //어쩔지 몰라 예비용

//         System.out.print("성함) ");
//         String name = sc.nextLine();
//         System.out.print("휴대폰 번호 8자리) ");
//         String phone = sc.nextLine();
//         System.out.println("------------------------------------------------------");

