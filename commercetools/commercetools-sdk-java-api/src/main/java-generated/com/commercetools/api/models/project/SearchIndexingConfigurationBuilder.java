
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SearchIndexingConfigurationBuilder implements Builder<SearchIndexingConfiguration> {

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues products;

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues orders;

    public SearchIndexingConfigurationBuilder products(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder> builder) {
        this.products = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of())
                .build();
        return this;
    }

    public SearchIndexingConfigurationBuilder products(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
        return this;
    }

    public SearchIndexingConfigurationBuilder orders(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder> builder) {
        this.orders = builder.apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of())
                .build();
        return this;
    }

    public SearchIndexingConfigurationBuilder orders(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues orders) {
        this.orders = orders;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProducts() {
        return this.products;
    }

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getOrders() {
        return this.orders;
    }

    public SearchIndexingConfiguration build() {
        return new SearchIndexingConfigurationImpl(products, orders);
    }

    /**
     * builds SearchIndexingConfiguration without checking for non null required values
     */
    public SearchIndexingConfiguration buildUnchecked() {
        return new SearchIndexingConfigurationImpl(products, orders);
    }

    public static SearchIndexingConfigurationBuilder of() {
        return new SearchIndexingConfigurationBuilder();
    }

    public static SearchIndexingConfigurationBuilder of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationBuilder builder = new SearchIndexingConfigurationBuilder();
        builder.products = template.getProducts();
        builder.orders = template.getOrders();
        return builder;
    }

}
