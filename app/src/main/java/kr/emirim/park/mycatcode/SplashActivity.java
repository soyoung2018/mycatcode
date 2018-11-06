package kr.emirim.park.mycatcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //생성자와 같은 역활
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);  // 화면의 모든 요소들
        //R 클래스의 하위 클래스로 만들어 들어감
    }
}
