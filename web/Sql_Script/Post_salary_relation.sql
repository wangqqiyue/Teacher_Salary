drop table if exists post_salary_relation;

create table post_salary_relation
(
    name   varchar(32) NOT NULL PRIMARY KEY COMMENT '职务名称',
    salary double      NOT NULL CHECK ( salary>0 ) COMMENT '对应薪资'
) COMMENT = '职务工资对应表';