CREATE TABLE `user` (
    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `name` varchar(128) NULL COMMENT '用户名',
    `email` varchar(128) NULL COMMENT '用户邮箱',
    `password` varchar(128) NULL COMMENT '用户密码',
    `login_type_id` int(11) NULL DEFAULT 1 COMMENT '登录验证方式',
    `actived` boolean NULL COMMENT '是否激活',
    `enabled` boolean NULL COMMENT '是否可用',
    `deleted` boolean NULL COMMENT '是否删除',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci;