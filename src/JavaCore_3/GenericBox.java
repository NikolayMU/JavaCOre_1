package JavaCore_3;

import java.util.Arrays;

public class GenericBox<T>{
        private T[] obj;

        public GenericBox(T... obj) {

            this.obj = obj;
        }
    //метод change с помощью которого мы получим замену значений массива
        public void change(int i, int j){
            T value = obj[i];
            obj[i] = obj[j];
            obj[j] = value;
        }

        @Override
        public String toString() {
            return "Содержимое массива {"+ Arrays.toString(obj) +"}";
        }
    }









