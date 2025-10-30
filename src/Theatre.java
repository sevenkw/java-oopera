import person.*;
import show.*;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {

        Actor a1 = new Actor("Александр", "Петров", Gender.MALE, 180);
        Actor a2 = new Actor("Олег", "Сорокин", Gender.MALE, 168);
        Actor a3 = new Actor("Эмма", "Уотсон", Gender.FEMALE, 160);

        Director d1 = new Director("Роберт", "Карсен", Gender.MALE, 100);
        Director d2 = new Director("Софи", "Хантер", Gender.FEMALE, 20);

        Person choreographer = new Person("Игорь", "Моисеев", Gender.MALE);

        Person musicAuthor = new Person("Петр", "Чайковский", Gender.MALE);
        Person musicAuthor2 = new Person("Джузеппо", "Верди", Gender.MALE);

        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();

        Show show = new Show("Обычный спектакль", 120, d1, showActors);

        Ballet ballet = new Ballet("Лебединое озеро", 150, d2, balletActors,
                musicAuthor, "Принц влюбляется в прекрасную Одит, заколдованную злым волшебником.", choreographer);
        Opera opera = new Opera("Травиата", 130, d1, operaActors,
                musicAuthor2, "Жить, желая лишь дотянуть до завтрашнего дня, недопустимо", 20);


        show.addActor(a1);
        show.addActor(a2);

        ballet.addActor(a2);
        ballet.addActor(a3);

        opera.addActor(a1);
        opera.addActor(a3);

        System.out.println("Список актёров обычного спектакля:");
        show.printActors();

        System.out.println("\nСписок актёров балета:");
        ballet.printActors();

        System.out.println("\nСписок актёров оперы:");
        opera.printActors();

        System.out.println("\nЗамена актёра в опере:");
        opera.replaceActor("Петров", a2);
        opera.printActors();

        System.out.println("\nЗаменяем несуществующего актёра:");
        show.replaceActor("Иванов", a3);


        System.out.println("\nЛибретто балета:");
        ballet.printLibretto();

        System.out.println("\nЛибретто оперы:");
        opera.printLibretto();
    }
}
