package com.MuslimMedia.ans;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class NfoActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private ImageView imageview8;
	private ImageView imageview9;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	
	private Intent i = new Intent();
	private TimerTask oo;
	private SharedPreferences sav_mode;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.nfo);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear3 = findViewById(R.id.linear3);
		linear2 = findViewById(R.id.linear2);
		linear4 = findViewById(R.id.linear4);
		imageview8 = findViewById(R.id.imageview8);
		imageview9 = findViewById(R.id.imageview9);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		button3 = findViewById(R.id.button3);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		sav_mode = getSharedPreferences("svamode", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://muslim-appss-store.web.app/app.html?id=7"));
				startActivity(i);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://alalm.web.app/#contact"));
				startActivity(i);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://alalm.web.app/#contact"));
				startActivity(i);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://muslim-appss-store.web.app/app.html?id=7"));
				startActivity(i);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("http://muslim-appss-store.web.app"));
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_10);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(3000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_3);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(6000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_4);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(9000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_1);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(12000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_2);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(15000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_7);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(18000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_8);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(21000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_5);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(24000));
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						imageview8.setImageResource(R.drawable.maz_6);
					}
				});
			}
		};
		_timer.schedule(oo, (int)(27000));
		if (!sav_mode.getString("mode", "").equals("")) {
			if (sav_mode.getString("mode", "").equals("day")) {
				_style_day();
			}
			else {
				_style();
			}
		}
		else {
			sav_mode.edit().putString("mode", "night").commit();
		}
		imageview8.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		imageview9.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
	}
	
	public void _style() {
		linear1.setBackgroundColor(0xFF000000);
		button1.setBackgroundResource(R.drawable.btn_ripple);
		button2.setBackgroundResource(R.drawable.btn_ripple);
		button3.setBackgroundResource(R.drawable.btn_ripple);
		button4.setBackgroundResource(R.drawable.btn_ripple);
		button5.setBackgroundResource(R.drawable.btn_ripple);
		linear3.setBackgroundResource(R.drawable.btn_ripple);
		button1.setTextColor(0xFFFFFFFF);
		button2.setTextColor(0xFFFFFFFF);
		button3.setTextColor(0xFFFFFFFF);
		button4.setTextColor(0xFFFFFFFF);
		button5.setTextColor(0xFFFFFFFF);
		button1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
	}
	
	
	public void _style_day() {
		linear1.setBackgroundColor(0xFFFFFFFF);
		button1.setBackgroundResource(R.drawable.btn_ripple_day);
		button2.setBackgroundResource(R.drawable.btn_ripple_day);
		button3.setBackgroundResource(R.drawable.btn_ripple_day);
		button4.setBackgroundResource(R.drawable.btn_ripple_day);
		button5.setBackgroundResource(R.drawable.btn_ripple_day);
		linear3.setBackgroundResource(R.drawable.btn_ripple_day);
		
		// النصوص النهارية (غامق)
		int dayText = 0xFF212121;
		button1.setTextColor(dayText);
		button2.setTextColor(dayText);
		button3.setTextColor(dayText);
		button4.setTextColor(dayText);
		button5.setTextColor(dayText);
		button1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
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