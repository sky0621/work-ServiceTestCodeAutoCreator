package sample;

import static com.ninja_squad.dbsetup.Operations.*;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.destination.Destination;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;

public class Main {

    public static void main(String[] args) {

        Destination dest =
            new DriverManagerDestination(
                "jdbc:mysql://localhost:3306/ym",
                "root",
                "root");

        Operation DELETE_PARTIAL = sql("delete from character where age < 20");

        Operation INSERT =
        // テーブルの指定
            insertInto("character")

            // 全てのレコードに同じ値をセットする場合
                .withDefaultValue("gender", "女性")

                // 列の定義
                .columns("headgear", "clothing", "shoes")

                // 1つ目のレコード
                .values("ヘッドバンド ホワイト", "わかばイカT", "キャンバス ホワイト")

                // 2つ目のレコード
                .values("フェイスゴーグル", "スクールブレザー", "パワードレッグス")

                // Operationオブジェクトを作成
                .build();

        Operation ops = sequenceOf(DELETE_PARTIAL, INSERT);

        DbSetup dbSetup = new DbSetup(dest, ops);
        dbSetup.launch();
    }

}
