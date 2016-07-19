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
 * MstCategoryエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/07/20 0:45:00")
public class MstCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    /** categoryIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long categoryId;

    /** categoryNameプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String categoryName;

    /** relCategoryMovieList関連プロパティ */
    @OneToMany(mappedBy = "mstCategory")
    public List<RelCategoryMovie> relCategoryMovieList;
}