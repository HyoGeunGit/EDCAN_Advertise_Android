package kr.edcan.edcan_ad_app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        // intent.setPackage("com.android.chrome");   // 브라우저가 여러개 인 경우 콕 찍어서 크롬을 지정할 경우
        startActivity(intent);

        finish();  // 브라우저만 띄우고 종료
    }

}