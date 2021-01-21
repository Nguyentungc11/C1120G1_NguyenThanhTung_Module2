package bai_12_java_collection_framework.bai_tap.quan_li_san_pham;

public class Product {
    private String productName;
    private int productId;
    private float productPrice;

    public Product() {
    }

    public Product(String productName, int productId, float productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product { " +
                " productName = '" + productName + '\'' +
                ", productId =" + productId +
                ", productPrice =" + productPrice +
                '}';
    }
}
