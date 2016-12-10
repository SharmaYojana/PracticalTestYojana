package nyc.c4q.yojana.practicaltestyojana;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.yojana.practicaltestyojana.Pojo.Record;

/**
 * Created by yojanasharma on 12/10/16.
 */

public class RecordsAdapter extends RecyclerView.Adapter{
private Context context;

    private List<Record> recordList;

    public RecordsAdapter(List<Record> list){
        this.recordList = list;


        }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecordsViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecordsViewHolder vh = (RecordsViewHolder) holder;
        vh.bind(recordList.get(position));
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }
}
