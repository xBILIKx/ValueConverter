package com.example.valueconverter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.valueconverter.model.APIService
import com.example.valueconverter.model.Value
import com.example.valueconverter.model.ValuesList
import com.example.valueconverter.model.Valute
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.reflect.full.memberProperties

class MainViewModel : ViewModel() {
    private val _valuteListLiveData = MutableLiveData<List<Value>>()
    val valuteListLiveData: LiveData<List<Value>>
        get() = _valuteListLiveData

    private val _errorLiveData = MutableLiveData<String>()
    val errorLiveData: LiveData<String>
        get() = _errorLiveData


    fun updateData(){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.cbr-xml-daily.ru/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        viewModelScope.launch {
            val service = retrofit.create(APIService::class.java)
            val response = service.getData()
            response.enqueue(object : Callback<ValuesList>{
                override fun onResponse(call: Call<ValuesList>, response: Response<ValuesList>) {
                    if (response.isSuccessful) {
                        val listValues: MutableList<Value> = mutableListOf()
                        val value = response.body()!!.Valute
                        for (i in Valute::class.memberProperties)
                            listValues.add(i.get(value) as Value)
                        _valuteListLiveData.postValue(listValues)
                    }
                    else _errorLiveData.postValue(response.errorBody().toString())
                }

                override fun onFailure(call: Call<ValuesList>, t: Throwable) =
                    _errorLiveData.postValue(t.message)

            })
        }
    }
}