package com.commercetools.sdk.examples.spring.servingwebcontent;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.Cart;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.project.Project;
import com.commercetools.sdk.examples.spring.service.MeRepository;
import com.commercetools.sdk.examples.spring.service.ProductsRepository;
import com.commercetools.sdk.examples.spring.service.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
public class HomeController {

    private final ProjectRepository projectRepository;

    private final ProductsRepository productsRepository;

    @Autowired
    public HomeController(ProjectRepository projectRepository, ProductsRepository productsRepository) {
        this.projectRepository = projectRepository;
        this.productsRepository = productsRepository;

    }

    @GetMapping("/")
    public String home(Model model) {
        Mono<Project> project = projectRepository.get();
        model.addAttribute("project", project);
        return "home";
    }

    @GetMapping("/p")
    public String pop(@RequestAttribute("meClient") ProjectApiRoot client, Model model, WebSession session) {

        Mono<List<ProductProjection>> products = productsRepository.products();
        final Mono<Cart> cart = new MeRepository(client, session).meCart();

        model.addAttribute("products", products);
        model.addAttribute("cart", cart);
        return "pop";
    }
}
