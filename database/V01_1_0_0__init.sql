DROP TABLE IF EXISTS `uc_users`;
CREATE TABLE `uc_users` (
  `id` bigint(20) NOT NULL auto_increment COMMENT 'id' ,
  `user_name` varchar(128) DEFAULT NULL COMMENT '用户名',
  `user_account` varchar(128) DEFAULT NULL COMMENT '用户账户',
  `user_password` varchar(128) DEFAULT NULL COMMENT '用户密码',
  `is_admin` tinyint DEFAULT NULL COMMENT '是否是管理员 0：否 1：是',
  `parent_user_id` bigint(20) DEFAULT NULL COMMENT '父级用户id',
  `gmt_create` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_modify` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- ----------------------------
DROP TABLE IF EXISTS `uc_link_group`;
CREATE TABLE `uc_link_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `group_name` varchar(128) DEFAULT NULL COMMENT '组名称',
  `gmt_create` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `gmt_modify` timestamp NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


drop table if exists uc_link;
create table uc_link 
(
   id                   bigint                         not null  auto_increment comment 'id',
   link_name            varchar(128)                   null comment '链接名称',
   link_url             varchar(512)                   null comment '链接url',
   link_group_id        bigint                         null comment '链接组id',
   link_group_name      varchar(128)                   null comment '链接组名称',
   gmt_create           timestamp                      null comment '创建时间',
   gmt_modify           timestamp                      null comment '修改时间',
   constraint PK_UC_LINK primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



drop table if exists uc_link_weixin;
create table uc_link_weixin 
(
   id                   bigint                         not null auto_increment comment 'id',
   user_id              bigint                         null comment '用户id',
   user_name            varchar(128)                   null comment '用户名称',
   group_id             bigint                         null comment '分组id',
   group_name           varchar(128)                   null comment '分组名称',
   link_id              bigint                         null comment '链接id',
   link_name            varchar(128)                   null comment '链接名称',
   link_url             varchar(512)                   null comment '链接',
   is_online            TINYINT                     null comment '是否在线',
   online_time          timestamp                      null comment '上线时间',
   offline_time         timestamp                      null comment '下线时间',
   copy_num             bigint                         null comment '复制数，超过该数，微信号自动下线',
   gmt_create           timestamp                      null comment '创建时间',
   gmt_modify           timestamp                      null comment '修改时间',
   constraint PK_UC_LINK_WEIXIN primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


drop table if exists uc_link_wx_manager;
create table uc_link_wx_manager 
(
   id                   bigint                         not null auto_increment comment 'id',
   link_wx_id           bigint                         null comment '用户链接微信id',
   weixin               varchar(128)                   null comment '微信号',
   weighting            bigint                         null default 1 comment '权重',
   uv_num               bigint                         null default 0 comment 'uv数',
   pv_num               bigint                         null default 0 comment 'pv数',
   is_online            TINYINT                    null default '1' comment '是否在线 0：否；1：是',
   gmt_create           timestamp                      null comment '创建时间',
   gmt_modify           timestamp                      null comment '修改时间',
   constraint PK_UC_LINK_WX_MANAGER primary key (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
















