create tablespace jm
datafile '/work/jm.dbf' size 500m;

CREATE USER kjm
IDENTIFIED BY 1111
DEFAULT TABLESPACE jm;


commit;

GRANT connect, resource, dba TO kjm;