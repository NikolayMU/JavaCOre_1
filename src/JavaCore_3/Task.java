package JavaCore_3;

public class Task {

        public static void main(String[] args) {
            GenericBox<Integer> firstBox = new GenericBox<>(10,9,8,7,6,5,4,3,2,1,0);
            System.out.println(firstBox);
            firstBox.change(0,10);
            System.out.println(firstBox);

            GenericBox<String> secondBox = new GenericBox<>("Вася","Петя","Аня","Настя","Петя","Максим",
                    "Илья","Вика","Артем","Соня","Дима");
            System.out.println(secondBox);
            secondBox.change(0,10);
            System.out.println(secondBox);

        }


    }
