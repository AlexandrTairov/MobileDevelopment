package com.example.mobile.ui.timesheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.mobile.R;

public class TimesheetFragment extends Fragment {

    private TimesheetViewModel timesheetViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        timesheetViewModel =
                ViewModelProviders.of(this).get(TimesheetViewModel.class);
        View root = inflater.inflate(R.layout.fragment_timesheet, container, false);
        final TextView textView = root.findViewById(R.id.text_timesheet);
        timesheetViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}