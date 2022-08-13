package com.example.finalprojec;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    //DBHandler dbHandler;
    static Criminal crim1, crim2, crim3, crim4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runGame();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavView);
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.navHostFragment);
        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();
            NavigationUI.setupWithNavController(bottomNavigationView, navController);

            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
                @Override
                public void onDestinationChanged(@NonNull NavController navController, @NonNull NavDestination navDestination, @Nullable Bundle bundle) {
                    if(navDestination.getId() == R.id.beginningFragment || navDestination.getId() == R.id.finalFragment) {
                        bottomNavigationView.setVisibility(View.INVISIBLE);
                    }
                    else {
                        bottomNavigationView.setVisibility(View.VISIBLE);

                    }

                }
            });

        }




        crim1 = new Criminal("George Foyet", "38", "Serial killer who is wanted for 36 other killings. Left a  piece of technology at each of these 36 crime scenes. Uses Vicodin for a recent head injury.", "5 ft. 11 in.", "160 lbs.");
        crim2 = new Criminal("Spencer Reid", "26", "Lost father when he was 3. No criminal history. Was an ex-boyfriend of the victim's. Has a deep-rooted hatred for the victim. Suffered from a severe brain injury after a car crash.", "6 ft. 3 in.", "111 lbs.");
        crim3 = new Criminal("Ian Doyle", "22", "Heavy drug and alcohol addiction. Former FBI agent and was fired for drinking on the job. Killed a former member of your team and wants more information about your team.", "5 ft. 4 in.", "106 lbs.");
        crim4 = new Criminal("Niall Lewis", "32", "Skilled stalker and hacker. Former U.S. Marine. Uses Oxycontin for a recent leg injury. Working as a computer technician.", "5 ft. 7 in.", "121 lbs.");

        //dbHandler = new DBHandler(MainActivity.this);
        //dbHandler.addNewCriminal("George Foyet", "38", "Abusive relationship with father caused hatred for mother. Prolific serial killer that is wanted for 36 other killings. Lost his mother when he was 9.", "5 ft. 11 in.", "121 lbs.", "Topiramate"); //Topiramate is a medicine used for treating headaches
        //dbHandler.addNewCriminal("Spencer Reid", "26", "Lost father when he was 3. Mother has Alzheimers. No criminal history", "6 ft. 3 in.", "111 lbs.", "No medicine.");
        //dbHandler.addNewCriminal("Ian Doyle", "22", "Heavy drug and alcohol addiction. Killed a former member of your team. Former U.S. Marine.", "5 ft. 12 in.", "106 lbs.", "Vicodin");
        //dbHandler.addNewCriminal("Niall Lewis", "32", "Former stalker and hacker. Victim of sexual abuse by a former male partner. Orphaned at the age of 5.", "5 ft. 9 in.", "121 lbs.", "Oxycontin");
    }

    public void runGame() {

    }

}