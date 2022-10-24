package Survey;

import java.sql.Statement;

public class SurveyQuestion {
    public void QuestionFunction(Statement statement){
        try {
            // insert
            String query = "INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)"+ 
            "VALUES ('Q1','1.해당 매장을 방문시 매장은 청결 하였습니까?')"; 
            
            String query1 ="INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)" +
            "VALUES ('Q2','2. 주문시 직원은 고객님께 친절 하였습니까? '')";
            
            String query2 ="INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)"+
            "VALUES ('Q3', '3. 주문하신 음료가 나오기까지 시간이 적당하였습니까?')";
            
            String query3 ="INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)"+
            "VALUES ('Q4', '4. 직원이 제조한 음료에 대해 맛은 좋았습니까?')";
            
            String query4 ="INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)"+
            "VALUES ('Q5', '5. 해당 매장을 다음에도 재방문 하실 의향이 있으십니까?')";
            
            String query5 = "INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)"+ 
            "VALUES ('E1', '(1)전혀 아니다')"; 
           
            String query6 = "INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)"+ 
            "VALUES ('E2', '(2) 아니다')"; 
           
            String query7 = "INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)"+ 
            "VALUES ('E3', '(3) 보통이다')"; 
            
            String query8 = "INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)"+ 
            "VALUES ('E4', '(4) 그렇다')"; 
           
            String query9 = "INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)"+ 
            "VALUES ('E5', '(5) 매우 그렇다')"; 


        statement.execute(query);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
    
}