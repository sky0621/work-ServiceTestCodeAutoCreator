package examples.service;

import examples.entity.MstMovie;
import java.util.List;
import javax.annotation.Generated;

import static examples.entity.MstMovieNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link MstMovie}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/07/19 23:31:08")
public class MstMovieService extends AbstractService<MstMovie> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param movieId
     *            識別子
     * @return エンティティ
     */
    public MstMovie findById(Long movieId) {
        return select().id(movieId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MstMovie> findAllOrderById() {
        return select().orderBy(asc(movieId())).getResultList();
    }
}