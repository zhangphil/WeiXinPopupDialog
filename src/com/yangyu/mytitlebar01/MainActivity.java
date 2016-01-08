package com.yangyu.mytitlebar01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * @author yangyu
 *	功能描述：主Activity类，程序的入口类
 */
public class MainActivity extends Activity implements OnClickListener {
	//定义按钮
	private Button mainBtn01,mainBtn02;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
						
		initView();		
	}

	/**
	 * 初始化组件
	 */
	private void initView(){
		//得到按钮并设置监听事件
		mainBtn01 = (Button)findViewById(R.id.main_btn01);
		mainBtn02 = (Button)findViewById(R.id.main_btn02);		
		
		mainBtn01.setOnClickListener(this);
		mainBtn02.setOnClickListener(this);
	}	
		
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.main_btn01:
			startActivity(new Intent(MainActivity.this,CustomTitleActivity01.class));
			break;
		case R.id.main_btn02:
			startActivity(new Intent(MainActivity.this,CustomTitleActivity02.class));
			break;				
		default:
			break;
		}		
	}
	
}
