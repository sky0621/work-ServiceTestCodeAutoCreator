package examples.entity;

import examples.entity.MstMovieNames._MstMovieNames;
import examples.entity.MstRecommendNames._MstRecommendNames;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link RelRecommendMovie}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/19 23:44:47")
public class RelRecommendMovieNames {

    /**
     * mstMovieMovieIdのプロパティ名を返します。
     * 
     * @return mstMovieMovieIdのプロパティ名
     */
    public static PropertyName<Long> mstMovieMovieId() {
        return new PropertyName<Long>("mstMovieMovieId");
    }

    /**
     * mstRecommendRecommendIdのプロパティ名を返します。
     * 
     * @return mstRecommendRecommendIdのプロパティ名
     */
    public static PropertyName<Long> mstRecommendRecommendId() {
        return new PropertyName<Long>("mstRecommendRecommendId");
    }

    /**
     * mstRecommendのプロパティ名を返します。
     * 
     * @return mstRecommendのプロパティ名
     */
    public static _MstRecommendNames mstRecommend() {
        return new _MstRecommendNames("mstRecommend");
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
    public static class _RelRecommendMovieNames extends PropertyName<RelRecommendMovie> {

        /**
         * インスタンスを構築します。
         */
        public _RelRecommendMovieNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _RelRecommendMovieNames(final String name) {
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
        public _RelRecommendMovieNames(final PropertyName<?> parent, final String name) {
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
         * mstRecommendRecommendIdのプロパティ名を返します。
         *
         * @return mstRecommendRecommendIdのプロパティ名
         */
        public PropertyName<Long> mstRecommendRecommendId() {
            return new PropertyName<Long>(this, "mstRecommendRecommendId");
        }

        /**
         * mstRecommendのプロパティ名を返します。
         * 
         * @return mstRecommendのプロパティ名
         */
        public _MstRecommendNames mstRecommend() {
            return new _MstRecommendNames(this, "mstRecommend");
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