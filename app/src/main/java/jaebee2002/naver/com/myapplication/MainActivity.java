package jaebee2002.naver.com.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton naver;
    Button google;
    Button daum;
    WebView webview;
    ImageView imageview;
//    Button save;
//    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        save = findViewById(R.id.save);
//        cancel = findViewById(R.id.cancel);


        naver = findViewById(R.id.naver);
        google = findViewById(R.id.google);
        daum = findViewById(R.id.daum);
        naver.setOnClickListener(bClick);
        google.setOnClickListener(bClick);
        daum.setOnClickListener(bClick);
        webview = findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        imageview = findViewById(R.id.imageview);
        imageview.setOnClickListener(bClick);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
//        save.setOnClickListener(new Button.OnClickListener(){
////
////            @Override
////            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "save", Toast.LENGTH_SHORT).show();
////            }
////        });
////        cancel.setOnClickListener(new Button.OnClickListener(){
////
////            @Override
////            public void onClick(View v) {
////                Toast.makeText(MainActivity.this, "cancel",Toast.LENGTH_SHORT).show();
////            }
////        });


//        Toast.makeText( this, "Hi", Toast.LENGTH_LONG).show();
//        Log.d("------------->>> show","--------->>> show....");
//        Log.d("------------->>> show","--------->>> show....");
//        Log.d("------------->>> show","--------->>> show....");

    }
    Button.OnClickListener bClick = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.naver:
                    webview.loadUrl("http://www.naver.com");
                    break;
                case R.id.google:
                    webview.loadUrl("http://www.google.com");
                    break;
                case R.id.daum:
                    webview.loadUrl("http://www.daum.net");
                    break;
                case R.id.imageview:
                    webview.goBack();
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
