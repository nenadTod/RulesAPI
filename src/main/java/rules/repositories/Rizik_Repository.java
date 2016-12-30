package rules.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rules.beans.Rizik;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Todorovic on 25-Dec-16.
 */
@Repository
public class Rizik_Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Rizik> findAll(){

        List<Rizik> retVal = jdbcTemplate.query("select * from Rizik", new RizikRowMapper());
        return retVal;
    }
}

class RizikRowMapper implements RowMapper<Rizik>{


    @Override
    public Rizik mapRow(ResultSet resultSet, int i) throws SQLException {
        Rizik rizik = new Rizik();
        rizik.setId_Rizik(resultSet.getDouble("id_Rizik"));
        rizik.setId_Vrsta_rizika(resultSet.getDouble("id_Vrsta_Rizika"));
        rizik.setNaziv_Rizik(resultSet.getString("naziv_Rizik"));

        return rizik;
    }
}
