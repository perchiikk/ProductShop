
public class Customer {
    private int budget;
    private ProductCart productCart;

    public Customer(int budget, ProductCart productCart) {
        this.budget = budget;
        this.productCart = productCart;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public ProductCart getProductCart() {
        return productCart;
    }

    public void setProductCart(ProductCart productCart) {
        this.productCart = productCart;
    }

    /**
     * Совершить покупку
     */
    public void buy(){
        int allSum = productCart.getSum();
        //int result = budget - allSum;
        if(allSum <= budget){
            System.out.println("Покупка на сумму выполнена успешно");
            setBudget(budget-allSum);
            System.out.println("Остаток средств " + getBudget());
            productCart.removeAll();
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }
}
