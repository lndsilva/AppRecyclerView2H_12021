package br.com.local.apprecyclerview2h_12021;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class FilmesAdapter extends RecyclerView.Adapter<FilmesAdapter.ViewHolder>{

    Context ctx;

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(ctx);
        view = inflater.inflate(R.layout.modelo_card_filmes,null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {

        holder.txtNomeCard.setText("Outro Cartão");

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNomeCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNomeCard = itemView.findViewById(R.id.txtNome);

        }
    }
}
