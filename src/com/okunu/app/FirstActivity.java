package com.okunu.app;

import com.okunu.app.touch.Touch2Fragment;
import com.okunu.app.touch.TouchFragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_first);
        
        //cameraʾ��
        //setDefaultFragment(new CameraFragment());
        
        //�ⲿ���ط�
        //setDefaultFragment(new TouchFragment());
        
        //�ڲ����ط�
        setDefaultFragment(new Touch2Fragment());
    }
    
    public void setDefaultFragment(Fragment fragment){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.main_content, fragment);
        transaction.commit();
    }

}
