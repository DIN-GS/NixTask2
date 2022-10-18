public class Main {
    public static void main(String[] args) {
        int[] mas = new int[10];

        for (int i = 0; i <  mas.length; i++){
            mas[i] = (int)(Math.random() * 10 + 1);

            /*if(mas[i] % 2 == 0) {
                System.out.println(mas[i]);
            }*/
        }

        for (int i = 0; i < mas.length; i++){
            if(mas[i] % 2 == 0) {
                System.out.println(mas[i]);

            }
        }
    }
}