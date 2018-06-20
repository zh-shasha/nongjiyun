package com.example.administrator.myapplication.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.fragment.Home_Details;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;

public class HomeFarmCompanySelect extends AppCompatActivity implements View.OnClickListener{
    private ImageView home_farm_company_select_back_iv;
    private RadioButton phone_rb;
    private ViewPager pv_company;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_farm_company_select);
        home_farm_company_select_back_iv=(ImageView)findViewById(R.id.home_farm_company_select_back_iv);
        home_farm_company_select_back_iv.setOnClickListener(this);
        phone_rb=(RadioButton)findViewById(R.id.phone_rb);
        pv_company=(ViewPager) findViewById(R.id.pv_company);
        initHotLine();
        pv_company.setAdapter(new HomeFarmCompanySelect.TestNormalAdapter());
    }
    private void initHotLine() {

        phone_rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogHotline();
            }

            private void DialogHotline() {
                String yes = "<font color='#2EC667'>" + "是" + "</font>";
                String no = "<font color='#2EC667'>" + "否" + "</font>";
                AlertDialog dialog = new AlertDialog.Builder(HomeFarmCompanySelect.this)
                        .setMessage("是否拨打电话")//设置对话框的内容
                        //设置对话框的按钮
                        .setNegativeButton(Html.fromHtml(no), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setPositiveButton(Html.fromHtml(yes), new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                call("025-86261287");
                                dialog.dismiss();
                            }
                        }).create();
                dialog.show();
            }

        });
    }
    /**
     * 调用拨号界面
     *
     * @param phone 电话号码
     */
    private void call(String phone) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phone));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.home_farm_company_select_back_iv:
             finish();
             break;
     }
    }




        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));




    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.mipmap.photo1,
                R.mipmap.photo2,
                R.mipmap.photo3,
                R.mipmap.photo4,
                R.mipmap.photo5,
                R.mipmap.photo6
        };
        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public View getView(ViewGroup container, final int position) {
            final ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);

            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(HomeFarmCompanySelect.this,Home_Details.class);
                    startActivity(intent);
                }
            });
            return view;
        }




    }
}
