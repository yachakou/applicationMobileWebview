package budget.myapp.yacine.mybudgetapplication.view;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import budget.myapp.yacine.mybudgetapplication.R;

/**
 * Created by Yacine on 24/07/16.
 */
public class MainActivity extends ActionBarActivity {

    /**CONSTANTS**/

    private static final String TAG = MainActivity.class.getCanonicalName();

    /**MEMBERS**/

    private WebView mWebView;

    private ProgressBar mLoading;



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mWebView = (WebView)findViewById(R.id.wvPortal);

        mLoading = (ProgressBar) findViewById(R.id.pbLoading);

        mWebView.loadUrl("file:///android_asset/www/index.html");

        WebSettings mWebSettings = mWebView.getSettings();

        mWebSettings.setJavaScriptEnabled(true);



    }
}