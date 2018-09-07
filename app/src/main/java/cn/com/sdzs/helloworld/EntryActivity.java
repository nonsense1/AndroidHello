package cn.com.sdzs.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import javax.inject.Inject;

import cn.com.sdzs.helloworld.Utils.ConfigUtils;
import cn.com.sdzs.helloworld.dagger.Product;
@Route(path = "/test/entry", extras = 1)
public class EntryActivity extends AppCompatActivity {
    @Inject
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

/*        String ip = ConfigUtils.getAppConfigProperties().getProperty("IP");
        Toast.makeText(this,ip,Toast.LENGTH_LONG).show();*/

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/test/login").navigation();
            }
        });
        Button full = findViewById(R.id.fullscreen);
        full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ARouter.getInstance().build("/test/fullscreen").navigation();
            }
        });
        Button tab = findViewById(R.id.tablout);
        tab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ARouter.getInstance().build("/test/tablayout").navigation();
            }
        });
        Button systab = findViewById(R.id.systemtablayout);
        systab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ARouter.getInstance().build("/test/systab").navigation();
            }
        });

/*        AnnoClass annoClass = new AnnoClass();
        annoClass.getAnnotation();*/

/*        mTextView = findViewById(R.id.tv);
        myPresenter = new MyPresenter(this);*/

/*        DaggerFactoryActivityComponent.create().inject(this);
        Toast.makeText(this,""+product.hashCode(),Toast.LENGTH_LONG).show();*/


/*        Runnable netThread = new Runnable() {
            @Override
            public void run() {
                GetExanple get = new GetExanple();
                try {
                    String r = get.run("http://www.baidu.com");
                    Log.d("getRequest", "onCreate: " + r);
                }catch (IOException e){

                }*/

/*                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://10.100.0.94:8081/cs/pms/").build();
                LoginService loginService = retrofit.create(LoginService.class);
                Call<ResponseBody> call = loginService.login("sunfs","1111");
                call.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        try {
                            Log.d("onResponse", "onResponse: " + response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {

                    }
                });
            }
        };
        new Thread(netThread).start();*/

/*        final Runnable trans = new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://fy.iciba.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                TranslateService translateService = retrofit.create(TranslateService.class);
                HashMap map = new HashMap();
                map.put("a","fy");
                map.put("f","auto");
                map.put("t","auto");
                map.put("w","hello");
                Call<Translation> call = translateService.getCall(map);
                call.enqueue(new Callback<Translation>() {
                    @Override
                    public void onResponse(Call<Translation> call, Response<Translation> response) {
                        response.body().show();
                    }

                    @Override
                    public void onFailure(Call<Translation> call, Throwable t) {

                    }
                });
            }
        };
        new Thread(trans).start();*/

    }

/*    void Rxjava() {
        io.reactivex.Observer<String> observer = new io.reactivex.Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext: " + s);
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
            }
        };

        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription s) {
                Log.d(TAG, "onSubscribe: ");
            }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "onNext: " + s);
            }

            @Override
            public void onError(Throwable t) {
                Log.d(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
            }
        };

        io.reactivex.Observable observable = io.reactivex.Observable.create(new ObservableOnSubscribe() {
            @Override
            public void subscribe(ObservableEmitter emitter) throws Exception {
                emitter.onNext("hello");
                emitter.onComplete();
            }
        });

        observable.subscribe(observer);
    }*/

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent home = new Intent(Intent.ACTION_MAIN);
            home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            home.addCategory(Intent.CATEGORY_HOME);
            startActivity(home);
        }
        return super.onKeyDown(keyCode, event);
    }
}
