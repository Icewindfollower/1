package lv.ressel.testapp.DAO;


import lv.ressel.testapp.domain.Creature;
import lv.ressel.testapp.domain.DAOExampleObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class InputValueDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addValue() {
        System.out.println("jdbctemplate is !!!!!!!!!!!!!!!!!!!!!!!!" + jdbcTemplate);
        this.jdbcTemplate.update("insert into inputstringvalue (Number, Value) values(5, 5)");
    }

    public List<DAOExampleObject> getDataFromTable() {
        RowMapper<DAOExampleObject> rowMapper = new RowMapper<DAOExampleObject>() {
            @Override
            public DAOExampleObject mapRow(ResultSet resultSet, int rowNum) throws SQLException {
                DAOExampleObject result = new DAOExampleObject();
                result.setAttack(resultSet.getInt(1));
                result.setDefense(resultSet.getInt(2));
                return result;
            }
        };
        List<DAOExampleObject> result = this.jdbcTemplate.query("select * from inputstringvalue", rowMapper);
        if (result.isEmpty()) {
            return null;
        }
        return result;
    }

}
