package com.iyangcong.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.iyangcong.mm.R;
import com.iyangcong.widget.ScrollTextView;

public class InfoActivity extends BaseActivity {
	ScrollTextView mSampleView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_info);

		mSampleView = (ScrollTextView) findViewById(R.id.sampleView1);
		mSampleView.setScrollText("猿圈儿，是一款针对软件开发者孕育而生的一款社交软件，在这里，可以找到志同道合的朋友，在这里，可以提高你的交际圈，在这里，可以提高自己的技术，在这里，大家都是程序猿。");
		mSampleView.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mSampleView.updateScrollStatus();
			}
		});
	}
	public void onClickImg(View v){
		MediaPlayer.create(InfoActivity.this, R.raw.refresh_full)
		.start();
		
	}
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		finish();
		overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
		return false;
	};
}
