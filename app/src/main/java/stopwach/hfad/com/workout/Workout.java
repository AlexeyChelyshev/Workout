package stopwach.hfad.com.workout;

/**
 * Created by retro_2k on 18.09.2017.
 */

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {

            new Workout("жим лежа",
                    "ложись на спину (шоб лицом к металлической штуке) опусти на себя штангу (это и есть это штука перед глазами) постарайся поднять её, если не получается - зови на помощь"),
            new Workout("становая тяга",
                    "ставь штангу перед собой и с ровной спиной пытайся её поднять"),
            new Workout("бег",
                    "дразни соседского добермана и убегай "),
            new Workout("присяд",
                    "содись - вставай")
    };

    private Workout(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String toString(){
        return this.name;
    }
}
