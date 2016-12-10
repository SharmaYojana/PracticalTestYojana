package nyc.c4q.yojana.practicaltestyojana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.yojana.practicaltestyojana.Pojo.Record;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    final static String URL = "http://vine.co";
    List<Record> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        final RecyclerView myRecyclerView = (RecyclerView) findViewById(R.id.records_recycler_view);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        myRecyclerView.setAdapter(new RecordsAdapter(list));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        RestApi service = retrofit.create(RestApi.class);
        Call<List<Record>> call = service.getTheListOfRecords();

        call.enqueue(new Callback<List<Record>>() {
            @Override
            public void onResponse(Call<List<Record>> call, Response<List<Record>> response) {
                list = response.body();
                Log.d("Retrofit success", String.valueOf(list.get(0).getUsername()));
            }

            @Override
            public void onFailure(Call<List<Record>> call, Throwable t) {
                Log.d("Retrofit Failure", t.toString());

            }
        });

    }
}
