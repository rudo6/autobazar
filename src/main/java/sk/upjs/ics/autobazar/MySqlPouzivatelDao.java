package sk.upjs.ics.autobazar;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlPouzivatelDao implements PouzivatelDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlPouzivatelDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/autobazar");
        dataSource.setUser("autobazar");
        dataSource.setPassword("autobazar");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    @Override
    public void pridajPouzivatela(Pouzivatel pouzivatel) {
        String sql = "INSERT INTO pouzivatel VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,null,pouzivatel.getUzivatelskeMeno(), pouzivatel.getHeslo(), pouzivatel.getMeno(), pouzivatel.getPriezvisko(),
                pouzivatel.getAdresa(), pouzivatel.getMesto(), pouzivatel.getPsc(), pouzivatel.getKrajina(), pouzivatel.getTelefonneCislo(), pouzivatel.getEmail());
    }
    
    @Override
    public void odstranPouzivatela(Pouzivatel pouzivatel) {
         String sql = "delete from inzerat where id = ?";
         jdbcTemplate.update(sql, pouzivatel.getId());
    }

    @Override
    public boolean overPouzivatela(String uzivatelskeMeno, String heslo) {
        String sql = "SELECT * FROM Pouzivatel";
        BeanPropertyRowMapper<Pouzivatel> mapper = BeanPropertyRowMapper.newInstance(Pouzivatel.class);
        List<Pouzivatel> pom = jdbcTemplate.query(sql, mapper);
        
        for(Pouzivatel p : pom) {
            if(p.getUzivatelskeMeno().equals(uzivatelskeMeno) && p.getHeslo().equals(heslo)) {
                
                    return true;
                
            }
        }
        
        return false;
    }
    
}
