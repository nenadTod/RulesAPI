package rules.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rules.beans.CK_Rizik;
import rules.beans.Stopa_PDV;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vuletic on 22.1.2017.
 */
@Repository
public class Stopa_PDV_Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Stopa_PDV> findAll(){

        List<Stopa_PDV> retVal = jdbcTemplate.query("SELECT * FROM Stopa_PDV", new Stopa_PDVRowMapper());
        return retVal;
    }

    @Transactional(readOnly = true)
    public Stopa_PDV findByPDV(int pdvId){
        String query = "SELECT * FROM Stopa_PDV WHERE Id_PDV = " + pdvId +  " AND Datum_Pocetka_Vazenja_Stopa_PDV = " +
                "(SELECT MAX(Datum_Pocetka_Vazenja_Stopa_PDV) FROM Stopa_PDV WHERE Id_PDV = " + pdvId + ")";
        List<Stopa_PDV> retVal = jdbcTemplate.query(query, new Stopa_PDVRowMapper());

        return retVal.get(0);
    }

}

class Stopa_PDVRowMapper implements RowMapper<Stopa_PDV> {

    @Override
    public Stopa_PDV mapRow(ResultSet resultSet, int i) throws SQLException {
        Stopa_PDV stopa = new Stopa_PDV();
        stopa.setId_PDV(resultSet.getDouble("Id_PDV"));
        stopa.setId_Stopa_PDV(resultSet.getDouble("Id_Stopa_PDV"));
        //stopa.setDatum_pocetka_vazenja_Stopa_PDV(resultSet.getDouble("Koeficijent_CK_Rizik"));
        stopa.setStopa_PDV(resultSet.getDouble("Stopa_PDV"));

        return stopa;
    }
}


