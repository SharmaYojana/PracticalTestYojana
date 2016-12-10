package nyc.c4q.yojana.practicaltestyojana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

import nyc.c4q.yojana.practicaltestyojana.Pojo.Data;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    final static String URL = "http://vine.co";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        RestApi service = retrofit.create(RestApi.class);
        Call<List<Data>> call = service.getTheListOfRecords();

        call.enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                List<Data> list = response.body();
                Log.d("Retrofit success", String.valueOf(list.get(0).getRecords()));
//                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//                recyclerView.setAdapter(new CountryAdapter(list));
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                Log.d("Retrofit Failure", t.toString());

            }
        });

    }
}
