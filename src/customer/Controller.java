package customer;

import persistence.Store;

public class Controller {
    public static void addCustomer(String nit, String name, String age, String gender) {
        int customerId = Store.customerId;
        Model customer = new Model(customerId,nit, name, age, gender);
        persistence.Store.addCustomer(customer);
    }
    public static Model search(String nit){
        Model customer = persistence.Store.getOneCustomer(nit);
        if(customer != null){
            System.out.println(customer.getCustomer());
            return customer;
        }else{
            System.out.println("No encontrado");
            return null;
        }
    }

    public static Model updateCustomer(int id,String nit, String name, String age, String gender){
        Model customer = new Model(id, nit, name, age, gender);
        Model updatedCustomer = persistence.Store.updateCustomer(customer);
        return updatedCustomer;
    }

    public static void deleteCustomer(Model customer){

    }
}
