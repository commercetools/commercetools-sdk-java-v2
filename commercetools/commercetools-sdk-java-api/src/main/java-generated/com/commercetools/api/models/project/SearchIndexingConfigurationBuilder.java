
package com.commercetools.api.models.project;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchIndexingConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchIndexingConfiguration searchIndexingConfiguration = SearchIndexingConfiguration.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SearchIndexingConfigurationBuilder implements Builder<SearchIndexingConfiguration> {

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues products;

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues orders;

    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder products(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder> builder) {
        this.products = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @param products
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder products(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
        return this;
    }

    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder orders(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder> builder) {
        this.orders = builder.apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @param orders
     * @return Builder
     */

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
