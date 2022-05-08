import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task5();
    }

    public static void task5() {

        String fullName = "Ivanov Ivan Ivanovich";
        int inOf = fullName.indexOf(' ');
        int lastInOf = fullName.lastIndexOf(' ');
        String firstName = fullName.substring(inOf + 1, lastInOf);
        String middleName = fullName.substring(lastInOf);
        String lastName = fullName.substring(0, inOf);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        int inOf = fullName.indexOf(' ');
        int lastInOf = fullName.lastIndexOf(' ');
        char[] arr = fullName.toCharArray();
        char one = fullName.charAt(inOf + 1);
        one = Character.toUpperCase(one);
        char sec = fullName.charAt(0);
        sec = Character.toUpperCase(sec);
        char mid = fullName.charAt(lastInOf + 1);
        mid = Character.toUpperCase(mid);
        arr[0] = sec;
        arr[inOf + 1] = one;
        arr[lastInOf + 1] = mid;
        String createFullName = new String(arr);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + createFullName);
    }

    public static void task7() {
        String one = "135";
        String two = "246";
        StringBuilder sliyanie = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            sliyanie.append(one.charAt(i)).append(two.charAt(i));
        }
        System.out.println(sliyanie);
    }

    public static void task8() {
        String stroka = "aabccddefgghiijjkk";
        char [] sortirovka = stroka.toCharArray();
        Arrays.sort(sortirovka);
        String dubli = new String(sortirovka);
        StringBuilder noDubli = new StringBuilder();
        for (int i = 0; i < dubli.length(); i++) {
            for (int j = 0; j < dubli.length(); j++) {
                if (i != j && dubli.charAt(i) == dubli.charAt(j) && i > j) {
                    noDubli.append(dubli.charAt(i));
                }
            }
        }
        System.out.println(noDubli);
    }
}