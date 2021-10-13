drop table if exists bonus_item;

create table bonus_item(
    id int(10)      PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '奖罚金项目号',
    teacher_id      int(10) NOT NULL COMMENT '教师工号',
    teacher_name    varchar(32) NOT NULL COMMENT '教师姓名',
    bonus_type      varchar(32) NOT NULL COMMENT '奖罚类型',
    bonus_amount    double NOT NULL COMMENT '奖罚金额',
    KEY teacher_fk (teacher_id),
    CONSTRAINT teacher_fk FOREIGN KEY (teacher_id) REFERENCES tea_info(id),
    KEY bonus_fk (bonus_type),
    CONSTRAINT bonus_fk FOREIGN KEY (bonus_type) REFERENCES bonus_relation(type)
) COMMENT = '奖罚金项目表';