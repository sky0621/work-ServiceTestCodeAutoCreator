package sample;

import static com.ninja_squad.dbsetup.Operations.*;

import java.util.Map;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.operation.Insert.Builder;
import com.ninja_squad.dbsetup.operation.Insert.RowBuilder;
import com.ninja_squad.dbsetup.operation.Operation;

public class Main {

    public static void main(String[] args) {

        MstMovie mm = new MstMovie();

        Operation DELETE_PARTIAL = sql(mm.createDeleteSql());

        Builder builder = insertInto(mm.getTableName());

        Map<String, Object> defValueMap = mm.getDefaultValueMap();
        for (String key : defValueMap.keySet()) {
            builder = builder.withDefaultValue(key, defValueMap.get(key));
        }

        for (Map<String, Object> valueMap : mm.getColumnsList()) {
            RowBuilder rb = builder.row();
            for (String key : valueMap.keySet()) {
                rb = rb.column(key, valueMap.get(key));
            }
            builder = rb.end();
        }

        Operation INSERT = builder.build();

        // // 1行目の作成
        // .row().column("headgear", "ヘッドバンド ホワイト")
        // .column("clothing", "わかばイカT")
        // .column("shoes", "キャンバス ホワイト")
        // .end()
        //
        // // 2行目の作成
        // .row().column("headgear", "フェイスゴーグル")
        // .column("clothing", "スクールブレザー")
        // .column("shoes", "パワードレッグス")
        // .end()

        Operation ops = sequenceOf(DELETE_PARTIAL, INSERT);

        DbSetup dbSetup = new DbSetup(DbSetupUtil.getDestination(), ops);
        dbSetup.launch();
    }

}
