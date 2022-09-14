package JavaCore_3_1;

public class Task_2 {

    public static Apple createApples(int value){
        Apple apples = new Apple(value);
        return apples;
    }

    public static Orange createOranges(int value){
        Orange oranges = new Orange(value);
        return oranges;
    }


    public static void main(String[] args) {

        System.out.println("Коробки с фруктами :");
        System.out.println(createApples(10));
        System.out.println(createOranges(3));

        System.out.println("Коробки :");
        // cоздание коробок с яблоками
        Box<Apple> appleBox = new Box<>();
        appleBox.add(createApples(10));
        appleBox.add(createApples(6));
        appleBox.add(createApples(3));
        appleBox.add(createApples(8));
        System.out.println(appleBox);
        System.out.println("Общий вес коробок - "+appleBox.getWeight()+"f");
        // создание коробок с апельсинами
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(createOranges(10));
        orangeBox.add(createOranges(6));
        orangeBox.add(createOranges(11));
        System.out.println(orangeBox);
        System.out.println("Общий вес коробок - "+orangeBox.getWeight()+"f");

        // cравнение коробок
        System.out.println("Сравнение коробок :");
        if (orangeBox.compare(appleBox)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        };
        Box<Apple> appleBoxFull = new Box<>();
        Box<Orange> orangeBoxFull = new Box<>();
        appleBoxFull.add(createApples(3));
        orangeBoxFull.add(createOranges(2));

        System.out.println(appleBoxFull);
        System.out.println(orangeBoxFull);
        if (orangeBoxFull.compare(appleBoxFull)) {
            System.out.println("Коробки равны");
        } else {
            System.out.println("Коробки не равны");
        };


        System.out.println("Пересыпали :");
        System.out.println(appleBox);
        System.out.println(appleBoxFull);
        appleBox.emptyTo(appleBoxFull);
        System.out.println(appleBox);
        System.out.println(appleBoxFull);

        orangeBox.emptyTo(appleBoxFull);
        System.out.println(appleBoxFull);
        System.out.println(orangeBox);
    }
}
