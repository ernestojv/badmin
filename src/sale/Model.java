package sale;

public class Model {
    int id;
    String nit;
    product.Model[] products;
    int total;

    public Model(int id, String nit, product.Model[] products, int total) {
        this.id = id;
        this.nit = nit;
        this.products = products;
        this.total = total;
    }

    public String getSale() {
        String list = "";
        for (int i = 0; i < products.length; i++) {
            list.concat("\n"+products[i].getProduct());
        }
        return "Id:" + id + "\nNit:" + nit + "\n Productos:" + list + "\nTotal:" + total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public product.Model[] getProducts() {
        return products;
    }

    public void setProducts(product.Model[] products) {
        this.products = products;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
