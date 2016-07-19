package examples.entity;

import examples.entity.MstCategoryNames._MstCategoryNames;
import examples.entity.MstMovieNames._MstMovieNames;
import examples.entity.MstRecommendNames._MstRecommendNames;
import examples.entity.MstUserNames._MstUserNames;
import examples.entity.RelCategoryMovieNames._RelCategoryMovieNames;
import examples.entity.RelRecommendMovieNames._RelRecommendMovieNames;
import examples.entity.TrnFavoriteNames._TrnFavoriteNames;
import examples.entity.TrnViewHistoryNames._TrnViewHistoryNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.48", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2016/07/19 23:44:48")
public class Names {

    /**
     * {@link MstCategory}の名前クラスを返します。
     * 
     * @return MstCategoryの名前クラス
     */
    public static _MstCategoryNames mstCategory() {
        return new _MstCategoryNames();
    }

    /**
     * {@link MstMovie}の名前クラスを返します。
     * 
     * @return MstMovieの名前クラス
     */
    public static _MstMovieNames mstMovie() {
        return new _MstMovieNames();
    }

    /**
     * {@link MstRecommend}の名前クラスを返します。
     * 
     * @return MstRecommendの名前クラス
     */
    public static _MstRecommendNames mstRecommend() {
        return new _MstRecommendNames();
    }

    /**
     * {@link MstUser}の名前クラスを返します。
     * 
     * @return MstUserの名前クラス
     */
    public static _MstUserNames mstUser() {
        return new _MstUserNames();
    }

    /**
     * {@link RelCategoryMovie}の名前クラスを返します。
     * 
     * @return RelCategoryMovieの名前クラス
     */
    public static _RelCategoryMovieNames relCategoryMovie() {
        return new _RelCategoryMovieNames();
    }

    /**
     * {@link RelRecommendMovie}の名前クラスを返します。
     * 
     * @return RelRecommendMovieの名前クラス
     */
    public static _RelRecommendMovieNames relRecommendMovie() {
        return new _RelRecommendMovieNames();
    }

    /**
     * {@link TrnFavorite}の名前クラスを返します。
     * 
     * @return TrnFavoriteの名前クラス
     */
    public static _TrnFavoriteNames trnFavorite() {
        return new _TrnFavoriteNames();
    }

    /**
     * {@link TrnViewHistory}の名前クラスを返します。
     * 
     * @return TrnViewHistoryの名前クラス
     */
    public static _TrnViewHistoryNames trnViewHistory() {
        return new _TrnViewHistoryNames();
    }
}