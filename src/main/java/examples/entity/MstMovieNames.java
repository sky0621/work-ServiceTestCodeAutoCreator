package examples.entity;

import examples.entity.RelCategoryMovieNames._RelCategoryMovieNames;
import examples.entity.RelRecommendMovieNames._RelRecommendMovieNames;
import examples.entity.TrnFavoriteNames._TrnFavoriteNames;
import examples.entity.TrnViewHistoryNames._TrnViewHistoryNames;
import java.sql.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link MstMovie}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/07/19 23:44:47")
public class MstMovieNames {

    /**
     * movieIdのプロパティ名を返します。
     * 
     * @return movieIdのプロパティ名
     */
    public static PropertyName<Long> movieId() {
        return new PropertyName<Long>("movieId");
    }

    /**
     * movieTitleのプロパティ名を返します。
     * 
     * @return movieTitleのプロパティ名
     */
    public static PropertyName<String> movieTitle() {
        return new PropertyName<String>("movieTitle");
    }

    /**
     * movieFilenameのプロパティ名を返します。
     * 
     * @return movieFilenameのプロパティ名
     */
    public static PropertyName<String> movieFilename() {
        return new PropertyName<String>("movieFilename");
    }

    /**
     * movieTimeのプロパティ名を返します。
     * 
     * @return movieTimeのプロパティ名
     */
    public static PropertyName<String> movieTime() {
        return new PropertyName<String>("movieTime");
    }

    /**
     * movieTakeDateのプロパティ名を返します。
     * 
     * @return movieTakeDateのプロパティ名
     */
    public static PropertyName<Date> movieTakeDate() {
        return new PropertyName<Date>("movieTakeDate");
    }

    /**
     * delFlgのプロパティ名を返します。
     * 
     * @return delFlgのプロパティ名
     */
    public static PropertyName<Boolean> delFlg() {
        return new PropertyName<Boolean>("delFlg");
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
     * relRecommendMovieListのプロパティ名を返します。
     * 
     * @return relRecommendMovieListのプロパティ名
     */
    public static _RelRecommendMovieNames relRecommendMovieList() {
        return new _RelRecommendMovieNames("relRecommendMovieList");
    }

    /**
     * trnFavoriteListのプロパティ名を返します。
     * 
     * @return trnFavoriteListのプロパティ名
     */
    public static _TrnFavoriteNames trnFavoriteList() {
        return new _TrnFavoriteNames("trnFavoriteList");
    }

    /**
     * trnViewHistoryListのプロパティ名を返します。
     * 
     * @return trnViewHistoryListのプロパティ名
     */
    public static _TrnViewHistoryNames trnViewHistoryList() {
        return new _TrnViewHistoryNames("trnViewHistoryList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _MstMovieNames extends PropertyName<MstMovie> {

        /**
         * インスタンスを構築します。
         */
        public _MstMovieNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MstMovieNames(final String name) {
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
        public _MstMovieNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * movieIdのプロパティ名を返します。
         *
         * @return movieIdのプロパティ名
         */
        public PropertyName<Long> movieId() {
            return new PropertyName<Long>(this, "movieId");
        }

        /**
         * movieTitleのプロパティ名を返します。
         *
         * @return movieTitleのプロパティ名
         */
        public PropertyName<String> movieTitle() {
            return new PropertyName<String>(this, "movieTitle");
        }

        /**
         * movieFilenameのプロパティ名を返します。
         *
         * @return movieFilenameのプロパティ名
         */
        public PropertyName<String> movieFilename() {
            return new PropertyName<String>(this, "movieFilename");
        }

        /**
         * movieTimeのプロパティ名を返します。
         *
         * @return movieTimeのプロパティ名
         */
        public PropertyName<String> movieTime() {
            return new PropertyName<String>(this, "movieTime");
        }

        /**
         * movieTakeDateのプロパティ名を返します。
         *
         * @return movieTakeDateのプロパティ名
         */
        public PropertyName<Date> movieTakeDate() {
            return new PropertyName<Date>(this, "movieTakeDate");
        }

        /**
         * delFlgのプロパティ名を返します。
         *
         * @return delFlgのプロパティ名
         */
        public PropertyName<Boolean> delFlg() {
            return new PropertyName<Boolean>(this, "delFlg");
        }

        /**
         * relCategoryMovieListのプロパティ名を返します。
         * 
         * @return relCategoryMovieListのプロパティ名
         */
        public _RelCategoryMovieNames relCategoryMovieList() {
            return new _RelCategoryMovieNames(this, "relCategoryMovieList");
        }

        /**
         * relRecommendMovieListのプロパティ名を返します。
         * 
         * @return relRecommendMovieListのプロパティ名
         */
        public _RelRecommendMovieNames relRecommendMovieList() {
            return new _RelRecommendMovieNames(this, "relRecommendMovieList");
        }

        /**
         * trnFavoriteListのプロパティ名を返します。
         * 
         * @return trnFavoriteListのプロパティ名
         */
        public _TrnFavoriteNames trnFavoriteList() {
            return new _TrnFavoriteNames(this, "trnFavoriteList");
        }

        /**
         * trnViewHistoryListのプロパティ名を返します。
         * 
         * @return trnViewHistoryListのプロパティ名
         */
        public _TrnViewHistoryNames trnViewHistoryList() {
            return new _TrnViewHistoryNames(this, "trnViewHistoryList");
        }
    }
}