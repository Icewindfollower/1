package lv.ressel.testapp.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InputValueDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addValue() {
        System.out.println("jdbctemplate is !!!!!!!!!!!!!!!!!!!!!!!!" +jdbcTemplate);
        this.jdbcTemplate.update("insert into inputstringvalue (Number, Value) values(1, 1)");
                //new Integer[]{1, 15});
    }

}
