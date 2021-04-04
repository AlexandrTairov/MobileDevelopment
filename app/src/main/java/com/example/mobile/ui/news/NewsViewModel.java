package com.example.mobile.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//новости
public class NewsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("1");
//        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}