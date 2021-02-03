package test.quanlisanpham;

public class Product1 implements Comparable<Product1>{
    private String name;
    private int id;
    private float price;

    public Product1() {
    }

    public Product1(String name, int id, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product1 o) {
        if (this.getPrice()>o.getPrice()){
            return 1;
        }else if(this.getPrice() < o.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
}
