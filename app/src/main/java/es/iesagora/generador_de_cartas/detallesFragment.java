package es.iesagora.generador_de_cartas;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.iesagora.generador_de_cartas.databinding.FragmentDetallesBinding;
import es.iesagora.generador_de_cartas.model.Pokemon;

public class detallesFragment extends Fragment {

    private FragmentDetallesBinding binding;
    private Pokemon pokemon;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            pokemon = (Pokemon) getArguments().getSerializable("detalles");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentDetallesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        if (pokemon == null) return;

        binding.ivImagenPokemon.setImageResource(pokemon.getImage());

        String numeroFormateado = String.format("%03d", pokemon.getNumero());
        binding.tvNumero.setText("Nº " + numeroFormateado);

        binding.tvNombrePokemon.setText(pokemon.getNombre());

        binding.tvDetalles.setText(pokemon.getDetalles());


    }
}
