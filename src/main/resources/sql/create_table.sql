create table class
(
    id               serial
        constraint class_pk
            primary key,
    name             text                  not null,
    delete_flag      boolean default false not null,
    create_date_time timestamp             not null,
    update_date_time timestamp             not null
);

comment on table class is '班级表';

comment on column class.id is '班级id(自增)';

comment on column class.name is '班级名称';

comment on column class.delete_flag is '0-未删除；1-已删除';

create table score
(
    id               serial
        constraint score_pk
            primary key,
    student_id       integer               not null,
    course_name      text                  not null,
    score            numeric               not null,
    delete_flag      boolean default false not null,
    create_date_time timestamp             not null,
    update_date_time timestamp             not null
);

comment on table score is '成绩表';

comment on column score.id is '自增主键';

comment on column score.student_id is '学生id';

comment on column score.course_name is '课程名称';

comment on column score.score is '分数表';

comment on column score.delete_flag is '删除标识';

create table student
(
    id                 serial
        constraint student_pk
            primary key,
    name               text                                not null,
    birthday           date                                not null,
    class_id           integer                             not null,
    create_date_time   timestamp                           not null,
    delete_flag        boolean   default false             not null,
    type               integer                             not null,
    update_date_time   timestamp default CURRENT_TIMESTAMP not null,
    register_date_time timestamp with time zone
);

comment on table student is '学生表';

comment on column student.id is '自增id';

comment on column student.name is '姓名';

comment on column student.birthday is '生日';

comment on column student.class_id is '班级id';

comment on column student.create_date_time is '创建时间';

comment on column student.delete_flag is '删除标识';

comment on column student.type is '1-小学;2-初中;3-高中';

comment on column student.update_date_time is '更新时间';

comment on column student.register_date_time is '注册时间（带时区）';
