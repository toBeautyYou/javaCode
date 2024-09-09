/*
Navicat MySQL Data Transfer

Source Server         : ly_5
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : ly

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2023-12-24 11:51:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for contacts
-- ----------------------------
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `姓名` varchar(10) DEFAULT NULL,
  `电话` varchar(20) DEFAULT NULL,
  `性别` varchar(255) DEFAULT NULL,
  `邮箱` varchar(255) DEFAULT NULL,
  `类型` varchar(255) DEFAULT NULL,
  `住址` varchar(255) DEFAULT NULL,
  `who` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contacts
-- ----------------------------
INSERT INTO `contacts` VALUES ('123454', '12345', null, '123', null, null, '123454');
INSERT INTO `contacts` VALUES ('张三', '12312312311', null, '123@12', null, null, '123454');
INSERT INTO `contacts` VALUES ('张三', '12323412312', '男', '123@133', null, '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('李思思', '121212121', '男', '134@12', null, '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('李四', '1231313131', '男', '13131@121', null, null, '123454');
INSERT INTO `contacts` VALUES ('桑还是', '12313134131', '男', '13131！@131', null, null, '123454');
INSERT INTO `contacts` VALUES ('三个和尚', '13131313131', '男', '12313@1313', null, null, '123454');
INSERT INTO `contacts` VALUES ('请问豆腐乳', '1313131313', '男', '1313131@1212', null, null, '123454');
INSERT INTO `contacts` VALUES ('山东高速', '12414141', '男', '14141@132441', null, null, '123454');
INSERT INTO `contacts` VALUES ('省公司', '1313131313', '男', '134131@13131', null, null, '123454');
INSERT INTO `contacts` VALUES ('额王天文', '13131313', '男', '1313@131', null, null, '123454');
INSERT INTO `contacts` VALUES ('华东师范', '131313131331', '男', '131@1', null, null, '123454');
INSERT INTO `contacts` VALUES ('李', '88988', '男', '889', '8', '8', '123454');
INSERT INTO `contacts` VALUES ('哦', '90', '男', '9', '0', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('积极90', '99', '男', '9', '9', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('与', '78', '男', '78', '878', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('8（9', '89', '男', '98', '98', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('78&8', '78', '78', '78', '78', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('565', '55555', '555', '555', '555', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('李阳', '18993397327', '男', '12321@12', '朋友', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('&', '7', '7', '7', '8', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('67', '6', '6', '66', '66', '甘肃省', '123454');
INSERT INTO `contacts` VALUES ('121', '12', '12', '112', '12', '12', '123454');
INSERT INTO `contacts` VALUES ('898·8', '89', '89', '2', '9', '98', '123454');
INSERT INTO `contacts` VALUES ('李阳', '180283140892', '男', '123@12', '朋友', '甘肃兰州', '123454');
INSERT INTO `contacts` VALUES ('李阳', '89', '男', '89', '朋友', '89', '202406388');
INSERT INTO `contacts` VALUES ('89*9', '89', '898', '98', '89', '8', '123454');
INSERT INTO `contacts` VALUES ('李阳把', '1231', '男', '12212@12', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('是你啊', '332', '男', '122@121', '家人', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('李', '898', '男', '878', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('哈哈哈', '131', '女', '313@12', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('留', '1212', '女', '123@12', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('78', '787', '87', '878', '78', '78', '123454');
INSERT INTO `contacts` VALUES ('67', '67', '67', '67', '67', '67', '123454');
INSERT INTO `contacts` VALUES ('78', '787', '878', '787', '8787', '78', '123454');
INSERT INTO `contacts` VALUES ('好', '323', '男', '323', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('李阳', '133', '男', '33', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('哈后', '99', '男', '89', '朋友', '新疆', '123454');
INSERT INTO `contacts` VALUES ('最长的一次测试', '9799', '男', '89', '朋友', '89', '123454');
INSERT INTO `contacts` VALUES ('与', '与', '男', '与', '朋友', '与', '123454');
INSERT INTO `contacts` VALUES ('哈哈哈', 'uUI', '男', 'UI', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('成功了吗', '787', '男', '787', '朋友', '新疆', '123454');
INSERT INTO `contacts` VALUES ('再试一次', '79', '男', '79', '朋友', '甘肃', '123454');
INSERT INTO `contacts` VALUES ('89', '89', '男', '89', '朋友', '89', '123454');
INSERT INTO `contacts` VALUES ('90', '90', '男', '90', '朋友', '90', '123454');
INSERT INTO `contacts` VALUES ('89', '89', '男', '99999', '朋友', '88', '123454');
INSERT INTO `contacts` VALUES ('90', '90', '男', '909', '朋友', '90', '123454');
INSERT INTO `contacts` VALUES ('909', '9', '男', '9', '朋友', '9', '123454');
INSERT INTO `contacts` VALUES ('赵哈哈', '1897891234', '男', '1234212@12', '家人', '甘肃兰州', '202408787');
INSERT INTO `contacts` VALUES ('67', '67', '男', '67', '朋友', '67', '202405768');
INSERT INTO `contacts` VALUES ('李阳2', '17878771234', '男', '1234@12', '朋友', '甘肃陇南', '202408787');
INSERT INTO `contacts` VALUES ('李阳', '18034652242', '男', '1314@qq.com', '朋友', '甘肃兰州', '202405336');
INSERT INTO `contacts` VALUES ('张三', '18989990989', '男', '14141@qq.com', '朋友', '新疆', '202405336');
INSERT INTO `contacts` VALUES ('李阳', '18978903214', '男', '16767@qq.com', '朋友', '甘肃兰州', '202406382');
INSERT INTO `contacts` VALUES ('赵赵', '18787782341', '男', '1414441@1212', '朋友', '新疆吐鲁番', '202406382');
INSERT INTO `contacts` VALUES ('李阳', '18922425432', '男', '1234@122', '朋友', '甘肃兰州', '202401396');
INSERT INTO `contacts` VALUES ('杨杨', '17878787127', '男', '179898@128', '朋友', '安徽宿州', '202401396');
INSERT INTO `contacts` VALUES ('张三', '18978978899', '男', '1212121@qq.com', '朋友', '甘肃兰州七里河', '202408339');
INSERT INTO `contacts` VALUES ('90', '90', '男', '90', '朋友', '90', '123454');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `daan` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123454', '1', '今年几岁', '18岁');
INSERT INTO `user` VALUES ('202405054', 'ly3344..', '今年多少岁', '18');
INSERT INTO `user` VALUES ('202406162', 'zxcv1234', '今年多少岁', '18');
INSERT INTO `user` VALUES ('202405812', 'zxc', '啊啊', '啊');
INSERT INTO `user` VALUES ('202406388', 'ly3344', '在哪', '兰州');
INSERT INTO `user` VALUES ('202405768', 'li123', '9', '9');
INSERT INTO `user` VALUES ('202408787', '121', '在哪', '兰州');
INSERT INTO `user` VALUES ('202405336', '1234', '在哪', '兰州');
INSERT INTO `user` VALUES ('202406382', '12', '在哪', '兰州');
INSERT INTO `user` VALUES ('202401396', '12', '在哪呢', '兰州');
INSERT INTO `user` VALUES ('202408339', '123', '在哪', '兰州');
INSERT INTO `user` VALUES ('202408667', '', '', '');
