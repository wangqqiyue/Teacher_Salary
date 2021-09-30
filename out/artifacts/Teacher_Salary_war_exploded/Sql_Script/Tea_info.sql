drop table if exists Tea_info;

create table Tea_info
(
    id       int(10) PRIMARY KEY auto_increment comment '教师工号',
    realname varchar(32) NOT NULL comment '教师姓名',
    sex      char(1) check ( sex = '男' || sex = '女' ) comment '教师性别',
    post_id  int comment '教师职务id 外键 和职务表相关联',
    title_id int comment '教师职称id 外键 和职称表相关联',


    # 外键
    KEY post_fk (post_id) COMMENT '教师职务id外键 和职务-工资表相关联',
    CONSTRAINT post_fk FOREIGN KEY (post_id) REFERENCES post_salary_relation (id),
    KEY title_fk (title_id) COMMENT '教师职称id外键 和职称-工资表相关联',
    CONSTRAINT title_fk FOREIGN KEY (title_id) REFERENCES title_salary_relation (id)
);