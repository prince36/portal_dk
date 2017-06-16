package com.sprhib.controller;

import com.sprhib.model.Product;
import com.sprhib.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by Ja on 15.06.2017.
 */
@RequestMapping("/products")
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping
    public String list(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }

    @RequestMapping("/all")
    public String allProducts(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "products";
    }
/*
    @RequestMapping("/{category}")
    public String getProductsByCategory(Model model, @PathVariable("category") String category) {
        List<Product> products = productService.getProductsByCategory(category);
        if (products == null || products.isEmpty()){
            throw new NoProductsFoundUnderCategoryException();
        }
        model.addAttribute("products", products);
        return "products";
    }
    @RequestMapping("/filter/{ByCriteria}")
    public String getProductsByFilter(@MatrixVariable(pathVar = "ByCriteria") Map<String,List<String>> filterParams, Model model) {
        model.addAttribute("products", productService.getProductsByFilter(filterParams));
        return "products";
    }
    */
    @RequestMapping("/product")
    public String getProductById(@RequestParam("id") Integer productId, Model model) {
        model.addAttribute("product", productService.getProduct(productId));
        return "product" + "boots1";
    }
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getAddNewProductForm(Model model) {
        Product newProduct = new Product();
        model.addAttribute("newProduct", newProduct);
        return "addProduct";
    }

    @RequestMapping(value = "/add", method =RequestMethod.POST)
    public String processAddNewProductForm(@ModelAttribute Product newProduct, BindingResult result) {
        String[] suppressedFields = result.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Próba wiązania niedozwolonych pól:" + StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }

        /*MultipartFile productImage = productToBeAdded.getProductImage();
        String rootDirectory = request.getSession().getServletContext().getRealPath("/");
        if(productImage!=null && !productImage.isEmpty()){
            try {
                productImage.transferTo(new File(rootDirectory+"resources\\images\\"+productToBeAdded.getProductId()+".png"));

            } catch (Exception e) {
                throw new RuntimeException("Niepowodzenie podczas próby zapisu obrazka produktu", e);
            }
        }*/
        System.out.println("nowy produkt to: "+newProduct.getName()+" id: "+newProduct.getProductId());
        productService.addProduct(newProduct);
        return "redirect:/products";
    }

    @InitBinder
    public void initialiseBinder(WebDataBinder binder) {
        binder.setDisallowedFields("unitsInOrder", "discontinued");
        binder.setAllowedFields("productId", "name", "unitPrice", "description", "manufacturer", "category", "unitsInStock");
    }

	/*@RequestMapping(value = "/all")
	public @ResponseBody Iterable<Product> getAllUsers() {
		// This returns a JSON or XML with the users
		//return ProductRepository.findAll();

		return lhhT<>;
	}

*/


}
