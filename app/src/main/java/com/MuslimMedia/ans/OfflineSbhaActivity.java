package com.MuslimMedia.ans;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.Context;
import android.content.DialogInterface;
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
import android.os.Vibrator;
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
import android.widget.TextView;
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

public class OfflineSbhaActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout toolbar;
	private LinearLayout wallpaper;
	private ImageView imageview1;
	private TextView textview2;
	private LinearLayout linear4;
	private ImageView imageview2;
	private LinearLayout linear8;
	private LinearLayout frame;
	private LinearLayout linear6;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout screen;
	private TextView number;
	private Button reset;
	private Button count;
	
	private SharedPreferences save;
	private Vibrator vib;
	private AlertDialog.Builder auto_sbha;
	private TimerTask timer;
	private TimerTask clickAnimTimer;
	private RequestNetwork check_connect;
	private RequestNetwork.RequestListener _check_connect_request_listener;
	private TimerTask chect_connect;
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.offline_sbha);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		toolbar = findViewById(R.id.toolbar);
		wallpaper = findViewById(R.id.wallpaper);
		imageview1 = findViewById(R.id.imageview1);
		textview2 = findViewById(R.id.textview2);
		linear4 = findViewById(R.id.linear4);
		imageview2 = findViewById(R.id.imageview2);
		linear8 = findViewById(R.id.linear8);
		frame = findViewById(R.id.frame);
		linear6 = findViewById(R.id.linear6);
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		screen = findViewById(R.id.screen);
		number = findViewById(R.id.number);
		reset = findViewById(R.id.reset);
		count = findViewById(R.id.count);
		save = getSharedPreferences("save", Activity.MODE_PRIVATE);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		auto_sbha = new AlertDialog.Builder(this);
		check_connect = new RequestNetwork(this);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), NfoActivity.class);
				startActivity(intent);
			}
		});
		
		reset.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				save.edit().remove("count").commit();
				number.setText("0");
				vib.vibrate((long)(100));
				if (timer != null) {
					    timer.cancel();
				}
				
				if (_timer != null) {
					    _timer.cancel();
					    _timer = new Timer(); // مهم جدًا لو عايز تشغله تاني بعدين
				}
				
			}
		});
		
		count.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				auto_sbha.setTitle("وضع العد التلقائي ");
				auto_sbha.setMessage("السلام عليكم ورحمة الله وبركاته \nأهلا بك في وضع العد التلقائي \nسيتم ضغط زر العد تلقائيا كل ثانية تلقائيا \nاستمر في ذكرك لله ");
				auto_sbha.setPositiveButton("جزاك الله خيرا ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						timer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										count.performClick();
									}
								});
							}
						};
						_timer.scheduleAtFixedRate(timer, (int)(100), (int)(1000));
					}
				});
				auto_sbha.create().show();
				return true;
			}
		});
		
		count.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				double currentCount = SketchwareUtil.parseDoubleSafe(number.getText().toString(), 0);
				number.setText(String.valueOf((long)(currentCount + 1)));
				save.edit().putString("count", number.getText().toString()).commit();
			}
		});
		
		_check_connect_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		_ClickAnimation(reset);
		_Animator(reset, "elevation", 10, 0);
		_ClickAnimation(count);
		_Animator(count, "elevation", 10, 0);
		number.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/digtal.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		_ICC(imageview2, "#FFFFFF", "#FFFFFF");
		chect_connect = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (SketchwareUtil.isConnected(getApplicationContext())) {
							textview2.setText("تم استعادة اتصالك بالإنترنت ، لازال بإمكانك استغلال هذا الوقت في ذكر الله ");
						}
						else {
							textview2.setText("أنت غير متصل بالإنترنت ، استغل هذا الوقت في ذكر الله ");
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(chect_connect, (int)(100), (int)(1000));
		textview2.setBackgroundResource(R.drawable.btn_ripple);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (save.getString("count", "").equals("")) {
			number.setText("0");
		}
		else {
			number.setText(save.getString("count", ""));
		}
	}

	@Override
	protected void onDestroy() {
		if (timer != null) {
			timer.cancel();
		}
		if (clickAnimTimer != null) {
			clickAnimTimer.cancel();
		}
		if (chect_connect != null) {
			chect_connect.cancel();
		}
		if (_timer != null) {
			_timer.cancel();
		}
		super.onDestroy();
	}

	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _ClickAnimation(final View _view) {
		_view.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						_Animator(_view, "elevation", 5, 70);
						_Animator(_view, "scaleX", 0.95d, 70);
						_Animator(_view, "scaleY", 0.95d, 70);
						clickAnimTimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										_Animator(_view, "elevation", 1, 100);
										_Animator(_view, "scaleX", 0.9d, 100);
										_Animator(_view, "scaleY", 0.9d, 100);
									}
								});
							}
						};
						_timer.schedule(clickAnimTimer, (int)(70));
						break; }
					case MotionEvent.ACTION_UP:{
						if (clickAnimTimer != null) {
							clickAnimTimer.cancel();
						}
						_Animator(_view, "elevation", 10, 100);
						_Animator(_view, "scaleX", 1, 100);
						_Animator(_view, "scaleY", 1, 100);
						clickAnimTimer = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										_Animator(_view, "elevation", 5, 100);
										_Animator(_view, "scaleX", 1, 100);
										_Animator(_view, "scaleY", 1, 100);
									}
								});
							}
						};
						_timer.schedule(clickAnimTimer, (int)(100));
						break; } } return false; } });
	}
	
	
	public void _ICC(final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RippleEffects(final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _HideNavigationBar() {
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}
	
	
	public void _DARK_ICONS() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _sx2(final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#212121")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
	}
	
	
	public void _RadiusGradient4(final View _view, final String _color1, final String _color2, final double _lt, final double _rt, final double _rb, final double _lb, final double _border, final String _color3) {
		int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colors);
		gd.setCornerRadii(new float[]{(int)_lt,(int)_lt,(int)_rt,(int)_rt,(int)_rb,(int)_rb,(int)_lb,(int)_lb});
		gd.setStroke((int) _border, Color.parseColor(_color3));
		_view.setBackground(gd);
	}
	
	
	public void _rippleRoundStroke(final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
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
