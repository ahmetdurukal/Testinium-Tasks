package nLayerdDemo;
import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;

public class LayerdDemoMain {
    public static void main(String[] args) {
//        ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerManagerAdapter() );
//       Product product = new Product(1,2,"Elma",12,50);
//       productService.add(product);

       ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
       Product product = new Product(1,2,"Armut",12,50);
        productService.add(product);

    }
}
