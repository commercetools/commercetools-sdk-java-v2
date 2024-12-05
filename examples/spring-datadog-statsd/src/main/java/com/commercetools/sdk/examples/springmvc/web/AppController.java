package com.commercetools.sdk.examples.springmvc.web;

import com.commercetools.api.client.ProjectScopedApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.sdk.examples.springmvc.service.CartRepository;
import com.commercetools.sdk.examples.springmvc.service.ProductsRepository;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Controller
public class AppController {
    @GetMapping("/")
    public String home() {
        return "home/index";
    }

    @Value(value = "${ctp.project.key}")
    private String projectKey;

    @Autowired
    @Resource(name = "apiRoot")
    ProjectScopedApiRoot apiRoot;

    @GetMapping("/p")
    public String pop(Model model, HttpSession session) throws ExecutionException, InterruptedException {
        CompletableFuture<List<ProductProjection>> products =  new ProductsRepository(apiRoot).products();
        CompletableFuture<Cart> cart = new CartRepository(apiRoot, session).meCart();
        model.addAttribute("products", products.get());
        model.addAttribute("cart", cart.get());
        return "home/pop";
    }

    @GetMapping("/cart")
    public String cart(Model model, HttpSession session) throws ExecutionException, InterruptedException {
        final CompletableFuture<Cart> cart = new CartRepository(apiRoot, session).meCart();
        model.addAttribute("cart", cart.get());
        return "mycart/index";
    }

    @GetMapping("/cart/add")
    public RedirectView addToCart(String sku, Model model, HttpSession session)
            throws ExecutionException, InterruptedException {
        CartRepository repository = new CartRepository(apiRoot, session);

        final CompletableFuture<Cart> cart = repository.addToCart(sku);
        model.addAttribute("cart", cart.get());

        return new RedirectView("/cart");
    }

    @GetMapping("/cart/del")
    public RedirectView removeFromCart(String lineItemId, Model model, HttpSession session)
            throws ExecutionException, InterruptedException {
        CartRepository repository = new CartRepository(apiRoot, session);

        final CompletableFuture<Cart> cart = repository.removeFromCart(lineItemId);
        model.addAttribute("cart", cart.get());

        return new RedirectView("/cart");
    }
}
