package com.commercetools.sdk.examples.spring.service;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Repository
@Component
public class ProductsRepository {
    private final ProjectApiRoot apiRoot;

    public ProductsRepository(ProjectApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    public Mono<List<ProductProjection>> products() {
        final CompletableFuture<List<ProductProjection>> products = apiRoot.productProjections()
                .search()
                .get()
                .execute()
                .thenApply(ApiHttpResponse::getBody)
                .thenApply(ProductProjectionPagedSearchResponse::getResults);
        return Mono.fromFuture(products);
    }

}
