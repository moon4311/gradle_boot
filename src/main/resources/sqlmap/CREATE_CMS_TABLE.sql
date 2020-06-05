--------------------------------------------------------
--  파일이 생성됨 - 일요일-3월-29-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TB_CMSCOMMONCODE
--------------------------------------------------------

  CREATE TABLE "TB_CMSCOMMONCODE" 
   (	"COMCD_ID" VARCHAR2(20 BYTE), 
	"COMCD_CODE" VARCHAR2(20 BYTE), 
	"COMCD_NAME" VARCHAR2(255 BYTE), 
	"COMCD_PARENT_CODE" VARCHAR2(20 BYTE), 
	"COMCD_ORDER" NUMBER(5,0), 
	"COMCD_LEVEL" NUMBER(5,0), 
	"ISACTIVE" NUMBER(1,0) DEFAULT 1, 
	"CREATED" DATE, 
	"CREATED_USER_ID" VARCHAR2(20 BYTE), 
	"MODIFIED" DATE, 
	"MODIFIED_USER_ID" VARCHAR2(20 BYTE), 
	"ISDEL" NUMBER(1,0) DEFAULT 0
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  ;
 

   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."COMCD_ID" IS '공통코드ID';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."COMCD_CODE" IS '공통코드값';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."COMCD_NAME" IS '공통코드명';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."COMCD_PARENT_CODE" IS '공통코드상위코드값';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."COMCD_ORDER" IS '공통코드순서';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."COMCD_LEVEL" IS '공통코드레벨';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."ISACTIVE" IS '활성화여부';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."CREATED" IS '생성일';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."CREATED_USER_ID" IS '생성자ID';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."MODIFIED" IS '수정일';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."MODIFIED_USER_ID" IS '수정자ID';
 
   COMMENT ON COLUMN "TB_CMSCOMMONCODE"."ISDEL" IS '삭제여부';
 
   COMMENT ON TABLE "TB_CMSCOMMONCODE"  IS '공통코드';
--------------------------------------------------------
--  DDL for Table TB_CMSADMENUTYPE
--------------------------------------------------------

  CREATE TABLE "TB_CMSADMENUTYPE" 
   (	"MENU_ID" VARCHAR2(10 BYTE), 
	"TYPE_ID" VARCHAR2(20 BYTE), 
	"ISLIST" VARCHAR2(1 BYTE), 
	"ISVIEW" VARCHAR2(1 BYTE), 
	"ISWRITE" VARCHAR2(1 BYTE), 
	"MAPNG_CREAT_ID" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_CMSADMENUTYPE"."MENU_ID" IS '메뉴아이디';
 
   COMMENT ON COLUMN "TB_CMSADMENUTYPE"."TYPE_ID" IS '유형코드';
 
   COMMENT ON COLUMN "TB_CMSADMENUTYPE"."ISLIST" IS '목록권한';
 
   COMMENT ON COLUMN "TB_CMSADMENUTYPE"."ISVIEW" IS '상세권한';
 
   COMMENT ON COLUMN "TB_CMSADMENUTYPE"."ISWRITE" IS '쓰기권한';
 
   COMMENT ON COLUMN "TB_CMSADMENUTYPE"."MAPNG_CREAT_ID" IS '작업자아이디';
 
   COMMENT ON TABLE "TB_CMSADMENUTYPE"  IS '관리자타입별메뉴관리';
--------------------------------------------------------
--  DDL for Table TB_CMSADMENUINFO
--------------------------------------------------------

  CREATE TABLE "TB_CMSADMENUINFO" 
   (	"MENU_ID" VARCHAR2(10 BYTE), 
	"UPPER_MENU_ID" VARCHAR2(10 BYTE), 
	"MENU_DEPTH" NUMBER(5,0), 
	"MENU_ODR" NUMBER(5,0) DEFAULT 0, 
	"MENU_ICON" VARCHAR2(10 BYTE), 
	"MENU_NM" VARCHAR2(60 BYTE), 
	"MENU_LINK" VARCHAR2(100 BYTE), 
	"ISACTIVE" VARCHAR2(1 BYTE) DEFAULT 'Y', 
	"ISDEL" VARCHAR2(1 BYTE) DEFAULT 'N', 
	"CANNOTDEL" VARCHAR2(1 BYTE) DEFAULT 'N', 
	"MENU_DESC" VARCHAR2(250 BYTE), 
	"MENU_NM_ICON" VARCHAR2(250 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  ;
 

   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_ID" IS '메뉴아이디';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."UPPER_MENU_ID" IS '부모메뉴아이디';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_DEPTH" IS '메뉴레벨';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_ODR" IS '메뉴순번';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_ICON" IS '트리아이콘(CSS)';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_NM" IS '메뉴명';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_LINK" IS '메뉴링크';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."ISACTIVE" IS '활성화유무';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."ISDEL" IS '삭제유무';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."CANNOTDEL" IS '삭제불가유무';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_DESC" IS '메뉴설명';
 
   COMMENT ON COLUMN "TB_CMSADMENUINFO"."MENU_NM_ICON" IS '메뉴아이콘(CSS)';
 
   COMMENT ON TABLE "TB_CMSADMENUINFO"  IS '관리자메뉴관리';
--------------------------------------------------------
--  DDL for Table TB_CMSIPCONFIG
--------------------------------------------------------

  CREATE TABLE "TB_CMSIPCONFIG" 
   (	"CMS_TYPE" VARCHAR2(10 BYTE), 
	"PERMISSION_YN" VARCHAR2(1 BYTE) DEFAULT 0, 
	"MBR_ID" VARCHAR2(20 BYTE), 
	"CREATED" DATE, 
	"MODIFIED" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  ;
 

   COMMENT ON COLUMN "TB_CMSIPCONFIG"."CMS_TYPE" IS '사용자/관리자사이트구분';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIG"."PERMISSION_YN" IS '허용여부';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIG"."MBR_ID" IS '작성자 고유번호';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIG"."CREATED" IS '작성일시';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIG"."MODIFIED" IS '수정일시';
 
   COMMENT ON TABLE "TB_CMSIPCONFIG"  IS 'IP접속제한설정';
--------------------------------------------------------
--  DDL for Table TB_CMSIPCONFIGINFO
--------------------------------------------------------

  CREATE TABLE "TB_CMSIPCONFIGINFO" 
   (	"CMS_TYPE" VARCHAR2(10 BYTE), 
	"IP_ADDR" VARCHAR2(100 BYTE), 
	"IP_BAND" VARCHAR2(10 BYTE), 
	"IP_DESC" VARCHAR2(250 BYTE), 
	"MBR_ID" VARCHAR2(20 BYTE), 
	"CREATED" DATE, 
	"MODIFIED" DATE, 
	"ISDEL" NUMBER(1,0) DEFAULT 0
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  ;
 

   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."CMS_TYPE" IS '사용자/관리자사이트 구분';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."IP_ADDR" IS 'IP주소';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."IP_BAND" IS 'IP대역';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."IP_DESC" IS 'IP설명';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."MBR_ID" IS '작성자고유번호';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."CREATED" IS '작성일시';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."MODIFIED" IS '수정일시';
 
   COMMENT ON COLUMN "TB_CMSIPCONFIGINFO"."ISDEL" IS '삭제여부';
 
   COMMENT ON TABLE "TB_CMSIPCONFIGINFO"  IS 'IP접속관리목록';
--------------------------------------------------------
--  DDL for Table TB_CMSMBR
--------------------------------------------------------

  CREATE TABLE "TB_CMSMBR" 
   (	"MBR_ID" VARCHAR2(20 BYTE), 
	"MBR_LOGIN" VARCHAR2(100 BYTE), 
	"MBR_NM" VARCHAR2(50 BYTE), 
	"PASSWD" VARCHAR2(128 BYTE), 
	"TYPE_ID" VARCHAR2(10 BYTE), 
	"POS_NM" VARCHAR2(50 BYTE), 
	"ORG_NM" VARCHAR2(50 BYTE), 
	"EMAIL" VARCHAR2(50 BYTE), 
	"TEL" VARCHAR2(20 BYTE), 
	"CREATED" DATE, 
	"MODIFIED" DATE, 
	"ISDEL" NUMBER(1,0) DEFAULT 0, 
	"PW_MISCNT" NUMBER(1,0) DEFAULT 0, 
	"EX01" VARCHAR2(255 BYTE), 
	"EX02" VARCHAR2(255 BYTE), 
	"EX03" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_CMSMBR"."MBR_ID" IS '회원코드';
 
   COMMENT ON COLUMN "TB_CMSMBR"."MBR_LOGIN" IS '회원아이디';
 
   COMMENT ON COLUMN "TB_CMSMBR"."MBR_NM" IS '회원명';
 
   COMMENT ON COLUMN "TB_CMSMBR"."PASSWD" IS '패스워드';
 
   COMMENT ON COLUMN "TB_CMSMBR"."TYPE_ID" IS '권한그룹';
 
   COMMENT ON COLUMN "TB_CMSMBR"."POS_NM" IS '직급코드';
 
   COMMENT ON COLUMN "TB_CMSMBR"."ORG_NM" IS '부서코드';
 
   COMMENT ON COLUMN "TB_CMSMBR"."EMAIL" IS '이메일';
 
   COMMENT ON COLUMN "TB_CMSMBR"."TEL" IS '전화번호';
 
   COMMENT ON TABLE "TB_CMSMBR"  IS '회원테이블';
--------------------------------------------------------
--  DDL for Table TB_CMSMBRLOG
--------------------------------------------------------

  CREATE TABLE "TB_CMSMBRLOG" 
   (	"MBRLOG_ID" VARCHAR2(60 BYTE), 
	"MBR_ID" VARCHAR2(50 BYTE), 
	"MBRLOG_CONTENT" VARCHAR2(255 BYTE), 
	"MBRLOG_STATUS" NUMBER(1,0) DEFAULT 0, 
	"CREATED" DATE, 
	"MBR_NM" VARCHAR2(50 BYTE), 
	"MBR_LOGIN" VARCHAR2(255 BYTE), 
	"MBR_IP" VARCHAR2(100 BYTE), 
	"ACT_MBR_LOGIN" VARCHAR2(60 BYTE), 
	"MBRLOG_PATH" VARCHAR2(50 BYTE), 
	"MBRLOG_EXT01" VARCHAR2(255 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBRLOG_ID" IS '로그ID';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBR_ID" IS '회원ID';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBRLOG_CONTENT" IS '로그내용';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBRLOG_STATUS" IS '로그상태';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."CREATED" IS '생성일';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBR_NM" IS '회원명';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBR_LOGIN" IS '로그인ID';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBR_IP" IS '로그인IP';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."ACT_MBR_LOGIN" IS '로그인한이름';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBRLOG_PATH" IS '로그인경로';
 
   COMMENT ON COLUMN "TB_CMSMBRLOG"."MBRLOG_EXT01" IS '회원유형';
 
   COMMENT ON TABLE "TB_CMSMBRLOG"  IS '회원로그';
--------------------------------------------------------
--  DDL for Table TB_CMSMBRSESS
--------------------------------------------------------

  CREATE TABLE "TB_CMSMBRSESS" 
   (	"MBR_ID" VARCHAR2(20 BYTE), 
	"MBR_SESS" VARCHAR2(200 BYTE), 
	"SESS_LOCK" NUMBER(10,0) DEFAULT 0, 
	"SESS_DATE" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_CMSMBRSESS"."MBR_ID" IS '회원ID';
 
   COMMENT ON COLUMN "TB_CMSMBRSESS"."MBR_SESS" IS '세션';
 
   COMMENT ON COLUMN "TB_CMSMBRSESS"."SESS_LOCK" IS '세션락';
 
   COMMENT ON COLUMN "TB_CMSMBRSESS"."SESS_DATE" IS '세션생성시간';
 
   COMMENT ON TABLE "TB_CMSMBRSESS"  IS '회원세션';
--------------------------------------------------------
--  DDL for Table TB_CMSMBRTYPE
--------------------------------------------------------

  CREATE TABLE "TB_CMSMBRTYPE" 
   (	"TYPE_ID" VARCHAR2(20 BYTE), 
	"TYPE_NM" VARCHAR2(50 BYTE), 
	"TYPE_LV" VARCHAR2(2 BYTE), 
	"CREATED" DATE, 
	"MODIFIED" DATE, 
	"ISDEL" NUMBER(1,0) DEFAULT 0
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_CMSMBRTYPE"."TYPE_ID" IS '유형코드';
 
   COMMENT ON COLUMN "TB_CMSMBRTYPE"."TYPE_NM" IS '유형명';
 
   COMMENT ON COLUMN "TB_CMSMBRTYPE"."TYPE_LV" IS '레벨';
 
   COMMENT ON COLUMN "TB_CMSMBRTYPE"."CREATED" IS '등록일';
 
   COMMENT ON COLUMN "TB_CMSMBRTYPE"."MODIFIED" IS '수정일';
 
   COMMENT ON COLUMN "TB_CMSMBRTYPE"."ISDEL" IS '삭제여부';
 
   COMMENT ON TABLE "TB_CMSMBRTYPE"  IS '회원유형테이블';
--------------------------------------------------------
--  DDL for Table TB_LOGINLOG
--------------------------------------------------------

  CREATE TABLE "TB_LOGINLOG" 
   (	"IP_ID" VARCHAR2(255 BYTE), 
	"MBR_ID" VARCHAR2(255 BYTE), 
	"IP_ADDR" VARCHAR2(255 BYTE), 
	"CREATED" DATE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_LOGINLOG"."IP_ID" IS 'IP_ID';
 
   COMMENT ON COLUMN "TB_LOGINLOG"."MBR_ID" IS 'MBR_ID';
 
   COMMENT ON COLUMN "TB_LOGINLOG"."IP_ADDR" IS 'IP_주소';
 
   COMMENT ON COLUMN "TB_LOGINLOG"."CREATED" IS '생성일';
 
   COMMENT ON TABLE "TB_LOGINLOG"  IS '로그인 로그 테이블';
--------------------------------------------------------
--  DDL for Table TB_CMSVISITLOG
--------------------------------------------------------

  CREATE TABLE "TB_CMSVISITLOG" 
   (	"SEQ_NO" NUMBER(20,0), 
	"SITE_ID" VARCHAR2(100 BYTE), 
	"PAGE_ID" VARCHAR2(100 BYTE), 
	"PAGE_NM" VARCHAR2(100 BYTE), 
	"WHEN_DATETIME" DATE, 
	"WHEN_DATE" VARCHAR2(8 BYTE), 
	"IPADDR" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
   ;
 

   COMMENT ON COLUMN "TB_CMSVISITLOG"."SEQ_NO" IS '순번';
 
   COMMENT ON COLUMN "TB_CMSVISITLOG"."SITE_ID" IS '사이트ID';
 
   COMMENT ON COLUMN "TB_CMSVISITLOG"."PAGE_ID" IS '페이지ID';
 
   COMMENT ON COLUMN "TB_CMSVISITLOG"."PAGE_NM" IS '페이지명';
 
   COMMENT ON COLUMN "TB_CMSVISITLOG"."WHEN_DATETIME" IS '날짜시간';
 
   COMMENT ON COLUMN "TB_CMSVISITLOG"."WHEN_DATE" IS '년월일';
 
   COMMENT ON COLUMN "TB_CMSVISITLOG"."IPADDR" IS 'IP';
 
   COMMENT ON TABLE "TB_CMSVISITLOG"  IS '방문자분석데이터';
----------------------
