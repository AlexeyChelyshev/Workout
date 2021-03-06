package stopwach.hfad.com.workout;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.app.FragmentTransaction;

public class WorkoutDetailFragment extends Fragment {

    private long workoutId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if(savedInstanceState != null)
        {
            workoutId = savedInstanceState.getLong("workoutId");
        }else {
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            StopwatchFragment stopwatchFragment = new StopwatchFragment();
            ft.replace(R.id.stopwatch_container, stopwatchFragment);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView(); // получил корневой view фрагмента

        if(view != null)
        {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workouts = Workout.workouts[(int) workoutId];
            title.setText(workouts.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(workouts.getDescription());
        }
    }

    public void setWorkout(long id) {
        this.workoutId = id;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("workoutId", workoutId);
    }
}