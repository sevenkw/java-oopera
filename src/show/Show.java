package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;
public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println(director.toString());
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("В спектакле пока нет актеров");
            return;
        }
        for (Actor actor: listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        for (Actor actors: listOfActors) {
            if (actor.equals(actors)) {
                System.out.println("Данный актер уже есть в списке");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void replaceActor(String surname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
             Actor actors = listOfActors.get(i);
             if (surname.equals(actors.getSurname())) {
                 listOfActors.set(i, newActor);
                 return;
             }
        }
        System.out.println("Актер с данной фамилией не найден!");
    }
}
