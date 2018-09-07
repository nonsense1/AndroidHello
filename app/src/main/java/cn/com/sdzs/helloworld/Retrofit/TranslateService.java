package cn.com.sdzs.helloworld.Retrofit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface TranslateService {

    @GET("ajax.php")
    Call<Translation> getCall(@QueryMap Map<String,String> map);
}
