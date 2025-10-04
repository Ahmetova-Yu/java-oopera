import Entity.Actor;
import Entity.Director;
import Entity.Genre;
import Entity.Person;

import Theatre.Show;
import Theatre.Opera;
import Theatre.Ballet;

import java.util.ArrayList;
import java.util.Scanner;

public class Theatre {
    private static Actor actor1, actor2, actor3, actor4;
    private static Director director1, director2;
    private static Person dancer, musician;

    private static ArrayList<Actor> listOfActors1 = new ArrayList<>();
    private static ArrayList<Actor> listOfActors2 = new ArrayList<>();
    private static ArrayList<Actor> listOfActors3 = new ArrayList<>();

    private static Show show;
    private static Opera opera;
    private static Ballet ballet;

    public static void main(String[] args) {
        // создание сущностей
        testCreatePersons();
        testCreateShows();

        System.out.println();

        // добавление актеров в спектакли
        System.out.println("Добавление актеров в спектакли: ");
        System.out.println();
        show.addNewActor(actor1);
        show.addNewActor(actor2);
        ballet.addNewActor(actor3);
        System.out.println("-".repeat(50));

        System.out.println("Вывод информации об актерах: ");
        System.out.println();
        System.out.println(show);
        System.out.println(opera);
        System.out.println(ballet);
        System.out.println("-".repeat(50));

        System.out.println("Замена актера");
        System.out.println();
        opera.replaceActor(actor2, actor3);
        System.out.println(opera);
        System.out.println("-".repeat(50));

        System.out.println("Замена актера на несуществующего актера: ");
        System.out.println();
        opera.replaceActor(actor1, actor4);
        System.out.println(opera);
        System.out.println("-".repeat(50));

        System.out.println();

        System.out.println("Либретто '" + opera.getTitle() + "': " + opera.getLibrettoText());
        System.out.println("Либретто '" + ballet.getTitle() + "': " + ballet.getLibrettoText());
    }

    private static void testCreatePersons() {
        actor1 = new Actor("Мария", "Васильева", Genre.FEMALE, 168);
        actor2 = new Actor("Денис", "Леонов", Genre.MALE, 187);
        actor3 = new Actor("Анастасия", "Потапова", Genre.FEMALE, 170);
        actor4 = new Actor("Егор", "Анисимов", Genre.MALE, 190);

        director1 = new Director("Валерий", "Зайцев", Genre.MALE, 6);
        director2 = new Director("Тимофей", "Кукунин", Genre.MALE, 15);

        dancer = new Person("Елена", "Тимофеева", Genre.FEMALE);
        musician = new Person("Ольга", "Владимирова", Genre.FEMALE);
    }

    private static void testCreateShows() {
        listOfActors1.add(actor1);
        show = new Show("Обычный спектакль!", 120, director2, listOfActors1);

        listOfActors2.add(actor3);
        opera = new Opera("Опера!", 80, director2, listOfActors2, musician,
                "Композитор, теряющий слух, в отчаянии пишет симфонию, находя вдохновение в любви", 4);

        listOfActors3.add(actor2);
        listOfActors3.add(actor1);
        ballet = new Ballet("Балет", 140, director1, listOfActors3, musician,
                "Порыв ветра уносит шарф балерины к скрипачу. Их взгляды встречаются, и рождается танец на мосту под дождем",
                dancer);
    }
}