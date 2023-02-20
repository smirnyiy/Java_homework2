// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.





import java.io.FileReader;
import java.util.Scanner;


public class task_2 {

     
    public static void main(String[] args) throws Exception {

        FileReader rd = new FileReader("task_2.json");
        Scanner st = new Scanner(rd);
        String s = st.nextLine();
        st.close();
        rd.close();
        s = s.substring(1, s.length() - 1);
        s = s.replaceAll("\"", "");
        String[] words = s.split(",");
        for (int i = 0; i < words.length; i++) {
            String[] temp = words[i].split(": ");
            if (!temp[1].equals("null")) {
                System.out.println(temp[0] + " " + temp[1]);
            }
        }
    }

}