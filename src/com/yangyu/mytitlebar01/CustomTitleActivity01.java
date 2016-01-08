package com.yangyu.mytitlebar01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;

/**
 * @author yangyu 功能描述：第一种实现方式，PopupWindow实现方式
 */
public class CustomTitleActivity01 extends Activity {
	// 定义标题栏上的按钮
	private ImageButton titleBtn;

	// 定义标题栏弹窗按钮
	private TitlePopup titlePopup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_title);

		initView();

		initData();
	}

	/**
	 * 初始化组件
	 */
	private void initView() {
		// 实例化标题栏按钮并设置监听
		titleBtn = (ImageButton) findViewById(R.id.title_btn);
		titleBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				titlePopup.show(v);
			}
		});

		// 实例化标题栏弹窗
		titlePopup = new TitlePopup(this, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		// 给标题栏弹窗添加子类
		titlePopup.addAction(new ActionItem(this, "发起聊天", R.drawable.mm_title_btn_compose_normal));
		titlePopup.addAction(new ActionItem(this, "听筒模式", R.drawable.mm_title_btn_receiver_normal));
		titlePopup.addAction(new ActionItem(this, "登录网页", R.drawable.mm_title_btn_keyboard_normal));
		titlePopup.addAction(new ActionItem(this, "扫一扫", R.drawable.mm_title_btn_qrcode_normal));
	}

}
