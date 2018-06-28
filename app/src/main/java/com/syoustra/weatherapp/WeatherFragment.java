package com.syoustra.weatherapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.syoustra.weatherapp.api_calls.dark_sky.Weather;

import butterknife.ButterKnife;

import static com.syoustra.weatherapp.MainActivity.PLACE;
import static com.syoustra.weatherapp.MainActivity.WEATHER;

public class WeatherFragment extends Fragment {

    private Weather weather;
    private String place;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);
        ButterKnife.bind(this, view);

        weather = getArguments().getParcelable(WEATHER);
        place = getArguments().getParcelable(PLACE);

        return view;
    }


    public static WeatherFragment newInstance() {

        Bundle args = new Bundle();

        WeatherFragment fragment = new WeatherFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
}
