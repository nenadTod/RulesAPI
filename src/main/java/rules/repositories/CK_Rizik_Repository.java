package rules.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rules.beans.CK_Rizik;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Vuletic on 2.1.2017.
 */
@Repository
public class CK_Rizik_Repository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<CK_Rizik> findAll(){

        List<CK_Rizik> retVal = jdbcTemplate.query("SELECT * FROM CK_Rizik", new CK_RizikRowMapper());
        return retVal;
    }

    @Transactional(readOnly = true)
    public CK_Rizik findByRizik(int rizikId){
        String query = "SELECT * FROM CK_Rizik WHERE Id_Rizik = " + rizikId +  " AND Datum_Pocetka_Vazenja_CL_Rizik = " +
                "(SELECT MAX(Datum_Pocetka_Vazenja_CL_Rizik) FROM CK_Rizik WHERE Id_Rizik = " + rizikId + ")";
        List<CK_Rizik> retVal = jdbcTemplate.query(query, new CK_RizikRowMapper());

        return retVal.get(0);
    }

}

class CK_RizikRowMapper implements RowMapper<CK_Rizik> {

    @Override
    public CK_Rizik mapRow(ResultSet resultSet, int i) throws SQLException {
        CK_Rizik ck_rizik = new CK_Rizik();
        ck_rizik.setId_Rizik(resultSet.getDouble("Id_Rizik"));
        ck_rizik.setId_CK_Rizik(resultSet.getDouble("Id_CK_Rizik"));
        ck_rizik.setKoeficijent_CK_Rizik(resultSet.getDouble("Koeficijent_CK_Rizik"));
        ck_rizik.setCena_CK_Rizik(resultSet.getDouble("Cena_CK_Rizik"));

        return ck_rizik;
    }
}