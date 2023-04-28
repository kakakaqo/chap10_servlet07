create table member(
    id varchar2(20),
    pwd varchar2(20) not null,
    name varchar2(50) not null,
    email varchar2(100),
    joindate date,
    constraint pk_member primary key(id)
);

insert into member values
('dream', '1234', '������', 'dream@google.com',
to_date('20190516', 'yyyy-mm-dd'));

insert into member values
('hong', '4567', 'ȫ����', 'hong@google.com',
to_date('20170228', 'yyyy-mm-dd'));

insert into member values
('jsupark', '2596', '���ؼ�', 'jsupark@google.com',
to_date('20200120', 'yyyy-mm-dd'));

commit;