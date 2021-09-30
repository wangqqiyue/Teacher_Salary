drop table if exists post_salary_relation;

create table post_salary_relation
(
    id     int         NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '职务id',
    name   varchar(32) NOT NULL COMMENT '职务名称',
    salary double      NOT NULL CHECK ( salary>0 ) COMMENT '对应薪资'
) COMMENT = '职务工资对应表';