package org.androidtown.study19;

import android.content.Context;
import android.widget.Toast;

public class Benz implements Car {
	Context context;
	
	public Benz(Context context) {
		this.context = context;
	}
	
	@Override
	public void doStart() {
		Toast.makeText(context, "Benz�� doStart �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doRun() {
		Toast.makeText(context, "Benz�� doRun �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doTurn() {
		Toast.makeText(context, "Benz�� doTurn �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

	@Override
	public void doStop() {
		Toast.makeText(context, "Benz�� doStop �޼ҵ尡 ȣ��Ǿ����ϴ�.", Toast.LENGTH_LONG).show();
	}

}
