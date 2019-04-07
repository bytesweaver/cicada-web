CREATE TABLE author(
	author_id VARCHAR(32) NOT NULL --
-- 作者ID
--
,
	author_name VARCHAR(256) COMMENT "作者名字",
	birth_date DATE COMMENT "出生日期",
	birth_palace VARCHAR(256) COMMENT "出生地点",
	nationality VARCHAR(64) COMMENT "出生国家",
	sex CHAR(1) COMMENT "性别",
	PRIMARY KEY (author_id)
)