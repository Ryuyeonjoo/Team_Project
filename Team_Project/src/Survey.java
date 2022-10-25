import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;




public class Survey {
    public void SurveyFunction(Statement statement){
        Scanner sc = new Scanner(System.in);

        System.out.println("고객님의 성함과 010을 제외한 휴대폰 번호 뒷자리를 입력해주세요.");

        System.out.print("성함) ");
        String name = sc.nextLine();
        System.out.print("휴대폰 번호 8자리) ");
        String phone = sc.nextLine();
        System.out.println("------------------------------------------------------");
        System.out.println("고객님께서 방문하신 KHCAFE 강남점에 관련한 설문 조사입니다.\n"+
        "1번에서부터 5번까지 고객님께서 매장에 대해 경험하신 내용을 바탕으로\n" +
        "설문에 임해주시기 바랍니다.");

        String query = "SELECT answers.QUESTIONS_UID, answers.EXAMPLE_UID"
        + "FROM (answers inner JOIN questions_list ON answers.QUESTIONS_UID = questions_list.QUESTIONS_UID)"
        + "INNER JOIN example_list ON answers.EXAMPLE_UID = example_list.EXAMPLE_UID";
        ResultSet resultSet;

        
        try{
            resultSet = statement.executeQuery(query);

            //문항 출력
            while(resultSet.next()){

                System.out.println(resultSet.getString("QUESTIONS_UID"));         
             
                System.out.println("");
                System.out.print("답변 : ");
                int answer = sc.nextInt();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
 