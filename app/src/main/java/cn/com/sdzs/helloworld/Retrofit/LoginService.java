package cn.com.sdzs.helloworld.Retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginService {
    @FormUrlEncoded
    @POST("interface/login")
    Call<ResponseBody> login(@Field("userName") String userName, @Field("userPassword") String password);
}
