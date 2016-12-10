package nyc.c4q.yojana.practicaltestyojana;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.yojana.practicaltestyojana.Pojo.Record;

/**
 * Created by yojanasharma on 12/10/16.
 */

public class RecordsViewHolder extends RecyclerView.ViewHolder {
    private TextView liked;
    private TextView userName;

    public RecordsViewHolder(ViewGroup parent) {
        super(inflate(parent));
       liked = (TextView) liked.findViewById(R.id.attribute_liked);
        userName = (TextView) userName.findViewById(R.id.attribute_UserName);
    }

    private static View inflate(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.records_view_holder, parent, false);
    }

    public void bind(final Record record) {
        String name = record.getUsername();
        liked.setText(name);
        liked.setText("jmgj");

    }

}
