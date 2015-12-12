/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.autobazar;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlInzeratNakladneDao implements InzeratNakladneDao {
    private JdbcTemplate jdbcTemplate;
    
    public MySqlInzeratNakladneDao() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost/autobazar");
        dataSource.setUser("autobazar");
        dataSource.setPassword("autobazar");
        
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void pridat(InzeratNakladne inzerat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InzeratNakladne> dajVsetky() {
        String sql = "SELECT * FROM inzeratNakladne";
        BeanPropertyRowMapper<InzeratNakladne> mapper = BeanPropertyRowMapper.newInstance(InzeratNakladne.class);
        return jdbcTemplate.query(sql, mapper);
    }

    @Override
    public List<InzeratNakladne> vyhladaj(String znacka, String model, String odRocnik, String doRocnik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void odstranit(InzeratNakladne inzerat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
