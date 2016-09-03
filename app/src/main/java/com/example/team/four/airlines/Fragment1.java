package com.example.team.four.airlines;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.team.four.airlines.z_fan.F_CycleShowView;

/**
 * Created by jiangpeng on 2016/4/24.
 */
public class Fragment1 extends Fragment {

    int[] imageUrls = new int[]{
           R.drawable.img_f_view1,
            R.drawable.img_f_view2,
            R.drawable.img_f_view3,
            R.drawable.img_f_view2,
            R.drawable.img_f_view3,};


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        F_CycleShowView cycleView = (F_CycleShowView)getActivity().findViewById(R.id.cycle_view);
        cycleView.setData(imageUrls);
        cycleView.startPlay();
        cycleView.setMyPageOnClickItemListener(new F_CycleShowView.MyPageOnClickItemListener() {

            @Override
            public void curSelect(int position) {
                Toast.makeText(getActivity(), position+"", Toast.LENGTH_SHORT).show();

            }
        });
    }






}


