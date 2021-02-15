package com.example.mobile.ui.shares;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SharesViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is slideshow fragment");
        mText.setValue("3");
    }

    public LiveData<String> getText() {
        return mText;
    }
}