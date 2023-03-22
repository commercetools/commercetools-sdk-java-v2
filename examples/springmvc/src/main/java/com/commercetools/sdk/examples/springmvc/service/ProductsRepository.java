
package com.commercetools.sdk.examples.springmvc.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.client.ProjectScopedApiRoot;
import com.commercetools.api.models.product.ProductProjection;
import com.commercetools.api.models.product.ProductProjectionPagedSearchResponse;

import com.newrelic.api.agent.Trace;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class ProductsRepository {
    private final ProjectScopedApiRoot apiRoot;

    public ProductsRepository(ProjectScopedApiRoot apiRoot) {
        this.apiRoot = apiRoot;
    }

    @Trace(async = true)
    public CompletableFuture<List<ProductProjection>> products() {
        return apiRoot.productProjections()
                .search()
                .get()
                .execute()
                .thenApply(ApiHttpResponse::getBody)
                .thenApply(ProductProjectionPagedSearchResponse::getResults);
    }
}
