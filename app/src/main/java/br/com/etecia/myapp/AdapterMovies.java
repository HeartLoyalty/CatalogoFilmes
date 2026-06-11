package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.ViewHolder> {

    private Context context;
    private List<Movies> lstMovies;

    public AdapterMovies(Context context, List<Movies> lstMovies) {
        this.lstMovies = lstMovies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_filmes, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.
                holder.


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView modelCardMovies;
        ImageView modelImgMovies;
        TextView modelTittleMovies;
        TextView modelContentMovies;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            modelTittleMovies = itemView.findViewById(R.id.modelTittleMovies);
            modelImgMovies = itemView.findViewById(R.id.modelImgMovies);
            modelCardMovies = itemView.findViewById(R.id.modelCardMovies);
            modelContentMovies = itemView.findViewById(R.id.modelContentMovies);

        }
    }


}
