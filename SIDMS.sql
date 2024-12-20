
create table user(
   user_id bigint not null,
   login_name varchar(32) not null COMMENT '登录账户',
   password varchar(64) not null COMMENT '密码',
   realname varchar(32) not null COMMENT '真实姓名',
   mobile varchar(16) null COMMENT '手机',
   user_type int default 0 not null COMMENT '用户类型',
   create_time datetime null COMMENT '创建时间',
   unique key(login_name),
   primary key(user_id)
 )COMMENT = '用户表';
 
 create table leads(
	leads_id int not null auto_increment,
	leads_name varchar(128) not null COMMENT '线索名称',
	is_transform int not null DEFAULT 0 COMMENT '1已转化 0 未转化',
	customer_id int null COMMENT '客户ID',
	followup int not null COMMENT '跟进状态 0未跟进1已跟进',
	next_time datetime null COMMENT '下次联系时间',
	customer_name varchar(64) not null COMMENT '客户名称',
	contacts varchar(64) not null COMMENT '客户联系人',
	mobile varchar(16) null COMMENT '手机',
	telephone varchar(16) null COMMENT '电话',
	address varchar(128) null COMMENT '地址',
	remark varchar(128) null COMMENT '备注',
	create_time datetime null COMMENT '创建时间',
	primary key(leads_id)
)COMMENT = '线索表';
 
 create table customer(
	customer_id int not null auto_increment,
	customer_name varchar(64) not null COMMENT '客户名称',
	followup int not null COMMENT '跟进状态 0未跟进1已跟进',
	next_time datetime null COMMENT '下次联系时间',
	deal_status int not null default 0 COMMENT '成交状态 0未成交 1已成交',
	contacts varchar(64) not null COMMENT '客户联系人',
	mobile varchar(16) null COMMENT '手机',
	telephone varchar(16) null COMMENT '电话',
	address varchar(128) null COMMENT '地址',
	remark varchar(128) null COMMENT '备注',
	create_time datetime null COMMENT '创建时间',
	primary key(customer_id)
)COMMENT = '客户表';

 create table business(
	business_id int not null auto_increment,
	business_name varchar(64) not null COMMENT '商机名称',
	money decimal(18, 2) NULL COMMENT '商机金额',
	customer_id int not null,
	remark varchar(128) null COMMENT '需求描述',
	create_time datetime null COMMENT '创建时间',
	primary key(business_id)
)COMMENT = '商机表';

 create table record(
	record_id int not null auto_increment,
	business_id int not null,
	next_time datetime null COMMENT '下次联系时间',
	remark varchar(255) null COMMENT '跟进内容',
	create_time datetime null COMMENT '创建时间',
	primary key(record_id),
	constraint business_fk foreign key(business_id) references business(business_id)
)COMMENT = '跟进记录';

 create table contract(
	contract_id int not null auto_increment,
	name varchar(64) not null COMMENT '合同名称',
	customer_id int not null,
	business_id int not null,
	check_status int not null default 0 COMMENT '0 未审核 1 审核通过 2 审核拒绝 3 审核中 4 已撤回 5草稿 6 作废',
	num varchar(128) null COMMENT '合同编号',
	remark varchar(128) null COMMENT '合同描述',
	create_time datetime null COMMENT '创建时间',
	primary key(contract_id)
)COMMENT = '合同表';





 
 
 
 