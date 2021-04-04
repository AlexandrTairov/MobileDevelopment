package com.example.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration; //бургер меню ипорт со страницы layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //onCreate - при открытии приложения срабатывает метод
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//связка текущей страницы с acrivity_main.xml
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Передача каждого идентификатора меню в виде набора идентификаторов, поскольку каждый
        // меню следует рассматривать как пункты назначения верхнего уровня.
        mAppBarConfiguration = new AppBarConfiguration.Builder(      //добавляем страницы в бургер меню
                R.id.nav_news, R.id.nav_directions,
                R.id.nav_timesheet, R.id.nav_contacts, R.id.nav_aboutus)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void goToEmployee(View v) {
        Intent intent = new Intent(this, EmployeeActivity.class);
        startActivity(intent);
    }

    public void goToEmployee2(View v) {
        Intent intent = new Intent(this, EmployeeActivity2.class);
        startActivity(intent);
    }

    public void goToNews(View v) {
        Intent intent = new Intent(this, NewsActivity1.class);
        startActivity(intent);
    }

    public void goToNews2(View v) {
        Intent intent = new Intent(this, NewsActivity2.class);
        startActivity(intent);
    }

    public void goToPageComputerDirection(View v) {
        Intent intent = new Intent(this, PageComputerDirection.class);
        startActivity(intent);
    }

    public void goToPageCreativeDirection(View v) {
        Intent intent = new Intent(this, PageCreativeDirection.class);
        startActivity(intent);
    }

    public void goToPageDevelopmentOfIntelligence(View v) {
        Intent intent = new Intent(this, PageDevelopmentOfIntelligence.class);
        startActivity(intent);
    }

    public void goToPageEngineeringDirection(View v) {
        Intent intent = new Intent(this, PageEngineeringDirection.class);
        startActivity(intent);
    }

    public void goToPagePreparationForTheOGEandUSE(View v) {
        Intent intent = new Intent(this, PagePreparationForTheOGEandUSE.class);
        startActivity(intent);
    }


    public void goToPPageSportsDirection(View v) {
        Intent intent = new Intent(this, PageSportsDirection.class);
        startActivity(intent);
    }

}
