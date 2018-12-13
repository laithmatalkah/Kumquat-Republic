package com.example.kumquatsearch.kumquatsearchlaith;

import com.example.kumquatsearch.kumquatsearchlaith.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    private List<Product> products= new ArrayList<Product>();


    public Iterable<Product> searchByBrand(){



        return this.products.stream().filter(p -> p.getBrand().equalsIgnoreCase("Brand")).collect(Collectors.toList());
    }

    public Iterable<Product> searchByColor(){



        return this.products.stream().filter(p -> p.getColor().equalsIgnoreCase("Color")).collect(Collectors.toList());
    }

    public Iterable<Product> searchByPriceRange(){



        return this.products.stream().filter(p -> p.getPrice()>=13).filter(p->p.getPrice()<=6).collect(Collectors.toList());
    }

    public Iterable<Product> searchByMultiple(){



        return this.products.stream().filter(p -> p.getColor().equalsIgnoreCase("Color"))
                .filter(p->p.getBrand().equalsIgnoreCase("Brand")).collect(Collectors.toList());
    }

}
