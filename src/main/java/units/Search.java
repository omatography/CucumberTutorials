package units;

public class Search {

    public boolean searchProduct(Product p,String name){
        return p.returnProducts().contains(name);
    }
}
