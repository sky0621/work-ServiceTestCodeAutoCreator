package rootpackage.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * RelRecommendMovieエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/20 23:38:30")
public class RelRecommendMovie implements Serializable {

    private static final long serialVersionUID = 1L;

    /** mstMovieMovieIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstMovieMovieId;

    /** mstRecommendRecommendIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstRecommendRecommendId;

    /** mstRecommend関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "mst_recommend_recommend_id", referencedColumnName = "recommend_id")
    public MstRecommend mstRecommend;

    /** mstMovie関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "mst_movie_movie_id", referencedColumnName = "movie_id")
    public MstMovie mstMovie;
}