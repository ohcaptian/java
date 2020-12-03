package com.ying.cloud.dao;/**
 * @author 17694
 * @date 2020/12/03
 **/

import com.ying.cloud.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName : ProductDao 
 * @Description : 模拟数据库操作  
 */
@Service
public class ProductDao {
    private static Map<Integer, Product> products=null;
    static {
        products = new HashMap<Integer, Product>();
        products.put(01,new Product(1,"apple",23));
        products.put(02,new Product(2,"phone",2300));
        products.put(03,new Product(3,"ball",50));
        products.put(04,new Product(4,"pen",2));
    }
    public Collection<Product> selectAll(){
            return products.values();
    }
}
