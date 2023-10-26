package my_oop;

public class Product {
    String name;
    int count;
    double price;

    public void sell(int count) {
        if(this.count >= count && this.count > 0) {
            System.out.println("Вы купили " + count + " шт.");
            this.count -= count;
        } else {
            System.out.println("Доступное количество товара - " + this.count + ". Покупка не состоялась.");
        }
    }
}
