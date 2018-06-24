package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
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
import com.example.administrator.myapplication.utils.GlideLoader;
import com.example.administrator.myapplication.utils.Utils;
import com.jaiky.imagespickers.ImageConfig;
import com.jaiky.imagespickers.ImageSelector;
import com.jaiky.imagespickers.ImageSelectorActivity;

import java.util.ArrayList;
import java.util.List;

public class MyFillInTheLog extends AppCompatActivity implements View.OnClickListener,AMapLocationListener {
    private AMapLocationClient locationClient = null;
    private AMapLocationClientOption locationOption = null;
    private RadioButton photo_rb;
    private String[] strMsg;
    private TextView please_log_tv;
    private ImageView log_back_bt;
    private EditText et_push_adress;
   //图片上传
    private ArrayList<String> path = new ArrayList<>();
    public static final int REQUEST_CODE = 123;
    private ImageConfig imageConfig;
    private LinearLayout llContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fill_in_the_log);
        please_log_tv = (TextView) findViewById(R.id.please_log_tv);
        log_back_bt=(ImageView)findViewById(R.id.log_back_bt);
        et_push_adress=(EditText)findViewById(R.id.et_push_adress);
        photo_rb=(RadioButton) findViewById(R.id.photo_rb);
        llContainer=findViewById(R.id.llContainer);
        photo_rb.setOnClickListener(this);
        et_push_adress.setOnClickListener(this);
        please_log_tv.setOnClickListener(this);
        log_back_bt.setOnClickListener(this);
        Location();
    }
    private void Location() {
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
            Toast.makeText(MyFillInTheLog.this, "定位失败", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case 2:
                String kejiao = data.getStringExtra("tv1");
                please_log_tv.setText(kejiao);
                break;
            case 4:
                String newname = data.getStringExtra("tv2");
                please_log_tv.setText(newname);
                break;
            case 6:
                String newcompany = data.getStringExtra("tv3");
                please_log_tv.setText(newcompany);
                break;
        }
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            List<String> pathList = data.getStringArrayListExtra(ImageSelectorActivity.EXTRA_RESULT);

//            tv1.setText("");
//            for (String path : pathList) {
//                tv1.append(path);
//                tv1.append("\n");
//            }
            path.clear();
            path.addAll(pathList);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.log_back_bt:
                finish();
                break;
            case R.id.please_log_tv:
                Intent intent = new Intent(MyFillInTheLog.this, MyLogIntypeChoose.class);
                startActivityForResult(intent, 1);
                break;
            case R.id.photo_rb:
                imageConfig = new ImageConfig.Builder(
                        new GlideLoader())
                        .steepToolBarColor(getResources().getColor(R.color.green))
                        .titleBgColor(getResources().getColor(R.color.green))
                        .titleSubmitTextColor(getResources().getColor(R.color.white))
                        .titleTextColor(getResources().getColor(R.color.white))
                        // 开启多选   （默认为多选）
                        .mutiSelect()
                        // 多选时的最大数量   （默认 9 张）
                        .mutiSelectMaxSize(9)
                        //设置图片显示容器，参数：、（容器，每行显示数量，是否可删除）
                        .setContainer(llContainer, 3, true)
                        // 已选择的图片路径
                        .pathList(path)
                        // 拍照后存放的图片路径（默认 /temp/picture）
                        .filePath("/temp")
                        // 开启拍照功能 （默认关闭）
                        .showCamera()
                        .requestCode(REQUEST_CODE)
                        .build();
                ImageSelector.open(MyFillInTheLog.this, imageConfig);
        }
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
    Handler mHandler = new Handler() {
        public void dispatchMessage(android.os.Message msg) {
            switch (msg.what) {
                //定位完成
                case Utils.MSG_LOCATION_FINISH:
                    String result = "";
                    try {
                        AMapLocation loc = (AMapLocation) msg.obj;
                        result = Utils.getLocationStr(loc, 1);
                        strMsg = result.split(",");
                        Toast.makeText(MyFillInTheLog.this, "定位成功", Toast.LENGTH_LONG).show();
                        //    textView.setText("地址：" + strMsg[0] + "\n" + "经    度：" + strMsg[1] + "\n" + "纬    度：" + strMsg[1]);
                        et_push_adress.setText(strMsg[0]);
                    } catch (Exception e) {
                        Toast.makeText(MyFillInTheLog.this, "定位失败", Toast.LENGTH_LONG).show();
                    }
                    break;
                default:
                    break;
            }
        }

    };
}