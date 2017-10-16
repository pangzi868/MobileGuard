package cn.edu.gdmec.android.mobileguard.m2theftguard;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.RadioButton;

        import cn.edu.gdmec.android.mobileguard.R;

public class Setup3Activity extends BaseSetUpActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup3);
        ((RadioButton)findViewById(R.id.rb_third)).setChecked(true);
    }

    public void showNext(){
        startActivityAndFinishSelf(Setup4Activity.class);
    }
    public void showPre(){
        startActivityAndFinishSelf(Setup2Activity.class);
    }
}