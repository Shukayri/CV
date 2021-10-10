package ran.am.currencyconverter


import retrofit2.http.GET
import retrofit2.http.Headers

interface APIInterface {
    @Headers("Content-Type: application/json")
    @GET("eur.json")
    fun getCurrency(): android.telecom.Call<Datum>?
}