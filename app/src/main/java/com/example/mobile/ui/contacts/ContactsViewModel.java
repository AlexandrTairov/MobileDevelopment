package com.example.mobile.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
//Направления
public class ContactsViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    String[] names = { "Иван", "Марья", "Петр", "Антон", "Даша", "Борис",
            "Костя", "Игорь", "Анна", "Денис", "Андрей" };

    public ContactsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("123");

    }

    public LiveData<String> getText() {
        return mText;
    }
    public String[] getNames() {
        return names;
    }
}