package sk.upjs.ics.autobazar;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum InzeratFactory {
    INSTANCE;
    
    private InzeratOsobneDao inzeratDao;
    
    private InzeratNakladneDao inzeratDao2;
    
    private PouzivatelDao pouzivatelDao;
    
    private InzeratMotocykelDao inzeratDao3;
    
    private JdbcTemplate jdbcTemplate;
    
    public InzeratOsobneDao getInzeratOsobneDao(){
        if(this.inzeratDao==null){
            return new MySqlInzeratOsobneDao();
        } else{
            return this.inzeratDao;
        }
    }
    
    public InzeratNakladneDao getInzeratNakladneDao(){
        if(this.inzeratDao2==null){
            return new MySqlInzeratNakladneDao();
        } else{
            return this.inzeratDao2;
        }
    }
    
    public PouzivatelDao getPouzivatel(){
        if(this.pouzivatelDao==null){
            return new MySqlPouzivatelDao();
        } else{
            return this.pouzivatelDao;
        }
    }
    
    public InzeratMotocykelDao getInzeratMotocykelDao(){
        if(this.inzeratDao2==null){
            return new MySqlInzeratMotocykelDao();
        } else{
            return this.inzeratDao3;
        }
    }
    
    public MysqlDataSource dataSource(){
         MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/autobazar");
        dataSource.setUser("autobazar");
        dataSource.setPassword("autobazar");
        
        return dataSource;
    }
    
    public JdbcTemplate jdbcTemplate() {
        if(this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(dataSource());                
        }
        return this.jdbcTemplate;
    }  
}
