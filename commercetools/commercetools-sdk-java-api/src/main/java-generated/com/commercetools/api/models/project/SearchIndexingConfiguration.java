
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Controls indexing of resources to be provided on high performance read-only search endpoints.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchIndexingConfigurationImpl.class)
public interface SearchIndexingConfiguration {

    /**
    *  <p>Configuration for the <a href="/../api/projects/products-search">Product Projection Search</a> and <a href="/../api/projects/products-suggestions">Product Suggestions</a> endpoints.</p>
    */
    @Valid
    @JsonProperty("products")
    public SearchIndexingConfigurationValues getProducts();

    /**
    *  <p>Configuration for the <a href="/../api/projects/order-search">Order Search</a> feature.</p>
    */
    @Valid
    @JsonProperty("orders")
    public SearchIndexingConfigurationValues getOrders();

    public void setProducts(final SearchIndexingConfigurationValues products);

    public void setOrders(final SearchIndexingConfigurationValues orders);

    public static SearchIndexingConfiguration of() {
        return new SearchIndexingConfigurationImpl();
    }

    public static SearchIndexingConfiguration of(final SearchIndexingConfiguration template) {
        SearchIndexingConfigurationImpl instance = new SearchIndexingConfigurationImpl();
        instance.setProducts(template.getProducts());
        instance.setOrders(template.getOrders());
        return instance;
    }

    public static SearchIndexingConfigurationBuilder builder() {
        return SearchIndexingConfigurationBuilder.of();
    }

    public static SearchIndexingConfigurationBuilder builder(final SearchIndexingConfiguration template) {
        return SearchIndexingConfigurationBuilder.of(template);
    }

    default <T> T withSearchIndexingConfiguration(Function<SearchIndexingConfiguration, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfiguration> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchIndexingConfiguration>() {
            @Override
            public String toString() {
                return "TypeReference<SearchIndexingConfiguration>";
            }
        };
    }
}
