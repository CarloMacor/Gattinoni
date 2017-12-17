package com.macormap.gattinoni;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carlo on 08/11/2017.
 */

public class ProdottoAdapter extends RecyclerView.Adapter<ProdottoAdapter.MyViewHolder> {

    private List<Prodotto> ProdottoList;


    public ProdottoAdapter(List<Prodotto> ProdottoList)
    {
        this.ProdottoList = ProdottoList;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView descr_1, descr_2;
        public ImageView img_1,img_2;

        public MyViewHolder(View view) {
            super(view);
            descr_1 = (TextView) view.findViewById(R.id.txt1prod);
            descr_2 = (TextView) view.findViewById(R.id.txt2prod);
            img_1   = (ImageView)view.findViewById(R.id.img1_prod);
            img_2   = (ImageView)view.findViewById(R.id.img2_prod);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.prodotto_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Prodotto prodotto =ProdottoList.get(position);
        holder.descr_1.setText(prodotto.getDecr_1());
        holder.descr_2.setText(prodotto.getDecr_2());
        holder.img_1.setImageResource(prodotto.gettoIdImg_1r());
        holder.img_2.setImageResource(prodotto.gettoIdImg_2r());
    }

    @Override
    public int getItemCount() {
        return ProdottoList.size();
    }


}
