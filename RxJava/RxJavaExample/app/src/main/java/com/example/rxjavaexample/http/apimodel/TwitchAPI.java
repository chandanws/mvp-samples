 package com.example.rxjavaexample.http.apimodel;


 import retrofit2.Call;
 import retrofit2.http.GET;
 import rx.Observable;

 /**
 * Created by tzia on 24-May-17.
 */

public interface TwitchAPI
{

    @GET("streams")
    Call<Twitch> getTopGames();

    @GET("streams")
    Observable<Twitch> getTopGamesObservable();
}
