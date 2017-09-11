package com.example.dumisile.tourguide;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.ResourceBundle;

import static android.R.attr.start;

/**
 * Created by DUMISILE on 2017/08/16.
 */

public class DetailsRecyclerView extends RecyclerView.Adapter<DetailsRecyclerView.ViewHolder> {
    Context context;
    //creating the list
    List<Details> detailsList;


    //creating a constructor


    public DetailsRecyclerView(Context context, List<Details> contentList) {
        this.context = context;
        this.detailsList = contentList;
    }

    @Override
    public DetailsRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //pull the card layout to this layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final DetailsRecyclerView.ViewHolder holder, final int position) {
        final Details details = detailsList.get(position);
        holder.Description.setText(details.getDescription());
        holder.icon.setImageResource(Integer.parseInt(String.valueOf(details.getIcon())));
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent intent = new Intent(context, restaurants.class);
                    context.startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(context, malls.class);
                    context.startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(context, bar.class);
                    context.startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(context, spa.class);
                    context.startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(context, park.class);
                    context.startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(context, zoo.class);
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        //get the number of items in the list.
        return detailsList.size();
    }

    //inner class that helps you to find reference
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Description;
        ImageView icon;
        CardView cardview;

        public ViewHolder(View itemView) {
            super(itemView);

            Description = (TextView) itemView.findViewById(R.id.txtDescription);
            icon = (ImageView) itemView.findViewById(R.id.dimage);
            cardview = (CardView) itemView.findViewById(R.id.cardView);
        }


    }
}


