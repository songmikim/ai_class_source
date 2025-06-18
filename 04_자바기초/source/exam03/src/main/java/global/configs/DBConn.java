package global.configs;


import member.mappers.MemberMapper;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;

public class DBConn {

    private final SqlSessionFactory sqlSessionFactory;
    private static DBConn instance;
    private DBConn(){
        sqlSessionFactory = sqlSessionFactory();
    }

    public DataSource dataSource(){
        DataSource ds = new DataSource();
        /* 연결설정 */
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/study");
        ds.setUsername("study");
        ds.setPassword("1234");

        /* 커넥션 풀 설정 */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);

        return ds;
    }

    public SqlSessionFactory sqlSessionFactory(){
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("development", transactionFactory, dataSource());
        Configuration configuration = new Configuration(environment);
        configuration.setLogImpl(Slf4jImpl.class);  // 로거 연동
        configuration.addMapper(MemberMapper.class); // 매퍼 등록
        return new SqlSessionFactoryBuilder().build(configuration);
    }

    public SqlSession getSession(boolean autoCommit){
        // autoCommit : 기본값이 false
        return sqlSessionFactory.openSession(); // session.commit() : DB에 영구 반영
    }

    public SqlSession getSession(){
        return getSession(true); // 자동으로 commit() 실행
    }

    public static DBConn getInstance(){
        if(instance == null){
            instance = new DBConn();
        }
        return instance;
    }
}
