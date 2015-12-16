package sk.upjs.ics.autobazar;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlPouzivatelDao implements PouzivatelDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlPouzivatelDao() {
        MysqlDataSource dataSource = InzeratFactory.INSTANCE.dataSource();        
        jdbcTemplate = InzeratFactory.INSTANCE.jdbcTemplate();
    }
    
    @Override
    public void pridajPouzivatela(Pouzivatel pouzivatel) {
        String sql = "INSERT INTO pouzivatel VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,null,pouzivatel.getUzivatelskeMeno(), pouzivatel.getHeslo(), pouzivatel.getMeno(), pouzivatel.getPriezvisko(),
                pouzivatel.getAdresa(), pouzivatel.getMesto(), pouzivatel.getPsc(), pouzivatel.getKrajina(), pouzivatel.getTelefonneCislo(), pouzivatel.getEmail());
    }

    @Override
    public Long overPouzivatela(String uzivatelskeMeno, String heslo) {
        String sql = "SELECT * FROM Pouzivatel";
        BeanPropertyRowMapper<Pouzivatel> mapper = BeanPropertyRowMapper.newInstance(Pouzivatel.class);
        List<Pouzivatel> pom = jdbcTemplate.query(sql, mapper);
        
        for(Pouzivatel p : pom) {
            if(p.getUzivatelskeMeno().equals(uzivatelskeMeno) && p.getHeslo().equals(heslo)) {
                    return p.getId();
                
            }
        }
        
        return null;
        
        /*String sql = "select * from pouzivatel where uzivatelskeMeno = ? and heslo = ?";
        BeanPropertyRowMapper<Pouzivatel> mapper = BeanPropertyRowMapper.newInstance(Pouzivatel.class);
        return jdbcTemplate.query(sql, mapper,uzivatelskeMeno,heslo);*/
        
    }
    
}
