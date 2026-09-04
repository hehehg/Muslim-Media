package com.MuslimMedia.ans;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
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
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class SocialMediaActivity extends AppCompatActivity {
	
	public final int REQ_CD_FP = 101;
	
	private Timer _timer = new Timer();
	
	private FloatingActionButton _fab;
	private double h = 0;
	private double t = 0;
	private double g = 0;
	private double hl = 0;
	private double glsat = 0;
	private double glsat2 = 0;
	private double s = 0;
	private double onclick = 0;
	private double wts_click = 0;
	private double imo_click = 0;
	private boolean faab = false;
	private String names = "";
	private double exit = 0;
	private String banndedTxt = "";
	private String token = "";
	private double posCheck = 0;
	private double nu = 0;
	private String cut = "";
	private double nu2 = 0;
	private String Filtering_text = "";
	private double n = 0;
	private boolean fasb = false;
	private double page_start = 0;
	private String url = "";
	private String word = "";
	private double nighMode = 0;
	private String test = "";
	private double somd = 0;
	private double ytyt = 0;
	private double fb = 0;
	private double inst = 0;
	private double twit = 0;
	private double imooo = 0;
	private double wtst = 0;
	
	private ArrayList<HashMap<String, Object>> contacts = new ArrayList<>();
	private ArrayList<String> tokendGot = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> hist = new ArrayList<>();
	
	private LinearLayout fatherLinear;
	private LinearLayout linear1;
	private LinearLayout fab_linear;
	private LinearLayout mainlist;
	private LinearLayout in_app_browser;
	private LinearLayout safhaweb;
	private LinearLayout linear2;
	private LinearLayout search_linear;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ScrollView vscroll1;
	private LinearLayout toolbar;
	private LinearLayout nointernet;
	private ImageView imageview8;
	private TextView textview14;
	private ImageView imageview9;
	private TextView textview6;
	private TextView textview5;
	private ImageView imageview19;
	private EditText edittext5;
	private ImageView imageview20;
	private ImageView imageview21;
	private ImageView imageview1;
	private ImageView imageview2;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imo;
	private ImageView wts;
	private LinearLayout ofo;
	private TextView oi;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear8;
	private TextView fra;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private Button button2;
	private Button button7;
	private Button button3;
	private LinearLayout linear12;
	private TextView textview13;
	private TextView textview12;
	private TextView last5;
	private TextView textview9;
	private TextView textview2;
	private TextView textview4;
	private TextView timer;
	private LinearLayout linear9;
	private TextView textview15;
	private LinearLayout linear11;
	private Button button4;
	private EditText edittext1;
	private Button button5;
	private EditText edittext2;
	private Switch switch1;
	private Button button6;
	private Switch blurSwitch;
	private Switch blurVideoSwitch;
	private SeekBar blurAmount;
	private TextView blurAmountLabel;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private ProgressBar progressbar1;
	private LinearLayout linear15;
	private ImageView imageview10;
	private EditText edittext3;
	private ImageView imageview11;
	private ImageView imageview12;
	private SwipeRefreshLayout swiperefreshlayout1;
	private WebView webview1;
	private ListView listview2;
	private TextView textview1;
	private WebView Youtube;
	private WebView insta;
	private WebView twitt;
	private WebView whats;
	private WebView imoo;
	private WebView Facebook;
	private ImageView sbha_btn;
	private ImageView refresh;
	private ImageView imageview15;
	private ImageView mute;
	private ImageView light_night_mode;
	private ImageView block_urll;
	private ImageView web;
	private ImageView back_btn;
	private ImageView back_home_btn;
	private ImageView fab_enable_image;
	private ImageView fabBlurToggle;
	
	private Calendar tim = Calendar.getInstance();
	private SharedPreferences sv;
	private Calendar onofoclick = Calendar.getInstance();
	private Calendar tot = Calendar.getInstance();
	private Calendar totn = Calendar.getInstance();
	private TimerTask oo;
	private Intent fon = new Intent();
	private RequestNetwork nonet;
	private RequestNetwork.RequestListener _nonet_request_listener;
	private Calendar ondes = Calendar.getInstance();
	private Calendar df = Calendar.getInstance();
	private Calendar lf = Calendar.getInstance();
	private Calendar opo = Calendar.getInstance();
	private Calendar hpo = Calendar.getInstance();
	private Calendar lp = Calendar.getInstance();
	private AlertDialog.Builder d;
	private AlertDialog.Builder showImage;
	private AlertDialog.Builder firstdialog;
	private Intent fp = new Intent(Intent.ACTION_GET_CONTENT);
	private TimerTask tt;
	private SharedPreferences his;
	private SharedPreferences template;
	private TimerTask timm;
	private TimerTask moda;
	private SharedPreferences sav_mode;
	private Intent open_wts = new Intent();
	private SharedPreferences wts_clickk;
	private SharedPreferences imo_clic;
	private Intent go_to_sbha = new Intent();
	private final ArrayList<BroadcastReceiver> downloadReceivers = new ArrayList<>();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.social_media);
		initialize(_savedInstanceState);
		
		if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.S_V2
				&& (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
				|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED)) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		
		fatherLinear = findViewById(R.id.fatherLinear);
		linear1 = findViewById(R.id.linear1);
		fab_linear = findViewById(R.id.fab_linear);
		mainlist = findViewById(R.id.mainlist);
		in_app_browser = findViewById(R.id.in_app_browser);
		safhaweb = findViewById(R.id.safhaweb);
		linear2 = findViewById(R.id.linear2);
		search_linear = findViewById(R.id.search_linear);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		vscroll1 = findViewById(R.id.vscroll1);
		toolbar = findViewById(R.id.toolbar);
		nointernet = findViewById(R.id.nointernet);
		imageview8 = findViewById(R.id.imageview8);
		textview14 = findViewById(R.id.textview14);
		imageview9 = findViewById(R.id.imageview9);
		textview6 = findViewById(R.id.textview6);
		textview5 = findViewById(R.id.textview5);
		imageview19 = findViewById(R.id.imageview19);
		edittext5 = findViewById(R.id.edittext5);
		imageview20 = findViewById(R.id.imageview20);
		imageview21 = findViewById(R.id.imageview21);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);
		imageview6 = findViewById(R.id.imageview6);
		imo = findViewById(R.id.imo);
		wts = findViewById(R.id.wts);
		ofo = findViewById(R.id.ofo);
		oi = findViewById(R.id.oi);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		linear8 = findViewById(R.id.linear8);
		fra = findViewById(R.id.fra);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		button2 = findViewById(R.id.button2);
		button7 = findViewById(R.id.button7);
		button3 = findViewById(R.id.button3);
		linear12 = findViewById(R.id.linear12);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		last5 = findViewById(R.id.last5);
		textview9 = findViewById(R.id.textview9);
		textview2 = findViewById(R.id.textview2);
		textview4 = findViewById(R.id.textview4);
		timer = findViewById(R.id.timer);
		linear9 = findViewById(R.id.linear9);
		textview15 = findViewById(R.id.textview15);
		linear11 = findViewById(R.id.linear11);
		button4 = findViewById(R.id.button4);
		edittext1 = findViewById(R.id.edittext1);
		button5 = findViewById(R.id.button5);
		edittext2 = findViewById(R.id.edittext2);
		switch1 = findViewById(R.id.switch1);
		button6 = findViewById(R.id.button6);
		blurSwitch = findViewById(R.id.blur_switch);
		blurVideoSwitch = findViewById(R.id.blur_video_switch);
		blurAmount = findViewById(R.id.blur_amount);
		blurAmountLabel = findViewById(R.id.blur_amount_label);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		progressbar1 = findViewById(R.id.progressbar1);
		linear15 = findViewById(R.id.linear15);
		imageview10 = findViewById(R.id.imageview10);
		edittext3 = findViewById(R.id.edittext3);
		imageview11 = findViewById(R.id.imageview11);
		imageview12 = findViewById(R.id.imageview12);
		swiperefreshlayout1 = findViewById(R.id.swiperefreshlayout1);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		listview2 = findViewById(R.id.listview2);
		textview1 = findViewById(R.id.textview1);
		Youtube = findViewById(R.id.Youtube);
		Youtube.getSettings().setJavaScriptEnabled(true);
		Youtube.getSettings().setSupportZoom(true);
		insta = findViewById(R.id.insta);
		insta.getSettings().setJavaScriptEnabled(true);
		insta.getSettings().setSupportZoom(true);
		twitt = findViewById(R.id.twitt);
		twitt.getSettings().setJavaScriptEnabled(true);
		twitt.getSettings().setSupportZoom(true);
		whats = findViewById(R.id.whats);
		whats.getSettings().setJavaScriptEnabled(true);
		whats.getSettings().setSupportZoom(true);
		imoo = findViewById(R.id.imoo);
		imoo.getSettings().setJavaScriptEnabled(true);
		imoo.getSettings().setSupportZoom(true);
		Facebook = findViewById(R.id.Facebook);
		Facebook.getSettings().setJavaScriptEnabled(true);
		Facebook.getSettings().setSupportZoom(true);
		sbha_btn = findViewById(R.id.sbha_btn);
		refresh = findViewById(R.id.refresh);
		imageview15 = findViewById(R.id.imageview15);
		mute = findViewById(R.id.mute);
		light_night_mode = findViewById(R.id.light_night_mode);
		block_urll = findViewById(R.id.block_urll);
		web = findViewById(R.id.web);
		back_btn = findViewById(R.id.back_btn);
		back_home_btn = findViewById(R.id.back_home_btn);
		fab_enable_image = findViewById(R.id.fab_enable_image);
		fabBlurToggle = findViewById(R.id.fab_blur_toggle);
		sv = getSharedPreferences("sv", Activity.MODE_PRIVATE);
		nonet = new RequestNetwork(this);
		d = new AlertDialog.Builder(this);
		showImage = new AlertDialog.Builder(this);
		firstdialog = new AlertDialog.Builder(this);
		fp.setType("*/*");
		fp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		his = getSharedPreferences("his", Activity.MODE_PRIVATE);
		template = getSharedPreferences("template", Activity.MODE_PRIVATE);
		sav_mode = getSharedPreferences("svamode", Activity.MODE_PRIVATE);
		wts_clickk = getSharedPreferences("clic", Activity.MODE_PRIVATE);
		imo_clic = getSharedPreferences("clikk", Activity.MODE_PRIVATE);
		blurSwitch.setChecked(sv.getBoolean("blur_enabled", true));
		blurVideoSwitch.setChecked(sv.getBoolean("blur_video_enabled", true));
		blurAmount.setProgress(sv.getInt("blur_amount", 10));
		updateBlurFabIcon();
		blurSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
			sv.edit().putBoolean("blur_enabled", isChecked).apply();
			updateBlurFabIcon();
			applyBlurToAllWebViews();
		});
		fabBlurToggle.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				blurSwitch.setChecked(!blurSwitch.isChecked());
				updateBlurFabIcon();
			}
		});
		blurVideoSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
			sv.edit().putBoolean("blur_video_enabled", isChecked).apply();
			applyBlurToAllWebViews();
		});
		blurAmount.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
				if (fromUser) {
					sv.edit().putInt("blur_amount", Math.max(2, progress)).apply();
					applyBlurToAllWebViews();
				}
			}
			@Override public void onStartTrackingTouch(SeekBar seekBar) { }
			@Override public void onStopTrackingTouch(SeekBar seekBar) { }
		});
		
		search_linear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				safhaweb.setVisibility(View.GONE);
				mainlist.setVisibility(View.GONE);
				in_app_browser.setVisibility(View.VISIBLE);
			}
		});
		
		imageview8.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (onclick == 0) {
					linear3.setVisibility(View.GONE);
					linear4.setVisibility(View.GONE);
					linear5.setVisibility(View.GONE);
					nointernet.setVisibility(View.GONE);
					vscroll1.setVisibility(View.VISIBLE);
					ofo.setVisibility(View.VISIBLE);
					onclick++;
				}
				else {
					if (Double.parseDouble(sv.getString("olpo", "0")) > Double.parseDouble(sv.getString("glsa", "0"))) {
						linear3.setVisibility(View.GONE);
						linear4.setVisibility(View.GONE);
						safhaweb.setVisibility(View.GONE);
						linear5.setVisibility(View.GONE);
						vscroll1.setVisibility(View.VISIBLE);
						ofo.setVisibility(View.VISIBLE);
						textview4.setVisibility(View.VISIBLE);
						SketchwareUtil.showMessage(getApplicationContext(), "انتهت الجلسات المتاحه لليوم \nعاود فتح التطبيق غداً ");
					}
					else {
						ofo.setVisibility(View.GONE);
						linear3.setVisibility(View.VISIBLE);
						linear4.setVisibility(View.VISIBLE);
						linear5.setVisibility(View.VISIBLE);
						vscroll1.setVisibility(View.GONE);
					}
					onclick = 0;
				}
			}
		});
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				safhaweb.setVisibility(View.GONE);
				mainlist.setVisibility(View.GONE);
				in_app_browser.setVisibility(View.VISIBLE);
				if (!edittext5.getText().toString().equals("")) {
					edittext3.setText(edittext5.getText().toString());
				}
			}
		});
		
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				safhaweb.setVisibility(View.GONE);
				mainlist.setVisibility(View.GONE);
				in_app_browser.setVisibility(View.VISIBLE);
			}
		});
		
		imageview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				safhaweb.setVisibility(View.GONE);
				mainlist.setVisibility(View.GONE);
				in_app_browser.setVisibility(View.VISIBLE);
			}
		});
		
		imageview1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				imageview1.setVisibility(View.GONE);
				sv.edit().putString("y", "y").commit();
				return true;
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (ytyt > 0) {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.GONE);
					Youtube.setVisibility(View.VISIBLE);
					insta.setVisibility(View.GONE);
					twitt.setVisibility(View.GONE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
				}
				else {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.GONE);
					Youtube.setVisibility(View.VISIBLE);
					insta.setVisibility(View.GONE);
					twitt.setVisibility(View.GONE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
					Youtube.loadUrl("https://m.youtube.com/");
					ytyt++;
				}
			}
		});
		
		imageview2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				imageview2.setVisibility(View.GONE);
				sv.edit().putString("f", "f").commit();
				return true;
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (fb > 0) {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.VISIBLE);
					Youtube.setVisibility(View.GONE);
					insta.setVisibility(View.GONE);
					twitt.setVisibility(View.GONE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
				}
				else {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.VISIBLE);
					Youtube.setVisibility(View.GONE);
					insta.setVisibility(View.GONE);
					twitt.setVisibility(View.GONE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
					    Facebook.getSettings().setJavaScriptEnabled(true);
					    Facebook.getSettings().setLoadWithOverviewMode(true);
					    Facebook.getSettings().setUseWideViewPort(true);
					    Facebook.getSettings().setDomStorageEnabled(true);
					    Facebook.getSettings().setBuiltInZoomControls(false);
					
					    Facebook.loadUrl("https://m.facebook.com/");
					
					    String userAgent = Facebook.getSettings().getUserAgentString();
					
					    try {
						        String androidString = Facebook.getSettings().getUserAgentString().
						                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
						
						        userAgent = Facebook.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
						
						    }catch (Exception e){
						        e.printStackTrace();
						    }
					
					    Facebook.getSettings().setUserAgentString(userAgent);
					    Facebook.reload();
					fb++;
				}
			}
		});
		
		imageview3.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				imageview3.setVisibility(View.GONE);
				sv.edit().putString("g", "g").commit();
				return true;
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (inst > 0) {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.GONE);
					Youtube.setVisibility(View.GONE);
					insta.setVisibility(View.VISIBLE);
					twitt.setVisibility(View.GONE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
				}
				else {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.GONE);
					Youtube.setVisibility(View.GONE);
					insta.setVisibility(View.VISIBLE);
					twitt.setVisibility(View.GONE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
					insta.loadUrl("https://www.instagram.com/");
					inst++;
				}
			}
		});
		
		imageview4.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				imageview4.setVisibility(View.GONE);
				sv.edit().putString("h", "h").commit();
				return true;
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (twit > 0) {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.GONE);
					Youtube.setVisibility(View.GONE);
					insta.setVisibility(View.GONE);
					twitt.setVisibility(View.VISIBLE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
				}
				else {
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.GONE);
					safhaweb.setVisibility(View.VISIBLE);
					Facebook.setVisibility(View.GONE);
					Youtube.setVisibility(View.GONE);
					insta.setVisibility(View.GONE);
					twitt.setVisibility(View.VISIBLE);
					whats.setVisibility(View.GONE);
					imoo.setVisibility(View.GONE);
					twitt.loadUrl("https://x.com/");
					twit++;
				}
			}
		});
		
		imo.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				imo.setVisibility(View.GONE);
				sv.edit().putString("k", "k").commit();
				return true;
			}
		});
		
		imo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (imo_click == 0) {
					showImage.setTitle("تأكيد");
					showImage.setMessage("يُفضل تفعيل عرض الصور أثناء استخدام تطبيق التليجرام لأول مرة  ، \nلتستطيع عرض QR ويعمل التطبيق بشكل جيد \nهل تود الإستمرار بوضع عرض الصور ؟");
					showImage.setPositiveButton("نعم ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							mainlist.setVisibility(View.GONE);
							in_app_browser.setVisibility(View.GONE);
							safhaweb.setVisibility(View.VISIBLE);
							Facebook.setVisibility(View.GONE);
							Youtube.setVisibility(View.GONE);
							insta.setVisibility(View.GONE);
							twitt.setVisibility(View.GONE);
							whats.setVisibility(View.GONE);
							imoo.setVisibility(View.VISIBLE);
							imoo.getSettings().setJavaScriptEnabled(true);
							    
							   
							imoo.getSettings().setLoadsImagesAutomatically(true);
							 imoo.getSettings().setLoadWithOverviewMode(true);
							    imoo.getSettings().setUseWideViewPort(true);
							    imoo.getSettings().setDomStorageEnabled(true);
							    imoo.getSettings().setBuiltInZoomControls(true);
							
							    imoo.loadUrl("https://web.telegram.org/");
							
							    String userAgent = imoo.getSettings().getUserAgentString();
							
							    try {
								        String androidString = imoo.getSettings().getUserAgentString().
								                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
								
								        userAgent = imoo.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
								
								    }catch (Exception e){
								        e.printStackTrace();
								    }
							
							    imoo.getSettings().setUserAgentString(userAgent);
							    imoo.reload();
							SketchwareUtil.showMessage(getApplicationContext(), "يمكنك تعطيل ظهور الصور باختيارك لا   .");
						}
					});
					showImage.setNegativeButton("لا", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							mainlist.setVisibility(View.GONE);
							in_app_browser.setVisibility(View.GONE);
							safhaweb.setVisibility(View.VISIBLE);
							Facebook.setVisibility(View.GONE);
							Youtube.setVisibility(View.GONE);
							insta.setVisibility(View.GONE);
							twitt.setVisibility(View.GONE);
							whats.setVisibility(View.GONE);
							imoo.setVisibility(View.VISIBLE);
							imoo.getSettings().setJavaScriptEnabled(true);
							    
							   
							imoo.getSettings().setLoadsImagesAutomatically(false);
							 imoo.getSettings().setLoadWithOverviewMode(true);
							    imoo.getSettings().setUseWideViewPort(true);
							    imoo.getSettings().setDomStorageEnabled(true);
							    imoo.getSettings().setBuiltInZoomControls(true);
							
							    imoo.loadUrl("https://web.telegram.org/");
							
							    String userAgent = imoo.getSettings().getUserAgentString();
							
							    try {
								        String androidString = imoo.getSettings().getUserAgentString().
								                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
								
								        userAgent = imoo.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
								
								    }catch (Exception e){
								        e.printStackTrace();
								    }
							
							    imoo.getSettings().setUserAgentString(userAgent);
							    imoo.reload();
							SketchwareUtil.showMessage(getApplicationContext(), "يمكنك تعطيل ظهور الصور باختيارك لا   .");
						}
					});
					showImage.create().show();
					imo_click++;
				}
				else {
					if (imooo > 0) {
						mainlist.setVisibility(View.GONE);
						in_app_browser.setVisibility(View.GONE);
						safhaweb.setVisibility(View.VISIBLE);
						Facebook.setVisibility(View.GONE);
						Youtube.setVisibility(View.GONE);
						insta.setVisibility(View.GONE);
						twitt.setVisibility(View.GONE);
						whats.setVisibility(View.GONE);
						imoo.setVisibility(View.VISIBLE);
					}
					else {
						mainlist.setVisibility(View.GONE);
						in_app_browser.setVisibility(View.GONE);
						safhaweb.setVisibility(View.VISIBLE);
						Facebook.setVisibility(View.GONE);
						Youtube.setVisibility(View.GONE);
						insta.setVisibility(View.GONE);
						twitt.setVisibility(View.GONE);
						whats.setVisibility(View.GONE);
						imoo.setVisibility(View.VISIBLE);
						imoo.getSettings().setJavaScriptEnabled(true);
						 imoo.getSettings().setLoadWithOverviewMode(true);
						    imoo.getSettings().setUseWideViewPort(true);
						    imoo.getSettings().setDomStorageEnabled(true);
						    imoo.getSettings().setBuiltInZoomControls(true);
						
						    imoo.loadUrl("https://web.telegram.org/");
						
						    String userAgent = imoo.getSettings().getUserAgentString();
						
						    try {
							        String androidString = imoo.getSettings().getUserAgentString().
							                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
							
							        userAgent = imoo.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
							
							    }catch (Exception e){
							        e.printStackTrace();
							    }
						
						    imoo.getSettings().setUserAgentString(userAgent);
						    imoo.reload();
						imooo++;
					}
				}
			}
		});
		
		wts.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				wts.setVisibility(View.GONE);
				sv.edit().putString("j", "j").commit();
				return true;
			}
		});
		
		wts.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (wts_click == 0) {
					showImage.setTitle("تأكيد");
					showImage.setMessage("يُفضل تفعيل عرض الصور أثناء استخدام تطبيق الواتس لأول مرة  ، \nلتستطيع عرض QR ويعمل التطبيق بشكل جيد \nهل تود الإستمرار بوضع عرض الصور ؟");
					showImage.setPositiveButton("نعم ", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							mainlist.setVisibility(View.GONE);
							in_app_browser.setVisibility(View.GONE);
							safhaweb.setVisibility(View.VISIBLE);
							Facebook.setVisibility(View.GONE);
							Youtube.setVisibility(View.GONE);
							insta.setVisibility(View.GONE);
							twitt.setVisibility(View.GONE);
							whats.setVisibility(View.VISIBLE);
							imoo.setVisibility(View.GONE);
							whats.getSettings().setJavaScriptEnabled(true);
							   
							whats.getSettings().setLoadsImagesAutomatically(true);
							    whats.getSettings().setLoadWithOverviewMode(true);
							    whats.getSettings().setUseWideViewPort(true);
							    whats.getSettings().setDomStorageEnabled(true);
							    whats.getSettings().setBuiltInZoomControls(true);
							
							    whats.loadUrl("https://web.whatsapp.com/");
							
							    String userAgent = whats.getSettings().getUserAgentString();
							
							    try {
								        String androidString = whats.getSettings().getUserAgentString().
								                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
								
								        userAgent = whats.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
								
								    }catch (Exception e){
								        e.printStackTrace();
								    }
							
							    whats.getSettings().setUserAgentString(userAgent);
							    whats.reload();
							timer.setVisibility(View.VISIBLE);
							SketchwareUtil.showMessage(getApplicationContext(), "يمكنك تعطيل ظهور الصور باختيارك لا   .");
						}
					});
					showImage.setNegativeButton("لا", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface _dialog, int _which) {
							mainlist.setVisibility(View.GONE);
							in_app_browser.setVisibility(View.GONE);
							safhaweb.setVisibility(View.VISIBLE);
							Facebook.setVisibility(View.GONE);
							Youtube.setVisibility(View.GONE);
							insta.setVisibility(View.GONE);
							twitt.setVisibility(View.GONE);
							whats.setVisibility(View.VISIBLE);
							imoo.setVisibility(View.GONE);
							whats.getSettings().setJavaScriptEnabled(true);
							   
							whats.getSettings().setLoadsImagesAutomatically(false);
							    whats.getSettings().setLoadWithOverviewMode(true);
							    whats.getSettings().setUseWideViewPort(true);
							    whats.getSettings().setDomStorageEnabled(true);
							    whats.getSettings().setBuiltInZoomControls(true);
							
							    whats.loadUrl("https://web.whatsapp.com/");
							
							    String userAgent = whats.getSettings().getUserAgentString();
							
							    try {
								        String androidString = whats.getSettings().getUserAgentString().
								                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
								
								        userAgent = whats.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
								
								    }catch (Exception e){
								        e.printStackTrace();
								    }
							
							    whats.getSettings().setUserAgentString(userAgent);
							    whats.reload();
							timer.setVisibility(View.VISIBLE);
							SketchwareUtil.showMessage(getApplicationContext(), "يمكنك تعطيل ظهور أي تطبيق بالضغط مطولاً عليه  .");
						}
					});
					showImage.create().show();
					wts_click++;
				}
				else {
					if (wtst > 0) {
						mainlist.setVisibility(View.GONE);
						in_app_browser.setVisibility(View.GONE);
						safhaweb.setVisibility(View.VISIBLE);
						Facebook.setVisibility(View.GONE);
						Youtube.setVisibility(View.GONE);
						insta.setVisibility(View.GONE);
						twitt.setVisibility(View.GONE);
						whats.setVisibility(View.VISIBLE);
						imoo.setVisibility(View.GONE);
						timer.setVisibility(View.VISIBLE);
					}
					else {
						mainlist.setVisibility(View.GONE);
						in_app_browser.setVisibility(View.GONE);
						safhaweb.setVisibility(View.VISIBLE);
						Facebook.setVisibility(View.GONE);
						Youtube.setVisibility(View.GONE);
						insta.setVisibility(View.GONE);
						twitt.setVisibility(View.GONE);
						whats.setVisibility(View.VISIBLE);
						imoo.setVisibility(View.GONE);
						whats.getSettings().setJavaScriptEnabled(true);
						    whats.getSettings().setLoadWithOverviewMode(true);
						    whats.getSettings().setUseWideViewPort(true);
						    whats.getSettings().setDomStorageEnabled(true);
						    whats.getSettings().setBuiltInZoomControls(true);
						
						    whats.loadUrl("https://web.whatsapp.com/");
						
						    String userAgent = whats.getSettings().getUserAgentString();
						
						    try {
							        String androidString = whats.getSettings().getUserAgentString().
							                substring(userAgent.indexOf("("),userAgent.indexOf(")")+ 1);
							
							        userAgent = whats.getSettings().getUserAgentString().replace(androidString,"X11; Linux x86_64");
							
							    }catch (Exception e){
							        e.printStackTrace();
							    }
						
						    whats.getSettings().setUserAgentString(userAgent);
						    whats.reload();
						timer.setVisibility(View.VISIBLE);
						wtst++;
					}
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				lf = Calendar.getInstance();
				sv.edit().putString("tim1", new SimpleDateFormat("HHmm").format(lf.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
				oo.cancel();
				finishAffinity();
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (onclick == 0) {
					linear3.setVisibility(View.GONE);
					linear4.setVisibility(View.GONE);
					linear5.setVisibility(View.GONE);
					nointernet.setVisibility(View.GONE);
					vscroll1.setVisibility(View.VISIBLE);
					ofo.setVisibility(View.VISIBLE);
					onclick++;
				}
				else {
					if (Double.parseDouble(sv.getString("olpo", "0")) > Double.parseDouble(sv.getString("glsa", "0"))) {
						linear3.setVisibility(View.GONE);
						linear4.setVisibility(View.GONE);
						safhaweb.setVisibility(View.GONE);
						linear5.setVisibility(View.GONE);
						vscroll1.setVisibility(View.VISIBLE);
						ofo.setVisibility(View.VISIBLE);
						textview4.setVisibility(View.VISIBLE);
						SketchwareUtil.showMessage(getApplicationContext(), "انتهت الجلسات المتاحه لليوم \nعاود فتح التطبيق غداً ");
					}
					else {
						ofo.setVisibility(View.GONE);
						linear3.setVisibility(View.VISIBLE);
						linear4.setVisibility(View.VISIBLE);
						linear5.setVisibility(View.VISIBLE);
						vscroll1.setVisibility(View.GONE);
					}
					onclick = 0;
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("تأكيد حذف التوقيتات ");
				d.setMessage("هل أنت متأكد من انك تريد حذف التوقيتات الحالية ؟");
				d.setPositiveButton("نعم", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						linear6.setVisibility(View.VISIBLE);
						linear7.setVisibility(View.VISIBLE);
						sv.edit().putString("timtom", "0").commit();
						sv.edit().putString("glsa", "2").commit();
						SketchwareUtil.showMessage(getApplicationContext(), "اتق الله  ");
					}
				});
				d.setNegativeButton("لا", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		
		textview13.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "صنع بواسطة : تطبيقات المسلم ");
				return true;
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				fon.setClass(getApplicationContext(), NfoActivity.class);
				startActivity(fon);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!edittext1.getText().toString().equals("")) {
					sv.edit().putString("hali", edittext1.getText().toString().replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
					linear6.setVisibility(View.GONE);
					sv.edit().putString("oiio", "lll").commit();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "قم بإدخال مدة الجلسة أولاً ");
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (sv.getString("hali", "").equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "قم بإدخال مدة الجلسة أولاً ");
				}
				else {
					if (edittext2.getText().toString().equals("")) {
						SketchwareUtil.showMessage(getApplicationContext(), "قم بإدخال عدد الجلسات أولاً ");
					}
					else {
						double sessionCount = SketchwareUtil.parseDoubleSafe(edittext2.getText().toString(), -1);
						if (sessionCount >= 1) {
							opo = Calendar.getInstance();
							sv.edit().putString("glsa", edittext2.getText().toString().replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
							last5.setText("هذه الجلسة رقم   ".concat(sv.getString("olpo", "").concat("  من أصل    ".concat(sv.getString("glsa", "").concat("   جلسات .")))));
							sv.edit().putString("bthp", "bnb").commit();
							linear7.setVisibility(View.GONE);
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "قم بإدخال عدد جلسة واحدة فأكثر ");
						}
					}
				}
			}
		});
		
		switch1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (sv.getString("switch", "").equals("true")) {
					Youtube.getSettings().setLoadsImagesAutomatically(false);
					Facebook.getSettings().setLoadsImagesAutomatically(false);
					twitt.getSettings().setLoadsImagesAutomatically(false);
					insta.getSettings().setLoadsImagesAutomatically(false);
					whats.getSettings().setLoadsImagesAutomatically(false);
					imoo.getSettings().setLoadsImagesAutomatically(false);
					webview1.getSettings().setLoadsImagesAutomatically(false);
					button6.setText("تفعيل ظهور الصور");
					switch1.setChecked(false);
					sv.edit().putString("switch", "false").commit();
					fab_enable_image.setImageResource(R.drawable.ic_camera_alt_white);
				}
				else {
					Youtube.getSettings().setLoadsImagesAutomatically(true);
					Facebook.getSettings().setLoadsImagesAutomatically(true);
					twitt.getSettings().setLoadsImagesAutomatically(true);
					insta.getSettings().setLoadsImagesAutomatically(true);
					whats.getSettings().setLoadsImagesAutomatically(true);
					imoo.getSettings().setLoadsImagesAutomatically(true);
					webview1.getSettings().setLoadsImagesAutomatically(true);
					switch1.setChecked(true);
					button6.setText("تعطيل ظهور الصور");
					sv.edit().putString("switch", "true").commit();
					fab_enable_image.setImageResource(R.drawable.ic_layers_clear_white);
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (sv.getString("switch", "").equals("true")) {
					Youtube.getSettings().setLoadsImagesAutomatically(false);
					Facebook.getSettings().setLoadsImagesAutomatically(false);
					twitt.getSettings().setLoadsImagesAutomatically(false);
					insta.getSettings().setLoadsImagesAutomatically(false);
					whats.getSettings().setLoadsImagesAutomatically(false);
					imoo.getSettings().setLoadsImagesAutomatically(false);
					webview1.getSettings().setLoadsImagesAutomatically(false);
					button6.setText("تفعيل ظهور الصور");
					switch1.setChecked(false);
					sv.edit().putString("switch", "false").commit();
					fab_enable_image.setImageResource(R.drawable.ic_camera_alt_white);
				}
				else {
					Youtube.getSettings().setLoadsImagesAutomatically(true);
					Facebook.getSettings().setLoadsImagesAutomatically(true);
					twitt.getSettings().setLoadsImagesAutomatically(true);
					insta.getSettings().setLoadsImagesAutomatically(true);
					whats.getSettings().setLoadsImagesAutomatically(true);
					imoo.getSettings().setLoadsImagesAutomatically(true);
					webview1.getSettings().setLoadsImagesAutomatically(true);
					switch1.setChecked(true);
					button6.setText("تعطيل ظهور الصور");
					sv.edit().putString("switch", "true").commit();
					fab_enable_image.setImageResource(R.drawable.ic_layers_clear_white);
				}
			}
		});
		
		imageview10.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				if (!edittext3.getText().toString().trim().isEmpty()) {
					if (template.getString("bT", "").contains(edittext3.getText().toString().trim().toLowerCase().trim()) || banndedTxt.contains(edittext3.getText().toString().trim().toLowerCase())) {
						SketchwareUtil.showMessage(getApplicationContext(), "Already added");
					}
					else {
						banndedTxt = banndedTxt.concat("\n".concat(edittext3.getText().toString().trim().toLowerCase()));
						template.edit().putString("bT", banndedTxt).commit();
						SketchwareUtil.showMessage(getApplicationContext(), "Done add word \"".concat(edittext3.getText().toString().trim().concat("\" in block-list")));
						_FilterTextBy_DarkGhost();
						banndedTxt = banndedTxt.replace("\n", "¶").replace("¶", "¶").replace("§¶¶", "§¶");
						banndedTxt = "¶".concat(banndedTxt.concat("§"));
						_indextext();
					}
					edittext3.setText("");
				}
				return true;
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_indextext();
				Filtering_text = edittext3.getText().toString().toLowerCase().trim();
				for(int _repeat16 = 0; _repeat16 < (int)(tokendGot.size()); _repeat16++) {
					Filtering_text = Filtering_text.trim().replace(tokendGot.get((int)(_repeat16)), "");
				}
				textview1.setText("https://www.google.com/search?q=".concat(Filtering_text.concat("&safe=strict")));
				edittext3.setText("");
				tt = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (Filtering_text.equals("")) {
									SketchwareUtil.showMessage(getApplicationContext(), "     سبحان الله وبحمده\n     سبحان الله العظيم ");
								}
								else {
									if (Filtering_text.equals(" ")) {
										SketchwareUtil.showMessage(getApplicationContext(), "    سبحان الله وبحمده\n    سبحان الله العظيم ");
									}
									else {
										if (Filtering_text.equals("  ")) {
											SketchwareUtil.showMessage(getApplicationContext(), "   سبحان الله وبحمده\n   سبحان الله العظيم ");
										}
										else {
											if (Filtering_text.contains("https") || (Filtering_text.contains("http") || Filtering_text.contains("http:"))) {
												webview1.loadUrl(Filtering_text);
												webview1.setVisibility(View.VISIBLE);
												listview2.setVisibility(View.GONE);
												fasb = false;
											}
											else {
												webview1.loadUrl(textview1.getText().toString());
												webview1.setVisibility(View.VISIBLE);
												listview2.setVisibility(View.GONE);
												fasb = false;
											}
										}
									}
								}
							}
						});
					}
				};
				_timer.schedule(tt, (int)(300));
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("text", Filtering_text);
					hist.add(_item);
				}
				
				his.edit().putString("dato", new Gson().toJson(hist)).commit();
				listview2.setAdapter(new Listview2Adapter(hist));
				((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
				block_urll.setVisibility(View.VISIBLE);
				webview1.setVisibility(View.VISIBLE);
			}
		});
		
		edittext3.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				edittext3.setText("");
				return true;
			}
		});
		
		imageview11.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				his.edit().putString("dato", "").commit();
				return true;
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!his.getString("dato", "").equals("")) {
					if (fasb) {
						webview1.setVisibility(View.VISIBLE);
						listview2.setVisibility(View.GONE);
						fasb = false;
					}
					else {
						webview1.setVisibility(View.VISIBLE);
						listview2.setVisibility(View.VISIBLE);
						fasb = true;
					}
				}
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				((ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", webview1.getUrl()));
				SketchwareUtil.showMessage(getApplicationContext(), "تم النسخ");
			}
		});
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				edittext3.setText(_url);
				url = _url;
				_on_webview_start_loading();
				progressbar1.setVisibility(View.VISIBLE);
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				swiperefreshlayout1.setRefreshing(false);
				progressbar1.setVisibility(View.GONE);
				if (!webview1.getUrl().contains("https://www.google.com/search")) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("text", webview1.getUrl());
						hist.add(_item);
					}
					
					his.edit().putString("dato", new Gson().toJson(hist)).commit();
					listview2.setAdapter(new Listview2Adapter(hist));
					((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				edittext3.setText(hist.get((int)_position).get("text").toString());
			}
		});
		
		Youtube.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.contains("https://m.youtube.com/") || (_url.contains("https://accounts.google.com/") || _url.contains("https://studio.youtube.com/"))) {
					
				}
				else {
					Youtube.stopLoading();
					Youtube.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				if (_url.contains("https://m.youtube.com/") || (_url.contains("https://accounts.google.com/") || _url.contains("https://studio.youtube.com/"))) {
					
				}
				else {
					Youtube.stopLoading();
					Youtube.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		insta.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.contains("https://www.instagram.com/")) {
					
				}
				else {
					insta.stopLoading();
					insta.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				if (_url.contains("https://www.instagram.com/")) {
					
				}
				else {
					insta.stopLoading();
					insta.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		twitt.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.contains("https://x.com/")) {
					
				}
				else {
					twitt.stopLoading();
					twitt.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				if (_url.contains("https://x.com/")) {
					
				}
				else {
					twitt.stopLoading();
					twitt.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		whats.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.contains("https://web.whatsapp.com/")) {
					
				}
				else {
					whats.stopLoading();
					whats.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				if (_url.contains("https://web.whatsapp.com/")) {
					
				}
				else {
					whats.stopLoading();
					whats.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		imoo.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.contains("https://web.telegram.org/")) {
					
				}
				else {
					imoo.stopLoading();
					imoo.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				if (_url.contains("https://web.telegram.org/")) {
					
				}
				else {
					imoo.stopLoading();
					imoo.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		Facebook.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				if (_url.contains("https://www.facebook.com/") || (_url.contains("https://m.facebook.com/") || _url.contains("https://business.facebook.com/"))) {
					
				}
				else {
					Facebook.stopLoading();
					Facebook.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
				}
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				applyBlur(_param1);
				if (_url.contains("https://www.facebook.com/") || (_url.contains("https://m.facebook.com/") || _url.contains("https://business.facebook.com/"))) {
					
				}
				else {
					Facebook.stopLoading();
					Facebook.goBack();
					safhaweb.setVisibility(View.GONE);
					mainlist.setVisibility(View.GONE);
					in_app_browser.setVisibility(View.VISIBLE);
					edittext3.setText(_url);
					timm = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									imageview10.performClick();
								}
							});
						}
					};
					_timer.schedule(timm, (int)(500));
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		sbha_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				go_to_sbha.setClass(getApplicationContext(), OfflineSbhaActivity.class);
				startActivity(go_to_sbha);
			}
		});
		
		refresh.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				webview1.loadUrl(webview1.getUrl());
				Youtube.loadUrl(Youtube.getUrl());
				insta.loadUrl(insta.getUrl());
				twitt.loadUrl(twitt.getUrl());
				whats.loadUrl(whats.getUrl());
				imoo.loadUrl(imoo.getUrl());
				Facebook.loadUrl(Facebook.getUrl());
			}
		});
		
		imageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				shareApplication();
			}
		});
		
		mute.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (somd == 0) {
					AudioManager aManager=(AudioManager)getSystemService(AUDIO_SERVICE); aManager.setStreamMute(AudioManager.STREAM_MUSIC, true); 
					
					somd++;
					mute.setImageResource(R.drawable.ic_mic_white);
				}
				else {
					AudioManager aManager=(AudioManager)getSystemService(AUDIO_SERVICE); aManager.setStreamMute(AudioManager.STREAM_MUSIC, false); 
					
					somd = 0;
					mute.setImageResource(R.drawable.ic_mic_off_white);
				}
			}
		});
		
		light_night_mode.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (nighMode == 0) {
					linear1.setBackgroundColor(0xFFFFFFFF);
					nighMode++;
					_style_day();
					light_night_mode.setImageResource(R.drawable.ic_brightness_4_white);
					sav_mode.edit().putString("mode", "day").commit();
				}
				else {
					linear1.setBackgroundColor(0xFF000000);
					nighMode = 0;
					textview14.setTextColor(0xFFFFFFFF);
					textview6.setTextColor(0xFFFFFFFF);
					textview5.setTextColor(0xFFFFFFFF);
					oi.setTextColor(0xFFFFFFFF);
					textview10.setTextColor(0xFFFFFFFF);
					textview11.setTextColor(0xFFFFFFFF);
					fra.setTextColor(0xFFFFFFFF);
					textview7.setTextColor(0xFFFFFFFF);
					textview8.setTextColor(0xFFFFFFFF);
					button2.setTextColor(0xFFFFFFFF);
					button3.setTextColor(0xFFFFFFFF);
					textview13.setTextColor(0xFFFFFFFF);
					textview12.setTextColor(0xFFFFFFFF);
					last5.setTextColor(0xFFFFFFFF);
					textview9.setTextColor(0xFFFFFFFF);
					textview2.setTextColor(0xFFFFFFFF);
					textview4.setTextColor(0xFFFFFFFF);
					timer.setTextColor(0xFFFFFFFF);
					textview15.setTextColor(0xFFFFFFFF);
					button4.setTextColor(0xFFFFFFFF);
					edittext1.setTextColor(0xFFFFFFFF);
					button5.setTextColor(0xFFFFFFFF);
					edittext2.setTextColor(0xFFFFFFFF);
					switch1.setTextColor(0xFFFFFFFF);
					button6.setTextColor(0xFFFFFFFF);
					edittext3.setTextColor(0xFFFFFFFF);
					textview6.setTextColor(0xFFFFFFFF);
					textview1.setTextColor(0xFFFFFFFF);
					
					imageview8.setBackgroundColor(Color.TRANSPARENT);
					_style();
					light_night_mode.setImageResource(R.drawable.ic_brightness_7_white);
					sav_mode.edit().putString("mode", "night").commit();
				}
			}
		});
		
		block_urll.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!edittext3.getText().toString().trim().isEmpty()) {
					if (template.getString("bT", "").contains(edittext3.getText().toString().trim().toLowerCase().trim()) || banndedTxt.contains(edittext3.getText().toString().trim().toLowerCase())) {
						SketchwareUtil.showMessage(getApplicationContext(), "Already added");
					}
					else {
						banndedTxt = banndedTxt.concat("\n".concat(edittext3.getText().toString().trim().toLowerCase()));
						template.edit().putString("bT", banndedTxt).commit();
						SketchwareUtil.showMessage(getApplicationContext(), "Done add word \"".concat(edittext3.getText().toString().trim().concat("\" in block-list")));
						_FilterTextBy_DarkGhost();
						banndedTxt = banndedTxt.replace("\n", "¶").replace("¶", "¶").replace("§¶¶", "§¶");
						banndedTxt = "¶".concat(banndedTxt.concat("§"));
						_indextext();
					}
					edittext3.setText("");
				}
			}
		});
		
		web.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				safhaweb.setVisibility(View.GONE);
				mainlist.setVisibility(View.GONE);
				in_app_browser.setVisibility(View.VISIBLE);
			}
		});
		
		back_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Facebook.canGoBack()) {
					Facebook.goBack();
				}
				else {
					if (Youtube.canGoBack()) {
						Youtube.goBack();
					}
					else {
						if (insta.canGoBack()) {
							insta.goBack();
						}
						else {
							if (twitt.canGoBack()) {
								twitt.goBack();
							}
							else {
								if (whats.canGoBack()) {
									whats.goBack();
								}
								else {
									if (imoo.canGoBack()) {
										imoo.goBack();
									}
									else {
										if (webview1.canGoBack()) {
											webview1.goBack();
										}
										else {
											if (exit == 0) {
												safhaweb.setVisibility(View.GONE);
												in_app_browser.setVisibility(View.GONE);
												mainlist.setVisibility(View.VISIBLE);
												exit++;
											}
											else {
												finishAffinity();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
		
		back_home_btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				safhaweb.setVisibility(View.GONE);
				mainlist.setVisibility(View.VISIBLE);
			}
		});
		
		fab_enable_image.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (sv.getString("switch", "").equals("true")) {
					Youtube.getSettings().setLoadsImagesAutomatically(false);
					Facebook.getSettings().setLoadsImagesAutomatically(false);
					twitt.getSettings().setLoadsImagesAutomatically(false);
					insta.getSettings().setLoadsImagesAutomatically(false);
					whats.getSettings().setLoadsImagesAutomatically(false);
					imoo.getSettings().setLoadsImagesAutomatically(false);
					webview1.getSettings().setLoadsImagesAutomatically(false);
					button6.setText("تفعيل ظهور الصور");
					switch1.setChecked(false);
					sv.edit().putString("switch", "false").commit();
					fab_enable_image.setImageResource(R.drawable.ic_camera_alt_white);
					webview1.loadUrl(webview1.getUrl());
					Youtube.loadUrl(Youtube.getUrl());
					insta.loadUrl(insta.getUrl());
					twitt.loadUrl(twitt.getUrl());
					whats.loadUrl(whats.getUrl());
					imoo.loadUrl(imoo.getUrl());
					Facebook.loadUrl(Facebook.getUrl());
				}
				else {
					Youtube.getSettings().setLoadsImagesAutomatically(true);
					Facebook.getSettings().setLoadsImagesAutomatically(true);
					twitt.getSettings().setLoadsImagesAutomatically(true);
					insta.getSettings().setLoadsImagesAutomatically(true);
					whats.getSettings().setLoadsImagesAutomatically(true);
					imoo.getSettings().setLoadsImagesAutomatically(true);
					webview1.getSettings().setLoadsImagesAutomatically(true);
					switch1.setChecked(true);
					button6.setText("تعطيل ظهور الصور");
					sv.edit().putString("switch", "true").commit();
					fab_enable_image.setImageResource(R.drawable.ic_layers_clear_white);
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (faab) {
					linear1.setVisibility(View.VISIBLE);
					fab_linear.setVisibility(View.INVISIBLE);
					faab = false;
					_fab.setImageResource(R.drawable.ic_expand_less_white);
				}
				else {
					linear1.setVisibility(View.VISIBLE);
					fab_linear.setVisibility(View.VISIBLE);
					faab = true;
					_fab.setImageResource(R.drawable.ic_details_white);
				}
			}
		});
		
		_nonet_request_listener = new RequestNetwork.RequestListener() {
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
		_blo();
		_savedata();
		_hidw();
		_extra();
		_style();
		_timesOpenApp();
		_banner();
		_download();
		textview4.setVisibility(View.GONE);
		safhaweb.setVisibility(View.GONE);
		nointernet.setVisibility(View.GONE);
		in_app_browser.setVisibility(View.GONE);
		vscroll1.setVisibility(View.GONE);
		ofo.setVisibility(View.GONE);
		// تسجيل الوقت عند فتح التطبيق 
		tim = Calendar.getInstance();
		sv.edit().putString("tim1", new SimpleDateFormat("HHmm").format(tim.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
		// الوظائف التي تعمل في الخلفية 
		// حساب الوقت الذي مر من الجلسة 
		moda = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						lf = Calendar.getInstance();
						timer.setText("تبقى  ".concat(String.valueOf((long)(Double.parseDouble(sv.getString("hali", "0")) - (Double.parseDouble(new SimpleDateFormat("HHmm").format(lf.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")) - Double.parseDouble(sv.getString("tim1", "0"))))).concat("    دقيقة من أصل   ".concat(sv.getString("hali", "")))));
						sv.edit().putString("totaltimeofglsat", String.valueOf((long)(Double.parseDouble(sv.getString("totaltimeofglsa", "0").replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")) + (Double.parseDouble(new SimpleDateFormat("HHmm").format(lf.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")) - Double.parseDouble(sv.getString("tim1", "0")))))).commit();
						textview2.setText(String.valueOf((long)(Double.parseDouble(sv.getString("totaltimeofglsat", "0").replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")))).concat("   دقيقة. "));
						if ((Double.parseDouble(new SimpleDateFormat("HHmm").format(lf.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")) - Double.parseDouble(sv.getString("tim1", "0"))) > Double.parseDouble(sv.getString("hali", "0"))) {
							linear3.setVisibility(View.GONE);
							linear4.setVisibility(View.GONE);
							safhaweb.setVisibility(View.GONE);
							linear5.setVisibility(View.GONE);
							vscroll1.setVisibility(View.VISIBLE);
							ofo.setVisibility(View.VISIBLE);
							textview4.setVisibility(View.VISIBLE);
							SketchwareUtil.showMessage(getApplicationContext(), "انتهت مدة الجلسة ");
							moda.cancel();
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(moda, (int)(15000), (int)(1000));
		//التحقق من مرور 24 ساعة 
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (Double.parseDouble(new SimpleDateFormat("yyMMddHHmm").format(tim.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")) > (Double.parseDouble(sv.getString("tot", "0").replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")) + 2400)) {
							linear6.setVisibility(View.VISIBLE);
							linear7.setVisibility(View.VISIBLE);
							sv.edit().putString("timtom", "0").commit();
							tot = Calendar.getInstance();
							sv.edit().putString("tot", new SimpleDateFormat("yyMMddHHmm").format(tot.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
							SketchwareUtil.showMessage(getApplicationContext(), "يمكنك الآن إعادة تعيين وقت الجلسة والحمدلله ");
						}
						else {
							SketchwareUtil.showMessage(getApplicationContext(), "سبحان الله ");
						}
					}
				});
			}
		};
		_timer.schedule(oo, (int)(7000));
		if (sv.getString("glsa", "").equals("")) {
			sv.edit().putString("glsa", "2").commit();
		}
		// إخفاء صناديق إدخال مدة الجلسة وعدد الجلسات 
		if (sv.getString("oiio", "").equals("lll")) {
			linear6.setVisibility(View.GONE);
		}
		if (sv.getString("bthp", "").equals("bnb")) {
			linear7.setVisibility(View.GONE);
		}
		// التحقق من عدد الجلسات 
		oo = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (Double.parseDouble(sv.getString("olpo", "0")) > Double.parseDouble(sv.getString("glsa", "0"))) {
							linear3.setVisibility(View.GONE);
							linear4.setVisibility(View.GONE);
							safhaweb.setVisibility(View.GONE);
							linear5.setVisibility(View.GONE);
							vscroll1.setVisibility(View.VISIBLE);
							ofo.setVisibility(View.VISIBLE);
							textview4.setVisibility(View.VISIBLE);
							SketchwareUtil.showMessage(getApplicationContext(), "انتهت الجلسات المتاحه لليوم \nعاود فتح التطبيق غداً ");
						}
					}
				});
			}
		};
		_timer.schedule(oo, (int)(5000));
		// وظيفةتعمل لمرة واحدة 
		// أول مرة يفتح التطبيق يأخذ الوقت والتاريخ 
		if (sv.getString("tot", "").equals("")) {
			tot = Calendar.getInstance();
			sv.edit().putString("tot", new SimpleDateFormat("yyMMddHHmm").format(tot.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
			firstdialog.setTitle("رسالة ترحيب ");
			firstdialog.setMessage("مرحبًا بك في تطبيق وسائل تواصل المسلم \nتم ضبط مدة الجلسة الى 5 دقائق وعدد الجلسات المتاحة لك هى واحدة افتراضياً \n\nيمكنك تغيير ذلك من الإعدادات بالضغط على رمز  ¡  في الأعلى يميناً \n\nنرجو لك وقتاً نافعاً ودعوة منك خالصة \nمع تحيات فريق عمل تطبيقات المسلم ");
			firstdialog.setPositiveButton("شكراً ", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			firstdialog.create().show();
		}
		if (sv.getString("hali", "").equals("")) {
			sv.edit().putString("hali", "5").commit();
		}
		Youtube.setWebChromeClient(new CustomWebClient());
		if (sv.getString("totaltimeofglsa", "").equals("")) {
			sv.edit().putString("totaltimeofglsa", "0").commit();
		}
		FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/Android/data/Muslim-instruction.txt"), "مرحبًا بك في تطبيق وسائل تواصل المسلم \nتم ضبط مدة الجلسة الى 5 دقائق وعدد الجلسات المتاحة لك هى واحدة افتراضياً \n\nيمكنك تغيير ذلك من الإعدادات بالضغط على رمز  ¡  في الأعلى يميناً \n\nنرجو لك وقتاً نافعاً ودعوة منك خالصة \nمع تحيات فريق عمل تطبيقات المسلم ");
		_fab();
		_in_app_browse();
		onclick = 0;
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FP:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
			}
			break;
			
			case REQUEST_SELECT_FILE:
			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
				if (uploadMessage == null) return; uploadMessage.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(_resultCode, _data)); uploadMessage = null; }
			break;
			
			case FILECHOOSER_RESULTCODE:
			if (null == mUploadMessage){
				return; }
			Uri result = _data == null || _resultCode != RESULT_OK ? null : _data.getData(); mUploadMessage.onReceiveValue(result);
			mUploadMessage = null;
			
			if (true){
			}
			else {
				SketchwareUtil.showMessage(getApplicationContext(), "فشل رفع الملف !");
			}
			break;
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (Facebook.canGoBack()) {
			Facebook.goBack();
		}
		else {
			if (Youtube.canGoBack()) {
				Youtube.goBack();
			}
			else {
				if (insta.canGoBack()) {
					insta.goBack();
				}
				else {
					if (twitt.canGoBack()) {
						twitt.goBack();
					}
					else {
						if (whats.canGoBack()) {
							whats.goBack();
						}
						else {
							if (imoo.canGoBack()) {
								imoo.goBack();
							}
							else {
								if (webview1.canGoBack()) {
									webview1.goBack();
								}
								else {
									if (exit == 0) {
										safhaweb.setVisibility(View.GONE);
										in_app_browser.setVisibility(View.GONE);
										mainlist.setVisibility(View.VISIBLE);
										exit++;
										SketchwareUtil.showMessage(getApplicationContext(), "اضغط مرة أخرى للخروج من التطبيق ");
									}
									else {
										finishAffinity();
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	@Override
	public void onDestroy() {
		unregisterDownloadReceivers();
		super.onDestroy();
		h++;
		sv.edit().putString("taka", String.valueOf((long)(h)).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
		lf = Calendar.getInstance();
		sv.edit().putString("tim1", new SimpleDateFormat("HHmm").format(lf.getTime()).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
		sv.edit().putString("totaltimeofglsa", String.valueOf((long)(Double.parseDouble(sv.getString("totaltimeofglsat", "0").replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9"))))).commit();
		if (oo != null) {
			oo.cancel();
		}
		if (tt != null) {
			tt.cancel();
		}
		if (timm != null) {
			timm.cancel();
		}
		if (moda != null) {
			moda.cancel();
		}
		if (_timer != null) {
			_timer.cancel();
		}
		wts_clickk.edit().putString("wts", String.valueOf((long)(wts_click))).commit();
		imo_clic.edit().putString("imo", String.valueOf((long)(imo_click))).commit();
	}
	public void _blo() {
		if (sv.getString("switch", "").equals("")) {
			Youtube.getSettings().setLoadsImagesAutomatically(false);
			Facebook.getSettings().setLoadsImagesAutomatically(false);
			twitt.getSettings().setLoadsImagesAutomatically(false);
			insta.getSettings().setLoadsImagesAutomatically(false);
			whats.getSettings().setLoadsImagesAutomatically(false);
			imoo.getSettings().setLoadsImagesAutomatically(false);
			webview1.getSettings().setLoadsImagesAutomatically(false);
			button6.setText("تفعيل ظهور الصور");
			switch1.setChecked(false);
			sv.edit().putString("switch", "false").commit();
			fab_enable_image.setImageResource(R.drawable.ic_camera_alt_white);
		}
		if (sv.getString("switch", "").equals("true")) {
			Youtube.getSettings().setLoadsImagesAutomatically(true);
			Facebook.getSettings().setLoadsImagesAutomatically(true);
			twitt.getSettings().setLoadsImagesAutomatically(true);
			insta.getSettings().setLoadsImagesAutomatically(true);
			whats.getSettings().setLoadsImagesAutomatically(true);
			imoo.getSettings().setLoadsImagesAutomatically(true);
			webview1.getSettings().setLoadsImagesAutomatically(true);
			button6.setText("تعطيل ظهور الصور");
			switch1.setChecked(true);
			fab_enable_image.setImageResource(R.drawable.ic_layers_clear_white);
		}
		else {
			Youtube.getSettings().setLoadsImagesAutomatically(false);
			Facebook.getSettings().setLoadsImagesAutomatically(false);
			twitt.getSettings().setLoadsImagesAutomatically(false);
			insta.getSettings().setLoadsImagesAutomatically(false);
			whats.getSettings().setLoadsImagesAutomatically(false);
			imoo.getSettings().setLoadsImagesAutomatically(false);
			webview1.getSettings().setLoadsImagesAutomatically(false);
			button6.setText("تفعيل ظهور الصور");
			switch1.setChecked(false);
			fab_enable_image.setImageResource(R.drawable.ic_camera_alt_white);
		}
	}
	
	
	public void _savedata() {
		whats.getSettings(). setSavePassword(true);
		imoo.getSettings(). setSavePassword(true);
		Facebook.getSettings(). setSavePassword(true);
		Youtube.getSettings(). setSavePassword(true);
		insta.getSettings(). setSavePassword(true);
		twitt.getSettings(). setSavePassword(true);
	}
	
	
	public void _hidw() {
		if (sv.getString("y", "").equals("y")) {
			imageview1.setVisibility(View.GONE);
		}
		if (sv.getString("f", "").equals("f")) {
			imageview2.setVisibility(View.GONE);
		}
		if (sv.getString("g", "").equals("g")) {
			imageview3.setVisibility(View.GONE);
		}
		if (sv.getString("h", "").equals("h")) {
			imageview4.setVisibility(View.GONE);
		}
		if (sv.getString("j", "").equals("j")) {
			wts.setVisibility(View.GONE);
		}
		if (sv.getString("k", "").equals("k")) {
			imo.setVisibility(View.GONE);
		}
	}
	
	
	public void _extra() {
	}
	
	public class CustomWebClient extends WebChromeClient {
		private View mCustomView;
		private WebChromeClient.CustomViewCallback mCustomViewCallback;
		protected FrameLayout frame;
		
		// Initially mOriginalOrientation is set to Landscape
		private int mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
		private int mOriginalSystemUiVisibility;
		
		// Constructor for CustomWebClient
		public CustomWebClient() {}
		
		public Bitmap getDefaultVideoPoster() {
			if (SocialMediaActivity.this == null) {
				return null; }
			return BitmapFactory.decodeResource(SocialMediaActivity.this.getApplicationContext().getResources(), 2130837573); }
		
		public void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback viewCallback) {
			if (this.mCustomView != null) {
				onHideCustomView();
				return; }
			this.mCustomView = paramView;
			this.mOriginalSystemUiVisibility = SocialMediaActivity.this.getWindow().getDecorView().getSystemUiVisibility();
			// When CustomView is shown screen orientation changes to mOriginalOrientation (Landscape).
			
			
			SocialMediaActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			
			
			// After that mOriginalOrientation is set to portrait.
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
			this.mCustomViewCallback = viewCallback; ((FrameLayout)SocialMediaActivity.this.getWindow().getDecorView()).addView(this.mCustomView, new FrameLayout.LayoutParams(-1, -1)); SocialMediaActivity.this.getWindow().getDecorView().setSystemUiVisibility(3846);
		}
		
		public void onHideCustomView() {
			((FrameLayout)SocialMediaActivity.this.getWindow().getDecorView()).removeView(this.mCustomView);
			this.mCustomView = null;
			SocialMediaActivity.this.getWindow().getDecorView().setSystemUiVisibility(this.mOriginalSystemUiVisibility);
			// When CustomView is hidden, screen orientation is set to mOriginalOrientation (portrait).
			
			
			SocialMediaActivity.this.setRequestedOrientation(this.mOriginalOrientation);
			// After that mOriginalOrientation is set to landscape.
			this.mOriginalOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE; this.mCustomViewCallback.onCustomViewHidden();
			this.mCustomViewCallback = null;
		}
	}
	
	{
	}
	
	
	public void _style() {
		//حواف وخلفية العناصر غامقة في الوضع الليلي
		button2.setBackgroundResource(R.drawable.btn_ripple);
		button3.setBackgroundResource(R.drawable.btn_ripple);
		button4.setBackgroundResource(R.drawable.btn_ripple);
		button5.setBackgroundResource(R.drawable.btn_ripple);
		button6.setBackgroundResource(R.drawable.btn_ripple);
		button7.setBackgroundResource(R.drawable.btn_ripple);
		edittext1.setBackgroundResource(R.drawable.btn_ripple);
		edittext2.setBackgroundResource(R.drawable.btn_ripple);
		last5.setBackgroundResource(R.drawable.btn_ripple);
		textview14.setBackgroundResource(R.drawable.btn_ripple);
		timer.setBackgroundResource(R.drawable.btn_ripple);
		textview13.setBackgroundResource(R.drawable.btn_ripple);
		textview15.setBackgroundResource(R.drawable.btn_ripple);
		switch1.setBackgroundResource(R.drawable.btn_ripple);
		blurSwitch.setBackgroundResource(R.drawable.btn_ripple);
		blurVideoSwitch.setBackgroundResource(R.drawable.btn_ripple);
		blurAmountLabel.setBackgroundResource(R.drawable.btn_ripple);
		blurSwitch.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/amiri.ttf"), 0);
		blurVideoSwitch.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/amiri.ttf"), 0);
		blurAmountLabel.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/amiri.ttf"), 0);
		linear14.setBackgroundResource(R.drawable.btn_ripple);
		search_linear.setBackgroundResource(R.drawable.btn_ripple);
		//ألوان النصوص في الوضع الليلي أبيض
		textview14.setTextColor(0xFFFFFFFF);
		textview6.setTextColor(0xFFFFFFFF);
		textview5.setTextColor(0xFFFFFFFF);
		oi.setTextColor(0xFFFFFFFF);
		textview10.setTextColor(0xFFFFFFFF);
		textview11.setTextColor(0xFFFFFFFF);
		fra.setTextColor(0xFFFFFFFF);
		textview7.setTextColor(0xFFFFFFFF);
		textview8.setTextColor(0xFFFFFFFF);
		button2.setTextColor(0xFFFFFFFF);
		button3.setTextColor(0xFFFFFFFF);
		textview13.setTextColor(0xFFFFFFFF);
		textview12.setTextColor(0xFFFFFFFF);
		last5.setTextColor(0xFFFFFFFF);
		textview9.setTextColor(0xFFFFFFFF);
		textview2.setTextColor(0xFFFFFFFF);
		textview4.setTextColor(0xFFFFFFFF);
		timer.setTextColor(0xFFFFFFFF);
		textview15.setTextColor(0xFFFFFFFF);
		button4.setTextColor(0xFFFFFFFF);
		edittext1.setTextColor(0xFFFFFFFF);
		button5.setTextColor(0xFFFFFFFF);
		edittext2.setTextColor(0xFFFFFFFF);
		switch1.setTextColor(0xFFFFFFFF);
		blurSwitch.setTextColor(0xFFFFFFFF);
		blurVideoSwitch.setTextColor(0xFFFFFFFF);
		blurAmountLabel.setTextColor(0xFFFFFFFF);
		button6.setTextColor(0xFFFFFFFF);
		edittext3.setTextColor(0xFFFFFFFF);
		textview6.setTextColor(0xFFFFFFFF);
		textview1.setTextColor(0xFFFFFFFF);
		edittext5.setTextColor(0xFFFFFFFF);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		oi.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		fra.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		last5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		edittext1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		edittext2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		timer.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		textview15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		button6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		linear13.setBackgroundColor(Color.TRANSPARENT);
		imageview8.setBackgroundColor(Color.TRANSPARENT);
		light_night_mode.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		edittext1.setHintTextColor(0xFFFFFFFF);
		edittext2.setHintTextColor(0xFFFFFFFF);
		edittext3.setHintTextColor(0xFFFFFFFF);
		edittext5.setHintTextColor(0xFFFFFFFF);
		button7.setTextColor(0xFFFFFFFF);
		// الصور في الوضع الليلي
		imageview1.setImageResource(R.drawable.night_icon_1);
		imageview2.setImageResource(R.drawable.night_icon_4);
		imageview3.setImageResource(R.drawable.night_icon_3);
		imageview4.setImageResource(R.drawable.night_icon_2);
		imo.setImageResource(R.drawable.night_icon_6);
		wts.setImageResource(R.drawable.night_icon_5);
	}
	
	
	public void _timesOpenApp() {
		if (sv.getString("timtom", "").equals("")) {
			sv.edit().putString("timtom", String.valueOf((long)(1)).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
			sv.edit().putString("olpo", sv.getString("timtom", "").replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
			last5.setText("هذه الجلسة رقم   ".concat(sv.getString("olpo", "").concat("  من أصل    ".concat(sv.getString("olpo", "").concat("   جلسات .")))));
		}
		else {
			sv.edit().putString("timtom", String.valueOf((long)(Double.parseDouble(sv.getString("timtom", "0")) + 1)).replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
			sv.edit().putString("olpo", sv.getString("timtom", "").replace("٠", "0").replace("١", "1").replace("٢", "2").replace("٣", "3").replace("٤", "4").replace("٥", "5").replace("٦", "6").replace("٧", "7").replace("٨", "8").replace("٩", "9")).commit();
			last5.setText("هذه الجلسة رقم   ".concat(sv.getString("olpo", "").concat("  من أصل    ".concat(sv.getString("glsa", "").concat("   جلسات .")))));
		}
	}
	
	
	public void _explain() {
		//شرح
		//هناك قيم يتم تخزينها لأول مرة 
		// مثل 
		// قيمة tot يتم تخزينها أول ما يتم فتح التطبيق والسبب في ذلك حتى نحدد أول وقت دخل فيه المستخدم للتطبيق 
		// هذه القيمة مفيدة لانها + مجموع عليها 24000 = مر يوم على فتح التطبيق = هذه تقنية معرفة مرور 24 ساعة هنا في تطبيق 
		// حيث هناك قيمة tim1 وهي قيمة وقت فتح التطبيق   
		//شرط مرور 24 ساعة : لو tim1 وهي الوقت الحالي بالسنين والشهور والايام والساعات والدقائق اكبر من قيمة tot مجموع عليها 24 ساعة فهذه معناه مر 24 ساعة من الآن عندها يرجع قيمة tot الى الوقت الحالي ليتخزن ويتم حساب 24 ساعة أخرى بهذه الطريقة 
		// يتم احتساب مدة الجلسة عن طريق حساب lf وهي قيمة الوقت الحالي مطروحا منها tim1 وهي قيمة وقت فتح التطبيق والفرق بين الوقت الان الذي استغرقه في التطبيق والوقت الذي تم تخزينه لاول مره عند فتح التطبيق هو مدة الجلسة 
		// لو تحقق هذا الشرط وكانت قيمته اكبر من قيمة hali وهي مدة الجلسة الذي يختارها المستخدم يتم غلق الجلسة عليه 
		//قيمة  hali الافتراضيه تكون 5
		
	}
	
	
	public void _banner() {
		// البانر المتحرك 
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
	}
	
	
	private boolean isSafeDownloadUrl(String value) {
		try {
			Uri uri = Uri.parse(value);
			return "https".equalsIgnoreCase(uri.getScheme()) && uri.getHost() != null;
		} catch (Exception e) {
			return false;
		}
	}

	private void registerDownloadReceiver(BroadcastReceiver receiver) {
		if (receiver == null || downloadReceivers.contains(receiver)) return;
		IntentFilter filter = new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE);
		if (Build.VERSION.SDK_INT >= 33) {
			registerReceiver(receiver, filter, Context.RECEIVER_NOT_EXPORTED);
		} else {
			registerReceiver(receiver, filter);
		}
		downloadReceivers.add(receiver);
	}

	private void unregisterDownloadReceivers() {
		for (BroadcastReceiver receiver : downloadReceivers) {
			try {
				unregisterReceiver(receiver);
			} catch (IllegalArgumentException ignored) {
			}
		}
		downloadReceivers.clear();
	}

	public void _download() {
		imoo.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
					if (!isSafeDownloadUrl(url)) return;
				        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				        request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				        request.setDescription("Downloading file...");
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				        dm.enqueue(request);
				
				        Toast.makeText(getApplicationContext(), "Downloading...", Toast.LENGTH_SHORT).show();
						registerDownloadReceiver(onComplete_imoo);
				    }
			
			    BroadcastReceiver onComplete_imoo = new BroadcastReceiver() {
				        @Override
				        public void onReceive(Context context, Intent intent) {
					            Toast.makeText(getApplicationContext(), "Downloading Complete", Toast.LENGTH_SHORT).show();
					        }
				    };
		});
		
		whats.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
					if (!isSafeDownloadUrl(url)) return;
				        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				        request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				        request.setDescription("Downloading file...");
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				        dm.enqueue(request);
				
				        Toast.makeText(getApplicationContext(), "Downloading...", Toast.LENGTH_SHORT).show();
						registerDownloadReceiver(onComplete_whats);
				    }
			
			    BroadcastReceiver onComplete_whats = new BroadcastReceiver() {
				        @Override
				        public void onReceive(Context context, Intent intent) {
					            Toast.makeText(getApplicationContext(), "Downloading Complete", Toast.LENGTH_SHORT).show();
					        }
				    };
		});
		
		twitt.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
					if (!isSafeDownloadUrl(url)) return;
				        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				        request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				        request.setDescription("Downloading file...");
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				        dm.enqueue(request);
				
				        Toast.makeText(getApplicationContext(), "Downloading...", Toast.LENGTH_SHORT).show();
						registerDownloadReceiver(onComplete_twitt);
				    }
			
			    BroadcastReceiver onComplete_twitt = new BroadcastReceiver() {
				        @Override
				        public void onReceive(Context context, Intent intent) {
					            Toast.makeText(getApplicationContext(), "Downloading Complete", Toast.LENGTH_SHORT).show();
					        }
				    };
		});
		
		insta.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
					if (!isSafeDownloadUrl(url)) return;
				        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				        request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				        request.setDescription("Downloading file...");
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimetype));
				
				        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				        dm.enqueue(request);
				
				        Toast.makeText(getApplicationContext(), "Downloading...", Toast.LENGTH_SHORT).show();
						registerDownloadReceiver(onComplete_insta);
				    }
			
			    BroadcastReceiver onComplete_insta = new BroadcastReceiver() {
				        @Override
				        public void onReceive(Context context, Intent intent) {
					            Toast.makeText(getApplicationContext(), "Downloading Complete", Toast.LENGTH_SHORT).show();
					        }
				    };
		});
		
		Facebook.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
					if (!isSafeDownloadUrl(url)) return;
				        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				        request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				        request.setDescription("Downloading file...");
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				        request.setDestinationInExternalPublicDir(
				                Environment.DIRECTORY_DOWNLOADS,
				                URLUtil.guessFileName(url, contentDisposition, mimetype)
				        );
				
				        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				        dm.enqueue(request);
				
				        Toast.makeText(getApplicationContext(), "Downloading...", Toast.LENGTH_SHORT).show();
						registerDownloadReceiver(onComplete_Facebook);
				    }
			
			    BroadcastReceiver onComplete_Facebook = new BroadcastReceiver() {
				        @Override
				        public void onReceive(Context context, Intent intent) {
					            Toast.makeText(getApplicationContext(), "Downloading Complete", Toast.LENGTH_SHORT).show();
					        }
				    };
		});
		
		Youtube.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
					if (!isSafeDownloadUrl(url)) return;
				        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
				        request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimetype));
				        request.setDescription("Downloading file...");
				        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
				        request.setDestinationInExternalPublicDir(
				                Environment.DIRECTORY_DOWNLOADS,
				                URLUtil.guessFileName(url, contentDisposition, mimetype)
				        );
				
				        DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
				        dm.enqueue(request);
				
				        Toast.makeText(getApplicationContext(), "Downloading...", Toast.LENGTH_SHORT).show();
						registerDownloadReceiver(onComplete_Youtube);
				    }
			
			    BroadcastReceiver onComplete_Youtube = new BroadcastReceiver() {
				        @Override
				        public void onReceive(Context context, Intent intent) {
					            Toast.makeText(getApplicationContext(), "Downloading Complete", Toast.LENGTH_SHORT).show();
					        }
				    };
		});
		
		webview1.getSettings().setJavaScriptEnabled(true);
		
		webview1.setDownloadListener(new DownloadListener() {
			    @Override
			    public void onDownloadStart(String url, String userAgent,
			                                String contentDisposition,
			                                String mimetype,
			                                long contentLength) {
				
				        String fileName = URLUtil.guessFileName(url, contentDisposition, mimetype);
				
				        if (url.startsWith("blob")) {
				            Toast.makeText(getApplicationContext(), "تنزيل blob غير متاح لأسباب أمنية", Toast.LENGTH_SHORT).show();
				        } else if (isSafeDownloadUrl(url)) {
					            // 👇 ده الجزء العادي للـ http/https
					            DownloadManager.Request request =
					                    new DownloadManager.Request(Uri.parse(url));
					
					            request.setTitle(fileName);
					            request.setDescription("Downloading file...");
					            request.setNotificationVisibility(
					                    DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
					            request.setDestinationInExternalPublicDir(
					                    Environment.DIRECTORY_DOWNLOADS,
					                    fileName);
					
					            DownloadManager dm =
					                    (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
					
					            dm.enqueue(request);
					
					            Toast.makeText(getApplicationContext(),
					                    "Downloading...", Toast.LENGTH_SHORT).show();
					        }
				    }
		});
		
	}
	
	
	public void _upload() {
		whats.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				
				
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		imoo.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				
				
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		Facebook.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				
				
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		Youtube.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				
				
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		insta.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				
				
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		twitt.setWebChromeClient(new WebChromeClient() {
			// For 3.0+ Devices
			protected void openFileChooser(ValueCallback uploadMsg, String acceptType) { mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			// For Lollipop 5.0+ Devices
			public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				if (uploadMessage != null) {
					uploadMessage.onReceiveValue(null);
					uploadMessage = null; } uploadMessage = filePathCallback; Intent intent = fileChooserParams.createIntent(); try {
					startActivityForResult(intent, REQUEST_SELECT_FILE);
				} catch (ActivityNotFoundException e) {
					uploadMessage = null; Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show(); return false; }
				return true; }
			
			//For Android 4.1 only
			protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				mUploadMessage = uploadMsg; Intent intent = new Intent(Intent.ACTION_GET_CONTENT); intent.addCategory(Intent.CATEGORY_OPENABLE); intent.setType("image/*"); startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
			}
			
			protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				mUploadMessage = uploadMsg; Intent i = new Intent(Intent.ACTION_GET_CONTENT); i.addCategory(Intent.CATEGORY_OPENABLE);
				
				
				i.setType("image/*"); startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
			}
			
			
		});
		Youtube.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		insta.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		twitt.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		whats.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		imoo.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		Facebook.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		Youtube.setWebChromeClient(new WebChromeClient() {
			
			    // ===== For Android 3.0+ =====
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(
				                Intent.createChooser(i, "File Browser"),
				                FILECHOOSER_RESULTCODE
				        );
				    }
			
			    // ===== For Android 5.0+ =====
			    @Override
			    public boolean onShowFileChooser(
			            WebView mWebView,
			            ValueCallback<Uri[]> filePathCallback,
			            FileChooserParams fileChooserParams) {
				
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				
				        uploadMessage = filePathCallback;
				
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(
					                    getApplicationContext(),
					                    "Cannot Open File Chooser",
					                    Toast.LENGTH_LONG
					            ).show();
					            return false;
					        }
				        return true;
				    }
			
			    // ===== For Android 4.1 =====
			    protected void openFileChooser(
			            ValueCallback<Uri> uploadMsg,
			            String acceptType,
			            String capture) {
				
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(
				                Intent.createChooser(intent, "File Browser"),
				                FILECHOOSER_RESULTCODE
				        );
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(
				                Intent.createChooser(i, "File Chooser"),
				                FILECHOOSER_RESULTCODE
				        );
				    }
			
		});
		
	}
	
	
	public void _extracodes() {
	}
	
	private ValueCallback<Uri> mUploadMessage;
	public ValueCallback<Uri[]> uploadMessage;
	public static final int REQUEST_SELECT_FILE = 100;
	
	private final static int FILECHOOSER_RESULTCODE = 1;
	{
	}
	
	
	public void _fab() {
		fab_enable_image.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		fabBlurToggle.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		back_home_btn.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		back_btn.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		web.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		block_urll.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		light_night_mode.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		mute.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		imageview15.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		refresh.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		sbha_btn.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		linear1.setVisibility(View.VISIBLE);
		fab_linear.setVisibility(View.INVISIBLE);
		faab = false;
		webview1.setVisibility(View.VISIBLE);
		listview2.setVisibility(View.GONE);
		fasb = false;
		nighMode = 0;
		block_urll.setVisibility(View.GONE);
		StrictMode.VmPolicy.Builder builder = 
		  new StrictMode.VmPolicy.Builder(); 
		  StrictMode.setVmPolicy(builder.build());
		  if(Build.VERSION.SDK_INT>=24){ 
					      try{
								    java.lang.reflect.Method m = 
								          StrictMode.class.getMethod(
								    "disableDeathOnFileUriExposure"); 
								          m.invoke(null); 
								    }
					   catch(Exception e){ 
								    showMessage(e.toString()); 
								    } 
					  }
		somd = 0;
		webview1.setVisibility(View.INVISIBLE);
		_extra_oncreate_code();
	}
	
	
	public void _CardView(final String _color, final double _radius, final double _shadow, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		try {
			if(Build.VERSION.SDK_INT >= 21) {
				_view.setElevation((int)_shadow);
			}
		} catch (Exception e) {}
	}
	
	
	public void _addContact(final String _name, final String _phone) {
		if (!names.contains(":".concat(_name.concat(":")))) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("name", _name.trim());
				contacts.add(_item);
			}
			
			contacts.get((int)contacts.size() - 1).put("phone", _phone);
			names = names.concat(_name.concat(":"));
		}
	}
	
	
	public void _getAllContacts() {
		android.database.Cursor c = getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {android.provider.ContactsContract.CommonDataKinds.Phone._ID, android.provider.ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, android.provider.ContactsContract.CommonDataKinds.Phone.NUMBER}, null, null, android.provider.ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME + " ASC");
		while(c.moveToNext()) {
			_addContact(c.getString(1), c.getString(2));
		}
	}
	
	
	public void _in_app_browse() {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
						getWindow().setStatusBarColor(0xFFFFFFFF);
		imageview10.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		imageview11.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		imageview12.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		edittext3.setLines(1);
		/*

DO NOT FORGET TO ADD THE PERMISSION TO THE MANIFEST TO RUN THIS APP, YOU CAN USE APK EDITOR AND ADD THIS TO THE MANIFEST:

<uses-permission android:name="android.permission.READ_CONTACTS"/>

*/
		// Please to do not put write/read block or any blocks/components which will ask for more manifest permissions in MainActivity to prevent double/clone onRequestPermissionsResult() error
		// Checking the read_contact permission
		
		if (checkSelfPermission(android.Manifest.permission.READ_CONTACTS) == android.content.pm.PackageManager.PERMISSION_DENIED) {
			
			requestPermissions(new String[] {android.Manifest.permission.READ_CONTACTS}, 9090);
			
		} else {
			names = ":";
			try {
					 String data = getIntent().getStringExtra("data");
					if (data == null) data = getIntent().getDataString();
					if (isSafeDownloadUrl(data)) {
						webview1.loadUrl(data);
					}
			}
			catch(Exception e) {
					  
			}
			
			
		}
		swiperefreshlayout1.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
			@Override
			public void onRefresh() {
				if (webview1.getUrl() != null) {
					webview1.reload();
				} else {
					swiperefreshlayout1.setRefreshing(false);
				}
			}
		});
		exit = 0;
		n = 0;
		edittext3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		_filter();
		if (!his.getString("dato", "").equals("")) {
			hist = new Gson().fromJson(his.getString("dato", ""), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			listview2.setAdapter(new Listview2Adapter(hist));
			((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
		}
		textview1.setVisibility(View.GONE);
		listview2.setVisibility(View.GONE);
		imageview19.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		imageview20.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		imageview21.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		edittext5.setLines(1);
	}

	private void applyBlurToAllWebViews() {
		applyBlur(webview1);
		applyBlur(Youtube);
		applyBlur(insta);
		applyBlur(twitt);
		applyBlur(whats);
		applyBlur(imoo);
		applyBlur(Facebook);
	}

	private void updateBlurFabIcon() {
		if (fabBlurToggle != null && blurSwitch != null) {
			fabBlurToggle.setImageResource(blurSwitch.isChecked()
					? R.drawable.ic_layers_clear_white : R.drawable.ic_camera_alt_white);
		}
	}

	private void applyBlur(WebView webView) {
		if (webView == null || webView.getUrl() == null) {
			return;
		}
		int blurPixels = Math.max(2, blurAmount == null ? 10 : blurAmount.getProgress());
		boolean enabled = blurSwitch == null || blurSwitch.isChecked();
		boolean blurVideos = blurVideoSwitch == null || blurVideoSwitch.isChecked();
		String script = "(function(){"
				+ "var id='muslim_media_blur_style';var old=document.getElementById(id);if(old)old.remove();"
				+ "if(!" + enabled + "){return;}"
				+ "var s=document.createElement('style');s.id=id;"
				+ "s.textContent='img,iframe{filter:blur(" + blurPixels + "px) grayscale(35%) !important;}"
				+ (blurVideos ? "video{filter:blur(" + blurPixels + "px) grayscale(35%) !important;}" : "")
				+ ".muslim-media-clear{filter:none !important;}';document.head.appendChild(s);"
				+ "if(!window.muslimMediaBlurBound){window.muslimMediaBlurBound=true;document.addEventListener('click',function(e){"
				+ "var t=e.target;if(t&&(['IMG','VIDEO','IFRAME'].indexOf(t.tagName)>=0)){t.classList.add('muslim-media-clear');"
				+ "setTimeout(function(){t.classList.remove('muslim-media-clear');},5000);}} ,true);}"
				+ "})()";
		webView.evaluateJavascript(script, null);
	}
	
	
	public void _filter() {
		_FilterTextBy_DarkGhost();
		banndedTxt = banndedTxt.replace("\n", "§¶");
		banndedTxt = "¶".concat(banndedTxt.concat("§"));
		_indextext();
	}
	
	
	public void _FilterTextBy_DarkGhost() {
		if (template.contains("bT")) {
			banndedTxt = template.getString("bT", "");
		}
		else {
			banndedTxt = "2g1c\n2 girls 1 cup\nacrotomophilia\nalabama hot pocket\nalaskan pipeline\nanal\nanilingus\nteraboxapp\nxxx\npokeballs\nlesbians\ndate\nshameless\nshame\nwebcam\ncum\nbitch\nshinky\nanime\nanimeporn\nemily\ntiktok\nreddit\nquora\nsaraha\nnaked\nsuit\ntoples\njacuzzi\njacuz\ntit\nmens\nrainbow\nalice\nstretc\nnaughty\nhenti\nhenta\ncock\ndress\nroom\nasses\ndating\ndance\nSex\nsexy\nsextant\nsextok\nplay with me\nStepmom\nstepmom\nstepsister\nstep\nteen\nblonde\nblondes\namateur\nhanti\nهنتاى\nهنتاي\nانمى\nانمي\nhot\npartner\nhit\nsextape\nanus\napeshit\ntwitter\nتويت\nporn\npornhup\nيعشر\nيفتح كس\nينام\nيراود\nيمسك\nينيك\nيركب\nيرطب\nطيز\nطز\nكس\nيفنس\nيفس\nيغسل\nيفط\nاخت\nأخت\nالمتناك\nالشرمط\nالشرموط\nنايا\nمايا\nخليفه\nساره\nسارة\nسحاقيات\nقضيب\nسحاق\nسحق\narsehole\nass\nasshole\nassmunch\nauto erotic\nautoerotic\nbabeland\nbaby batter\nbaby juice\nball gag\nball gravy\nball kicking\nball licking\nball sack\nball sucking\nbangbros\nbangbus\nbareback\nbarely legal\nbarenaked\nbastard\nbastardo\nbastinado\nbbw\nbdsm\nbeaner\nbeaners\nbeaver cleaver\nbeaver lips\nbeastiality\nbestiality\nbig black\nbig breasts\nbig knockers\nbig tits\nbimbos\nbirdlock\nbitch\nbitches\nblack cock\nblonde action\nblonde on blonde action\nblowjob\nblow job\nblow your load\nblue waffle\nblumpkin\nbollocks\nbondage\nboner\nboob\nboobs\nbooty call\nbrown showers\nbrunette action\nbukkake\nbulldyke\nbullet vibe\nbullshit\nbung hole\nbunghole\nbusty\nbutt\nbuttcheeks\nbutthole\ncamel toe\ncamgirl\ncamslut\ncamwhore\ncarpet muncher\ncarpetmuncher\nchocolate rosebuds\ncialis\ncirclejerk\ncleveland steamer\nclit\nclitoris\nclover clamps\nclusterfuck\ncock\ncocks\ncoprolagnia\ncoprophilia\ncornhole\ncoon\ncoons\ncreampie\ncum\ncumming\ncumshot\ncumshots\ncunnilingus\ncunt\ndarkie\nسكسي\nسكسية\nسكسيه\nسكسوني\nحكاكي\nسكس\nطيز\nطيزك\nطيزج\nطيزمك\nطيزختك\nطيزامك\nطيزاختك\nشرج\nلعق\nلحس\nتعالمص\nمصي\nيمص\nمص\nتمص\nديس\nديوس\nحلمة\nحلمات\nنهد\nنهود\nبيضان\nثدي\nبز\nبزاز\nمفلقسة\nبظر\nكسمك\nكسختك\nكسها\nوكس\nكسي\nكسك\nبلاع\nدمبك\nدنبك\nكسج\nكسمج\nكسختج\nبكسج\nبكسك\nبطيزك\nبطيزج\nبطيزه\nبطيزها\nكسهن\nكسهم\nبكس\nبطيز\nكس\nفرج\nشهوة\nشاذ\nشاذة\nشاذه\nشذوذ\nحلوك\nمماصص\nمصة\nمصه\nحلوگ\nچبة\nچبه\nجبه\nچبه\nكسخالتك\nكسعمتك\nكسخالاتك\nكسعماتك\nبدلي\nانزع\nانزعي\nنزعتها\nنزعته\nنزعتهن\nنزعتهم\nمبادل\nعاهرة\nكحبة\nگحبة\nقحبة\nگحبه\nكحبه\nقحبه\nتنيج\nينيج\nينيجن\nينيجون\nتنيچين\nناچوه\nنايجيه\nنايچيه\nناچوها\nنايچيها\nنايجيها\nتنيجين\nناجوه\nناجوها\nناچوهن\nناجوهن\nناجوهم\nنيج\nمنيوج\nمنيويج\nمناج\nمناجة\nمناجه\nمنيوجة\nمنيويجة\nمنيوجه\nمنيويجه\nاختنيج\nانيج\nانيجج\nانيجك\nانيجها\nناچوهم\nنيچ\nمنيوچ\nمنيويچ\nمناچ\nمناچة\nمناچه\nمنيويچة\nمنيويچه\nاختنيچ\nانيچ\nانيچچ\nانيچج\nانيجچ\nانيچك\nانيچها\nنيچها\nانيجهن\nنجتهن\nنجتها\nنجته\nنجتهم\nنيجة\nنيچ\nتنيچ\nينيچ\nينيچن\nينيچون\nجماع\nقضيب\nعير\nعيربمك\nعيربختك\nانيچهن\nنچتهن\nنچتها\nنچته\nنچتهم\nنيچه\nنيچة\nعيربخالتك\nالفعيربمك\nالفعيربخالتك\nالفعيربختك\nعيربعمتك\nالفعيربعمتك\nعيري\nعيره\nعيورة\nعيوره\nانتصاب\nمنتصب\nمكوم\nمگوم\nزبه\nزبي\nعيرك\nعيرها\nزبها\nزب\nلوطي\nلواط\nسحاق\nمغتصب\nالمغتصب\nالمغتصبين\nالمغتصبينه\nالمغتصبينها\nمغتصبينه\nسحاقيه\nمغتصبينها\nسحاقية\nاغتصاب\nخنثي\nخنثية\nخنثيه\nنيكها\nنيكو\nاحتلام\nاخيل\nمخيل\nمخيله\nمخيلة\nخايلت\nخيلت\nنيك\nمتناك\nمتناكه\nمتناكة\nشرموطة\nعرص\nخول\nلبوة\nبعصة\nبعبوص\nبعبوصة\nبعابيص\nالتنيج\nالتنيچ\nالكحبه\nالكحبة\nالگحبه\nالگحبة\nالقحبه\nالقحبة\nالحس\nالحسه\nالحسها\nالحسلج\nالحسلچ\nالحسلك\nالحسله\nالحسلها\nطببه\nطببته\nالزربه\nالزربة\nالزراب\nالخره\nالخرة\nالخرية\nالخريه\nزربه\nزربة\nخرة\nخره\nخرية\nخريه\nخريان\nمنعول\nنعلة على\nنعله على\nنعلعلا\nنعلعله\nنعلعلة\nنعل\nهتلي\nكسمك\nكس امك\nكسختك\nكس اختك\nابن كحبة\nابن كحبه\nكسخالتك\nكس خالتك\nشرموطة\nعرص\nابن العريضة\nابن العريضه\nمنيوج\nفرخ\nكواد\nديوث\nطبون\nاير\nعير\nكس\nطيز\nنياج\nنياجك\nنياجج\nكسعرضك\nكس عرضك\nامك تنيج\nامك عريضة\nاختك الكحبه\nاختك العريضة\nابن عرص\nابن متناكة\nامك متناكة\nاختك متناكة\nامك تنيج\nابن بلاعة\nبلاعت العير\nبلاع العير\nاختك بلاعة العير\nاخت تنيج\ndate rape\ndaterape\ndeep throat\ndeepthroat\ndendrophilia\ndick\ndildo\ndingleberry\ndingleberries\ndirty pillows\ndirty sanchez\ndoggie style\ndoggiestyle\ndoggy style\ndoggystyle\ndog style\ndolcett\ndomination\ndominatrix\ndommes\ndonkey punch\ndouble dong\ndouble penetration\ndp action\ndry hump\ndvda\neat my ass\necchi\nejaculation\nerotic\nerotism\nescort\neunuch\nfag\nfaggot\nfecal\nfelch\nfellatio\nfeltch\nfemale squirting\nfemdom\nfigging\nfingerbang\nfingering\nfisting\nfoot fetish\nfootjob\nfrotting\nfuck\nfuck buttons\nfuckin\nfucking\nfucktards\nfudge packer\nfudgepacker\nfutanari\ngangbang\ngang bang\ngay sex\ngenitals\ngiant cock\ngirl on\ngirl on top\ngirls gone wild\ngoatcx\ngoatse\ngod damn\ngokkun\ngolden shower\ngoodpoop\ngoo girl\ngoregasm\ngrope\ngroup sex\ng-spot\nguro\nhand job\nhandjob\nhard core\nhardcore\nhentai\nhomoerotic\nhonkey\nhooker\nhorny\nhot carl\nhot chick\nhow to kill\nhow to murder\nhuge fat\nhumping\nincest\nintercourse\njack off\njail bait\njailbait\njelly donut\njerk off\njigaboo\njiggaboo\njiggerboo\njizz\njuggs\nkike\nkinbaku\nkinkster\nkinky\nknobbing\nleather restraint\nleather straight jacket\nlemon party\nlivesex\nlolita\nlovemaking\nmake me come\nmale squirting\nmasturbate\nmasturbating\nmasturbation\nmenage a trois\nmilf\nmissionary position\nmong\nmotherfucker\nmound of venus\nmr hands\nmuff diver\nmuffdiving\nnambla\nnawashi\nnegro\nneonazi\nnigga\nnigger\nnig nog\nnimphomania\nnipple\nnipples\nnsfw\nnsfw images\nnude\nnudity\nnutten\nnympho\nnymphomania\noctopussy\nomorashi\none cup two girls\none guy one jar\norgasm\norgy\npaedophile\npaki\npanties\npanty\npedobear\npedophile\npegging\npenis\nphone sex\npiece of shit\npikey\npissing\npiss pig\npisspig\nplayboy\npleasure chest\npole smoker\nponyplay\npoof\npoon\npoontang\npunany\npoop chute\npoopchute\nporn\nporno\npornography\nprince albert piercing\npthc\npubes\npussy\nqueaf\nqueef\nquim\nraghead\nraging boner\nrape\nraping\nrapist\nrectum\nreverse cowgirl\nrimjob\nrimming\nrosy palm\nrosy palm and her 5 sisters\nrusty trombone\nsadism\nsantorum\nscat\nschlong\nscissoring\nsemen\nsex\nsexcam\nsexo\nsexy\nsexual\nsexually\nsexuality\nshaved beaver\nshaved pussy\nshemale\nshibari\nshit\nshitblimp\nshitty\nshota\nshrimping\nskeet\nslanteye\nslut\ns&m\nsmut\nsnatch\nsnowballing\nsodomize\nsodomy\nspastic\nspic\nsplooge\nsplooge moose\nspooge\nspread legs\nspunk\nstrap on\nstrapon\nstrappado\nstrip club\nstyle doggy\nsuck\nsucks\nsuicide girls\nsultry women\nswastika\nswinger\ntainted love\ntaste my\ntea bagging\nthreesome\nthroating\nthumbzilla\ntied up\ntight white\ntit\ntits\ntitties\ntitty\ntongue in a\ntopless\ntosser\ntowelhead\ntranny\ntribadism\ntub girl\ntubgirl\ntushy\ntwat\ntwink\ntwinkie\ntwo girls one cup\nundressing\nupskirt\nurethra play\nurophilia\nvagina\nvenus mound\nviagra\nvibrator\nviolet wand\nvorarephilia\nvoyeur\nvoyeurweb\nvoyuer\nvulva\nwank\nwetback\nwet dream\nwhite power\nwhore\nworldsex\nwrapping men\nwrinkled starfish\nxx\nxxx\nyaoi\nyellow showers\nyiffy\nzoophilia\n🖕\n\nينيك مراته\nيعشرها\nيبوس\nيبعبص\nيسخن\nيهيج\nكسم\nسكس\nلافا\nادمز\nمايا\nخليفة\nخليفه\nبز\nكسها\nيعاشر\nنسوان\nمره\nينط\nيفط\nيضرب\nيغتصب\nينيكها\nيقطع\nملابس\nملابسها";
		}
	}
	
	
	public void _indextext() {
		tokendGot.clear();
		token = banndedTxt;
		for(int _repeat61 = 0; _repeat61 < (int)(9999); _repeat61++) {
			posCheck = token.indexOf("¶");
			if (-1 < posCheck) {
				posCheck = token.indexOf("§");
			}
			if (-1 < posCheck) {
				nu = token.indexOf("¶");
				cut = token.substring((int)(nu + "¶".length()), (int)(token.length()));
				nu2 = cut.indexOf("§");
				cut = cut.substring((int)(0), (int)(nu2));
				tokendGot.add(cut);
				token = token.replaceFirst("¶".concat(cut.concat("§")), "");
			}
			else {
				break;
			}
		}
	}
	
	
	public void _on_webview_start_loading() {
		boolean block = false;    // نتيجة الفحص
		
		for(int i = 0; i < tokendGot.size(); i++) {
			
			    String banned = tokendGot.get(i).trim();
			
			    if (!banned.equals("")) {
				
				        if (url.toLowerCase().contains(banned.toLowerCase())) {
					            block = true;
					            break;   // وقف الحلقة مثل منطقك
					        }
				
				    }
		}
		
		if (block) {
			    webview1.stopLoading();
			    webview1.goBack();
			    Toast.makeText(getApplicationContext(), "تم حظر الرابط", Toast.LENGTH_SHORT).show();
		}
		
	}
	
	
	public void _style_day() {
		// خلفيات نهارية
		button2.setBackgroundResource(R.drawable.btn_ripple_day);
		button3.setBackgroundResource(R.drawable.btn_ripple_day);
		button4.setBackgroundResource(R.drawable.btn_ripple_day);
		button5.setBackgroundResource(R.drawable.btn_ripple_day);
		button6.setBackgroundResource(R.drawable.btn_ripple_day);
		button7.setBackgroundResource(R.drawable.btn_ripple_day);
		edittext1.setBackgroundResource(R.drawable.btn_ripple_day);
		edittext2.setBackgroundResource(R.drawable.btn_ripple_day);
		last5.setBackgroundResource(R.drawable.btn_ripple_day);
		timer.setBackgroundResource(R.drawable.btn_ripple_day);
		textview13.setBackgroundResource(R.drawable.btn_ripple_day);
		textview14.setBackgroundResource(R.drawable.btn_ripple_day);
		textview15.setBackgroundResource(R.drawable.btn_ripple_day);
		switch1.setBackgroundResource(R.drawable.btn_ripple_day);
		blurSwitch.setBackgroundResource(R.drawable.btn_ripple_day);
		blurVideoSwitch.setBackgroundResource(R.drawable.btn_ripple_day);
		blurAmountLabel.setBackgroundResource(R.drawable.btn_ripple_day);
		blurSwitch.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/amiri.ttf"), 0);
		blurVideoSwitch.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/amiri.ttf"), 0);
		blurAmountLabel.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/amiri.ttf"), 0);
		linear14.setBackgroundResource(R.drawable.btn_ripple_day);
		search_linear.setBackgroundResource(R.drawable.btn_ripple_day);
		
		
		// النصوص النهارية (غامق)
		int dayText = 0xFF212121;
		
		
		textview6.setTextColor(dayText);
		textview5.setTextColor(dayText);
		oi.setTextColor(dayText);
		textview10.setTextColor(dayText);
		textview11.setTextColor(dayText);
		fra.setTextColor(dayText);
		textview7.setTextColor(dayText);
		textview8.setTextColor(dayText);
		button2.setTextColor(dayText);
		button3.setTextColor(dayText);
		textview13.setTextColor(dayText);
		textview12.setTextColor(dayText);
		last5.setTextColor(dayText);
		textview9.setTextColor(dayText);
		textview2.setTextColor(dayText);
		textview4.setTextColor(dayText);
		timer.setTextColor(dayText);
		textview15.setTextColor(dayText);
		textview14.setTextColor(dayText);
		button4.setTextColor(dayText);
		button7.setTextColor(dayText);
		edittext1.setTextColor(dayText);
		button5.setTextColor(dayText);
		edittext2.setTextColor(dayText);
		edittext5.setTextColor(dayText);
		switch1.setTextColor(dayText);
		blurSwitch.setTextColor(dayText);
		blurVideoSwitch.setTextColor(dayText);
		blurAmountLabel.setTextColor(dayText);
		button6.setTextColor(dayText);
		edittext3.setTextColor(dayText);
		textview6.setTextColor(dayText);
		textview1.setTextColor(dayText);
		
		textview6.setTextColor(0xFF212121);
		textview5.setTextColor(0xFF212121);
		oi.setTextColor(0xFF212121);
		textview10.setTextColor(0xFF212121);
		textview11.setTextColor(0xFF212121);
		fra.setTextColor(0xFF212121);
		textview7.setTextColor(0xFF212121);
		textview8.setTextColor(0xFF212121);
		button2.setTextColor(0xFF212121);
		button3.setTextColor(0xFF212121);
		textview13.setTextColor(0xFF212121);
		textview12.setTextColor(0xFF212121);
		last5.setTextColor(0xFF212121);
		textview9.setTextColor(0xFF212121);
		textview2.setTextColor(0xFF212121);
		textview4.setTextColor(0xFF212121);
		timer.setTextColor(0xFF212121);
		textview15.setTextColor(0xFF212121);
		button4.setTextColor(0xFF212121);
		button7.setTextColor(0xFF212121);
		edittext1.setTextColor(0xFF212121);
		button5.setTextColor(0xFF212121);
		edittext2.setTextColor(0xFF212121);
		switch1.setTextColor(0xFF212121);
		button6.setTextColor(0xFF212121);
		edittext3.setTextColor(0xFF212121);
		textview6.setTextColor(0xFF212121);
		textview1.setTextColor(0xFF212121);
		
		light_night_mode.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)25, 0xFF673AB7));
		edittext1.setHintTextColor(0xFF212121);
		edittext2.setHintTextColor(0xFF212121);
		edittext3.setHintTextColor(0xFF212121);
		edittext5.setHintTextColor(0xFF212121);
		// صور ايقونات مواقع التواصل في الوضع النهاري
		imageview1.setImageResource(R.drawable.icon_1);
		imageview2.setImageResource(R.drawable.icon_4);
		imageview3.setImageResource(R.drawable.icon_3);
		imageview4.setImageResource(R.drawable.icon_2);
		imo.setImageResource(R.drawable.icon_6);
		wts.setImageResource(R.drawable.icon_5);
		linear13.setBackgroundColor(0xFFFFFFFF);
	}
	
	
	public void _ShareApp() {
	}
	private void shareApplication() { 
			    android.content.pm.ApplicationInfo app = 
			    getApplicationContext().getApplicationInfo(); 
			    String filePath = app.sourceDir;
			    Intent intent = new Intent(Intent.ACTION_SEND); 
			    intent.setType("*/*"); 
			    java.io.File originalApk = new java.io.File(filePath); 
			    try {  
					     java.io.File tempFile = new java.io.File(getExternalCacheDir() + "/ExtractedApk"); 
					      if (!tempFile.isDirectory()) 
					      if (!tempFile.mkdirs()) 
					      return; 
					      tempFile = new java.io.File(tempFile.getPath() + "/" + 
					      "Muslim Media.apk");
					      if (!tempFile.exists()) 
					       {
							       try{
									        if (!tempFile.createNewFile()) { 
											         return; }
									        }
							       catch (java.io.IOException e){} 
							       } 
					      java.io.InputStream in = new java.io.FileInputStream (originalApk);
					      java.io.OutputStream out = new java.io.FileOutputStream(tempFile);
					      byte[] buf = new byte[1024];
					      int len; 
					      while ((len = in.read(buf)) > 0) { 
							        out.write(buf, 0, len); 
							      } 
					      in.close(); 
					      out.close(); 
					      intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(tempFile));
					      startActivity(Intent.createChooser(intent, "مشاركة التطبيق من خلال:"));
					    } 
			    catch (java.io.IOException e) 
			    { showMessage(e.toString()); 
					    } 
			
			  }
	{
	}
	
	
	public void _extra_oncreate_code() {
		if (!sav_mode.getString("mode", "").equals("")) {
			if (sav_mode.getString("mode", "").equals("day")) {
				linear1.setBackgroundColor(0xFFFFFFFF);
				light_night_mode.setImageResource(R.drawable.ic_brightness_4_white);
				_style_day();
			}
			else {
				linear1.setBackgroundColor(0xFF000000);
				light_night_mode.setImageResource(R.drawable.ic_brightness_7_white);
				_style();
			}
		}
		else {
			sav_mode.edit().putString("mode", "night").commit();
		}
		imageview8.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		imageview9.setColorFilter(0xFF2196F3, PorterDuff.Mode.MULTIPLY);
		edittext5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/amiri.ttf"), 0);
		if (!wts_clickk.getString("wts", "").equals("")) {
			wts_click = Double.parseDouble(wts_clickk.getString("wts", "0"));
		}
		if (!imo_clic.getString("imo", "").equals("")) {
			imo_click = Double.parseDouble(imo_clic.getString("imo", "0"));
		}
		ytyt = 0;
		fb = 0;
		inst = 0;
		twit = 0;
		imooo = 0;
		wtst = 0;
		_setCustomWebChrome();
		_develop_webviews();
		_intent_filter();
		progressbar1.setVisibility(View.GONE);
		_progrresBar();
		_check_internet();
	}
	
	
	public void _setCustomWebChrome() {
		Youtube.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		Youtube.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		
		Facebook.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		Facebook.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		
		twitt.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		twitt.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		
		insta.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		insta.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		
		whats.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		whats.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		imoo.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		imoo.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		
		webview1.setWebChromeClient(new WebChromeClient() {
			
			    protected void openFileChooser(ValueCallback uploadMsg, String acceptType) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    public boolean onShowFileChooser(WebView mWebView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
				        if (uploadMessage != null) {
					            uploadMessage.onReceiveValue(null);
					            uploadMessage = null;
					        }
				        uploadMessage = filePathCallback;
				        Intent intent = fileChooserParams.createIntent();
				        try {
					            startActivityForResult(intent, REQUEST_SELECT_FILE);
					        } catch (ActivityNotFoundException e) {
					            uploadMessage = null;
					            Toast.makeText(getApplicationContext(), "Cannot Open File Chooser", Toast.LENGTH_LONG).show();
					            return false;
					        }
				        return true;
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
				        mUploadMessage = uploadMsg;
				        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
				        intent.addCategory(Intent.CATEGORY_OPENABLE);
				        intent.setType("image/*");
				        startActivityForResult(Intent.createChooser(intent, "File Browser"), FILECHOOSER_RESULTCODE);
				    }
			
			    protected void openFileChooser(ValueCallback<Uri> uploadMsg) {
				        mUploadMessage = uploadMsg;
				        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
				        i.addCategory(Intent.CATEGORY_OPENABLE);
				        i.setType("image/*");
				        startActivityForResult(Intent.createChooser(i, "File Chooser"), FILECHOOSER_RESULTCODE);
				    }
			
		});
		
		webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
	}
	
	
	public void _develop_webviews() {
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setLoadWithOverviewMode(true);
		webview1.getSettings().setUseWideViewPort(true);
		webview1.getSettings().setDomStorageEnabled(true);
		
		String userAgent = webview1.getSettings().getUserAgentString();
		try {
			    String androidString = webview1.getSettings().getUserAgentString().substring(userAgent.indexOf("("), userAgent.indexOf(")") + 1);
			    userAgent = webview1.getSettings().getUserAgentString().replace(androidString, "X11; Linux x86_64");
		} catch (Exception e) {
			    e.printStackTrace();
		}
		webview1.getSettings().setUserAgentString(userAgent);
		webview1.reload();
	}
	
	
	public void _intent_filter() {
		if (getIntent().hasExtra("data")) {
			safhaweb.setVisibility(View.GONE);
			mainlist.setVisibility(View.GONE);
			in_app_browser.setVisibility(View.VISIBLE);
			edittext3.setText(getIntent().getStringExtra("data"));
		}
	}
	
	
	public void _progrresBar() {
		webview1.setWebChromeClient(new WebChromeClient() {
			    @Override
			    public void onProgressChanged(WebView view, int progress) {
				        progressbar1.setProgress(progress);
				
				        if (progress < 100) {
					            progressbar1.setVisibility(View.VISIBLE);
					        } else {
					            progressbar1.setVisibility(View.GONE);
					        }
				    }
		});
		
	}
	
	
	public void _check_internet() {
		if (SketchwareUtil.isConnected(getApplicationContext())) {
			
		}
		else {
			go_to_sbha.setClass(getApplicationContext(), OfflineSbhaActivity.class);
			startActivity(go_to_sbha);
		}
	}
	
	public class Listview2Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.lihis, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			if (hist.get((int)_position).containsKey("text")) {
				textview1.setText(hist.get((int)_position).get("text").toString());
			}
			linear1.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF000000,0xFF673AB7}));
			textview1.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL, new int[] {0xFF2196F3,0xFF000000}));
			linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)5, 0xFF009688));
			
			return _view;
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
