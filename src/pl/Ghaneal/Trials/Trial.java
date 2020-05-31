package pl.Ghaneal.Trials;

public class Trial {
    String name = null;
    String description = null;
    String toDo = null;
    boolean isProgressive = false;
    int id = 0;
    int createdByUserId = 0;

    public Trial(String name, String description, String toDo, boolean isProgressive){
        this.id = NewFreeId.getNextFreeId(FinalValues.ACCESS_TRIALS_DATABASE);
        this.createdByUserId = getLoggedUserId();
        this.name = name;
        this.description = description;
        this.toDo = toDo;
        this.isProgressive = isProgressive;
    }



    public String toString(){
        return id + " ; " + createdByUserId + " ; " + name + " ; " + description + " ; " + toDo + " ; " + isProgressive +
                " ; ";
    }

    void doneDailyActivity(){

    }

    void endWithSuccess(){

    }

    void endWithNoSuccess(){

    }

    private int getLoggedUserId() {
        int loggedUserId = 0;

        return loggedUserId;
    }


}
