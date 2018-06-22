package com.example.administrator.myapplication.activity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.utils.Utils;

public class QuickQuestionSubmission extends AppCompatActivity implements AMapLocationListener {
    private AMapLocationClient locationClient = null;
    private AMapLocationClientOption locationOption = null;
    private String[] strMsg;

    private RadioButton quick_question_photo_rb;
    private RadioButton quick_question_video_rb;
    private ImageView agricultural_expert_back_iv;
    private TextView tv_receive;
    private LinearLayout ly_question_choose;
    private TextView push_address;


    @TargetApi(Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_quick_question_submission);
        initView();
        initOnclick();



        push_address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Location();
            }
//

        });
//
//
    }

    private void Location() {
        // TODO Auto-generated method stub
        try {
            locationClient = new AMapLocationClient(this);
            locationOption = new AMapLocationClientOption();
            // 设置定位模式为低功耗模式
            locationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Battery_Saving);
            // 设置定位监听
            locationClient.setLocationListener(this);
            locationOption.setOnceLocation(true);//设置为单次定位
            locationClient.setLocationOption(locationOption);// 设置定位参数
            // 启动定位
            locationClient.startLocation();
            mHandler.sendEmptyMessage(Utils.MSG_LOCATION_START);
        } catch (Exception e) {
            Toast.makeText(QuickQuestionSubmission.this, "定位失败", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case 100:
                String liangjing=data.getStringExtra("liangjing");
                tv_receive.setText(liangjing);
                break;
            case 200:
                String yuanyi=data.getStringExtra("yuanyi");
                tv_receive.setText(yuanyi);
                break;
            case 300:
                String chumu=data.getStringExtra("chumu");
                tv_receive.setText(chumu);
                break;
            case 400:
                String shuichan=data.getStringExtra("shuichan");
                tv_receive.setText(shuichan);
                break;
            case 500:
                String nongji=data.getStringExtra("nongji");
                tv_receive.setText(nongji);
                break;
            case 600:
                String qita=data.getStringExtra("qita");
                tv_receive.setText(qita);
                break;

        }
    }

    private void initView() {
        agricultural_expert_back_iv = (ImageView) findViewById(R.id.agricultural_expert_back_iv);
        tv_receive = (TextView) findViewById(R.id.tv_receive);
        ly_question_choose = (LinearLayout) findViewById(R.id.ly_question_choose);
        quick_question_photo_rb=(RadioButton)findViewById(R.id.quick_question_photo_rb);
        quick_question_video_rb=(RadioButton)findViewById(R.id.quick_question_video_rb);
        push_address = (TextView)findViewById(R.id.push_address);
    }
    private void initOnclick() {
        ly_question_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuickQuestionSubmission.this,QuickQuestionChooseType.class);
                startActivityForResult(intent,1);
            }
        });
        quick_question_video_rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuickQuestionSubmission.this,QuickQuestionRecordVideo.class);
                startActivity(intent);
            }
        });

        agricultural_expert_back_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onLocationChanged(AMapLocation loc) {
        if (null != loc) {
            Message msg = mHandler.obtainMessage();
            msg.obj = loc;
            msg.what = Utils.MSG_LOCATION_FINISH;
            mHandler.sendMessage(msg);
        }
    }
    Handler mHandler =new Handler() {
        public void dispatchMessage(android.os.Message msg) {
            switch (msg.what) {
                //定位完成
                case Utils.MSG_LOCATION_FINISH:
                    String result = "";
                    try {
                        AMapLocation loc = (AMapLocation) msg.obj;
                        result = Utils.getLocationStr(loc, 1);
                        strMsg = result.split(",");
                        Toast.makeText(QuickQuestionSubmission.this, "定位成功", Toast.LENGTH_LONG).show();
                        //    textView.setText("地址：" + strMsg[0] + "\n" + "经    度：" + strMsg[1] + "\n" + "纬    度：" + strMsg[1]);
                        push_address.setText(strMsg[0]);
                    } catch (Exception e) {
                        Toast.makeText(QuickQuestionSubmission.this, "定位失败", Toast.LENGTH_LONG).show();
                    }
                    break;
                default:
                    break;
            }
        }

    };
}

