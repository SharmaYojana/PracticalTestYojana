package nyc.c4q.yojana.practicaltestyojana;

import java.util.List;

import nyc.c4q.yojana.practicaltestyojana.Pojo.Record;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yojanasharma on 12/10/16.
 */

public interface RestApi {
    @GET("api/timelines/users/918753190470619136")
    Call<List<Record>> getTheListOfRecords();
}

