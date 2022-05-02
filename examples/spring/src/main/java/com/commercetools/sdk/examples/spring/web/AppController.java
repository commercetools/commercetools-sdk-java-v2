
package com.commercetools.sdk.examples.spring.web;

import java.util.List;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.sdk.examples.spring.service.MeRepository;
import com.commercetools.sdk.examples.spring.service.ProductsRepository;
import com.commercetools.sdk.examples.spring.service.ProjectRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.reactive.result.view.RedirectView;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

@Controller
public class AppController {

    private final ProjectRepository projectRepository;

    private final ProductsRepository productsRepository;

    @Autowired
    public AppController(ProjectRepository projectRepository, ProductsRepository productsRepository) {
        this.projectRepository = projectRepository;
        this.productsRepository = productsRepository;

    }

    @PostMapping("/login")
    public Mono<String> login(ServerWebExchange exchange, Authentication authentication) {
        return Mono.just("redirect:/me");
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("project", "World");
        return "home/index";
    }

    @GetMapping("/p")
    public String pop(@RequestAttribute("meClient") ProjectApiRoot client, Model model, WebSession session) {

        Mono<List<ProductProjection>> products = productsRepository.products();
        final Mono<Cart> cart = new MeRepository(client, session).meCart();

        model.addAttribute("products", products);
        model.addAttribute("cart", cart);
        return "home/pop";
    }

    @GetMapping("/cart")
    public String myCart(@RequestAttribute("meClient") ProjectApiRoot client, Model model, WebSession session) {
        final Mono<Cart> cart = new MeRepository(client, session).meCart();

        model.addAttribute("cart", cart);
        return "mycart/index";
    }

    @GetMapping("/cart/add")
    public RedirectView addToCart(@RequestAttribute("meClient") ProjectApiRoot client, String sku, Model model, WebSession session) {
        MeRepository repository = new MeRepository(client, session);

        final Mono<Cart> cart = repository.addToCart(sku);
        model.addAttribute("cart", cart);

        return new RedirectView("/cart");
    }

    @GetMapping("/cart/del")
    public RedirectView removeFromCart(@RequestAttribute("meClient") ProjectApiRoot client, String lineItemId, Model model, WebSession session) {
        MeRepository repository = new MeRepository(client, session);

        final Mono<Cart> cart = repository.removeFromCart(lineItemId);
        model.addAttribute("cart", cart);

        return new RedirectView("/cart");
    }

    @GetMapping("/me")
    public String me(@RequestAttribute("meClient") ProjectApiRoot client, Model model, WebSession session) {
        final Mono<Customer> customer = new MeRepository(client, session).me();
        model.addAttribute("customer", customer);
        return "me/index";
    }
}
