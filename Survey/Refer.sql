INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)
VALUES ('Q1', "1. 해당 매장을 방문시 매장은 청결 하였습니까?");

INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)
VALUES ('Q2', "2. 주문시 직원은 고객님께 친절 하였습니까? ");

INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)
VALUES ('Q3', "3. 주문하신 음료가 나오기까지 시간이 적당하였습니까?");

INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)
VALUES ('Q4', "4. 직원이 제조한 음료에 대해 맛은 좋았습니까?");

INSERT INTO questions_list (QUESTIONS_UID, QUESTIONS)
VALUES ('Q5', "5. 해당 매장을 다음에도 재방문 하실 의향이 있으십니까?");

SELECT *
FROM questions_list;

INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)
VALUES ('E1', "(1)전혀 아니다"); 

INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)
VALUES ('E2', "(2) 아니다");

INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)
VALUES ('E3', "(3) 보통이다");

INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)
VALUES ('E4', "(4) 그렇다");

INSERT INTO example_list (EXAMPLE_UID, EXAMPLE)
VALUES ('E5', "(5) 매우 그렇다");

SELECT *
FROM example_list;

SELECT questions_list.QUESTIONS, example_list.EXAMPLE
FROM questions_list, example_list
ORDER BY questions_list.QUESTIONS;