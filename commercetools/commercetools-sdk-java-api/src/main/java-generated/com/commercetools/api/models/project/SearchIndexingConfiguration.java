
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
 *
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
@JsonDeserialize(as = SearchIndexingConfigurationImpl.class)
public interface SearchIndexingConfiguration {

    /**
     *  <p>Configuration for the <span>Product Projection Search</span> and <span>Search Term Suggestions</span> APIs.</p>
     * @return products
     */
    @Valid
    @JsonProperty("products")
    public SearchIndexingConfigurationValues getProducts();

    /**
     *  <p>Configuration for the <span>Product Search</span> feature.</p>
     * @return productsSearch
     */
    @Valid
    @JsonProperty("productsSearch")
    public SearchIndexingConfigurationValues getProductsSearch();

    /**
     *  <p>Configuration for the <span>Order Search</span> feature.</p>
     * @return orders
     */
    @Valid
    @JsonProperty("orders")
    public SearchIndexingConfigurationValues getOrders();

    /**
     *  <p>Configuration for the <span>Customer Search</span> feature.</p>
     * @return customers
     */
    @Valid
    @JsonProperty("customers")
    public SearchIndexingConfigurationValues getCustomers();

    /**
     *  <p>Configuration for the <span>Business Unit Search</span> feature.</p>
     * @return businessUnits
     */
    @Valid
    @JsonProperty("businessUnits")
    public SearchIndexingConfigurationValues getBusinessUnits();

    /**
     *  <p>Configuration for the <span>Product Projection Search</span> and <span>Search Term Suggestions</span> APIs.</p>
     * @param products value to be set
     */

    public void setProducts(final SearchIndexingConfigurationValues products);

    /**
     *  <p>Configuration for the <span>Product Search</span> feature.</p>
     * @param productsSearch value to be set
     */

    public void setProductsSearch(final SearchIndexingConfigurationValues productsSearch);

    /**
     *  <p>Configuration for the <span>Order Search</span> feature.</p>
     * @param orders value to be set
     */

    public void setOrders(final SearchIndexingConfigurationValues orders);

    /**
     *  <p>Configuration for the <span>Customer Search</span> feature.</p>
     * @param customers value to be set
     */

    public void setCustomers(final SearchIndexingConfigurationValues customers);

    /**
     *  <p>Configuration for the <span>Business Unit Search</span> feature.</p>
     * @param businessUnits value to be set
     */

    public void setBusinessUnits(final SearchIndexingConfigurationValues businessUnits);

    /**
     * factory method
     * @return instance of SearchIndexingConfiguration
     */
    public static SearchIndexingConfiguration of() {
        return new SearchIndexingConfigurationImpl();
    }

    /**
     * factory method to create a shallow copy SearchIndexingConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    public static SearchIndexingConfiguration of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationImpl instance = new SearchIndexingConfigurationImpl();
        instance.setProducts(template.getProducts());
        instance.setProductsSearch(template.getProductsSearch());
        instance.setOrders(template.getOrders());
        instance.setCustomers(template.getCustomers());
        instance.setBusinessUnits(template.getBusinessUnits());
        return instance;
    }

    public SearchIndexingConfiguration copyDeep();

    /**
     * factory method to create a deep copy of SearchIndexingConfiguration
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SearchIndexingConfiguration deepCopy(@Nullable final SearchIndexingConfiguration template) {
        if (template == null) {
            return null;
        }
        SearchIndexingConfigurationImpl instance = new SearchIndexingConfigurationImpl();
        instance.setProducts(
            com.commercetools.api.models.project.SearchIndexingConfigurationValues.deepCopy(template.getProducts()));
        instance.setProductsSearch(com.commercetools.api.models.project.SearchIndexingConfigurationValues
                .deepCopy(template.getProductsSearch()));
        instance.setOrders(
            com.commercetools.api.models.project.SearchIndexingConfigurationValues.deepCopy(template.getOrders()));
        instance.setCustomers(
            com.commercetools.api.models.project.SearchIndexingConfigurationValues.deepCopy(template.getCustomers()));
        instance.setBusinessUnits(com.commercetools.api.models.project.SearchIndexingConfigurationValues
                .deepCopy(template.getBusinessUnits()));
        return instance;
    }

    /**
     * builder factory method for SearchIndexingConfiguration
     * @return builder
     */
    public static SearchIndexingConfigurationBuilder builder() {
        return SearchIndexingConfigurationBuilder.of();
    }

    /**
     * create builder for SearchIndexingConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchIndexingConfigurationBuilder builder(final SearchIndexingConfiguration template) {
        return SearchIndexingConfigurationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSearchIndexingConfiguration(Function<SearchIndexingConfiguration, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<SearchIndexingConfiguration>";
            }
        };
    }
}
