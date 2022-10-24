package Survey.yeonjoo;

import java.sql.*;
public class SurveyMain {
    public static void main(String[] args){
        // Done - MySQL workbench  실행 : JDBC - 
        // - User/password와 접속 IP:port(localhost:3306) 접속
        String url = "jdbc:mysql://localhost:3306/survey";
        String user = "root";
        String password = "*khacademy!";
        // - database 지정
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            // query Edit
            Statement statement = connection.createStatement();

            // select statement
            SurveySelect appSelect = new SurveySelect();
            appSelect.SelectFunctiion(statement);

            // insert into
            SurveyInsert appInsert = new SurveyInsert();
            appInsert.InsertFunctioin(statement);

            // update
            // SurveyUpdate appUpdate = new SurveyUpdate();
            // SurveyUpdate.UpdateFunction(statement);

        } catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}