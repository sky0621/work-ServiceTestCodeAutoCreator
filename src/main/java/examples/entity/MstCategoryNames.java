package examples.entity;

import examples.entity.RelCategoryMovieNames._RelCategoryMovieNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MstCategory}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/19 23:44:47")
public class MstCategoryNames {

    /**
     * categoryIdのプロパティ名を返します。
     * 
     * @return categoryIdのプロパティ名
     */
    public static PropertyName<Long> categoryId() {
        return new PropertyName<Long>("categoryId");
    }

    /**
     * categoryNameのプロパティ名を返します。
     * 
     * @return categoryNameのプロパティ名
     */
    public static PropertyName<String> categoryName() {
        return new PropertyName<String>("categoryName");
    }

    /**
     * relCategoryMovieListのプロパティ名を返します。
     * 
     * @return relCategoryMovieListのプロパティ名
     */
    public static _RelCategoryMovieNames relCategoryMovieList() {
        return new _RelCategoryMovieNames("relCategoryMovieList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MstCategoryNames extends PropertyName<MstCategory> {

        /**
         * インスタンスを構築します。
         */
        public _MstCategoryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MstCategoryNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _MstCategoryNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * categoryIdのプロパティ名を返します。
         *
         * @return categoryIdのプロパティ名
         */
        public PropertyName<Long> categoryId() {
            return new PropertyName<Long>(this, "categoryId");
        }

        /**
         * categoryNameのプロパティ名を返します。
         *
         * @return categoryNameのプロパティ名
         */
        public PropertyName<String> categoryName() {
            return new PropertyName<String>(this, "categoryName");
        }

        /**
         * relCategoryMovieListのプロパティ名を返します。
         * 
         * @return relCategoryMovieListのプロパティ名
         */
        public _RelCategoryMovieNames relCategoryMovieList() {
            return new _RelCategoryMovieNames(this, "relCategoryMovieList");
        }
    }
}