package nyc.c4q.yojana.practicaltestyojana;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.yojana.practicaltestyojana.Pojo.Data;
import nyc.c4q.yojana.practicaltestyojana.Pojo.Record;

/**
 * Created by yojanasharma on 12/10/16.
 */

public class RecordsAdapter extends RecyclerView.Adapter{
private Context context;
    private List<Data> list;
    private List<Record> recordList;

    public RecordsAdapter(List<Data> list){
        this.list = list;


        }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecordsViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecordsViewHolder vh = (RecordsViewHolder) holder;
        vh.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
