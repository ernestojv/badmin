package persistence;

public class Store {

    static user.Model[] users = new user.Model[10];
    static customer.Model[] customers = new customer.Model[100];
    public static product.Model[] products = new product.Model[100];
    static sale.Model[] sales = new sale.Model[100];
    public static int userId, customerId, productId, saleId = 0;

    public static void inicial() {
        users[userId] = new user.Model(userId, "admin", "Administrador", "admin");
        userId++;
        customers[customerId] = new customer.Model(customerId, "12345678", "Nombre", "21", "M");
        customerId++;
        products[productId] = new product.Model(productId, "Producto", "120", "2", "");
        productId++;
        products[productId] = new product.Model(productId, "Producto 2", "20", "2", "");
        productId++;
        products[productId] = new product.Model(productId, "Producto 1", "115", "2", "");
        productId++;
    }

    //CRUD Customers
    public static void addCustomer(customer.Model customer) {
        customers[customerId] = customer;
        System.out.println("Cliente insertado \n" + customer.getCustomer());
        customerId++;
    }

    public static customer.Model getOneCustomer(String nit) {
        for (int i = 0; i < customerId; i++) {
            if (customers[i].getNit().equals(nit)) {
                return customers[i];
            }
        }
        return null;
    }

    public static customer.Model updateCustomer(customer.Model customer) {
        for (int i = 0; i < customerId; i++) {
            if (customers[i].getId() == customer.getId()) {
                customers[i] = customer;
                return customer;
            }
        }
        return null;
    }

    public static customer.Model deleteCustomer(customer.Model customer) {
        for (int i = 0; i < customerId; i++) {
            if (customers[i].getId() == customer.getId()) {
                customers[i] = null;
            }
        }
        return null;
    }

    //CRUD Users
    public static user.Model getOne(String username) {
        for (int i = 0; i < userId; i++) {
            if (username.equals(users[i].getUsername())) {
                return users[i];
            }
        }
        return null;
    }

    //CRUD Products
    public static void addProduct(product.Model product) {
        products[productId] = product;
        System.out.println(product.getProduct());
        productId++;
    }

    public static product.Model getOneProduct(String name) {
        for (int i = 0; i < productId; i++) {
            if (products[i].getName().equals(name)) {
                return products[i];
            }
        }
        return null;
    }

    public static product.Model updateProduct(product.Model product) {
        for (int i = 0; i < productId; i++) {
            if (products[i].getId() == product.getId()) {
                products[i] = product;
                return product;
            }
        }
        return null;
    }

    //CRUD Sales
    public static void addSale(sale.Model sale) {
        sales[saleId] = sale;
        System.out.println("Venta insertada");
        saleId++;
    }

    public static sale.Model findSale(int id) {
        for (int i = 0; i < saleId; i++) {
            if(sales[i].getId() == id){
                return sales[i];
            }
        }
        return null;
    }
}
