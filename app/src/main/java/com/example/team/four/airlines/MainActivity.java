package com.example.team.four.airlines;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
   private ViewPager viewPager;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;
    private RadioGroup radioGroup;
    //页面列表
    private ArrayList<Fragment> fragmentArrayList;
    // No  pagerTabstrip 标题属性

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("测试一下");
        viewPager=(ViewPager) findViewById(R.id.viewPager1);
        viewPager.setOnPageChangeListener(new onPageChangedListener());
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup.setOnCheckedChangeListener(new onCheckedChanged());
        fragment1 =new Fragment1();
        fragment2= new Fragment2();
        fragment3= new Fragment3();
        fragment4=new Fragment4();

        fragmentArrayList=new ArrayList<Fragment>();
        fragmentArrayList.add(fragment1);
        fragmentArrayList.add(fragment2);
        fragmentArrayList.add(fragment3);
        fragmentArrayList.add(fragment4);

    viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager()));

    }
    public class MyViewPagerAdapter extends FragmentPagerAdapter {
        public MyViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentArrayList.get(position);
        }


        @Override
        public int getCount() {
            return fragmentArrayList.size();
        }
    }
   class  onCheckedChanged implements RadioGroup.OnCheckedChangeListener{
       @Override
       public void onCheckedChanged(RadioGroup group, int checkedId) {
           int current=0;
           switch (checkedId){
               case R.id.radioButton4:
                   current=0;
                   break;
               case R.id.radioButton5:
                   current=1;
                   break;
               case R.id.radioButton6:
                   current=2;
                   break;
               case R.id.radioButton7:
                   current=3;
                   break;
           }
           if (viewPager.getCurrentItem()!=current){
               viewPager.setCurrentItem(current);
           }
       }
   }
    class  onPageChangedListener implements ViewPager.OnPageChangeListener{
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            int current=viewPager.getCurrentItem();

            switch (current){
                case 0:
                    radioGroup.check(R.id.radioButton4);
                    break;
                case 1:
                    radioGroup.check(R.id.radioButton5);
                    break;
                case 2:
                    radioGroup.check(R.id.radioButton6);
                    break;
                case 3:
                    radioGroup.check(R.id.radioButton7);
                    break;

            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}
