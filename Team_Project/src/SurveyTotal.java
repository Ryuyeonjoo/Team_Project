import java.sql.*;
import java.util.Scanner;

public class SurveyTotal {
    public void TotalFunction(Connection connection){
        Scanner sc = new Scanner(System.in);
        Statement statement3;
        ResultSet userRs;
        Statement statement2;
        ResultSet elRs;
        try{                
            statement2 = connection.createStatement();
            statement3 = connection.createStatement();
            while(true){  
                System.out.println("1. 설문자별 답변 결과  | 2. 질문별 총 답변수 ");
                String choice = sc.nextLine();
                //설문자별 답변 결과 선택 시           
                if(choice.equals("1") ) {
                    System.out.println("선택) 1. 설문자별 답변 결과\n이름\t질문(1)\t질문(2)\t질문(3)\t질문(4)\t질문(5)");
                    String userQuery = "SELECT * FROM USERS_LIST";
                    userRs = statement3.executeQuery(userQuery);
                    while(userRs.next()){
                        String temp = userRs.getString(1);
                        temp = temp.replaceAll("[^\\d]", "");
                        int user_id = Integer.parseInt(temp);
                        String name = userRs.getString(3);
                        String pr = name + "\t\t";
                            String strQuery = "SELECT EXAMPLE_UID FROM survey where USERS_UID = 'U"+user_id+"'";
                            elRs = statement2.executeQuery(strQuery);
                            while(elRs.next()){
                                String elTemp = elRs.getString(1);
                                elTemp = elTemp.replaceAll("[^\\d]", "");
                                int el = Integer.parseInt(elTemp);
                                pr = pr + el + "\t";
                            }            
                        System.out.println(pr);
                    }
                    break;
                } else if(choice.equals("2")){ //질문별 총 답변 수 선택 시
                    System.out.println("선택) 2. 질문별 총 답변수\n구분\t전혀 아니다\t아니다\t\t보통이다\t그렇다\t\t매우 그렇다\t");
                    for (int i = 1 ; i <= 5; i++ ) {
                        String pr = "질문("+i+")\t\t";
                        for (int j = 1; j <= 5; j++) {
                            String q = "SELECT COUNT(QUESTIONS_UID) FROM survey where EXAMPLE_UID = 'E"+j+"'AND QUESTIONS_UID = 'Q"+i+"'";
                            ResultSet rs = statement3.executeQuery(q);
                            if(rs.next()){
                                pr = pr + rs.getInt(1) + "\t\t";
                            } 
                        }
                        System.out.println(pr);
                    }
                    break;
                }
                else{
                    System.out.println("다시 입력해주세요.");
                }
            }
            
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        // sc.close();
    }
}


 

