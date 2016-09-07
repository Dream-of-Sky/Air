package com.example.team.four.airlines;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by jiangpeng on 2016/4/24.
 */
public class Fragment2 extends Fragment {
    Button btnLe,btnAir,btnAtten,btnAdd;
    LinearLayout linear1,linear2,linear3;
    int btnSelected,btnWhtieGray;
    Drawable btn_1,btn_2,btn_3,btn_1_1,btn_2_2,btn_3_3;
    /*   public Fragment2() {
           // Required empty public constructor
       }
   */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //定义获取颜色资源
        btnSelected=ContextCompat.getColor(getActivity(),R.color.btn_selected);
        btnWhtieGray=ContextCompat.getColor(getActivity(),R.color.white_gray);
        btn_1=ContextCompat.getDrawable(getActivity(),R.drawable.y_shape_btn1);
        btn_2=ContextCompat.getDrawable(getActivity(),R.drawable.y_shape_btn2);
        btn_3=ContextCompat.getDrawable(getActivity(),R.drawable.y_shape_btn3);
        btn_1_1=ContextCompat.getDrawable(getActivity(),R.drawable.y_shape_btn1_1);
        btn_2_2=ContextCompat.getDrawable(getActivity(),R.drawable.y_shape_btn2_2);
        btn_3_3=ContextCompat.getDrawable(getActivity(),R.drawable.y_shape_btn3_3);

        //控制按钮添加图标大小
        btnAdd = (Button)getActivity().findViewById(R.id.y_btn_add_number);
        Drawable imgAdd = ContextCompat.getDrawable(getActivity(),R.drawable.y_btn_add);
        imgAdd.setBounds(0, 0, 62, 62);//第一0是距左边距离，第二0是距上边距离，40分别是长宽
         btnAdd.setCompoundDrawables(imgAdd, null, null, null);//只放左边
        linear3=(LinearLayout) getActivity().findViewById(R.id.y_linear_btn3);
        btnAtten=(Button)getActivity(). findViewById(R.id.y_btn_attention);
        btnAtten.setOnClickListener(new LinearLayoutListener());
        btnLe=(Button)getActivity().findViewById(R.id.y_btn_leave);
        btnLe.setBackgroundColor(btnSelected);
        btnLe.setOnClickListener(new LinearLayoutListener());
        btnAir=(Button) getActivity().findViewById(R.id.y_btn_airLines);
        btnAir.setOnClickListener(new LinearLayoutListener());
        linear1=(LinearLayout)getActivity().findViewById(R.id.y_linear_btn1);
        linear2=(LinearLayout) getActivity().findViewById(R.id.y_linear_btn2);

    }
    class LinearLayoutListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.y_btn_leave:
                    linear1.setVisibility(View.VISIBLE);
                    linear2.setVisibility(View.INVISIBLE);
                    linear3.setVisibility(View.INVISIBLE);
                    btnLe.setBackground(btn_1_1);
                    btnAir.setBackground(btn_2);
                    btnAtten.setBackground(btn_3);

                    break;
                case R.id.y_btn_airLines:
                    linear1.setVisibility(View.INVISIBLE);
                    linear2.setVisibility(View.VISIBLE);
                    linear3.setVisibility(View.INVISIBLE);
                    btnLe.setBackground(btn_1);
                    btnAir.setBackground(btn_2_2);
                    btnAtten.setBackground(btn_3);
                    break;
                case R.id.y_btn_attention:
                    linear1.setVisibility(View.INVISIBLE);
                    linear2.setVisibility(View.INVISIBLE);
                    linear3.setVisibility(View.VISIBLE);
                    btnLe.setBackground(btn_1);
                    btnAir.setBackground(btn_2);
                    btnAtten.setBackground(btn_3_3);
                    break;

            }

        }
    }



}