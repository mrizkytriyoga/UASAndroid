package id.ac.polinema.uasandroid.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import id.ac.polinema.uasandroid.R;

public class OtomodifFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_otomodif, container, false);

        CardView cardView = (CardView) view.findViewById(R.id.car1);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Car1Fragment b = new Car1Fragment();
                b.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, b)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView1 = (CardView) view.findViewById(R.id.car2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Car2Fragment a = new Car2Fragment();
                a.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, a)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView2 = (CardView) view.findViewById(R.id.car3);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Car3Fragment c = new Car3Fragment();
                c.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, c)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView3 = (CardView) view.findViewById(R.id.car4);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Car4Fragment d = new Car4Fragment();
                d.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, d)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView4 = (CardView) view.findViewById(R.id.car5);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Car5Fragment f = new Car5Fragment();
                f.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, f)
                        .addToBackStack(null)
                        .commit();
            }
        });

        CardView cardView5 = (CardView) view.findViewById(R.id.car6);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Car6Fragment f = new Car6Fragment();
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
}
