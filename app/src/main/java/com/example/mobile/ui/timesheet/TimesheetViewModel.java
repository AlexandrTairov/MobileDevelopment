package com.example.mobile.ui.timesheet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TimesheetViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TimesheetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Данная функция пока не доступна и будет добавлена в будущих патчах");
    }

    public LiveData<String> getText() {
        return mText;
    }
}