package sale;

public class Controller {
    public static void addSale(int id, String nit, product.Model[] products, int total){
        Model sale = new Model(id,nit,products,total);
        persistence.Store.addSale(sale);
        System.out.println(sale.getSale());
    }
    public static sale.Model showSale(int id){
        Model sale = persistence.Store.findSale(id);
        if(sale != null){
            return sale;
        }else{
            return null;
        }
    }
}
