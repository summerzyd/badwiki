CREATE TABLE `doc` (
                     `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文档ID',
                     `space_id` int(11) NULL COMMENT '文档空间',
                     `name` varchar(128) NOT NULL DEFAULT "" COMMENT '文档名称',
                     `size` bigint(20) NOT NULL DEFAULT 0 COMMENT '文档大小',
                     `parent_id` int(11) NULL COMMENT '直接父文档ID',
                     `has_child` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否有直接子文档',
                     `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除',
                     `creator` int(11) NULL COMMENT '创建者',
                     `create_time` bigint(20) NULL COMMENT '创建时间',
                     `modifier` int(11) NULL COMMENT '修改者',
                     `modify_time` bigint(20) NULL COMMENT '修改时间',
                     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT '文档表';
ALTER TABLE `doc` ADD INDEX idx_space_id(space_id);
ALTER TABLE `doc` ADD INDEX idx_parent_id(parent_id);

CREATE TABLE `doc_content` (
                     `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                     `doc_id` int(11) NOT NULL COMMENT '文档ID',
                     `doc_name` varchar(128) NOT NULL DEFAULT "" COMMENT '文档名称',
                     `doc_content` TEXT NOT NULL DEFAULT "" COMMENT '文档内容',
                     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档内容表';
ALTER TABLE `doc_content` ADD INDEX idx_doc_id(doc_id);

CREATE TABLE `doc_content_buffer` (
                     `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                     `doc_id` int(11) NOT NULL COMMENT '文档ID',
                     `saver` int(11) NULL COMMENT '文档修改者',
                     `save_time` bigint(20) NULL COMMENT '文档修改时间',
                     `doc_name` varchar(128) NOT NULL DEFAULT "" COMMENT '文档名称',
                     `doc_content` TEXT NOT NULL DEFAULT "" COMMENT '文档内容',
                     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档内容的修改缓存表';
ALTER TABLE `doc_content_buffer` ADD INDEX idx_doc_id(doc_id);

CREATE TABLE `doc_history` (
                      `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                      `space_id` int(11) NULL COMMENT '文档空间ID',
                      `doc_id` int(11) NULL COMMENT '文档ID',
                      `doc_operation_type_id` tinyint(4) NULL COMMENT '文档操作类型ID',
                      `operator` int(11) NULL COMMENT '操作者',
                      `operate_time` bigint(20) NULL COMMENT '文档操作时间',
                      PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档历史表';
ALTER TABLE `doc_history` ADD INDEX idx_space_id(space_id);
ALTER TABLE `doc_history` ADD INDEX idx_operate_time(operate_time);

CREATE TABLE `doc_operation_type` (
                      `id` tinyint(4)  NOT NULL AUTO_INCREMENT COMMENT '文档操作类型ID',
                      `name` varchar(32) NOT NULL DEFAULT "" COMMENT '文档操作类型名',
                      `note` varchar(32) NOT NULL DEFAULT "" COMMENT '文档操作类型备注',
                      PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档操作类型表';
INSERT `doc_operation_type`( `id`, `name`, `note`) values(1, 'add_doc', '创建文档'),(2, 'update_doc', '更新文档'),
(3, 'delete_doc', '删除文档'),(4, 'restore_doc', '还原文档'),(5, 'completely_delete_doc', '彻底删除文档');

CREATE TABLE `doc_trash` (
                       `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                       `space_id` int(11) NULL COMMENT '文档空间ID',
                       `doc_id` int(11) NULL COMMENT '文档ID',
                       `doc_path` TEXT NULL COMMENT '文档名称全路径',
                       `deleter` int(11) NULL COMMENT '操作者',
                       `delete_time` bigint(20) NULL COMMENT '文档操作时间',
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档回收站表';
ALTER TABLE `doc_trash` ADD INDEX idx_space_id_doc_id(space_id,doc_id);

CREATE TABLE `login_type` (
                         `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '用户登录类型ID',
                         `name` varchar(32) NULL COMMENT '用户登录类型名称',
                         `note` varchar(32) NULL COMMENT '用户登录类型备注',
                         `enabled` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否启用',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='用户登录类型表';
INSERT `login_type`( `id`, `name`, `note`, `enabled`) values (1, 'local', '本地', 1),(2, 'ldap', 'LDAP', 0);

CREATE TABLE `media` (
                      `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '媒体资源ID',
                      `name` varchar(128) NULL COMMENT '文件名',
                      `path` varchar(128) NULL COMMENT '保存路径',
                      `url` varchar(128) NULL COMMENT '访问url',
                      `is_img` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否是图片',
                      PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='媒体资源表';

CREATE TABLE `role` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
                        `name` varchar(128) NULL COMMENT '角色名称',
                        `note` varchar(128) NULL COMMENT '角色备注',
                        `deleted` TEXT NULL COMMENT '是否删除',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='角色表';
INSERT `role`( `id`, `name`, `note`, `deleted`) values (1, 'admin', '管理员', 0);

CREATE TABLE `space` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文档空间ID',
                        `name` varchar(128) NULL COMMENT '文档空间名称',
                        `note` varchar(128) NULL COMMENT '文档空间备注',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档空间表';

CREATE TABLE `space_area` (
                       `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '文档空间区域ID',
                       `name` varchar(128) NULL COMMENT '文档空间区域名称',
                       `note` varchar(128) NULL COMMENT '文档空间区域备注',
                       PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档空间区域表';
INSERT `space_area`( `id`, `name`, `note`) values (1, 'space', '空间'),(2, 'doc', '文档'),(3, 'trash','回收站'),(4, 'media','媒体资源');

CREATE TABLE `space_perm` (
                        `id` tinyint(4) NOT NULL AUTO_INCREMENT COMMENT '文档空间权限ID',
                        `name` varchar(128) NULL COMMENT '文档空间权限名称',
                        `note` varchar(128) NULL COMMENT '文档空间权限备注',
                        `space_area_id` tinyint(4) NULL COMMENT '文档空间区域ID',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档空间权限表';
INSERT `space_perm`( `id`, `name`, `note`, `space_area_id`)
values (1, 'searsh', '查看', 1),(2, 'add', '新增', 2),(3, 'edit','编辑', 2),(4, 'delete','删除',2),
(5, 'restore', '还原', 3),(6, 'delete','删除', 3),(7, 'upload','上传',4),(8, 'delete','删除',4);

CREATE TABLE `space_role` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                        `space_id` int(11) NULL COMMENT '文档空间ID',
                        `role_id` int(11) NULL COMMENT '角色ID',
                        `space_perm_id` tinyint(4) NULL COMMENT '文档空间权限ID',
                        `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='文档角色关系表';
ALTER TABLE `space_role` ADD INDEX idx_space_id(space_id);
ALTER TABLE `space_role` ADD INDEX idx_role_id(role_id);
ALTER TABLE `space_role` ADD INDEX idx_space_perm_id(space_perm_id);

CREATE TABLE `user` (
                        `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
                        `name` varchar(128) NOT NULL DEFAULT "" COMMENT '用户名',
                        `email` varchar(128) NOT NULL DEFAULT "" COMMENT '用户邮箱',
                        `password` varchar(128) NOT NULL DEFAULT "" COMMENT '用户密码',
                        `login_type_id` tinyint(4) NOT NULL DEFAULT 1 COMMENT '登录验证方式',
                        `activated` tinyint(1) NOT NULL DEFAULT 1 COMMENT '是否激活',
                        `enabled` tinyint(1) NOT NULL DEFAULT 1 COMMENT '是否可用',
                        `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='用户表';
ALTER TABLE `user` ADD INDEX idx_name(name);
INSERT `user`(`id`, `name`, `email`, `password`, `login_type_id`, `activated`, `enabled`, `deleted`) values ( 1, 'admin', '', '', 1, 1, 1, 0 );

CREATE TABLE `user_role` (
                          `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                          `user_id` int(11) NULL COMMENT '用户ID',
                          `role_id` int(11) NULL COMMENT '角色ID',
                          `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否删除',
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci COMMENT='用户角色关系表';
ALTER TABLE `user_role` ADD INDEX idx_user_id(user_id);
ALTER TABLE `user_role` ADD INDEX idx_role_id(role_id);
INSERT `user_role`( `id`, `user_id`, `role_id`, `deleted`) values ( 1, 1, 1, 0 );




