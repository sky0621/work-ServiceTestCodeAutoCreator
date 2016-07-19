package examples.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * RelCategoryMovieエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/19 23:31:02")
public class RelCategoryMovie implements Serializable {

    private static final long serialVersionUID = 1L;

    /** mstMovieMovieIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstMovieMovieId;

    /** mstCategoryCategoryIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long mstCategoryCategoryId;

    /** mstCategory関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "mst_category_category_id", referencedColumnName = "category_id")
    public MstCategory mstCategory;

    /** mstMovie関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "mst_movie_movie_id", referencedColumnName = "movie_id")
    public MstMovie mstMovie;
}