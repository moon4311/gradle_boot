
## 평가자 ##
CREATE TABLE `tb_member` (
  `mbr_id` int NOT NULL,
  `mbr_name` varchar(45) NOT NULL,
  `mbr_pw` varchar(100) DEFAULT NULL COMMENT '비밀번호',
  `mbr_tel` varchar(45) DEFAULT NULL COMMENT '연락처',
  `mbr_mail` varchar(45) DEFAULT NULL COMMENT '이메일',
  `mbr_nicname` varchar(45) DEFAULT NULL,
  `mbr_cnt` int DEFAULT NULL COMMENT '평가받은 수',
  PRIMARY KEY (`mbr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='사람정보';

## 평가 ##
CREATE TABLE `tb_member_evaluation` (
  `SEQ` int NOT NULL,
  `MBR_ID` int DEFAULT NULL COMMENT '사용자',
  `EVAL_ID` int DEFAULT NULL COMMENT '평가항목',
  `SCORE` int DEFAULT NULL COMMENT '점수',
  `CREATE_ID` varchar(45) DEFAULT NULL,
  `CREATE_DATE` date DEFAULT NULL,
  `UPDATE_ID` varchar(45) DEFAULT NULL,
  `UPDATE_DATE` date DEFAULT NULL,
  PRIMARY KEY (`SEQ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;