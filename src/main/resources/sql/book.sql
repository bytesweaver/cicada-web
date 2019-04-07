CREATE TABLE book(
	book_id VARCHAR(32) NOT NULL COMMENT "书籍ID",
	book_name VARCHAR(256) COMMENT "书名",
	book_type VARCHAR(8) COMMENT "书籍类型",
	author_id VARCHAR(32),
	public_date DATE COMMENT "出版日期",
	PRIMARY KEY (book_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT "书籍表"