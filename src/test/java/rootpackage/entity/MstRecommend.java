package rootpackage.entity;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * MstRecommendエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/20 23:38:30")
public class MstRecommend implements Serializable {

    private static final long serialVersionUID = 1L;

    /** recommendIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long recommendId;

    /** recommendTitleプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String recommendTitle;

    /** relRecommendMovieList関連プロパティ */
    @OneToMany(mappedBy = "mstRecommend")
    public List<RelRecommendMovie> relRecommendMovieList;
}