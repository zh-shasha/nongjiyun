package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.utils.TelNumMatch;
import com.example.administrator.myapplication.view.RefuseToastView;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class RegisterInfoActivity extends AppCompatActivity {
    private  EditText reister_info_username,reister_info_phone,reister_info_password, reister_info_password_conf;
    private ImageView reister_info_con_bt;
    private TextView register_info_person_choose_tv2;
    private TextView register_info_person_choose_tv1;
    private TextView  register_info_local_choose_tv1;
    private TextView register_info_local_choose_tv2;
    private TextView  register_info_local_choose_tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_info);
        x.view().inject(this);
        init();
        initClick();
        //接收返回值
        Intent intent=getIntent();
        String phone=intent.getStringExtra("phonenumber");
        reister_info_phone.setText(phone);
    }
    private void init() {
        reister_info_username=(EditText)findViewById(R.id.reister_info_username);
        reister_info_phone=(EditText)findViewById(R.id.reister_info_phone);
        reister_info_password=(EditText)findViewById(R.id.reister_info_password);
        reister_info_password_conf=(EditText)findViewById(R.id.reister_info_password_conf);
        register_info_person_choose_tv2=(TextView)findViewById(R.id.register_info_person_choose_tv2);
        register_info_person_choose_tv1=(TextView)findViewById(R.id.register_info_peron_choose_tv1);
        register_info_local_choose_tv1=(TextView)findViewById(R.id.register_info_local_choose_tv1);
        register_info_local_choose_tv2=(TextView)findViewById(R.id.register_info_local_choose_tv2);
        register_info_local_choose_tv3=(TextView)findViewById(R.id.register_info_local_choose_tv3);
        reister_info_con_bt=(ImageView)findViewById(R.id.reister_info_con_bt);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       switch (resultCode){
           case 1:
               String city=data.getStringExtra("local1");
               register_info_local_choose_tv1.setText(city);
               String dis=data.getStringExtra("local2");
               register_info_local_choose_tv2.setText(dis);
               break;
           case 500:
               String nongji=data.getStringExtra("nongji");
               register_info_person_choose_tv1.setText(nongji);
               break;
           case 800:
               String tv_expert=data.getStringExtra("tv_expert");
               register_info_person_choose_tv1.setText(tv_expert);
               break;
           case 1000:
               String tv1=data.getStringExtra("values");
               register_info_person_choose_tv1.setText(tv1);
               break;


       }

    }

    private void initClick() {
        reister_info_con_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yourphone = reister_info_phone.getText().toString();
                String yourname=reister_info_username.getText().toString();
                String yourpass= reister_info_password.getText().toString();

                if (yourname.length()==0){
                    Toast refuseToast = new Toast(RegisterInfoActivity.this.getApplicationContext());
                    //view布局
                    View refuseView = LayoutInflater.from(RegisterInfoActivity.this.getApplicationContext()).inflate(R.layout.refuse_toast_view, null, false);
                    TextView text = (TextView) refuseView.findViewById(R.id.refuse_toastMessage);
                    text.setText("姓名不能为空");
                    //给增加动画效果
                    RefuseToastView refuseToastView = (RefuseToastView) refuseView.findViewById(R.id.refuse_View);
                    refuseToastView.startAnim();
                    text.setBackgroundResource(R.drawable.shape_refuse_toast_text);
                    text.setTextColor(Color.parseColor("#FFFFFF"));
                    refuseToast.setView(refuseView);
                    refuseToast.setDuration(Toast.LENGTH_SHORT);
                    refuseToast.show();
                }else if (yourphone.length()==0){
                    Toast refuseToast = new Toast(RegisterInfoActivity.this.getApplicationContext());
                    //view布局
                    View refuseView = LayoutInflater.from(RegisterInfoActivity.this.getApplicationContext()).inflate(R.layout.refuse_toast_view, null, false);
                    TextView text = (TextView) refuseView.findViewById(R.id.refuse_toastMessage);
                    text.setText("手机号码不能为空");
                    //给增加动画效果
                    RefuseToastView refuseToastView = (RefuseToastView) refuseView.findViewById(R.id.refuse_View);
                    refuseToastView.startAnim();
                    text.setBackgroundResource(R.drawable.shape_refuse_toast_text);
                    text.setTextColor(Color.parseColor("#FFFFFF"));
                    refuseToast.setView(refuseView);
                    refuseToast.setDuration(Toast.LENGTH_SHORT);
                    refuseToast.show();
                }else if (!TelNumMatch.isValidPhoneNumber(yourphone)){
                    Toast refuseToast = new Toast(RegisterInfoActivity.this.getApplicationContext());
                    //view布局
                    View refuseView = LayoutInflater.from(RegisterInfoActivity.this.getApplicationContext()).inflate(R.layout.refuse_toast_view, null, false);
                    TextView text = (TextView) refuseView.findViewById(R.id.refuse_toastMessage);
                    text.setText("输入正确的手机号码");
                    //给增加动画效果
                    RefuseToastView refuseToastView = (RefuseToastView) refuseView.findViewById(R.id.refuse_View);
                    refuseToastView.startAnim();
                    text.setBackgroundResource(R.drawable.shape_refuse_toast_text);
                    text.setTextColor(Color.parseColor("#FFFFFF"));
                    refuseToast.setView(refuseView);
                    refuseToast.setDuration(Toast.LENGTH_SHORT);
                    refuseToast.show();

                }else if (yourpass.length()==0){
                    Toast refuseToast = new Toast(RegisterInfoActivity.this.getApplicationContext());
                    //view布局
                    View refuseView = LayoutInflater.from(RegisterInfoActivity.this.getApplicationContext()).inflate(R.layout.refuse_toast_view, null, false);
                    TextView text = (TextView) refuseView.findViewById(R.id.refuse_toastMessage);
                    text.setText("密码不能为空");
                    //给增加动画效果
                    RefuseToastView refuseToastView = (RefuseToastView) refuseView.findViewById(R.id.refuse_View);

                    refuseToastView.startAnim();
                    text.setBackgroundResource(R.drawable.shape_refuse_toast_text);
                    text.setTextColor(Color.parseColor("#FFFFFF"));
                    refuseToast.setView(refuseView);
                    refuseToast.setDuration(Toast.LENGTH_SHORT);
                    refuseToast.show();
                }else if (yourpass.length()<6||yourpass.length()>15){
                    Toast refuseToast = new Toast(RegisterInfoActivity.this.getApplicationContext());
                    //view布局
                    View refuseView = LayoutInflater.from(RegisterInfoActivity.this.getApplicationContext()).inflate(R.layout.refuse_toast_view, null, false);
                    TextView text = (TextView) refuseView.findViewById(R.id.refuse_toastMessage);
                    text.setText("密码长度不能小于6或者大于15");
                    //给增加动画效果
                    RefuseToastView refuseToastView = (RefuseToastView) refuseView.findViewById(R.id.refuse_View);
                    refuseToastView.startAnim();
                    text.setBackgroundResource(R.drawable.shape_refuse_toast_text);
                    text.setTextColor(Color.parseColor("#FFFFFF"));
                    refuseToast.setView(refuseView);
                    refuseToast.setDuration(Toast.LENGTH_SHORT);
                    refuseToast.show();
                }
                String name=reister_info_username.getText().toString();//获取用户名
                String pass=reister_info_password.getText().toString();//获取输入的密码
                String phone=reister_info_phone.getText().toString();
                //  String conf=reister_info_password_conf.getText().toString();
                String type=register_info_person_choose_tv1.getText().toString();
                String city=register_info_local_choose_tv1.getText().toString();
                String dis=register_info_local_choose_tv2.getText().toString();

                String msg="用户名："+name+ ",手机号: "+phone+",密码："+pass+",类型："+type+",城市:"+city+",区域："+dis;
                JSONObject js_request = new JSONObject();
        try {
            js_request.put("nickname",name);//根据实际需求添加相应键值对
            js_request.put("account",phone );
            js_request.put("password",pass);
            js_request.put("role",type);
            js_request.put("city",city);
            js_request.put("distrit",dis);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //下面开始请求后台地址
        RequestParams params = new RequestParams("http://47.100.175.180/nonjiyun/user_insert");
        params.setAsJsonContent(true);
        params.setBodyContent(js_request.toString());
        x.http().post(params,new Callback.CommonCallback<String>() {
            @Override
            public void onCancelled(CancelledException arg0) {

            }

            @Override
            public void onError(Throwable arg0, boolean arg1) {
                // TODO Auto-generated method stub
                Log.e("错误", arg0.toString());
            }

            @Override
            public void onFinished() {
                // TODO Auto-generated method stub

            }

            @Override
            public void onSuccess(String arg0) {
                //请求成功方法 arg0为返回的数据

                System.out.println(arg0);
                int status = 0;
                try {
                    //服务器返回的是一个json封装的字符串，将其转换为json对象
                    JSONObject jsonObject =  new JSONObject(arg0);
                    status = jsonObject.getInt("status");

                    //  Toast.makeText(x.app(),""+status,Toast.LENGTH_SHORT).show();
                    //如果状态码正确，这里得到

                    if(status == 0){

                        Intent intent = new Intent(RegisterInfoActivity.this,Activity_login.class);
                      //  Intent intent=getIntent();
                        intent.putExtra("view",reister_info_phone.getText().toString());
                      //  setResult(520,intent);
                        startActivity(intent);
                        Toast.makeText(RegisterInfoActivity.this,"注册成功",Toast.LENGTH_SHORT).show();
                        finish();

                    } else if(status==00){

                        Toast.makeText(x.app(),"账号已存在,请重新注册",Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        });
    }

});

        register_info_local_choose_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterInfoActivity.this,Register_Local_ChooseActivity.class);
                startActivityForResult(intent,1000);
            }
        });

        register_info_person_choose_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterInfoActivity.this,Register_Person_ChooseActivity.class);
               startActivityForResult(intent,10000);
            }
        });



    }


}
