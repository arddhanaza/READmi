package id.sch.smktelkom_mlg.privateassignment.xirpl103.readmi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Arddhana Zhafran on 5/13/2017.
 */

public class ReadAdapter extends RecyclerView.Adapter<ReadAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public ReadAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ReadAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ReadAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = listItems.get(position);

        holder.textViewJudul.setText(listItem.getJudul());
        holder.textViewDesc.setText(listItem.getDesc());


    }

    @Override
    public int getItemCount() {
        return listItems.size();


    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewJudul;
        public TextView textViewDesc;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
