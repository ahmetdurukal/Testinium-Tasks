package nLayerdDemo.business.concretes;

import nLayerdDemo.business.abstracts.ProductService;

import nLayerdDemo.core.LoggerService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;


    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId() == 1) {
            System.out.println("Bu katagoride ürün kabul edilmiyor.");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logTOSystem("Ürün loglandı: "+product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
