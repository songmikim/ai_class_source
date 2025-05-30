docker ps -a
docker exec -it mysql bash
mysql -uroot -p
1234
CREATE DATABASE CONSOLE_BOARD;
CREATE USER CONSOLE_BOARD@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON CONSOLE_BOARD.* TO CONSOLE_BOARD@'%';  -- 모든 테이블 권한 주기
FLUSH PRIVILEGES;  -- 권한반영

-- dbeaver
driver properties > allowPublicKeyRetrieval true 설정

CREATE TABLE member(
seq INT AUTO_INCREMENT,
email VARCHAR(65) NOT NULL UNIQUE,
password VARCHAR(65) NOT NULL,
name VARCHAR(45) NOT NULL,
mobile VARCHAR(15) NOT NULL,
regDt DATETIME DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY(seq)
);  -- 테이블 생성


========================
그래들 다운받아서 이름 폴더에 넣기
https://gradle.org/next-steps/?version=8.14&format=bin

========================
환경변수 Path에 추가
C:\Users\admin\Desktop\김송미\gradle-8.14\bin

gradle --vision   // 버전확인

================
# 의존성
1. mysql-connector/j
2. tomcat-jdbc
3. mybatis
4. slf4j-api / logback-classic
5. lombok 

#의존성 추가 https://mvnrepository.com/
   runtimeOnly 'com.mysql:mysql-connector-j:8.4.0'
   implementation 'org.apache.tomcat:tomcat-jdbc:11.0.6'
   implementation 'org.mybatis:mybatis:3.5.19'
   implementation 'ch.qos.logback:logback-classic:1.5.18'
   compileOnly 'org.projectlombok:lombok:1.18.38'


==============================

```groovy
dependencies {
    runtimeOnly 'com.mysql:mysql-connector-j:8.4.0'
    implementation 'org.apache.tomcat:tomcat-jdbc:11.0.6'
    implementation 'org.mybatis:mybatis:3.5.19'
    implementation 'ch.qos.logback:logback-classic:1.5.18'
    compileOnly 'org.projectlombok:lombok:1.18.38'
    testImplementation platform('org.junit:junit-bom:5.10.0')
    testImplementation 'org.junit.jupiter:junit-jupiter'
}
```

# 테이블

```sql
CREATE TABLE member (
	seq INT AUTO_INCREMENT,
	email VARCHAR(65) UNIQUE NOT NULL,
	password VARCHAR(65) NOT NULL,
	name VARCHAR(40) NOT NULL,
	mobile VARCHAR(15) NOT NULL,
	terms TINYINT(1) DEFAULT 0,
	isAdmin TINYINT(1) DEFAULT 0,
	regDt DATETIME DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(seq)
);

CREATE TABLE board (
    seq BIGINT AUTO_INCREMENT,
    posterId INT NOT NULL,
    subject VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    regDt DATETIME DEFAULT CURRENT_TIMESTAMP,
    modDt DATETIME, 
    PRIMARY KEY(seq),
    FOREIGN KEY (posterId) REFERENCES member(seq)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);


CREATE TABLE board (
    seq BIGINT AUTO_INCREMENT,
    posterId INT NOT NULL,
    subject VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    regDt DATETIME DEFAULT CURRENT_TIMESTAMP,
    modDt DATETIME, 
    PRIMARY KEY(seq),
    FOREIGN KEY (posterId) REFERENCES member(seq)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);  
```

# 암호화
1. 양방향성 암호화
- 암호화와 복호화가 가능(OpenSSL, Aria ...AES256, AES516 ...)

2. 단방향성 암호화
- 해시, 암호화만 가능하고 복호화는 불가
- 고정해시 : 같은 값에 대해서 같은 해시값, sha1, md5, sha256, sha512 ..
  위변조 검증에서 주로 사용된다.
  예) sha256
  abc : ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad

- 유동해시 : BCrypt
  예) abc : $2a$12$KUvYcdcCTJKLQn7HyxNL0OEf1SZ3LyYR78/L1M5GJTC8nn4p7Lboa
  : $2a$12$xV5tKJQitlQXMcD0ENU4.eHsOqKZQ2Wip7qjyWYzsaVqxilCzkrTi
  - 해시값의 일치 여부를 체크하기 위한 별도 알고리즘이 개발 되어 있다.
  - JBCrypt
  - hashpw, checkpw  