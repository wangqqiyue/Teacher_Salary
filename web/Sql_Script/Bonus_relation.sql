drop table if exists bonus_relation;

create table bonus_relation(
    type varchar(32) PRIMARY KEY NOT NULL COMMENT '奖罚类型',
    amount  double NOT NULL COMMENT '奖罚金额'
) COMMENT = '奖罚类型-金额关系表';