//package com.example.administrator.myapplication.moduels;
//
//import android.content.Context;
//import android.graphics.Color;
//import android.graphics.drawable.AnimationDrawable;
//import android.util.AttributeSet;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import com.example.administrator.myapplication.R;
//
//
//public class RefreshLoading extends RelativeLayout{
//    private AnimationDrawable mAnimationDrawable;//创建帧动画的对象
//    private ImageView loadingImg;//加载图片
//    private TextView textView;
//    private Context mContext;
//
//    public RefreshLoading(Context context) {
//        super(context);
//        initView(context);
//    }
//
//    public RefreshLoading(Context context, AttributeSet attributeSet){
//        super(context,attributeSet);
//        initView(context);
//    }
//
//    //停止动画
//    public void stopLoadingAnimation(){
//        setVisibility(View.GONE);
//        if (mAnimationDrawable != null){
//            if (mAnimationDrawable.isRunning()){
//                mAnimationDrawable.stop();
//            }
//        }
//    }
//
//    /**
//     * 布局中的图片和文字是通过动态加载的方式处理的
//     * 这里面添加了一张图片和一个textview
//     */
//    private void initView(Context context) {
//        mContext = context;
//        LayoutParams imgLp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        imgLp.addRule(RelativeLayout.CENTER_HORIZONTAL);//设置图片水平居中
//        loadingImg = new ImageView(context);
//        loadingImg.setId(Integer.parseInt("1"));//给loadingImg设置一个坐标，可以作为下面空间的参考位置
//        loadingImg.setLayoutParams(imgLp);
//        addView(loadingImg);
//
//        LayoutParams textLp = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        textLp.addRule(RelativeLayout.CENTER_IN_PARENT);
//        textLp.addRule(RelativeLayout.BELOW, loadingImg.getId());
//        textView = new TextView(context);
//        setLoadUi(null);
//        textView.setLayoutParams(textLp);
//        addView(textView);
//    }
//
//    /**
//     * 设置load文字
//     */
//    private void setLoadUi(String loadText) {
//        textView.setTextColor(Color.BLACK);
//        textView.setTextSize(16);
//        if (loadText == null) {
//            showLoadUi(false, 0);
//        } else {
//            showReloadUi();
//        }
//    }
//
//    /**
//     * 显示加载动画
//     *
//     * @param isStopAnim 是否需要停止动画
//     * @param loadTextStringId 加载文字，如果不自定义加载文字，此值为0
//     */
//    public void showLoadUi(boolean isStopAnim, int loadTextStringId) {
////        public void showLoadUi(boolean isStopAnim, int loadTextStringId) {
//        if (isStopAnim) {
//            stopLoadingAnimation();
//        } else {
//            setVisibility(View.VISIBLE);
////            if (loadTextStringId != 0) {
////                textView.setText("加载数据中...0.0");
////            } else {
////                textView.setText("加载数据中...");
////            }
//            //给图片设置加载动画
//            loadingImg.setBackgroundResource(R.drawable.animation_list);
//            mAnimationDrawable = (AnimationDrawable) loadingImg.getBackground();
//            //启动动画
//            mAnimationDrawable.start();
//        }
//    }
//
//    /**
//     * 显示重新加载页面
//     * 用途：当加载数据失败的时候显示，我们给当前布局设置点击响应事件，继续load data
//     */
//    public void showReloadUi() {
//        setVisibility(View.VISIBLE);
//        textView.setText("重新加载");
//        loadingImg.setBackgroundResource(R.drawable.ic_launcher);
//    }
//
//    /**
//     * 释放资源
//     * 在destroy或者destroy view的时候调用
//     */
//    public void release() {
//        if (mAnimationDrawable != null && mAnimationDrawable.isRunning()) {
//            mAnimationDrawable.stop();
//        }
//        mAnimationDrawable = null;
//
//        if (loadingImg != null) {
//            loadingImg.setImageDrawable(null);
//        }
//    }
//}
