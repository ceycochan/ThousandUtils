package com.nshane.thousandutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    /**
     * demo
     */

    private Button mBtnLess;
    private Button mBtnMore;
    private TextView mTvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnLess = (Button) findViewById(R.id.btn_less);
        mBtnMore = (Button) findViewById(R.id.btn_more);
        mTvShow = (TextView) findViewById(R.id.tv_show);

        mBtnLess.setOnClickListener(this);
        mBtnMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_less:
                int x = (int) (Math.random() * 50) * 10;
                mTvShow.setText(String.valueOf(x));
                break;
            case R.id.btn_more:
                long y = (int) (Math.random() * 50) * 100;
                mTvShow.setText(CountUtil.format(y));
                break;
            default:
                break;

        }
    }
}
