package sample;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MstMovie extends AbstractEntity {

    public static final String MOVIE_ID = "MOVIE_ID";
    public Long movieId;

    public static final String MOVIE_TITLE = "MOVIE_TITLE";
    public String movieTitle = "AutoGen";

    public static final String MOVIE_FILENAME = "MOVIE_FILENAME";
    public String movieFilename = "AutoGen";

    public static final String MOVIE_TIME = "MOVIE_TIME";
    public String movieTime = "AutoGen";

    public static final String MOVIE_TAKE_DATE = "MOVIE_TAKE_DATE";
    public Date movieTakeDate = Calendar.getInstance().getTime();

    public static final String DEL_FLG = "DEL_FLG";
    public Boolean delFlg = false;

    public static final String INS_ID = "INS_ID";
    public String insId = "AutoGen";

    private List<Map<String, Object>> columnsList;

    @Override
    public String getTableName() {
        return "mst_movie";
    }

    @Override
    public String getWhereString() {
        return INS_ID + " = \"" + insId + "\"";
    }

    @Override
    public Map<String, Object> getDefaultValueMap() {
        Map<String, Object> map = new HashMap<String, Object>();
//        map.put(MOVIE_ID, movieId);
        map.put(MOVIE_TITLE, movieTitle);
        map.put(MOVIE_FILENAME, movieFilename);
        map.put(MOVIE_TIME, movieTime);
        map.put(MOVIE_TAKE_DATE, movieTakeDate);
        map.put(DEL_FLG, delFlg);
        map.put(INS_ID, insId);
        return map;
    }

    @Override
    public void setColumnsList(List<Map<String, Object>> columnsList) {
        this.columnsList = columnsList;
    }

    @Override
    public List<Map<String, Object>> getColumnsList() {
        if (columnsList == null) {
            columnsList = new ArrayList<Map<String, Object>>();
            Map<String, Object> map = new HashMap<String, Object>();
            map.put(MOVIE_ID, 999);
            columnsList.add(map);
        }
        return columnsList;
    }

}
