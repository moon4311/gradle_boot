
## 평가분류 ##
CREATE TABLE `tb_evaluationtype` (
  `EVAL_TYPE_ID` int NOT NULL COMMENT '분류아이디',
  `EVAL_TYPE_NAME` varchar(45) NOT NULL COMMENT '분류명',
  `COMMENT` varchar(450) DEFAULT NULL,
  PRIMARY KEY (`EVAL_TYPE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='평가분류';

## 평가항목 ##
CREATE TABLE `tb_evaluationitem` (
  `EVAL_ID` int NOT NULL,
  `EVAL_TYPE_ID` int DEFAULT NULL COMMENT '평가분류',
  `EVAL_CODE` varchar(45) DEFAULT NULL,
  `EVAL_NAME` varchar(45) DEFAULT NULL COMMENT '평가항목',
  `SORT_NO` int DEFAULT NULL COMMENT '정렬순서',
  `COMMENT` varchar(200) DEFAULT NULL COMMENT '항목설명',
  `USE_YN` varchar(1) DEFAULT NULL COMMENT '사용여부',
  PRIMARY KEY (`EVAL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='평가항목테이블'