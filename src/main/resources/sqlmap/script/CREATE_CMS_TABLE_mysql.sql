
--------------------------------------------------------
--  파일이 생성됨 - 2020/11/03   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TB_CMSCOMMONCODE
--------------------------------------------------------

  CREATE TABLE `TB_CMSCOMMONCODE` 
   (	`COMCD_ID` VARCHAR(20) COMMENT '공통코드ID' , 
	`COMCD_CODE` VARCHAR(20) COMMENT '공통코드값' , 
	`COMCD_NAME` VARCHAR(255) COMMENT '공통코드명' , 
	`COMCD_PARENT_CODE` VARCHAR(20) COMMENT '공통코드상위코드값' , 
	`COMCD_ORDER` int COMMENT '공통코드순서' , 
	`COMCD_LEVEL` int COMMENT '공통코드레벨' , 
	`ISACTIVE` int DEFAULT 1 COMMENT '활성화여부' , 
	`CREATED` DATE COMMENT '생성일', 
	`CREATED_USER_ID` VARCHAR(20) COMMENT '생성자ID', 
	`MODIFIED` DATE COMMENT '수정일', 
	`MODIFIED_USER_ID` VARCHAR(20) COMMENT '수정자ID', 
	`ISDEL` varchar(1) DEFAULT 0 COMMENT '삭제여부'
   ) 
  ;
 
--------------------------------------------------------
--  DDL for Table TB_CMSADMENUTYPE
--------------------------------------------------------

  CREATE TABLE `TB_CMSADMENUTYPE` 
   (	`MENU_ID` VARCHAR(10 ) COMMENT '메뉴아이디', 
	`TYPE_ID` VARCHAR(20 ) COMMENT '유형코드', 
	`ISLIST` VARCHAR(1 ) COMMENT '목록권한', 
	`ISVIEW` VARCHAR(1 ) COMMENT '상세권한', 
	`ISWRITE` VARCHAR(1 ) COMMENT '쓰기권한', 
	`MAPNG_CREAT_ID` VARCHAR(20 ) COMMENT '작업자아이디'
   )
   ;
 
--------------------------------------------------------
--  DDL for Table TB_CMSADMENUINFO
--------------------------------------------------------

  CREATE TABLE `TB_CMSADMENUINFO` 
   (	`MENU_ID` VARCHAR(10 ) COMMENT '메뉴아이디', 
	`UPPER_MENU_ID` VARCHAR(10 ) COMMENT '부모메뉴아이디', 
	`MENU_DEPTH` int COMMENT '메뉴레벨', 
	`MENU_ODR` int DEFAULT 0 COMMENT '메뉴순번', 
	`MENU_ICON` VARCHAR(10 ) COMMENT '트리아이콘(CSS)', 
	`MENU_NM` VARCHAR(60 ) COMMENT '메뉴명', 
	`MENU_LINK` VARCHAR(100 ) COMMENT '메뉴링크', 
	`ISACTIVE` VARCHAR(1 ) DEFAULT 'Y' COMMENT '활성화유무', 
	`ISDEL` VARCHAR(1 ) DEFAULT 'N' COMMENT '삭제유무', 
	`CANNOTDEL` VARCHAR(1 ) DEFAULT 'N' COMMENT '삭제불가유무', 
	`MENU_DESC` VARCHAR(250 ) COMMENT '메뉴설명', 
	`MENU_NM_ICON` VARCHAR(250 ) COMMENT '메뉴아이콘(CSS)'
   ) 
  ;
 
--------------------------------------------------------
--  DDL for Table TB_CMSIPCONFIG
--------------------------------------------------------

  CREATE TABLE `TB_CMSIPCONFIG` 
   (	`CMS_TYPE` VARCHAR(10 ) COMMENT '사용자/관리자사이트구분', 
	`PERMISSION_YN` VARCHAR(1 ) DEFAULT 0 COMMENT '허용여부', 
	`MBR_ID` VARCHAR(20 ) COMMENT '작성자 고유번호', 
	`CREATED` DATE COMMENT '작성일시', 
	`MODIFIED` DATE COMMENT '수정일시'
   ) ;
--------------------------------------------------------
--  DDL for Table TB_CMSIPCONFIGINFO
--------------------------------------------------------

  CREATE TABLE `TB_CMSIPCONFIGINFO` 
   (	`CMS_TYPE` VARCHAR(10 ) COMMENT '사용자/관리자사이트 구분', 
	`IP_ADDR` VARCHAR(100 ) COMMENT 'IP주소', 
	`IP_BAND` VARCHAR(10 ) COMMENT 'IP대역', 
	`IP_DESC` VARCHAR(250 ) COMMENT 'IP설명', 
	`MBR_ID` VARCHAR(20 ) COMMENT '작성자고유번호', 
	`CREATED` DATE COMMENT '작성일시', 
	`MODIFIED` DATE COMMENT '수정일시', 
	`ISDEL` varchar(1) DEFAULT 0 COMMENT '삭제여부'
   )  ;
 
--------------------------------------------------------
--  DDL for Table TB_CMSMBR
--------------------------------------------------------
  CREATE TABLE `TB_CMSMBR` 
   (	`MBR_ID` VARCHAR(20 ) COMMENT '회원코드', 
	`MBR_LOGIN` VARCHAR(100 ) COMMENT '회원아이디', 
	`MBR_NM` VARCHAR(50 ) COMMENT '회원명', 
	`PASSWD` VARCHAR(128 ) COMMENT '패스워드', 
	`TYPE_ID` VARCHAR(10 ) COMMENT '권한그룹', 
	`POS_NM` VARCHAR(50 ) COMMENT '직급코드', 
	`ORG_NM` VARCHAR(50 ) COMMENT '부서코드', 
	`EMAIL` VARCHAR(50 ) COMMENT '이메일', 
	`TEL` VARCHAR(20 ) COMMENT '전화번호', 
	`CREATED` DATE COMMENT '', 
	`MODIFIED` DATE COMMENT '', 
	`ISDEL` varchar(1) DEFAULT 0 COMMENT '', 
	`PW_MISCNT` int(1) DEFAULT 0 COMMENT '', 
	`EX01` VARCHAR(255 ) COMMENT '', 
	`EX02` VARCHAR(255 ) COMMENT '', 
	`EX03` VARCHAR(255 )
   );
 
--------------------------------------------------------
--  DDL for Table TB_CMSMBRLOG
--------------------------------------------------------

  CREATE TABLE `TB_CMSMBRLOG` 
   (	`MBRLOG_ID` VARCHAR(60 ) COMMENT '', 
	`MBR_ID` VARCHAR(50 ) COMMENT '', 
	`MBRLOG_CONTENT` VARCHAR(255 ) COMMENT '', 
	`MBRLOG_STATUS` varchar(1) DEFAULT 0 COMMENT '', 
	`CREATED` DATE COMMENT '', 
	`MBR_NM` VARCHAR(50 ) COMMENT '', 
	`MBR_LOGIN` VARCHAR(255 ) COMMENT '', 
	`MBR_IP` VARCHAR(100 ) COMMENT '', 
	`ACT_MBR_LOGIN` VARCHAR(60 ) COMMENT '', 
	`MBRLOG_PATH` VARCHAR(50 ) COMMENT '', 
	`MBRLOG_EXT01` VARCHAR(255 )
   ) ;
--------------------------------------------------------
--  DDL for Table TB_CMSMBRSESS
--------------------------------------------------------

  CREATE TABLE `TB_CMSMBRSESS` 
   (	`MBR_ID` VARCHAR(20 ) COMMENT '', 
	`MBR_SESS` VARCHAR(200 ) COMMENT '', 
	`SESS_LOCK` int DEFAULT 0 COMMENT '', 
	`SESS_DATE` DATE
   ) ;
--------------------------------------------------------
--  DDL for Table TB_CMSMBRTYPE
--------------------------------------------------------

  CREATE TABLE `TB_CMSMBRTYPE` 
   (	`TYPE_ID` VARCHAR(20 ) COMMENT '', 
	`TYPE_NM` VARCHAR(50 ) COMMENT '', 
	`TYPE_LV` VARCHAR(2 ) COMMENT '', 
	`CREATED` DATE COMMENT '', 
	`MODIFIED` DATE COMMENT '', 
	`ISDEL` varchar(1) DEFAULT 0
   ) ;
 
;
--------------------------------------------------------
--  DDL for Table TB_LOGINLOG
--------------------------------------------------------

  CREATE TABLE `TB_LOGINLOG` 
   (	`IP_ID` VARCHAR(255 ) COMMENT '', 
	`MBR_ID` VARCHAR(255 ) COMMENT '', 
	`IP_ADDR` VARCHAR(255 ) COMMENT '', 
	`CREATED` DATE
   ) 
   ;
 
--------------------------------------------------------
--  DDL for Table TB_CMSVISITLOG
--------------------------------------------------------

  CREATE TABLE `TB_CMSVISITLOG` 
   (	`SEQ_NO` bigint COMMENT '', 
	`SITE_ID` VARCHAR(100 ) COMMENT '', 
	`PAGE_ID` VARCHAR(100 ) COMMENT '', 
	`PAGE_NM` VARCHAR(100 ) COMMENT '', 
	`WHEN_DATETIME` DATE COMMENT '', 
	`WHEN_DATE` VARCHAR(8 ) COMMENT '', 
	`IPADDR` VARCHAR(50 )
   ) ;
 