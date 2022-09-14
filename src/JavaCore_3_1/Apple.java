package JavaCore_3_1;

public class Apple extends Fruit{
    public Apple(int count){
        super(count);
        this.weightOfFruits = 1.0;
    }

    @Override
    public String toString() {
        return "Коробка с яблоками {" + count + " штук, весом "+getWeight()+ "f}";
    }
}

