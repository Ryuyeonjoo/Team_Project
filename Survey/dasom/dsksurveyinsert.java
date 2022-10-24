package Survey.dasom;

import java.sql.Statement;

public class dsksurveyinsert {
    public void InsertFunction(Statement statement){
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
            

        statement.execute(query);
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }
    
}
