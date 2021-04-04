package com.example.mobile.ui.directions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//контакты
public class DirectionsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DirectionsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("'Интеллект' на Химмаше\n\n" +
                "620010, г. Екатеринбург, ул. Профсоюзная, 63, со стороны магазина 'Домашний'\n\n" +
                "+7(343)382-59-05\n" +
                "+7(912)615-76-15\n\n" +
                "intellect@intellect96.ru");
    }

    public LiveData<String> getText() {
        return mText;
    }
}