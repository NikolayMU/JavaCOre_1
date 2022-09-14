package JavaCore_3_1;

public class Orange extends Fruit{            // апельсины
        public Orange(int count){
                super(count);
                this.weightOfFruits = 1.5;
        }

        @Override
        public String toString() {
                return "Коробка с апельсинами {" + count + " штук, весом "+getWeight()+ "f}";
        }
}
