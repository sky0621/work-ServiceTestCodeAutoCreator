package examples.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static examples.entity.MstMovieNames.*;

/**
 * {@link MstMovie}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2016/07/19 23:31:10")
public class MstMovieTest extends S2TestCase {

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
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(MstMovie.class).id(1L).getSingleResult();
    }

    /**
     * relCategoryMovieListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_relCategoryMovieList() throws Exception {
        jdbcManager.from(MstMovie.class).leftOuterJoin(relCategoryMovieList()).id(1L).getSingleResult();
    }

    /**
     * relRecommendMovieListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_relRecommendMovieList() throws Exception {
        jdbcManager.from(MstMovie.class).leftOuterJoin(relRecommendMovieList()).id(1L).getSingleResult();
    }

    /**
     * trnFavoriteListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_trnFavoriteList() throws Exception {
        jdbcManager.from(MstMovie.class).leftOuterJoin(trnFavoriteList()).id(1L).getSingleResult();
    }

    /**
     * trnViewHistoryListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_trnViewHistoryList() throws Exception {
        jdbcManager.from(MstMovie.class).leftOuterJoin(trnViewHistoryList()).id(1L).getSingleResult();
    }
}