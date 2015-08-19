package org.androidtown.study19;

import android.content.Context;
import android.widget.Toast;

public class BMW implements Car {
	Context context;
	
	public BMW(Context context) {
		this.context = context;
	}
	
	@Override
	public void doStart() {
		Toast.makeText(context, "BMW�� doStart �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doRun() {
		Toast.makeText(context, "BMW�� doRun �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doTurn() {
		Toast.makeText(context, "BMW�� doTurn �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doStop() {
		Toast.makeText(context, "BMW�� doStop �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

}
