package com.example.staymor.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.staymor.R;
import com.example.staymor.activity_videos;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


//    public void videos_on_click(View view)
//    {
////        Intent intent_1= new Intent(getContext(), recycler_view_videos.class);
////        startActivity(intent_1);
//        Toast.makeText(getContext(), "jfb", Toast.LENGTH_SHORT).show();
//
//    }
ImageView imag_videos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        imag_videos=root.findViewById(R.id.imageView_videos);
        imag_videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(getContext(), activity_videos.class);
               startActivity(intent);
            }
        });

        return root;
    }
}