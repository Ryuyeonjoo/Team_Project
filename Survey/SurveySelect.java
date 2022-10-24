package Survey;

import java.sql.*;
import java.util.Scanner;

public class SurveySelect {
    public void SelectFunction(Statement statement){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        String query = "SELECT * FROM users_list ";
        ResultSet resultSet;
        try{
            resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                String USER_UID = resultSet.getString("USERS_UID");
                System.out.println("성함 : " + USER_UID);
                System.out.println("휴대폰 번호 : " + resultSet.getString("PHONE"));
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
