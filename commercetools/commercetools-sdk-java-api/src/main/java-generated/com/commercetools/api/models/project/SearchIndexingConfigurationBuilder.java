
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
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues productsNew;

    @Nullable
    private com.commercetools.api.models.project.SearchIndexingConfigurationValues orders;

    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @param builder function to build the products value
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
     * @param builder function to build the products value
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder withProducts(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValues> builder) {
        this.products = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @param products value to be set
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder products(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues products) {
        this.products = products;
        return this;
    }

    /**
     *  <p>Configuration for the Product Search feature.</p>
     * @param builder function to build the productsNew value
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder productsNew(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder> builder) {
        this.productsNew = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Configuration for the Product Search feature.</p>
     * @param builder function to build the productsNew value
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder withProductsNew(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValues> builder) {
        this.productsNew = builder
                .apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration for the Product Search feature.</p>
     * @param productsNew value to be set
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder productsNew(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues productsNew) {
        this.productsNew = productsNew;
        return this;
    }

    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @param builder function to build the orders value
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
     * @param builder function to build the orders value
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder withOrders(
            Function<com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder, com.commercetools.api.models.project.SearchIndexingConfigurationValues> builder) {
        this.orders = builder.apply(com.commercetools.api.models.project.SearchIndexingConfigurationValuesBuilder.of());
        return this;
    }

    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @param orders value to be set
     * @return Builder
     */

    public SearchIndexingConfigurationBuilder orders(
            @Nullable final com.commercetools.api.models.project.SearchIndexingConfigurationValues orders) {
        this.orders = orders;
        return this;
    }

    /**
     *  <p>Configuration for the Product Projection Search and Product Suggestions endpoints.</p>
     * @return products
     */

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProducts() {
        return this.products;
    }

    /**
     *  <p>Configuration for the Product Search feature.</p>
     * @return productsNew
     */

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getProductsNew() {
        return this.productsNew;
    }

    /**
     *  <p>Configuration for the Order Search feature.</p>
     * @return orders
     */

    @Nullable
    public com.commercetools.api.models.project.SearchIndexingConfigurationValues getOrders() {
        return this.orders;
    }

    /**
     * builds SearchIndexingConfiguration with checking for non-null required values
     * @return SearchIndexingConfiguration
     */
    public SearchIndexingConfiguration build() {
        return new SearchIndexingConfigurationImpl(products, productsNew, orders);
    }

    /**
     * builds SearchIndexingConfiguration without checking for non-null required values
     * @return SearchIndexingConfiguration
     */
    public SearchIndexingConfiguration buildUnchecked() {
        return new SearchIndexingConfigurationImpl(products, productsNew, orders);
    }

    /**
     * factory method for an instance of SearchIndexingConfigurationBuilder
     * @return builder
     */
    public static SearchIndexingConfigurationBuilder of() {
        return new SearchIndexingConfigurationBuilder();
    }

    /**
     * create builder for SearchIndexingConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchIndexingConfigurationBuilder of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationBuilder builder = new SearchIndexingConfigurationBuilder();
        builder.products = template.getProducts();
        builder.productsNew = template.getProductsNew();
        builder.orders = template.getOrders();
        return builder;
    }

}
