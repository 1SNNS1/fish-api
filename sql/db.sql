-- 切换库
use fishapi;

-- 接口信息
create table if not exists fishapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `userId` bigint not null comment '创建人',
    `name` varchar(256) not null comment '名称',
    `description` varchar(256) null comment '描述',
    `url` varchar(512) not null comment '接口地址',
    `requestParams` text not null comment '请求参数',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `status` int default 0 not null comment '接口状态（0-关闭，1-开启）',
    `method` varchar(256) not null comment '请求类型',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口信息';

insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (48, 42283860, '白晟睿', 'www.maddie-feeney.name', 0, 'CWHDJ');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (18, 106, '吴修杰', 'www.lance-flatley.name', 0, 'Syr');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (5271283942, 833, '吕耀杰', 'www.scarlett-bergnaum.org', 0, '2h5');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (12063, 166987, '高绍齐', 'www.lorna-swift.com', 0, 'NvBA');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (40008, 51764265, '侯明', 'www.annett-okeefe.name', 0, 'avA0I');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (36, 4051, '赵智辉', 'www.lilliana-green.com', 0, 'GNBC4');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (97257, 51576368, '吕潇然', 'www.roosevelt-torphy.org', 0, 'tycZ');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (2, 9123077799, '段健柏', 'www.dennis-upton.com', 0, 'ipQy');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (862421285, 7, '范博文', 'www.gertrud-emmerich.net', 0, 'PoD');
insert into fishapi.`interface_info` (`id`, `userId`, `name`, `url`, `status`, `method`) values (148616, 3760660947, '沈聪健', 'www.tamara-barton.info', 0, 'iSlEr');


-- 用户调用接口关系表
create table if not exists fishapi.`user_interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `userId` bigint not null comment '调用用户 id',
    `interfaceInfoId` bigint not null comment '接口 id',
    `totalNum` int default 0 not null comment '总调用次数',
    `leftNum` int default 0 not null comment '剩余调用次数',
    `status` int default 0 not null comment '0-正常，1-禁用',
    `create_time` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `update_time` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '用户调用接口关系表';


