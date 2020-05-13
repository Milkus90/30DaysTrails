package pl.Ghaneal.Trials;

public class ProgressiveTrial extends Trial {
    double startingValue = 0;
    double dailyProgress = 1;

    public ProgressiveTrial(String name, String description, String toDo, boolean isProgressive,
                            double startingValue, double dailyProgress) {
        super(name, description, toDo, isProgressive);
        this.dailyProgress = dailyProgress;
        this.startingValue = startingValue;
    }


}
