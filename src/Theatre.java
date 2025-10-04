import Theatre.MusicalShow;
import java.util.Scanner;

public class Theatre {
    static MusicalShow musicalShow;

    public static void main(String[] args) {

    }

    private static void printMenu() {
        System.out.println("Введите одну из команд: ");
        System.out.println("1" + " - вывести текст либретто");
        System.out.println("2" + " - распечатать информацию о режиссёре спектакля");
        System.out.println("3" + " - распечатать список всех актёров, участвующих в спектакле");
        System.out.println("4" + " - добавить нового актёра в спектакль");
        System.out.println("5" + " - заменить одного актёра в спектакле на другого");
    }

    private static void testCreateShow() {
        MusicalShow musicalShow = new MusicalShow("Афанасьеф Кирилл", "libretto1");
    }
}