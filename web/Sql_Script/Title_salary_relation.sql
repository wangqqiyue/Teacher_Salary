drop table if exists title_salary_relation;

create table title_salary_relation(
    name varchar(32) NOT NULL PRIMARY KEY COMMENT '职级名称',
    salary double NOT NULL CHECK ( salary>0 ) COMMENT '对应薪资'
) COMMENT = '职级工资对应表';