drop table if exists Tea_info;

create table Tea_info
(
    id       int(10) PRIMARY KEY auto_increment comment '教师工号',
    realname varchar(32) NOT NULL comment '教师姓名',
    sex      char(1) check ( sex = '男' || sex = '女' ) comment '教师性别',
    post  varchar(32) comment '教师职务 外键 和职务表相关联',
    title varchar(32) comment '教师职称 外键 和职称表相关联',


    # 外键
    KEY post_fk (post) COMMENT '教师职务外键 和职务-工资表相关联',
    CONSTRAINT post_fk FOREIGN KEY (post) REFERENCES post_salary_relation (name),
    KEY title_fk (title) COMMENT '教师职称外键 和职称-工资表相关联',
    CONSTRAINT title_fk FOREIGN KEY (title) REFERENCES title_salary_relation (name)
);