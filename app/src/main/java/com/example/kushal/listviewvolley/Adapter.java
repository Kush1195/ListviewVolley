package com.example.kushal.listviewvolley;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class Adapter extends ArrayAdapter<Model>
{
    private List<Model>list;
    private Context context;

    public Adapter(List<Model>list, @NonNull Context context)
    {
        super(context, R.layout.list_items,list);
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.list_items,null,true);

        TextView name = (TextView)view.findViewById(R.id.textviewname);
        TextView url = (TextView)view.findViewById(R.id.textviewurl);

        Model model = list.get(position);

        name.setText(model.getName());
        url.setText(model.getImageurl());

        return view;
    }
}
