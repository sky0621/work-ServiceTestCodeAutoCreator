package rootpackage.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * MstMovieエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/20 0:45:00")
public class MstMovie implements Serializable {

    private static final long serialVersionUID = 1L;

    /** movieIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long movieId;

    /** movieTitleプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String movieTitle;

    /** movieFilenameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String movieFilename;

    /** movieTimeプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String movieTime;

    /** movieTakeDateプロパティ */
    @Column(nullable = false, unique = false)
    public Date movieTakeDate;

    /** delFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean delFlg;

    /** relCategoryMovieList関連プロパティ */
    @OneToMany(mappedBy = "mstMovie")
    public List<RelCategoryMovie> relCategoryMovieList;

    /** relRecommendMovieList関連プロパティ */
    @OneToMany(mappedBy = "mstMovie")
    public List<RelRecommendMovie> relRecommendMovieList;

    /** trnFavoriteList関連プロパティ */
    @OneToMany(mappedBy = "mstMovie")
    public List<TrnFavorite> trnFavoriteList;

    /** trnViewHistoryList関連プロパティ */
    @OneToMany(mappedBy = "mstMovie")
    public List<TrnViewHistory> trnViewHistoryList;
}