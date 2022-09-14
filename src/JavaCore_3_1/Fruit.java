package JavaCore_3_1;

abstract class Fruit{
    double weightOfFruits;
    int count;

    public Fruit(int value){

        this.count = value;
    }

    public Double getWeight(){          // получаем общий вес фруктов
        double result = this.count*this.weightOfFruits;
        return result;
    }
}
