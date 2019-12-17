package id.ac.polinema.uasandroid.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import id.ac.polinema.uasandroid.R;

public class BeritaFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_berita, container, false);

        CardView cardView = (CardView) view.findViewById(R.id.berita1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Berita1Fragment b = new Berita1Fragment();
                b.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, b)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView1 = (CardView) view.findViewById(R.id.berita2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Berita2Fragment a = new Berita2Fragment();
                a.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, a)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView2 = (CardView) view.findViewById(R.id.berita3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Berita3Fragment c = new Berita3Fragment();
                c.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, c)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView3 = (CardView) view.findViewById(R.id.berita4);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Berita4Fragment d = new Berita4Fragment();
                d.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, d)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView4 = (CardView) view.findViewById(R.id.berita5);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Berita5Fragment f = new Berita5Fragment();
                f.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, f)
                        .addToBackStack(null)
                        .commit();
            }
        });



        // Inflate the layout for this fragment

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

}

