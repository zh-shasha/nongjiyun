package com.example.administrator.myapplication.utils;

/**
 * Created by Administrator on 2018/6/14.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.RadioButton;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.activity.CustomScanActivity;
import com.example.administrator.myapplication.activity.HomeAddFriendsList;
import com.example.administrator.myapplication.activity.MyQrCode;


/**
 * 弹窗视图
 */
public class ConfirmPopWindow extends PopupWindow implements View.OnClickListener {
    private Context context;
    private RadioButton dialog_add_friends,dialog_sao,dialog_my_qr;
    public ConfirmPopWindow(Context context) {
        super(context);
        this.context = context;
        initalize();
    }

    private void initalize() {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_add_friends,null,false);
        dialog_add_friends= view.findViewById(R.id.dialog_add_friends);//发起群聊
        dialog_sao = view.findViewById(R.id.dialog_sao);//添加好友
        dialog_my_qr=view.findViewById(R.id.dialog_my_qr);
        dialog_add_friends.setOnClickListener(this);
        dialog_sao.setOnClickListener(this);
        dialog_my_qr.setOnClickListener(this);
        setContentView(view);
        initWindow();
    }

    private void initWindow() {
        DisplayMetrics d = context.getResources().getDisplayMetrics();
//        this.setWidth((int) (d.widthPixels * 0.35));
        this.setWidth(LayoutParams.WRAP_CONTENT);
        this.setHeight(LayoutParams.WRAP_CONTENT);
        this.setFocusable(true);
        this.setOutsideTouchable(true);
        this.update();
        //实例化一个ColorDrawable颜色为半透明
//        ColorDrawable dw = new ColorDrawable(0x00000000);
//        //设置SelectPicPopupWindow弹出窗体的背景
//        this.setBackgroundDrawable(dw);
        backgroundAlpha((Activity) context, 0.8f);//0.0-1.0
        this.setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss() {
                backgroundAlpha((Activity) context, 1f);
            }
        });
    }

    //设置添加屏幕的背景透明度
    public void backgroundAlpha(Activity context, float bgAlpha) {
        WindowManager.LayoutParams lp = context.getWindow().getAttributes();
        lp.alpha = bgAlpha;
        context.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        context.getWindow().setAttributes(lp);
    }

    public void showAtBottom(View view) {
        //弹窗位置设置
        showAsDropDown(view, Math.abs((view.getWidth() - getWidth()) / 2), 10);
        //showAtLocation(view, Gravity.TOP | Gravity.RIGHT, 10, 110);//有偏差
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dialog_add_friends:
                Intent intent = new Intent(context, HomeAddFriendsList.class);
                context.startActivity(intent);
                dismiss();
                break;
            case R.id.dialog_sao:
                intent = new Intent(context, CustomScanActivity.class);
                context.startActivity(intent);
                dismiss();
                break;
            case R.id.dialog_my_qr:
                intent = new Intent(context, MyQrCode.class);
                context.startActivity(intent);
                dismiss();
                break;
        }
    }

}