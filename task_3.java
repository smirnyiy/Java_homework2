//Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом (возвращает boolean значение)


public class task_3 {
    public static void main(String[] args)
    {
        System.out.println(IfPoly("я иду с мечем судия"));
    }

    public static boolean IfPoly(String str) {
        
        StringBuilder reverse = new StringBuilder();
        String clear = str.replaceAll("\\s", "").toLowerCase();
        char[] strToChar = clear.toCharArray();
        for (int i = strToChar.length - 1; i >=0; i--){
            reverse.append(strToChar[i]);
        }
        return (reverse.toString().equals(clear));
    }
}