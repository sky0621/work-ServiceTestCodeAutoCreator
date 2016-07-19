package examples.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static examples.entity.RelCategoryMovieNames.*;

/**
 * {@link RelCategoryMovie}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2016/07/19 23:31:10")
public class RelCategoryMovieTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 全件取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindAll() throws Exception {
        jdbcManager.from(RelCategoryMovie.class).getResultList();
    }
}