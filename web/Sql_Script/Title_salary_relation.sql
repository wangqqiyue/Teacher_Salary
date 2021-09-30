drop table if exists title_salary_relation;

create table title_salary_relation(
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '职级id',
    name varchar(32) NOT NULL COMMENT '职级名称',
    salary double NOT NULL CHECK ( salary>0 ) COMMENT '对应薪资'
) COMMENT = '职级工资对应表';