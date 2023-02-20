// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.





import java.io.File;
import java.util.Scanner;


public class task_2 {

     
    public static void main(String[] args) throws Exception {

        File file = new File("task_2.json");
        Scanner scanner = new Scanner(file); 
        String line = scanner.nextLine();
        String line2 = line.replace("{", "").replace("}","").replace(":",",");
        String [] lineData = line2.split(",");
        String family = lineData[1];
        String mark = lineData[3];
        String subject = lineData[5];
        // System.out.println(line2);
        scanner.close();        
        System.out.printf("Студент %s получил %s по предмету %s  " , family, mark, subject);
        }
}
