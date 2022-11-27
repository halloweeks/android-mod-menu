package com.halloweeks;

import com.halloweeks.LoginActivity;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear3;
	private LinearLayout linear10;
	private LinearLayout linear7;
	private LinearLayout linear12;
	private LinearLayout linear5;
	private TextView textview3;
	private LinearLayout linear6;
	private Button button1;
	private TextView textview5;
	private Button button2;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private LinearLayout linear13;
	private Button button3;
	
	private Intent it = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear4 = findViewById(R.id.linear4);
		linear3 = findViewById(R.id.linear3);
		linear10 = findViewById(R.id.linear10);
		linear7 = findViewById(R.id.linear7);
		linear12 = findViewById(R.id.linear12);
		linear5 = findViewById(R.id.linear5);
		textview3 = findViewById(R.id.textview3);
		linear6 = findViewById(R.id.linear6);
		button1 = findViewById(R.id.button1);
		textview5 = findViewById(R.id.textview5);
		button2 = findViewById(R.id.button2);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		linear13 = findViewById(R.id.linear13);
		button3 = findViewById(R.id.button3);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_newmodpro();
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finishAffinity();
				finish();
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				it.setAction(Intent.ACTION_VIEW);
				it.setData(Uri.parse("https://github.com/halloweeks/mode-menu/issues"));
				startActivity(it);
			}
		});
	}
	
	private void initializeLogic() {
		/*android.graphics.drawable.GradientDrawable BBGJEEI = new android.graphics.drawable.GradientDrawable();
int BBGJEEIADD[] = new int[]{ Color.argb(255,0,0,0), Color.argb(255,0,0,255) };
BBGJEEI.setColors(BBGJEEIADD);
BBGJEEI.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP);
BBGJEEI.setCornerRadii(new float[] { 0, 0, 0, 0, 0, 0, 0, 0 });
linear1.setBackground(BBGJEEI);*/
		android.graphics.drawable.GradientDrawable HDHBACF = new android.graphics.drawable.GradientDrawable();
		HDHBACF.setColor(Color.parseColor("#32a8ff"));
		HDHBACF.setCornerRadii(new float[] {20, 20, 20, 20, 20, 20, 20, 20});
		linear5.setBackground(HDHBACF);
		android.graphics.drawable.GradientDrawable BDGDHFE = new android.graphics.drawable.GradientDrawable();
		BDGDHFE.setColor(Color.parseColor("#ff4443"));
		BDGDHFE.setCornerRadii(new float[] { 20, 20, 20, 20, 20, 20, 20, 20 });
		linear6.setBackground(BDGDHFE);
		android.graphics.drawable.GradientDrawable BDGDHFEO = new android.graphics.drawable.GradientDrawable();
		BDGDHFEO.setColor(Color.parseColor("#ffffff"));
		BDGDHFEO.setCornerRadii(new float[] {20, 20, 20, 20, 20, 20, 20, 20 
		});
		linear7.setBackground(BDGDHFEO);
		android.graphics.drawable.GradientDrawable BDGDHFEP = new android.graphics.drawable.GradientDrawable();
		BDGDHFEP.setColor(Color.parseColor("#ffffff"));
		BDGDHFEP.setCornerRadii(new float[] {20, 20, 20, 20, 20, 20, 20, 20 
		});
		linear10.setBackground(BDGDHFEP);
		android.graphics.drawable.GradientDrawable BDGDHFEA = new android.graphics.drawable.GradientDrawable();
		BDGDHFEA.setColor(Color.parseColor("#556e7a"));
		BDGDHFEA.setCornerRadii(new float[] {20, 20, 20, 20, 20, 20, 20, 20 
		});
		linear3.setBackground(BDGDHFEA);
		android.graphics.drawable.GradientDrawable BDGDHFEZ = new android.graphics.drawable.GradientDrawable();
		BDGDHFEZ.setColor(Color.parseColor("#ffffff"));
		BDGDHFEZ.setCornerRadii(new float[] {20, 20, 20, 20, 20, 20, 20, 20 
		});
		linear12.setBackground(BDGDHFEZ);
		android.graphics.drawable.GradientDrawable BDGDHFEW = new android.graphics.drawable.GradientDrawable();
		BDGDHFEW.setColor(Color.parseColor("#607D8B"));
		BDGDHFEW.setCornerRadii(new float[] {20, 20, 20, 20, 20, 20, 20, 20 
		});
		button3.setBackground(BDGDHFEW);
		// copy binary executable into root directory
		try {
				int count;
				java.io.InputStream input= MainActivity.this.getAssets().open("main");
				java.io.OutputStream output = new  java.io.FileOutputStream("/data/data/com.halloweeks/files/main");
				byte data[] = new byte[1024];
				while ((count = input.read(data))>0) {
						output.write(data, 0, count);
				}
				output.flush();
				output.close();
				input.close();
			    
			    try {
				        Runtime.getRuntime().exec("chmod +x /data/data/com.halloweeks/files/main");
				    } catch (Exception s) {
				        SketchwareUtil.showMessage(getApplicationContext(), "Failed to change permission"/*s.getMessage()*/);
				    }
			
		}catch(Exception e){
			    FileUtil.makeDir("/data/data/com.halloweeks/files/");
			    SketchwareUtil.showMessage(getApplicationContext(), "Failed to copy file.");
			    // SketchwareUtil.showMessage(getApplicationContext(), e.getMessage()));
		}
		
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
		finish();
	}
	public void _newmodpro() {
		if (!android.provider.Settings.canDrawOverlays(MainActivity.this)){
				Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
			    startActivity(intent);
			    }
		    else{
			Intent startMain = new Intent(Intent.ACTION_MAIN); startMain.addCategory(Intent.CATEGORY_HOME); //startMain.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS); 
			startActivity(startMain);
			
			 int LAYOUT_FLAG;
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
				    LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
			} else {
				    LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_PHONE;
			}
			
			final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
			    WindowManager.LayoutParams.WRAP_CONTENT,
			    WindowManager.LayoutParams.WRAP_CONTENT,
			    LAYOUT_FLAG,
			      
			    WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
			     , 
			
			    PixelFormat.TRANSPARENT);
			
			  final  WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
			    LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
			    //View myView = inflater.inflate(R.layout.floating, null);
			
			final View myView = (View) getLayoutInflater().inflate(R.layout.newmodpro, null); 
			
			
			LinearLayout hold = (LinearLayout) myView.findViewById(R.id.menu);
			hold.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)360, Color.TRANSPARENT));
			
			    hold.setOnTouchListener(new OnTouchListener() {
				private int x;
				private int y;
				       @Override
				       public boolean onTouch(View v, MotionEvent event) {
					
					 switch (event.getAction()) { 
						case MotionEvent.ACTION_DOWN: 
						x = (int) event.getRawX(); 
						y = (int) event.getRawY(); 
						break;
						
						case MotionEvent.ACTION_MOVE: int nowX = (int) event.getRawX(); 
						int nowY = (int) event.getRawY(); 
						int movedX = nowX - x; 
						int movedY = nowY - y; 
						x = nowX; y = nowY; 
						params.x = params.x + movedX; 
						params.y = params.y + movedY; wm.updateViewLayout(myView, params); 
						break; 
						default: 
						break; 
					}
					 return false;
					 }
				 });
			
			   //Specify the view position
			       params.gravity = Gravity.TOP | Gravity.LEFT;        //Initially view will be added to top-left corner
			       params.x = 0;
			       params.y = 0;
			
			final LinearLayout   linear1 = (LinearLayout) myView.findViewById(R.id.linear1);
			
			linear1.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
			final LinearLayout   icone = (LinearLayout) myView.findViewById(R.id.icone);
			
			icone.setBackground(new android.graphics.drawable.GradientDrawable() { public android.graphics.drawable.GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
			linear1.setVisibility(View.GONE);         
			Button window_minimize_btn = (Button) myView.findViewById(R.id.window_minimize_btn);
			
			window_minimize_btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					linear1.setVisibility(View.GONE);         
					icone.setVisibility(View.VISIBLE);         
				} });
			LinearLayout menu = (LinearLayout) myView.findViewById(R.id.menu);
			menu.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					linear1.setVisibility(View.VISIBLE);         
					icone.setVisibility(View.GONE);         
				} });
			Button window_close_btn = (Button) myView.findViewById(R.id.window_close_btn);
			
			window_close_btn.setOnClickListener(new OnClickListener() { 
				@Override 
				public void onClick(View v) {
					wm.removeView(myView);
				} });
			
			wm.addView(myView, params);
		}
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}