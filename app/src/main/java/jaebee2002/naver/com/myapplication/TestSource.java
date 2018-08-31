package jaebee2002.naver.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestSource extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_scource);
    }
    Button.OnClickListener bClick = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.naver:
                    Toast.makeText(TestSource.this, "naver", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.google:
                    Toast.makeText(TestSource.this, "google", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.daum:
                    Toast.makeText(TestSource.this, "daum", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
