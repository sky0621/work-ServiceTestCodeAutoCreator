package examples.entity;

import examples.entity.MstMovieNames._MstMovieNames;
import examples.entity.MstUserNames._MstUserNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link TrnFavorite}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/19 23:44:47")
public class TrnFavoriteNames {

    /**
     * mstMovieMovieIdのプロパティ名を返します。
     * 
     * @return mstMovieMovieIdのプロパティ名
     */
    public static PropertyName<Long> mstMovieMovieId() {
        return new PropertyName<Long>("mstMovieMovieId");
    }

    /**
     * mstUserIdのプロパティ名を返します。
     * 
     * @return mstUserIdのプロパティ名
     */
    public static PropertyName<Long> mstUserId() {
        return new PropertyName<Long>("mstUserId");
    }

    /**
     * mstUserのプロパティ名を返します。
     * 
     * @return mstUserのプロパティ名
     */
    public static _MstUserNames mstUser() {
        return new _MstUserNames("mstUser");
    }

    /**
     * mstMovieのプロパティ名を返します。
     * 
     * @return mstMovieのプロパティ名
     */
    public static _MstMovieNames mstMovie() {
        return new _MstMovieNames("mstMovie");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TrnFavoriteNames extends PropertyName<TrnFavorite> {

        /**
         * インスタンスを構築します。
         */
        public _TrnFavoriteNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TrnFavoriteNames(final String name) {
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
        public _TrnFavoriteNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * mstMovieMovieIdのプロパティ名を返します。
         *
         * @return mstMovieMovieIdのプロパティ名
         */
        public PropertyName<Long> mstMovieMovieId() {
            return new PropertyName<Long>(this, "mstMovieMovieId");
        }

        /**
         * mstUserIdのプロパティ名を返します。
         *
         * @return mstUserIdのプロパティ名
         */
        public PropertyName<Long> mstUserId() {
            return new PropertyName<Long>(this, "mstUserId");
        }

        /**
         * mstUserのプロパティ名を返します。
         * 
         * @return mstUserのプロパティ名
         */
        public _MstUserNames mstUser() {
            return new _MstUserNames(this, "mstUser");
        }

        /**
         * mstMovieのプロパティ名を返します。
         * 
         * @return mstMovieのプロパティ名
         */
        public _MstMovieNames mstMovie() {
            return new _MstMovieNames(this, "mstMovie");
        }
    }
}