package com.example.mobile.ui.aboutUs;

import android.media.Image;
import android.widget.ImageView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//о нас
public class AboutUsViewModel extends ViewModel {

    private MutableLiveData<String> mText;
//    private MutableLiveData<Image> mImage;

    public AboutUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is aboutUs fragment");

//        mImage = new MutableLiveData<>();
//        mImage.setValue("employee.png");
    }

    public LiveData<String> getText() {
        return mText;
    }

}