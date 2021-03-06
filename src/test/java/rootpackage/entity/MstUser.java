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
 * MstUserエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/20 23:38:30")
public class MstUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long id;

    /** userIdプロパティ */
    @Column(length = 20, nullable = false, unique = false)
    public String userId;

    /** userPasswordプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String userPassword;

    /** delFlgプロパティ */
    @Column(nullable = false, unique = false)
    public Boolean delFlg;

    /** trnFavoriteList関連プロパティ */
    @OneToMany(mappedBy = "mstUser")
    public List<TrnFavorite> trnFavoriteList;

    /** trnViewHistoryList関連プロパティ */
    @OneToMany(mappedBy = "mstUser")
    public List<TrnViewHistory> trnViewHistoryList;
}