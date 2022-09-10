package JavaCore_2;

public class Main {
        static class MyArraySizeException extends Exception {
            public MyArraySizeException(){
                super("Ошибка размера массива");
            }
        }
        static class MyArrayDataException extends Exception {
            public MyArrayDataException(int i, int j){
                super("Ошибка данных в ячейке "+i+" "+j);
            }
        }

        public static void checkArraySize(String[][] array) throws MyArraySizeException {
            boolean result = false;
            if (array.length!=4) {
                result = true;
            }
            for (String[] i: array) {
                if (i.length!=4) {
                    result = true;
                }
            }
            if (result) {
                throw new MyArraySizeException();
            }
        }
// ссумирование чисел в массиве
        public static void arraySum(String[][] array) throws MyArrayDataException {
            int res = 0;
            Integer value;
            for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    try {
                        value = Integer.valueOf(array[i][j]);
                        /* Use parseInt(String) to convert a string to a int primitive, or use valueOf(String) to
                        convert a string to an Integer object*/
                    }
                    catch (Exception e) {
                        System.out.println("Преобразование не удается выполнить - "+"\""+array[i][j]+"\" в ячейке : "+i+" "+j);
                        throw new MyArrayDataException(i,j);
                    }
                    res+=value;
                }
            }
            System.out.println("Сумма элементов массива = "+res);
        }

    // exception "ошибка размера"
        public static void main(String[] args) {
            String[][] rightArray = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
            String[][] bestArray = {{"1","Hello world","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
            String[][] badArray = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4","5"}};
            try {
                checkArraySize(rightArray);
            }
            catch (MyArraySizeException e) {
                System.out.println(e);
            }
            // массив с ошибкой длины
            try {
                checkArraySize(badArray);
            }
            catch (MyArraySizeException e) {
                System.out.println(e);

            }

            try {
                arraySum(rightArray);
            }
            catch (MyArrayDataException e) {
                System.out.println(e);

            }
            // подсчет суммы для неправильного массива
            try {
                arraySum(bestArray);
            }
            catch (MyArrayDataException e) {
                System.out.println(e);
                // В массиве bestArray не удасться преобразовать часть массива содержащую - "Hello World" в ячейке : 0 1
            }

        }
    }

