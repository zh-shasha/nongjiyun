package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

import org.json.JSONException;
import org.json.JSONObject;
import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class ResetPassword extends AppCompatActivity {
    private EditText et_phone;
    private EditText et_password;
    private EditText et_password_ok;
    private TextView reset_pass_iv_next;
    private ImageView reister_back_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        et_password=(EditText)findViewById(R.id.et_password);
        et_password_ok=(EditText)findViewById(R.id.et_password_ok);
        et_phone=(EditText)findViewById(R.id.et_phone);
        reset_pass_iv_next=(TextView)findViewById(R.id.reset_pass_iv_next);
        reister_back_bt=(ImageView)findViewById(R.id.reister_back_bt);
        Intent intent=getIntent();
        String phonenumber=intent.getStringExtra("phonenumber");
        et_phone.setText(phonenumber);
        reset_pass_iv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone=et_phone.getText().toString();
                String password = et_password.getText().toString();
                String password_ok = et_password_ok.getText().toString();

                String msg = "手机号：" + phone;

                JSONObject js_request = new JSONObject();

                try {
                    js_request.put("account",phone);
                    js_request.put("password",password);
                } catch (JSONException e) {
                    e.printStackTrace();
                }


                //下面开始请求后台地址
                RequestParams params = new RequestParams("http://47.100.175.180/nonjiyun/forgetPassword/" + phone);
                params.setAsJsonContent(true);
                params.setBodyContent(js_request.toString());
                x.http().get(params, new Callback.CommonCallback<String>() {
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
                        System.out.println(arg0);
                        Toast.makeText(ResetPassword.this, arg0, Toast.LENGTH_SHORT).show();
                        try {
                            //服务器返回的是一个json封装的字符串，将其转换为json对象
                            JSONObject jsonObject = new JSONObject(arg0);
                            int status=0;
                            if (status==1){
                                Toast.makeText(ResetPassword.this,"密码修改成功",Toast.LENGTH_SHORT).show();
                            }

                            //       final  String data=jsonObject.getString("data");
                            //   JSONObject object =  jsonObject.getJSONObject("agr0");
//                            MessageTest msg = new Gson().fromJson(jsonObject.toString(), MessageTest.class);
//                            SharedPreferences.Editor editor = getSharedPreferences("message", MODE_PRIVATE).edit();
//                            editor.putString("msg", msg.getMsg());
//                            editor.putString("data", msg.getData());
//                            editor.putString("status", msg.getStatus());
//                            editor.apply();
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                });
            }
            });

        reister_back_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    }

