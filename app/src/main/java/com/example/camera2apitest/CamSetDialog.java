package com.example.camera2apitest;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;

//public class CamSetDialog extends AppCompatDialogFragment {
//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Info").setMessage("Dialog").setPositiveButton("ok", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//            }
//        });
//        return builder.create();
//    }
//}

public class CamSetDialog extends Dialog  {

    public CamSetDialog(@NonNull Context context) {
        super(context);
    }

//    private Button btnFlash = (Button) findViewById(R.id.btnFlash);
//    private Button btnRatio = (Button) findViewById(R.id.btnRatio);
//    private Button btnTimer = (Button) findViewById(R.id.btnTimer);
//    private Button btnSetting = (Button) findViewById(R.id.btnSetting);
//
//    private Switch SwitchAutoSave = (Switch) findViewById(R.id.SwitchAutoSave);
//    private Switch SwitchTouchCapture = (Switch) findViewById(R.id.SwitchTouchCapture);
//    private Switch SwitchHD = (Switch) findViewById(R.id.SwitchHD);


    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_cam_set);
//        setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
//        ButterKnife.bind(this);
    }

//    @OnClick(R.id.cd_add_category_submit_bt)
//    public void submitBt(){
//        addCategoryStr = addCateEt.getText().toString();
//        dismiss();
//    }
//    @OnClick(R.id.cd_add_category_cancel_bt)
//    public void cancelBt(){
//        dismiss();
//    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//        int width = dm.widthPixels;
//        int height = dm.heightPixels;
//
//        getWindow().setLayout((int)(width*.9), (int)(height*.3));
//
//        WindowManager.LayoutParams params = getWindow().getAttributes();
//        params.gravity = Gravity.TOP | Gravity.CENTER_HORIZONTAL;
//        params.width = WindowManager.LayoutParams.MATCH_PARENT;
//        params.softInputMode = WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE;
//
//        params.x = 0;
//        params.y = Gravity.TOP + 20;
//
//        getWindow().setAttributes(params);

//    }



}