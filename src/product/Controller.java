package product;

import persistence.Store;

public class Controller {
    public static void createProduct(String name, String price, String quantity, String image){
        Model product = new Model(Store.productId ,name, price, quantity, image);
        persistence.Store.addProduct(product);
    }
    public static product.Model search(String name){
        product.Model product = persistence.Store.getOneProduct(name);
        if(product != null){
            return product;
        }else{
            System.out.println("No encontrado");
            return null;
        }
    }

    public static Model updateProduct(int id, String name, String price, String quantity, String image){
        product.Model updatedProduct = persistence.Store.updateProduct(new product.Model(id, name, price, quantity, image));
        if(updatedProduct != null){
            return updatedProduct;
        }else {
            return null;
        }
    }
}
