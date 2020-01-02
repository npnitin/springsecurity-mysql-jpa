CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `active` tinyint(1) NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `roles` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL
);
INSERT INTO `user` (`id`, `active`, `password`, `roles`, `username`) VALUES
(1, 1, 'password', 'ROLE_ADMIN', 'admin');
INSERT INTO `user` (`id`, `active`, `password`, `roles`, `username`) VALUES
(1, 1, 'password', 'ROLE_USER', 'user');